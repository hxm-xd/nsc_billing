package com.example.pdsacw.controller;

import com.example.pdsacw.entity.Bill;
import com.example.pdsacw.service.BillService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping
    public Bill createBill(@Valid @RequestBody Bill bill) {
        return billService.CreateBill(bill);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable long id,@Valid @RequestBody Bill bill) {
        return billService.UpdateBill(bill, id);
    }

    @GetMapping
    public List<Bill> getAllBills() {
        return billService.GetAllBills();
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable int id) {
        return billService.GetBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable long id) {
        billService.DeleteBillById(id);
    }
}
