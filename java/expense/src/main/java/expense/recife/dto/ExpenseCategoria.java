package expense.recife.dto;

public class ExpenseCategoria {
	
	private String categoriaEconomica;
	private String liquido;
	private String pago;
	private String empenhado;
	
	public ExpenseCategoria() {
	}

	public ExpenseCategoria(String categoriaEconomica, String liquido, String pago, String empenhado) {
		this.categoriaEconomica = categoriaEconomica;
		this.liquido = liquido;
		this.pago = pago;
		this.empenhado = empenhado;
	}

	public String getCategoriaEconomica() {
		return categoriaEconomica;
	}

	public void setCategoriaEconomica(String categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
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
