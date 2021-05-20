package model;

/**
 * Classe responsável por armarzenar os atributos e métodos do objeto Filme
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class Filme {

	private int codigo;
	private String nome;
	private String genero;
	private double valor;
	private boolean disponivel;
	private boolean promocao;
	private double valorPromocao;

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the disponivel
	 */
	public boolean isDisponivel() {
		return disponivel;
	}

	/**
	 * @param disponivel the disponivel to set
	 */
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	/**
	 * @return the promocao
	 */
	public boolean isPromocao() {
		return promocao;
	}

	/**
	 * @param promocao the promocao to set
	 */
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	/**
	 * @return the valorPromocao
	 */
	public double getValorPromocao() {
		return valorPromocao;
	}

	/**
	 * @param valorPromocao the valorPromocao to set
	 */
	public void setValorPromocao(double valorPromocao) {
		this.valorPromocao = valorPromocao;
	}

}
