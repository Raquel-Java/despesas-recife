package expense.recife.dto;

public class ExpenseMensal {
	
	private Integer mes;
	String liquido;
	String pago;
	String empenhado;
	
	public ExpenseMensal() {
	}

	public ExpenseMensal(Integer mes, String liquido, String pago, String empenhado) {
		this.mes = mes;
		this.liquido = liquido;
		this.pago = pago;
		this.empenhado = empenhado;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public String getLiquido() {
		return liquido;
	}

	public void setLiquido(String liquido) {
		this.liquido = liquido;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public String getEmpenhado() {
		return empenhado;
	}

	public void setEmpenhado(String empenhado) {
		this.empenhado = empenhado;
	}
	
	
}
