package expense.recife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import expense.recife.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
