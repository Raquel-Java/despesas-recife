package expense.recife.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class ExpenseDto {
	
	private String id;
	private String ano;
	private String mes;
	private String codOrgao;
	private String nomeOrgao;
	private String subElemento;
	private String valorEmpenhado;
	private String valorLiquido;
	private String valorPago;
	
	public ExpenseDto() {
	}

	public ExpenseDto(String ano, String mes, String codOrgao, String nomeOrgao, String subElemento,
			String valorEmpenhado, String valorLiquido, String valorPago) {
		this.ano = ano;
		this.mes = mes;
		this.codOrgao = codOrgao;
		this.nomeOrgao = nomeOrgao;
		this.subElemento = subElemento;
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquido = valorLiquido;
		this.valorPago = valorPago;
	}

	public ExpenseDto(String id, String ano, String mes, String codOrgao, String nomeOrgao, String subElemento,
			String valorEmpenhado, String valorLiquido, String valorPago) {
		this.id = id;
		this.ano = ano;
		this.mes = mes;
		this.codOrgao = codOrgao;
		this.nomeOrgao = nomeOrgao;
		this.subElemento = subElemento;
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquido = valorLiquido;
		this.valorPago = valorPago;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getCodOrgao() {
		return codOrgao;
	}

	public void setCodOrgao(String codOrgao) {
		this.codOrgao = codOrgao;
	}

	public String getNomeOrgao() {
		return nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getSubElemento() {
		return subElemento;
	}

	public void setSubElemento(String subElemento) {
		this.subElemento = subElemento;
	}

	public String getValorEmpenhado() {
		return valorEmpenhado;
	}

	public void setValorEmpenhado(String valorEmpenhado) {
		this.valorEmpenhado = valorEmpenhado;
	}

	public String getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(String valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public String getValorPago() {
		return valorPago;
	}

	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}
	
	

	
	

}