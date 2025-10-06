package com.example.pdsacw.service;

import com.example.pdsacw.dto.BillDTO;
import com.example.pdsacw.entity.Bill;
import com.example.pdsacw.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Bill> GetBillById(long id) {
        return billRepository.findById(id);
    }

    public void DeleteBillById(long id) {
        billRepository.deleteById(id);
    }

    public Bill UpdateBill(Bill bill, long id) {
        Bill existingBill = billRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bill not found"));

        existingBill.setBillAmount(bill.getBillAmount());
        existingBill.setBillDate(bill.getBillDate());
        existingBill.setBillDescription(bill.getBillDescription());
        existingBill.setBillId(bill.getBillId());
        existingBill.setBillType(bill.getBillType());

        return billRepository.save(existingBill);
    }

    public BillDTO toDTO(Bill bill) {
        return new BillDTO(
                bill.getBillId(),
                bill.getBillDescription(),
                bill.getBillType(),
                bill.getBillDate(),
                bill.getBillAmount()
        );
    }

    public Bill toEntity(BillDTO dto) {
        Bill bill = new Bill();
        bill.setBillId(dto.getId());
        bill.setBillDescription(dto.getBillDescription());
        bill.setBillType(dto.getBillType());
        bill.setBillAmount(dto.getBillAmount());
        bill.setBillDate(dto.getBillDate());

        return bill;
    }
}
