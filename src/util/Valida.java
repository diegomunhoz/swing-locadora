package util;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o do projeto
 * 
 * @author Diego Munhoz
 * @since 08/03/2021
 * @version 1.0
 */
public class Valida {
	
	/*
	 * m�todo para verificar se o campo � diferente de vazio ou nulo
	 */
	public static boolean isEmptyOrNull(String args) {
		// verificando se o argumento est� preenchido
		return (args.trim().equals("") || args == null);
	}
	
	/*
	 * m�todo para verificar se o campo � um inteiro
	 */
	public static boolean isInteger(String args) {
		try {
			Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/*
	 * m�todo para verificar se o campo � um double
	 */
	public static boolean isDouble(String args) {
		try {
			Double.parseDouble(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
