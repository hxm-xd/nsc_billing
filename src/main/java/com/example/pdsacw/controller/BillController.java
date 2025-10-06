package com.example.pdsacw.controller;

import com.example.pdsacw.dto.BillDTO;
import com.example.pdsacw.entity.Bill;
import com.example.pdsacw.repository.BillRepository;
import com.example.pdsacw.service.BillService;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;
    private final BillRepository billRepository;

    public BillController(BillService billService, BillRepository billRepository) {
        this.billService = billService;
        this.billRepository = billRepository;
    }

    @PostMapping
    public BillDTO createBill(@Valid @RequestBody BillDTO billDTO) {
        Bill bill = billService.toEntity(billDTO);
        Bill savedBill = billRepository.save(bill);

        return billService.toDTO(savedBill);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable long id,@Valid @RequestBody Bill bill) {
        return billService.UpdateBill(bill, id);
    }

    @GetMapping
    public List<BillDTO> getAllBills() {
        return billRepository.findAll()
                .stream()
                .map(billService::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public BillDTO getBillById(@PathVariable long id) {
        Bill bill = billService.GetBillById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find Bill with id "+id+".")
                );
        return billService.toDTO(bill);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable long id) {
        billService.DeleteBillById(id);
    }
}
