package expense.recife.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import expense.recife.dto.ExpenseMensal;
import expense.recife.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
	
	@Query(nativeQuery = true,value = 
			"SELECT (Expense.mes), CAST(SUM(CAST(REPLACE(Expense.valor_Liquido, ',', '.') AS DECIMAL))AS VARCHAR) as liquido, "
			+ "CAST(SUM(CAST(REPLACE(Expense.valor_Pago, ',', '.') AS DECIMAL))AS VARCHAR) as pago, "
			+ "CAST(SUM(CAST(REPLACE(Expense.valor_Empenhado, ',', '.') AS DECIMAL))AS VARCHAR) as empenhado "
			+ "FROM Expense  GROUP BY (mes)  order by mes asc ")
	List<ExpenseRelDto> relMensal();

}
