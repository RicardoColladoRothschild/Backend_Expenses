package org.example.Controller;

import org.example.ErrorHandler.ResourceNotFoundException;
import org.example.Model.Expenses;
import org.example.Repository.IExpensableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpeseController {
    /*Dependecy injection*/
    @Autowired
    private IExpensableRepository expenseRepository;

    /*Since we are doing un dependency injection, y heredando de la interfaz de jpa, esta se encargara de ejectuar ese metodo*/
    @GetMapping("/")
    public List<Expenses> getAllExpenses(){
        return expenseRepository.findAll();
    }

    @PostMapping("/")
    public Expenses createExpense(@RequestBody Expenses expense){
        return expenseRepository.save(expense);
    }

    @PutMapping("/{id}")
    public Expenses updateExpense(@PathVariable Long id, @RequestBody Expenses expensesDetails){

            Expenses expense = expenseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Expense not found"));
        expense.setAmount(expensesDetails.getAmount());
        expense.setCategory(expensesDetails.getCategory());
        expense.setDescription(expensesDetails.getDescription());
        expense.setInvoiceUrl(expensesDetails.getInvoiceUrl());

        return expenseRepository.save(expense);

    }
}
