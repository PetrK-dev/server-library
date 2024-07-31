package com.example.demo.controller;

import com.example.demo.domain.BorrowRecord;
import com.example.demo.service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/borrowrecords")
public class BorrowRecordController {

    @Autowired
    private BorrowRecordService borrowRecordService;

    @GetMapping
    public Iterable<BorrowRecord> getAllBorrowRecords() {
        return borrowRecordService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BorrowRecord> getBorrowRecordById(@PathVariable Long id) {
        Optional<BorrowRecord> borrowRecord = borrowRecordService.readById(id);
        if (borrowRecord.isPresent()) {
            return ResponseEntity.ok(borrowRecord.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/user")
    public Collection<BorrowRecord> getBorrowRecordsByUsername(@RequestParam String username) {
        return borrowRecordService.getBorrowRecordsByUsername(username);
    }

    @GetMapping("/book")
    public Collection<BorrowRecord> getBorrowRecordsByBookTitle(@RequestParam String title) {
        return borrowRecordService.getBorrowRecordsByBookTitle(title);
    }

    @GetMapping("/borrowdate")
    public Collection<BorrowRecord> getBorrowRecordsByBorrowDate(@RequestParam Date borrowDate) {
        return borrowRecordService.getBorrowRecordsByBorrowDate(borrowDate);
    }

    @GetMapping("/returndate")
    public Collection<BorrowRecord> getBorrowRecordsByReturnDate(@RequestParam Date returnDate) {
        return borrowRecordService.getBorrowRecordsByReturnDate(returnDate);
    }

    @PostMapping
    public BorrowRecord createBorrowRecord(@RequestBody BorrowRecord borrowRecord) {
        return borrowRecordService.create(borrowRecord);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BorrowRecord> updateBorrowRecord(@PathVariable Long id, @RequestBody BorrowRecord borrowRecordDetails) {
        BorrowRecord updatedBorrowRecord = borrowRecordService.update(id, borrowRecordDetails);
        if (updatedBorrowRecord != null) {
            return ResponseEntity.ok(updatedBorrowRecord);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBorrowRecord(@PathVariable Long id) {
        borrowRecordService.deleteById(id);
    }
}