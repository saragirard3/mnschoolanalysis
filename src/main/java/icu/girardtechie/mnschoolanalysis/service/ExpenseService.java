package icu.girardtechie.mnschoolanalysis.service;

import icu.girardtechie.mnschoolanalysis.data.Expense;
import icu.girardtechie.mnschoolanalysis.data.ExpenseRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getDistName(){
        Iterable<Expense> expenses = this.expenseRepository.findAll();
        List<Expense> expenseList = new ArrayList<>();
        expenses.forEach(expense -> {expenseList.add(expense);});
        expenseList.sort(new Comparator<Expense>() {
            @Override
            public int compare(Expense o1, Expense o2) {
                if(o1.getDistName().equals(o2.getDistName())){
                    return o1.getDistName().compareTo(o2.getDistName());
                };
                return o1.getDistName().compareTo(o2.getDistName());
            }
        });
        return expenseList;
    }

}
