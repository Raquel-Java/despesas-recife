package expense.recife.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "Expense")
public class Expense {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Integer ano_movimentacao;
	private Integer mes_movimentacao;
	private Integer orgao_codigo;
	private String orgao_nome;
	private Integer unidade_codigo;
	private Integer categoria_economica_codigo;
	private String categoria_economica_nome;
	private Integer grupo_despesa_codigo;
	private String grupo_despesa_nome;
	private Integer modalidade_aplicacao_codigo;
	private String modalidade_aplicacao_nome;
	private Integer elemento_codigo;
	private String elemento_nome;
	private Integer subelemento_codigo;
	private String subelemento_nome;
	private Integer funcao_codigo;
	private String funcao_nome;
	private Integer subfuncao_codigo;
	private String subfuncao_nome;
	private Integer programa_codigo;
	private String programa_nome;
	private Integer acao_codigo;
	private String acao_nome;
	private Integer fonte_recurso_codigo;
	private String fonte_recurso_nome;
	private Integer empenho_ano;
	private String empenho_modalidade_nome;
	private Integer empenho_modalidade_codigo;
	private Integer empenho_numero;
	private Integer subempenho;
	private String indicador_subempenho;
	private Integer credor_codigo;
	private String credor_nome;
	private Integer modalidade_licitacao_codigo;
	private String modalidade_licitacao_nome;
	private String valor_empenhado;
	private String valor_liquidado;
	private String valor_pago;
	
	
	public Expense(Integer ano_movimentacao, Integer mes_movimentacao, Integer orgao_codigo, String orgao_nome,
			Integer unidade_codigo, Integer categoria_economica_codigo, String categoria_economica_nome,
			Integer grupo_despesa_codigo, String grupo_despesa_nome, Integer modalidade_aplicacao_codigo,
			String modalidade_aplicacao_nome, Integer elemento_codigo, String elemento_nome, Integer subelemento_codigo,
			String subelemento_nome, Integer funcao_codigo, String funcao_nome, Integer subfuncao_codigo,
			String subfuncao_nome, Integer programa_codigo, String programa_nome, Integer acao_codigo, String acao_nome,
			Integer fonte_recurso_codigo, String fonte_recurso_nome, Integer empenho_ano,
			String empenho_modalidade_nome, Integer empenho_modalidade_codigo, Integer empenho_numero,
			Integer subempenho, String indicador_subempenho, Integer credor_codigo, String credor_nome,
			Integer modalidade_licitacao_codigo, String modalidade_licitacao_nome, String valor_empenhado,
			String valor_liquidado, String valor_pago) {
		this.ano_movimentacao = ano_movimentacao;
		this.mes_movimentacao = mes_movimentacao;
		this.orgao_codigo = orgao_codigo;
		this.orgao_nome = orgao_nome;
		this.unidade_codigo = unidade_codigo;
		this.categoria_economica_codigo = categoria_economica_codigo;
		this.categoria_economica_nome = categoria_economica_nome;
		this.grupo_despesa_codigo = grupo_despesa_codigo;
		this.grupo_despesa_nome = grupo_despesa_nome;
		this.modalidade_aplicacao_codigo = modalidade_aplicacao_codigo;
		this.modalidade_aplicacao_nome = modalidade_aplicacao_nome;
		this.elemento_codigo = elemento_codigo;
		this.elemento_nome = elemento_nome;
		this.subelemento_codigo = subelemento_codigo;
		this.subelemento_nome = subelemento_nome;
		this.funcao_codigo = funcao_codigo;
		this.funcao_nome = funcao_nome;
		this.subfuncao_codigo = subfuncao_codigo;
		this.subfuncao_nome = subfuncao_nome;
		this.programa_codigo = programa_codigo;
		this.programa_nome = programa_nome;
		this.acao_codigo = acao_codigo;
		this.acao_nome = acao_nome;
		this.fonte_recurso_codigo = fonte_recurso_codigo;
		this.fonte_recurso_nome = fonte_recurso_nome;
		this.empenho_ano = empenho_ano;
		this.empenho_modalidade_nome = empenho_modalidade_nome;
		this.empenho_modalidade_codigo = empenho_modalidade_codigo;
		this.empenho_numero = empenho_numero;
		this.subempenho = subempenho;
		this.indicador_subempenho = indicador_subempenho;
		this.credor_codigo = credor_codigo;
		this.credor_nome = credor_nome;
		this.modalidade_licitacao_codigo = modalidade_licitacao_codigo;
		this.modalidade_licitacao_nome = modalidade_licitacao_nome;
		this.valor_empenhado = valor_empenhado;
		this.valor_liquidado = valor_liquidado;
		this.valor_pago = valor_pago;
	}


	public Expense() {
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Integer getAno_movimentacao() {
		return ano_movimentacao;
	}


	public void setAno_movimentacao(Integer ano_movimentacao) {
		this.ano_movimentacao = ano_movimentacao;
	}


	public Integer getMes_movimentacao() {
		return mes_movimentacao;
	}


	public void setMes_movimentacao(Integer mes_movimentacao) {
		this.mes_movimentacao = mes_movimentacao;
	}


	public Integer getOrgao_codigo() {
		return orgao_codigo;
	}


	public void setOrgao_codigo(Integer orgao_codigo) {
		this.orgao_codigo = orgao_codigo;
	}


	public String getOrgao_nome() {
		return orgao_nome;
	}


	public void setOrgao_nome(String orgao_nome) {
		this.orgao_nome = orgao_nome;
	}


	public Integer getUnidade_codigo() {
		return unidade_codigo;
	}


	public void setUnidade_codigo(Integer unidade_codigo) {
		this.unidade_codigo = unidade_codigo;
	}


	public Integer getCategoria_economica_codigo() {
		return categoria_economica_codigo;
	}


	public void setCategoria_economica_codigo(Integer categoria_economica_codigo) {
		this.categoria_economica_codigo = categoria_economica_codigo;
	}


	public String getCategoria_economica_nome() {
		return categoria_economica_nome;
	}


	public void setCategoria_economica_nome(String categoria_economica_nome) {
		this.categoria_economica_nome = categoria_economica_nome;
	}


	public Integer getGrupo_despesa_codigo() {
		return grupo_despesa_codigo;
	}


	public void setGrupo_despesa_codigo(Integer grupo_despesa_codigo) {
		this.grupo_despesa_codigo = grupo_despesa_codigo;
	}


	public String getGrupo_despesa_nome() {
		return grupo_despesa_nome;
	}


	public void setGrupo_despesa_nome(String grupo_despesa_nome) {
		this.grupo_despesa_nome = grupo_despesa_nome;
	}


	public Integer getModalidade_aplicacao_codigo() {
		return modalidade_aplicacao_codigo;
	}


	public void setModalidade_aplicacao_codigo(Integer modalidade_aplicacao_codigo) {
		this.modalidade_aplicacao_codigo = modalidade_aplicacao_codigo;
	}


	public String getModalidade_aplicacao_nome() {
		return modalidade_aplicacao_nome;
	}


	public void setModalidade_aplicacao_nome(String modalidade_aplicacao_nome) {
		this.modalidade_aplicacao_nome = modalidade_aplicacao_nome;
	}


	public Integer getElemento_codigo() {
		return elemento_codigo;
	}


	public void setElemento_codigo(Integer elemento_codigo) {
		this.elemento_codigo = elemento_codigo;
	}


	public String getElemento_nome() {
		return elemento_nome;
	}


	public void setElemento_nome(String elemento_nome) {
		this.elemento_nome = elemento_nome;
	}


	public Integer getSubelemento_codigo() {
		return subelemento_codigo;
	}


	public void setSubelemento_codigo(Integer subelemento_codigo) {
		this.subelemento_codigo = subelemento_codigo;
	}


	public String getSubelemento_nome() {
		return subelemento_nome;
	}


	public void setSubelemento_nome(String subelemento_nome) {
		this.subelemento_nome = subelemento_nome;
	}


	public Integer getFuncao_codigo() {
		return funcao_codigo;
	}


	public void setFuncao_codigo(Integer funcao_codigo) {
		this.funcao_codigo = funcao_codigo;
	}


	public String getFuncao_nome() {
		return funcao_nome;
	}


	public void setFuncao_nome(String funcao_nome) {
		this.funcao_nome = funcao_nome;
	}


	public Integer getSubfuncao_codigo() {
		return subfuncao_codigo;
	}


	public void setSubfuncao_codigo(Integer subfuncao_codigo) {
		this.subfuncao_codigo = subfuncao_codigo;
	}


	public String getSubfuncao_nome() {
		return subfuncao_nome;
	}


	public void setSubfuncao_nome(String subfuncao_nome) {
		this.subfuncao_nome = subfuncao_nome;
	}


	public Integer getPrograma_codigo() {
		return programa_codigo;
	}


	public void setPrograma_codigo(Integer programa_codigo) {
		this.programa_codigo = programa_codigo;
	}


	public String getPrograma_nome() {
		return programa_nome;
	}


	public void setPrograma_nome(String programa_nome) {
		this.programa_nome = programa_nome;
	}


	public Integer getAcao_codigo() {
		return acao_codigo;
	}


	public void setAcao_codigo(Integer acao_codigo) {
		this.acao_codigo = acao_codigo;
	}


	public String getAcao_nome() {
		return acao_nome;
	}


	public void setAcao_nome(String acao_nome) {
		this.acao_nome = acao_nome;
	}


	public Integer getFonte_recurso_codigo() {
		return fonte_recurso_codigo;
	}


	public void setFonte_recurso_codigo(Integer fonte_recurso_codigo) {
		this.fonte_recurso_codigo = fonte_recurso_codigo;
	}


	public String getFonte_recurso_nome() {
		return fonte_recurso_nome;
	}


	public void setFonte_recurso_nome(String fonte_recurso_nome) {
		this.fonte_recurso_nome = fonte_recurso_nome;
	}


	public Integer getEmpenho_ano() {
		return empenho_ano;
	}


	public void setEmpenho_ano(Integer empenho_ano) {
		this.empenho_ano = empenho_ano;
	}


	public String getEmpenho_modalidade_nome() {
		return empenho_modalidade_nome;
	}


	public void setEmpenho_modalidade_nome(String empenho_modalidade_nome) {
		this.empenho_modalidade_nome = empenho_modalidade_nome;
	}


	public Integer getEmpenho_modalidade_codigo() {
		return empenho_modalidade_codigo;
	}


	public void setEmpenho_modalidade_codigo(Integer empenho_modalidade_codigo) {
		this.empenho_modalidade_codigo = empenho_modalidade_codigo;
	}


	public Integer getEmpenho_numero() {
		return empenho_numero;
	}


	public void setEmpenho_numero(Integer empenho_numero) {
		this.empenho_numero = empenho_numero;
	}


	public Integer getSubempenho() {
		return subempenho;
	}


	public void setSubempenho(Integer subempenho) {
		this.subempenho = subempenho;
	}


	public String getIndicador_subempenho() {
		return indicador_subempenho;
	}


	public void setIndicador_subempenho(String indicador_subempenho) {
		this.indicador_subempenho = indicador_subempenho;
	}


	public Integer getCredor_codigo() {
		return credor_codigo;
	}


	public void setCredor_codigo(Integer credor_codigo) {
		this.credor_codigo = credor_codigo;
	}


	public String getCredor_nome() {
		return credor_nome;
	}


	public void setCredor_nome(String credor_nome) {
		this.credor_nome = credor_nome;
	}


	public Integer getModalidade_licitacao_codigo() {
		return modalidade_licitacao_codigo;
	}


	public void setModalidade_licitacao_codigo(Integer modalidade_licitacao_codigo) {
		this.modalidade_licitacao_codigo = modalidade_licitacao_codigo;
	}


	public String getModalidade_licitacao_nome() {
		return modalidade_licitacao_nome;
	}


	public void setModalidade_licitacao_nome(String modalidade_licitacao_nome) {
		this.modalidade_licitacao_nome = modalidade_licitacao_nome;
	}


	public String getValor_empenhado() {
		return valor_empenhado;
	}


	public void setValor_empenhado(String valor_empenhado) {
		this.valor_empenhado = valor_empenhado;
	}


	public String getValor_liquidado() {
		return valor_liquidado;
	}


	public void setValor_liquidado(String valor_liquidado) {
		this.valor_liquidado = valor_liquidado;
	}


	public String getValor_pago() {
		return valor_pago;
	}


	public void setValor_pago(String valor_pago) {
		this.valor_pago = valor_pago;
	}

}


