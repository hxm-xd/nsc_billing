package com.example.pdsacw.service;

import com.example.pdsacw.entity.Bill;
import com.example.pdsacw.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Bill CreateBill(Bill bill) {
        return billRepository.save(bill);
    }

    public List<Bill> GetAllBills() {
        return billRepository.findAll();
    }

    public Bill GetBillById(long id) {
        return billRepository.getReferenceById(id);
    }

    public void DeleteBillById(long id) {
        billRepository.deleteById(id);
    }

    public Bill SaveBill(Bill bill) {
        return billRepository.save(bill);
    }
}
