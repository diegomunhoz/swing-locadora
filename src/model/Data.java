package model;

/**
 * Classe responsável por armarzenar os atributos e métodos do objeto Data
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class Data {

	private int dia;
	private int mes;
	private int ano;

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		String dia = "", mes = "";
		if (this.dia < 10) {
			dia = "0" + this.dia;
		}
		if (this.mes < 10) {
			mes = "0" + this.mes;
		}
		return dia + "/" + mes + "/" + this.ano;
	}
}
