package com.expense.service;

import com.expense.entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.util.List;

public interface ExpenseService {

    Expense saveExpenseDetails(Expense expense);

    Expense getExpenseById(Long id);

    Page<Expense> getAllExpenses(Pageable page);

    Expense updateExpenseDetails(Long id, Expense expense);

    String deleteExpenseById(Long id);

    List<Expense> readByCategory(String category, Pageable page);

    List<Expense> readByName(String keyword, Pageable page);

    List<Expense> readByDate(Date startDate, Date endDate, Pageable page);
}
