package com.expense.repository;

import com.expense.entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // SELECT * FROM table WHERE category = xyz
    Page<Expense> findByUserIdAndCategory(Long userId, String category, Pageable page);

    // SELECT * FROM table WHERE name LIKE '%keyword%'
    Page<Expense> findByUserIdAndNameContaining(Long userId, String keyword, Pageable page);

    // SELECT * FROM table WHERE date BETWEEN 'startDate' AND 'endDate'
    Page<Expense> findByUserIdAndDateBetween(Long userId, Date startDate, Date endDate, Pageable page);

    Page<Expense> findByUserId(Long id, Pageable page);

    Optional<Expense> findByUserIdAndId(Long userID, Long expenseId);
}
