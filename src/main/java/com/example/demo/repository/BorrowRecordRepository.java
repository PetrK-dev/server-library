package com.example.demo.repository;

import com.example.demo.domain.BorrowRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.Date;

@Repository
public interface BorrowRecordRepository extends CrudRepository<BorrowRecord, Long> {
    Collection<BorrowRecord> findByUser_Username(String username);
    Collection<BorrowRecord> findByBook_Title(String title);
    Collection<BorrowRecord> findByBorrowDate(Date borrowDate);
    Collection<BorrowRecord> findByReturnDate(Date returnDate);
}