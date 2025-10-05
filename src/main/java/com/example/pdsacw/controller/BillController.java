package com.example.pdsacw.controller;

import com.example.pdsacw.entity.Bill;
import com.example.pdsacw.service.BillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billService.CreateBill(bill);
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
