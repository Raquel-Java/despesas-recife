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
		            	
		            	
		            	for (Object record : recordsList) {
		                    if (record instanceof LinkedHashMap) {
		                        LinkedHashMap<?, ?> recordMap = (LinkedHashMap<?, ?>) record;
		                        Expense ex = new Expense();
		                        
		                        ex.setId(Long.valueOf(recordMap.get("_id").toString()));  
		                        ex.setAno(Integer.valueOf(recordMap.get("ano_movimentacao").toString()));
		                        ex.setMes(Integer.valueOf(recordMap.get("mes_movimentacao").toString()));
		                        ex.setCodOrgao(Integer.valueOf(recordMap.get("orgao_codigo").toString()));
		                        ex.setNomeOrgao(String.valueOf(recordMap.get("orgao_nome").toString()));
		                        ex.setCodUnidade(String.valueOf(recordMap.get("unidade_codigo").toString()));  
		                        ex.setUnidade(String.valueOf(recordMap.get("unidade_nome").toString()));
		                        ex.setCodCategoriaEconomica(Integer.valueOf(recordMap.get("categoria_economica_codigo").toString()));
		                        ex.setCategoriaEconomica(String.valueOf(recordMap.get("categoria_economica_nome").toString()));
		                        ex.setCodGrupoDespesa(Integer.valueOf(recordMap.get("grupo_despesa_codigo").toString()));
		                        ex.setGrupoDespesa(String.valueOf(recordMap.get("grupo_despesa_nome").toString()));
		                        ex.setCodModalidadeAplicacao(Integer.valueOf(recordMap.get("modalidade_aplicacao_codigo").toString()));
		                        ex.setModalidadeAplicacao(String.valueOf(recordMap.get("modalidade_aplicacao_nome").toString()));
		                        ex.setCodElemento(Integer.valueOf(recordMap.get("elemento_codigo").toString()));
		                        ex.setElementoNome(String.valueOf(recordMap.get("elemento_nome").toString()));
		                        ex.setCodFuncao(Integer.valueOf(recordMap.get("funcao_codigo").toString()));
		                        ex.setFuncao(String.valueOf(recordMap.get("funcao_nome").toString()));
		                        ex.setCodSubfuncao(Integer.valueOf(recordMap.get("subfuncao_codigo").toString()));
		                        ex.setSubfuncao(String.valueOf(recordMap.get("subfuncao_nome").toString()));
		                        ex.setCodPrograma(Integer.valueOf(recordMap.get("programa_codigo").toString()));
		                        ex.setPrograma(String.valueOf(recordMap.get("programa_nome").toString()));
		                        ex.setCodAcao(Integer.valueOf(recordMap.get("acao_codigo").toString()));
		                        ex.setAcao(String.valueOf(recordMap.get("acao_nome").toString()));
		                        ex.setCodFonteRecurso(Integer.valueOf(recordMap.get("fonte_recurso_codigo").toString()));
		                        ex.setFonteRecurso(String.valueOf(recordMap.get("fonte_recurso_nome").toString()));
		                        ex.setEmpenhoAno(Integer.valueOf(recordMap.get("empenho_ano").toString()));
		                        ex.setEmpenhoModalidade(String.valueOf(recordMap.get("empenho_modalidade_nome").toString()));
		                        ex.setCodEmpenhoModalidade(Integer.valueOf(recordMap.get("empenho_modalidade_codigo").toString()));
		                        ex.setEmpenhoNumero(Integer.valueOf(recordMap.get("empenho_numero").toString()));
		                        ex.setSubEmpenho(Integer.valueOf(recordMap.get("subempenho").toString()));
		                        ex.setIndicadorSubempenho(String.valueOf(recordMap.get("indicador_subempenho").toString()));
		                        ex.setCodCredor(Integer.valueOf(recordMap.get("credor_codigo").toString()));
		                        ex.setSubElemento(String.valueOf(recordMap.get("subelemento_nome").toString()));
		                        ex.setCodSubElemento(Integer.valueOf(recordMap.get("subelemento_codigo").toString()));
		                        ex.setCredor(String.valueOf(recordMap.get("credor_nome").toString()));
		                        ex.setCodModalidadeLicitacao(Integer.valueOf(recordMap.get("modalidade_licitacao_codigo").toString()));
		                        ex.setModalidadeLicitacao(String.valueOf(recordMap.get("modalidade_licitacao_nome").toString()));
		                        ex.setValorEmpenhado(String.valueOf(recordMap.get("valor_empenhado").toString()));
		                        ex.setValorLiquido(String.valueOf(recordMap.get("valor_liquidado").toString()));
		                        ex.setValorPago(String.valueOf(recordMap.get("valor_pago").toString()));
		                        expenses.add(ex);
		                    }
		                }
		            	
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
