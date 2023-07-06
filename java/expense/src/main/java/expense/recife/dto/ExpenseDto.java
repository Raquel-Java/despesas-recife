package expense.recife.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class ExpenseDto {
	
	private Long id;
	Integer ano;
	Integer mes;
	Integer codOrgao;
	String nomeOrgao;
	String subElemento;
	String valorEmpenhado;
	String valorLiquido;
	String valorPago;
	
	public ExpenseDto(Integer ano, Integer mes, Integer codOrgao, String nomeOrgao, String subElemento,
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
	
	
	public ExpenseDto(Long id,Integer ano, Integer mes, Integer codOrgao, String nomeOrgao, String subElemento,
			String valorEmpenhado, String valorLiquido, String valorPago) {
		this.id =id;
		this.ano = ano;
		this.mes = mes;
		this.codOrgao = codOrgao;
		this.nomeOrgao = nomeOrgao;
		this.subElemento = subElemento;
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquido = valorLiquido;
		this.valorPago = valorPago;
	}

	public ExpenseDto() {
	}

	public Long getid() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getCodOrgao() {
		return codOrgao;
	}

	public void setCodOrgao(Integer codOrgao) {
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
