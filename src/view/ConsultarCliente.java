package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Classe respons�vel por armazenar atributos e m�todos da tela de consulta de
 * clientes
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class ConsultarCliente {

	// declarando os atributos da tela
	private JFrame janela;
	private JPanel painel;
	private JButton btSair;
	private JTable tbTabela;
	private JScrollPane scroll;

	// vetores auxiliares para configurar a tabela de registros
	private String colunas[] = { "Nome", "Sexo", "Idade", "Cidade", "Celular" };
	private String linhas[][] = {};

	/*
	 * m�todo para configurar os componentes swing utilizados na tela de consulta
	 */
	public void iniciaGui() {

		janela = new JFrame();
		painel = (JPanel) janela.getContentPane();
		btSair = new JButton();

		// Configura��es da tabela,
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tbTabela = new JTable(modelo);
		tbTabela.setEnabled(true);
//		tbTabela.setBounds(10, 10, 760, 370);
		// configura��es do scroll
		scroll = new JScrollPane(tbTabela);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(01, 02, 760, 370);

		// configuracoes do bot�o
		btSair.setText("Sair");
		btSair.setBounds(320, 375, 120, 30);
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				janela.dispose();
			}
		});

		// Configura��es do painel da janela
		painel.setLayout(null);
		painel.add(scroll);
		painel.add(btSair);

		// Configura��es da janela
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janela.setTitle("CONSULTA DE CLIENTES CADASTRADOS ");
		janela.setSize(777, 450);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);

	}// fim do m�todo

}// fim da classe
