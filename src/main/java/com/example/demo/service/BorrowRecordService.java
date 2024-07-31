package com.example.demo.service;

import com.example.demo.domain.BorrowRecord;

import java.util.Collection;
import java.util.Date;

public interface BorrowRecordService extends CrudService<BorrowRecord, Long> {
    Collection<BorrowRecord> getBorrowRecordsByUsername(String username);
    Collection<BorrowRecord> getBorrowRecordsByBookTitle(String title);
    Collection<BorrowRecord> getBorrowRecordsByBorrowDate(Date borrowDate);
    Collection<BorrowRecord> getBorrowRecordsByReturnDate(Date returnDate);
}
