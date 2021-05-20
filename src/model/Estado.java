package model;

/**
 * Classe responsável por armarzenar os atributos e métodos do objeto Estado
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class Estado {

	private String uf;
	private String nome;

	public Estado() {
	}

	public Estado(String uf, String nome) {
		this.uf = uf;
		this.nome = nome;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
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

}
