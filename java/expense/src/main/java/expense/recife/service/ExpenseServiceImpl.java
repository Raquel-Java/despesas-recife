package expense.recife.service;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expense.recife.client.ExpenseClient;
import expense.recife.entity.Expense;
import expense.recife.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	private ExpenseClient clientExpense;
	
	@Autowired private ExpenseRepository repository;

	@Override
	public List<Expense> getExpense() {
		
		List<Expense> expenses = new ArrayList<>();
		List<Object> list = clientExpense.expenseForClient();
		
		List<LinkedHashMap<?, ?>> linkedHashMapList = new ArrayList<>(); // Lista de LinkedHashMap

		if (list.size() >= 1) { // Verifica se a lista possui pelo menos dois elementos

		    Object secondElement = list.get(0); // Obtém o segundo elemento da lista

		    if (secondElement instanceof LinkedHashMap) { // Verifica se o segundo elemento é do tipo LinkedHashMap
		        LinkedHashMap<?, ?> linkedHashMap = (LinkedHashMap<?, ?>) secondElement; // Faz o cast para LinkedHashMap

		        // Acessa a chave "result" e o value correspondente, que é um LinkedHashMap
		        Object resultValue = linkedHashMap.get("result");

		        if (resultValue instanceof LinkedHashMap) { // Verifica se o value é do tipo LinkedHashMap
		            LinkedHashMap<?, ?> resultLinkedHashMap = (LinkedHashMap<?, ?>) resultValue; // Faz o cast para LinkedHashMap

		            // Acessa a lista "records" dentro do LinkedHashMap "result"
		            List<?> recordsList = (List<?>) resultLinkedHashMap.get("records");

		            // Verifica se a lista "records" não é nula e é uma lista
		            if (recordsList != null && recordsList instanceof List) {
		                // Aquiiiii pego os itens percorro pra insrir 
		            	//na entidade pra gravar no banco !!!
		            	Expense ex = new Expense();
		            	
		            	for (Object record : recordsList) {
		                    if (record instanceof LinkedHashMap) {
		                        LinkedHashMap<?, ?> recordMap = (LinkedHashMap<?, ?>) record;
		                        
		                
		                        ex.setId(Long.valueOf(recordMap.get("_id").toString()));
		                        ex.setCodOrgao(Integer.valueOf(recordMap.get("orgao_codigo").toString()));
		                       
		                    }
		                }
		            
		            	
		            	expenses.add(ex);
		            }
		        }
		    }
		}
		
		return expenses;
	}

//	@Override
//	public void changeForExpense(Expense expense, String id) {
//		repository.
//		
//	}

	@Override
	public void removeExpense(String id) {
		repository.deleteById(Long.valueOf(id));
		
	}

	@Override
	public Expense createExpense(Expense expense) {
		return repository.save(expense);
	}

}
