package expense.recife.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "Expense")
public class Expense {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer ano;
	private Integer mes;
	private Integer codOrgao;
	private String nomeOrgao;
	private String codUnidade;
	private String unidade;
	private Integer codCategoriaEconomica;
	private String categoriaEconomica;
	private Integer codGrupoDespesa;
	private String grupoDespesa;
	private Integer codModalidadeAplicacao;
	private String modalidadeAplicacao;
	private Integer codElemento;
	private String elementoNome;
	private Integer codSubElemento;
	private String subElemento;
	private Integer codFuncao;
	private String funcao;
	private Integer codSubfuncao;
	private String subfuncao;
	private Integer codPrograma;
	private String programa;
	private Integer codAcao;
	private String acao;
	private Integer codFonteRecurso;
	private String fonteRecurso;
	private Integer empenhoAno;
	private String empenhoModalidade;
	private Integer codEmpenhoModalidade;
	private Integer empenhoNumero;
	private Integer subEmpenho;
	private String indicadorSubempenho;
	private Integer codCredor;
	private String credor;
	private Integer codModalidadeLicitacao;
	private String modalidadeLicitacao;
	private String valorEmpenhado;
	private String valorLiquido;
	private String valorPago;
	
	public Expense(Integer ano, Integer mes, Integer codOrgao, String nomeOrgao, String codUnidade,
			Integer codCategoriaEconomica, String categoriaEconomica, Integer codGrupoDespesa, String grupoDespesa,
			Integer codModalidadeAplicacao, String modalidadeAplicacao, Integer codElemento, String elementoNome,
			Integer codSubElemento, String subElemento, Integer codFuncao, String funcao, Integer codSubfuncao,
			String subfuncao, Integer codPrograma, String programa, Integer codAcao, String acao,
			Integer codFonteRecurso, String fonteRecurso, Integer empenhoAno, String empenhoModalidade,
			Integer codEmpenhoModalidade, Integer empenhoNumero, Integer subEmpenho, String indicadorSubempenho,
			Integer codCredor, String credor, Integer codModalidadeLicitacao, String modalidadeLicitacao,
			String valorEmpenhado, String valorLiquido, String valorPago,String unidade) {
		this.ano = ano;
		this.mes = mes;
		this.codOrgao = codOrgao;
		this.nomeOrgao = nomeOrgao;
		this.codUnidade = codUnidade;
		this.codCategoriaEconomica = codCategoriaEconomica;
		this.categoriaEconomica = categoriaEconomica;
		this.codGrupoDespesa = codGrupoDespesa;
		this.grupoDespesa = grupoDespesa;
		this.codModalidadeAplicacao = codModalidadeAplicacao;
		this.modalidadeAplicacao = modalidadeAplicacao;
		this.codElemento = codElemento;
		this.elementoNome = elementoNome;
		this.codSubElemento = codSubElemento;
		this.subElemento = subElemento;
		this.codFuncao = codFuncao;
		this.funcao = funcao;
		this.codSubfuncao = codSubfuncao;
		this.subfuncao = subfuncao;
		this.codPrograma = codPrograma;
		this.programa = programa;
		this.codAcao = codAcao;
		this.acao = acao;
		this.codFonteRecurso = codFonteRecurso;
		this.fonteRecurso = fonteRecurso;
		this.empenhoAno = empenhoAno;
		this.empenhoModalidade = empenhoModalidade;
		this.codEmpenhoModalidade = codEmpenhoModalidade;
		this.empenhoNumero = empenhoNumero;
		this.subEmpenho = subEmpenho;
		this.indicadorSubempenho = indicadorSubempenho;
		this.codCredor = codCredor;
		this.credor = credor;
		this.codModalidadeLicitacao = codModalidadeLicitacao;
		this.modalidadeLicitacao = modalidadeLicitacao;
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquido = valorLiquido;
		this.valorPago = valorPago;
		this.unidade = unidade;
	}
	
	public Expense(Integer ano, Integer mes, Integer codOrgao, String nomeOrgao,String subElemento,
			String valorEmpenhado, String valorLiquido, String valorPago){
		this.ano = ano;
		this.mes = mes;
		this.codOrgao = codOrgao;
		this.nomeOrgao = nomeOrgao;
		this.codUnidade = "";
		this.codCategoriaEconomica = 0;
		this.categoriaEconomica = "";
		this.codGrupoDespesa = 0;
		this.grupoDespesa = "";
		this.codModalidadeAplicacao = 0;
		this.modalidadeAplicacao = "";
		this.codElemento = 0;
		this.elementoNome = "";
		this.codSubElemento = 0;
		this.subElemento = subElemento;
		this.codFuncao = 0;
		this.funcao = "";
		this.codSubfuncao = 0;
		this.subfuncao = "";
		this.codPrograma = 0;
		this.programa = "";
		this.codAcao = 0;
		this.acao = "";
		this.codFonteRecurso = 0;
		this.fonteRecurso = "";
		this.empenhoAno = 2023;
		this.empenhoModalidade = "";
		this.codEmpenhoModalidade = 0;
		this.empenhoNumero = 0;
		this.subEmpenho = 0;
		this.indicadorSubempenho = "";
		this.codCredor = 0;
		this.credor = "";
		this.codModalidadeLicitacao = 0;
		this.modalidadeLicitacao = "";
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquido = valorLiquido;
		this.valorPago = valorPago;
		this.unidade = "";
		
	}
	
	public Expense(Long id,Integer ano, Integer mes, Integer codOrgao, String nomeOrgao,String subElemento,
			String valorEmpenhado, String valorLiquido, String valorPago){
		this.id=id;
		this.ano = ano;
		this.mes = mes;
		this.codOrgao = codOrgao;
		this.nomeOrgao = nomeOrgao;
		this.codUnidade = "";
		this.codCategoriaEconomica = 0;
		this.categoriaEconomica = "";
		this.codGrupoDespesa = 0;
		this.grupoDespesa = "";
		this.codModalidadeAplicacao = 0;
		this.modalidadeAplicacao = "";
		this.codElemento = 0;
		this.elementoNome = "";
		this.codSubElemento = 0;
		this.subElemento = subElemento;
		this.codFuncao = 0;
		this.funcao = "";
		this.codSubfuncao = 0;
		this.subfuncao = "";
		this.codPrograma = 0;
		this.programa = "";
		this.codAcao = 0;
		this.acao = "";
		this.codFonteRecurso = 0;
		this.fonteRecurso = "";
		this.empenhoAno = 2023;
		this.empenhoModalidade = "";
		this.codEmpenhoModalidade = 0;
		this.empenhoNumero = 0;
		this.subEmpenho = 0;
		this.indicadorSubempenho = "";
		this.codCredor = 0;
		this.credor = "";
		this.codModalidadeLicitacao = 0;
		this.modalidadeLicitacao = "";
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquido = valorLiquido;
		this.valorPago = valorPago;
		this.unidade = "";
		
	}
	
	
	public Expense() {
	}

	public Long getId() {
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

	public String getCodUnidade() {
		return codUnidade;
	}

	public void setCodUnidade(String codUnidade) {
		this.codUnidade = codUnidade;
	}

	public Integer getCodCategoriaEconomica() {
		return codCategoriaEconomica;
	}

	public void setCodCategoriaEconomica(Integer codCategoriaEconomica) {
		this.codCategoriaEconomica = codCategoriaEconomica;
	}

	public String getCategoriaEconomica() {
		return categoriaEconomica;
	}

	public void setCategoriaEconomica(String categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}

	public Integer getCodGrupoDespesa() {
		return codGrupoDespesa;
	}

	public void setCodGrupoDespesa(Integer codGrupoDespesa) {
		this.codGrupoDespesa = codGrupoDespesa;
	}

	public String getGrupoDespesa() {
		return grupoDespesa;
	}

	public void setGrupoDespesa(String grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	public Integer getCodModalidadeAplicacao() {
		return codModalidadeAplicacao;
	}

	public void setCodModalidadeAplicacao(Integer codModalidadeAplicacao) {
		this.codModalidadeAplicacao = codModalidadeAplicacao;
	}

	public String getModalidadeAplicacao() {
		return modalidadeAplicacao;
	}

	public void setModalidadeAplicacao(String modalidadeAplicacao) {
		this.modalidadeAplicacao = modalidadeAplicacao;
	}

	public Integer getCodElemento() {
		return codElemento;
	}

	public void setCodElemento(Integer codElemento) {
		this.codElemento = codElemento;
	}

	public String getElementoNome() {
		return elementoNome;
	}

	public void setElementoNome(String elementoNome) {
		this.elementoNome = elementoNome;
	}

	public Integer getCodSubElemento() {
		return codSubElemento;
	}

	public void setCodSubElemento(Integer codSubElemento) {
		this.codSubElemento = codSubElemento;
	}

	public String getSubElemento() {
		return subElemento;
	}

	public void setSubElemento(String subElemento) {
		this.subElemento = subElemento;
	}

	public Integer getCodFuncao() {
		return codFuncao;
	}

	public void setCodFuncao(Integer codFuncao) {
		this.codFuncao = codFuncao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Integer getCodSubfuncao() {
		return codSubfuncao;
	}

	public void setCodSubfuncao(Integer codSubfuncao) {
		this.codSubfuncao = codSubfuncao;
	}

	public String getSubfuncao() {
		return subfuncao;
	}

	public void setSubfuncao(String subfuncao) {
		this.subfuncao = subfuncao;
	}

	public Integer getCodPrograma() {
		return codPrograma;
	}

	public void setCodPrograma(Integer codPrograma) {
		this.codPrograma = codPrograma;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public Integer getCodAcao() {
		return codAcao;
	}

	public void setCodAcao(Integer codAcao) {
		this.codAcao = codAcao;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public Integer getCodFonteRecurso() {
		return codFonteRecurso;
	}

	public void setCodFonteRecurso(Integer codFonteRecurso) {
		this.codFonteRecurso = codFonteRecurso;
	}

	public String getFonteRecurso() {
		return fonteRecurso;
	}

	public void setFonteRecurso(String fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}

	public Integer getEmpenhoAno() {
		return empenhoAno;
	}

	public void setEmpenhoAno(Integer empenhoAno) {
		this.empenhoAno = empenhoAno;
	}

	public String getEmpenhoModalidade() {
		return empenhoModalidade;
	}

	public void setEmpenhoModalidade(String empenhoModalidade) {
		this.empenhoModalidade = empenhoModalidade;
	}

	public Integer getCodEmpenhoModalidade() {
		return codEmpenhoModalidade;
	}

	public void setCodEmpenhoModalidade(Integer codEmpenhoModalidade) {
		this.codEmpenhoModalidade = codEmpenhoModalidade;
	}

	public Integer getEmpenhoNumero() {
		return empenhoNumero;
	}

	public void setEmpenhoNumero(Integer empenhoNumero) {
		this.empenhoNumero = empenhoNumero;
	}

	public Integer getSubEmpenho() {
		return subEmpenho;
	}

	public void setSubEmpenho(Integer subEmpenho) {
		this.subEmpenho = subEmpenho;
	}

	public String getIndicadorSubempenho() {
		return indicadorSubempenho;
	}

	public void setIndicadorSubempenho(String indicadorSubempenho) {
		this.indicadorSubempenho = indicadorSubempenho;
	}

	public Integer getCodCredor() {
		return codCredor;
	}

	public void setCodCredor(Integer codCredor) {
		this.codCredor = codCredor;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public Integer getCodModalidadeLicitacao() {
		return codModalidadeLicitacao;
	}

	public void setCodModalidadeLicitacao(Integer codModalidadeLicitacao) {
		this.codModalidadeLicitacao = codModalidadeLicitacao;
	}

	public String getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	public void setModalidadeLicitacao(String modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
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


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
	
	
	
}


