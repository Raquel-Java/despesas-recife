package expense.recife.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import expense.recife.dto.ExpenseDto;
import expense.recife.entity.Expense;
import expense.recife.service.ExpenseServiceImpl;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/expense/v1")
public class ExpenseControl {
	
	@Autowired private ExpenseServiceImpl service;
	
	 
	 @CrossOrigin(origins = "*")
	 @GetMapping(value = "/grava-dados")
	 public void popularDb(){
		 try {
			 service.crudExpense();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getCause() + " | " + e.getMessage());
		}
	       
	 }
	 
	 @CrossOrigin(origins = "*")
	 @GetMapping(value = "/all")
	 public List<Expense> buscar(){
	      return service.getExpense();
	 }
	 
	 @CrossOrigin(origins = "*")
	 @GetMapping(value = "/by")
	 public ResponseEntity<?> buscarId(@RequestParam("id") String id, HttpServletRequest request){
	      return ResponseEntity.ok().body(service.getExpenseForById(id));
	 }
	 
	 @CrossOrigin(origins = "*")
	 @PostMapping(value = "/new")
	 public ResponseEntity<?> salvar(@RequestBody ExpenseDto obj){
		 return new ResponseEntity<Expense>(service.createExpense(obj), HttpStatus.OK);
	 }
	 
	 @CrossOrigin(origins = "*")
	 @PutMapping(value = "/update")
	 public ResponseEntity<Expense> atualizar(@RequestBody ExpenseDto obj){
		 return new ResponseEntity<Expense>(service.changeForExpense(obj), HttpStatus.OK);
	 }
	 
	 @CrossOrigin(origins = "*")
	 @DeleteMapping(value = "/by")
	 public void deletar(@RequestParam("id") String id, HttpServletRequest request){
		 service.removeExpense(id);
	 }
	 
	 
	 
	 

	
	

}
