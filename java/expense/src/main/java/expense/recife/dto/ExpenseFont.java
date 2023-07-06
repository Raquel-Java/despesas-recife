package expense.recife.dto;

public class ExpenseFont {
	
	private String fonteRecurso;
	private String liquido;
	private String pago;
	private String empenhado;
	
	public ExpenseFont() {
	}

	public ExpenseFont(String fonteRecurso, String liquido, String pago, String empenhado) {
		this.fonteRecurso = fonteRecurso;
		this.liquido = liquido;
		this.pago = pago;
		this.empenhado = empenhado;
	}

	public String getFonteRecurso() {
		return fonteRecurso;
	}

	public void setFonteRecurso(String fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
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
