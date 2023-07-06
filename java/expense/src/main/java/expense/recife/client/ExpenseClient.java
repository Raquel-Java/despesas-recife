package expense.recife.client;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import expense.recife.entity.Expense;

@Component
public class ExpenseClient {
	
	private final String URL_EXPENSE_SERVICE_URI = "http://dados.recife.pe.gov.br/api/3/action/datastore_search";

	@Autowired
	RestTemplate restTemplate;
	
	public List<Expense>expenseForClient(){
		ResponseEntity<Expense> response = restTemplate.getForEntity(URL_EXPENSE_SERVICE_URI, Expense.class);
		return Arrays.asList(Objects.requireNonNull(response.getBody()));
	}
	
}
