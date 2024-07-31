package com.example.demo.service;

import com.example.demo.domain.BorrowRecord;
import com.example.demo.repository.BorrowRecordRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
public class BorrowRecordServiceImpl extends CrudServiceImpl<BorrowRecord, Long> implements BorrowRecordService{

    private BorrowRecordRepository borrowRecordRepository;

    public BorrowRecordServiceImpl(BorrowRecordRepository borrowRecordRepository){
        this.borrowRecordRepository = borrowRecordRepository;
    }

    @Override
    public Collection<BorrowRecord> getBorrowRecordsByUsername(String username) {
        return borrowRecordRepository.findByUser_Username(username);
    }

    @Override
    public Collection<BorrowRecord> getBorrowRecordsByBookTitle(String title) {
        return borrowRecordRepository.findByBook_Title(title);
    }

    @Override
    public Collection<BorrowRecord> getBorrowRecordsByBorrowDate(Date borrowDate) {
        return borrowRecordRepository.findByBorrowDate(borrowDate);
    }

    @Override
    public Collection<BorrowRecord> getBorrowRecordsByReturnDate(Date returnDate) {
        return borrowRecordRepository.findByReturnDate(returnDate);
    }

    @Override
    public BorrowRecord update(Long id, BorrowRecord borrowRecordDetails) {
        Optional<BorrowRecord> optionalBorrowRecord = borrowRecordRepository.findById(id);
        if (optionalBorrowRecord.isPresent()) {
            BorrowRecord borrowRecord = optionalBorrowRecord.get();
            borrowRecord.setBook(borrowRecordDetails.getBook());
            borrowRecord.setUser(borrowRecordDetails.getUser());
            borrowRecord.setBorrowDate(borrowRecordDetails.getBorrowDate());
            borrowRecord.setReturnDate(borrowRecordDetails.getReturnDate());
            return borrowRecordRepository.save(borrowRecord);
        } else {
            return null;
        }
    }

    @Override
    protected CrudRepository<BorrowRecord, Long> getRepository() {
        return this.borrowRecordRepository;
    }
}