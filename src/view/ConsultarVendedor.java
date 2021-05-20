package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.VendedorController;
import model.Vendedor;

/**
 * Classe responsável por armazenar atributos e métodos da tela de consulta de
 * vendedor
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class ConsultarVendedor {

	// declarando os atributos da tela
	private JFrame janela;
	private JPanel painel;
	private JButton btSair;
	private JTable tbTabela;
	private JScrollPane scroll;

	// vetores auxiliares para configurar a tabela de registros
	private String colunas[] = { "Nome", "Area de venda", "Cidade", "Estado", "Sexo", "Idade", "Salario" };

	/*
	 * método para configurar os componentes swing utilizados na tela de consulta
	 */
	public void iniciaGui() {

		janela = new JFrame();
		painel = (JPanel) janela.getContentPane();
		btSair = new JButton();

		// Configurações da tabela,
		DefaultTableModel modelo = new DefaultTableModel(null, colunas);
		tbTabela = new JTable(modelo);
		tbTabela.setEnabled(true);
//				tbTabela.setBounds(10, 10, 760, 370);
		// configurações do scroll
		scroll = new JScrollPane(tbTabela);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(01, 02, 760, 370);

		// configuracoes do botão
		btSair.setText("Sair");
		btSair.setBounds(320, 375, 120, 30);
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				janela.setVisible(false);
			}
		});

		// Configurações do painel da janela
		painel.setLayout(null);
		painel.add(scroll);
		painel.add(btSair);

		// Configurações da janela
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janela.setTitle("CONSULTA DE VENDEDORES CADASTRADOS");
		janela.setSize(777, 450);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);

		// chamando o método para carregar a tela
		carregarTabela();

		// visibilidade da tela
		janela.setVisible(true);

	}// fim do método

	/*
	 * método para carregar a tabela com os vendedores gravados no arquivo TXT
	 */
	public void carregarTabela() {

		// obtendo o modelo da tabela criada
		DefaultTableModel modelo = (DefaultTableModel) tbTabela.getModel();

		// laço de repetição para preencher as linhas da tabela
		for (Vendedor vendedor : new VendedorController().getVendedores()) {

			// adicionando a linha na tabela
			modelo.addRow(new String[] { vendedor.getNome(), vendedor.getAreaVenda(), vendedor.getCidade(),
					vendedor.getEstado(), vendedor.getSexo() + "", vendedor.getIdade() + "",
					vendedor.getSalario() + "" });

		}

	}

}// fim da classe
