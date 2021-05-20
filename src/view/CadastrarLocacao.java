package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável por armazenar atributos e métodos da tela Locação
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class CadastrarLocacao {

	// declarando os atributos da tela
	private JFrame janelaLocacao;
	private JPanel painelDaJanelaLocacao;

	private JTable tabelaFilme;

	private JScrollPane painelDeScroll;

	private JLabel jlbNomeFilme;
	private JLabel jlbNomeVendedor;
	private JLabel jlbFormaPagamento;
	private JLabel jlbValorTotalFilme;
	private JLabel jlbValorPagoFilme;
	private JLabel jlbValorTrocoFilme;

	private JTextField jtfValorTotalFilme;
	private JTextField jtfValorPagoFilme;
	private JTextField jtfValorTrocoFilme;

	private JRadioButton rbtDinheiro;
	private JRadioButton rbtCheque;
	private JRadioButton rbtDebito;
	private JRadioButton rbtCredito;
	private ButtonGroup grpRadio;

	private JButton btnIncluirFilme;
	private JButton btnSalvarLocacao;
	private JButton btnCancelarLocacao;

	private JComboBox cboxFilme;
	private String[] filmeComps = {};

	private JComboBox cboxVendedor;
	private String[] vendedorComps = {};

	private String[] colunas = new String[] { "Código", "Nome", "Valor", "Disponível", "Promoção",
			"Valor Promocional" };
	private String[][] dados = new String[][] { {} };

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		janelaLocacao = new JFrame("LOCAÇÃO DE FILME");
		janelaLocacao.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janelaLocacao.setSize(700, 450);

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabelaFilme = new JTable(modelo);
		modelo.removeRow(0);

		painelDeScroll = new JScrollPane(tabelaFilme);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		jlbNomeFilme = new JLabel("Nome do Filme:");
		jlbNomeVendedor = new JLabel("Nome do Vendedor:");
		jlbFormaPagamento = new JLabel("Forma de Pagamento:");

		jlbValorTotalFilme = new JLabel("Valor Total:");
		jlbValorPagoFilme = new JLabel("Valor Pago:");
		jlbValorTrocoFilme = new JLabel("Troco:");

		jtfValorTotalFilme = new JTextField("R$ 0,00");
		jtfValorPagoFilme = new JTextField("");
		jtfValorTrocoFilme = new JTextField("R$ 0,00");

		rbtDinheiro = new JRadioButton();
		rbtCheque = new JRadioButton();
		rbtDebito = new JRadioButton();
		rbtCredito = new JRadioButton();

		grpRadio = new ButtonGroup();

		cboxVendedor = new JComboBox(vendedorComps);
		cboxFilme = new JComboBox(filmeComps);

		btnIncluirFilme = new JButton("INCLUIR");
		btnSalvarLocacao = new JButton("SALVAR");
		btnCancelarLocacao = new JButton("CANCELAR");

		rbtDinheiro.setText("Dinheiro");
		rbtCheque.setText("Cheque");
		rbtDebito.setText("Débito");
		rbtCredito.setText("Crédito");

		jlbNomeVendedor.setBounds(10, 20, 150, 30);
		jlbNomeFilme.setBounds(10, 60, 150, 30);
		jlbFormaPagamento.setBounds(10, 250, 150, 30);

		jlbValorTotalFilme.setBounds(380, 250, 150, 30);
		jlbValorPagoFilme.setBounds(380, 275, 150, 30);
		jlbValorTrocoFilme.setBounds(380, 300, 150, 30);

		jtfValorTotalFilme.setBounds(460, 250, 150, 30);
		jtfValorPagoFilme.setBounds(460, 275, 150, 30);
		jtfValorTrocoFilme.setBounds(460, 300, 150, 30);

		cboxVendedor.setBounds(160, 20, 500, 30);
		cboxFilme.setBounds(160, 60, 360, 30);

		painelDeScroll.setBounds(0, 110, 685, 135);
		tabelaFilme.setBounds(0, 110, 685, 135);

		rbtDinheiro.setBounds(160, 255, 100, 24);
		rbtCheque.setBounds(160, 280, 100, 24);
		rbtDebito.setBounds(160, 305, 100, 24);
		rbtCredito.setBounds(160, 330, 146, 24);

		btnIncluirFilme.setBounds(540, 60, 120, 30);
		btnSalvarLocacao.setBounds(220, 370, 120, 30);
		btnCancelarLocacao.setBounds(350, 370, 120, 30);

		grpRadio.add(rbtDinheiro);
		grpRadio.add(rbtCheque);
		grpRadio.add(rbtDebito);
		grpRadio.add(rbtCredito);

		tabelaFilme.setEnabled(false);

		painelDaJanelaLocacao = (JPanel) janelaLocacao.getContentPane();
		painelDaJanelaLocacao.setLayout(null);

		cboxVendedor.setSelectedIndex(-1);
		cboxFilme.setSelectedIndex(-1);

		painelDaJanelaLocacao.add(painelDeScroll);
		painelDaJanelaLocacao.add(jlbNomeFilme);
		painelDaJanelaLocacao.add(jlbNomeVendedor);
		painelDaJanelaLocacao.add(jlbFormaPagamento);
		painelDaJanelaLocacao.add(jlbValorTotalFilme);
		painelDaJanelaLocacao.add(jlbValorPagoFilme);
		painelDaJanelaLocacao.add(jlbValorTrocoFilme);
		painelDaJanelaLocacao.add(jtfValorTotalFilme);
		painelDaJanelaLocacao.add(jtfValorPagoFilme);
		painelDaJanelaLocacao.add(jtfValorTrocoFilme);
		painelDaJanelaLocacao.add(cboxFilme);
		painelDaJanelaLocacao.add(cboxVendedor);
		painelDaJanelaLocacao.add(rbtDinheiro);
		painelDaJanelaLocacao.add(rbtCheque);
		painelDaJanelaLocacao.add(rbtDebito);
		painelDaJanelaLocacao.add(rbtCredito);
		painelDaJanelaLocacao.add(btnSalvarLocacao);
		painelDaJanelaLocacao.add(btnCancelarLocacao);
		painelDaJanelaLocacao.add(btnIncluirFilme);

//		listarFilme();
//		listarVendedor();

		btnCancelarLocacao.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				janelaLocacao.dispose();
			}
		});

		btnSalvarLocacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btnIncluirFilme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		janelaLocacao.setLocationRelativeTo(null);
		janelaLocacao.setVisible(true);
	}// fim do método

}// fim da classe