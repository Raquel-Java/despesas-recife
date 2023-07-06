package expense.recife.client;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExpenseClient {
	
	private final String URL_EXPENSE_SERVICE_URI = "http://dados.recife.pe.gov.br/api/3/action/datastore_search?resource_id=d4d8a7f0-d4be-4397-b950-f0c991438111&limit=30";

	@Autowired
	RestTemplate restTemplate;
	
	public List<Object>expenseForClient(){
		ResponseEntity<Object> response = restTemplate.getForEntity(URL_EXPENSE_SERVICE_URI, Object.class);
		return Arrays.asList(Objects.requireNonNull(response.getBody()));
	}
	
	
	
}
