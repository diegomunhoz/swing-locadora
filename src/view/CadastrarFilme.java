package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Classe responsável por armazenar atributos e métodos da tela Filme
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class CadastrarFilme {

	// variáveis do frame principal
	private JFrame janela;
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbValor;
	private JLabel lbDisponivel;
	private JLabel lbPromocao;
	private JLabel lbValorPromocao;
	private JLabel lbGenero;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfValor;
	private JTextField tfValorPromocao;
	private JRadioButton rbDisponivelSim;
	private JRadioButton rbDisponivelNao;
	private JRadioButton rbPromocaoSim;
	private JRadioButton rbPromocaoNao;
	private ButtonGroup grpDisponivel;
	private ButtonGroup grpPromocao;
	private JCheckBox cbFiccao;
	private JCheckBox cbAcao;
	private JCheckBox cbTerror;
	private JCheckBox cbComedia;
	private JCheckBox cbOutro;
	private JButton btNovo;
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btSair;
	private JPanel painel;

	/*
	 * Método responsável por iniciar tela de Cadastro de Filme
	 */
	public void iniciaGui() {
		
		/**
		 * configurações do JFrame - janela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("CADASTRO DE FILME");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(600, 360);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		// configurando a ação do clique X do Frame
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// cria as instancias dos objetos da aba FILME
		lbCodigo = new JLabel("Código:");
		lbNome = new JLabel("Nome:");
		lbValor = new JLabel("Valor:");
		lbDisponivel = new JLabel("Disponível:");
		lbPromocao = new JLabel("Promoção:");
		lbValorPromocao = new JLabel("Valor Promoção:");
		lbGenero = new JLabel("Gênero:");
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfValor = new JTextField();
		tfValorPromocao = new JTextField();
		btNovo = new JButton("NOVO");
		btSalvar = new JButton("SALVAR");
		btCancelar = new JButton("CANCELAR");
		btSair = new JButton("SAIR");
		cbAcao = new JCheckBox("Ação");
		cbComedia = new JCheckBox("Comédia");
		cbFiccao = new JCheckBox("Ficção");
		cbTerror = new JCheckBox("Terror");
		cbOutro = new JCheckBox("Outro");
		rbDisponivelSim = new JRadioButton();
		rbDisponivelNao = new JRadioButton();
		rbPromocaoSim = new JRadioButton();
		rbPromocaoNao = new JRadioButton();
		grpDisponivel = new ButtonGroup();
		grpPromocao = new ButtonGroup();

		// Define as Label's dos JRadionButton
		rbDisponivelSim.setText("Sim");
		rbDisponivelNao.setText("Nao");
		rbPromocaoSim.setText("Sim");
		rbPromocaoNao.setText("Nao");

		// define localização dos componentes de FILMES
		lbCodigo.setBounds(20, 20, 80, 20);
		lbNome.setBounds(20, 50, 40, 20);
		lbValor.setBounds(20, 80, 90, 20);
		lbDisponivel.setBounds(20, 110, 90, 20);
		lbPromocao.setBounds(20, 140, 90, 20);
		lbValorPromocao.setBounds(20, 170, 100, 20);
		lbGenero.setBounds(20, 200, 50, 20);
		tfCodigo.setBounds(120, 17, 420, 25);
		tfNome.setBounds(120, 47, 420, 25);
		tfValor.setBounds(120, 77, 420, 25);
		rbDisponivelSim.setBounds(120, 107, 50, 25);
		rbDisponivelNao.setBounds(180, 107, 50, 25);
		rbPromocaoSim.setBounds(120, 137, 50, 25);
		rbPromocaoNao.setBounds(180, 137, 50, 25);
		tfValorPromocao.setBounds(120, 167, 420, 25);
		cbAcao.setBounds(120, 197, 50, 24);
		cbFiccao.setBounds(175, 197, 58, 24);
		cbTerror.setBounds(238, 197, 58, 24);
		cbComedia.setBounds(301, 197, 73, 24);
		cbOutro.setBounds(380, 197, 55, 24);
		btNovo.setBounds(135, 250, 150, 30);
		btSalvar.setBounds(135, 250, 150, 30);
		btCancelar.setBounds(305, 250, 150, 30);
		btSair.setBounds(305, 250, 150, 30);

		// adiciona os botões ao grupo da aba FILME
		grpDisponivel.add(rbDisponivelSim);
		grpDisponivel.add(rbDisponivelNao);
		grpPromocao.add(rbPromocaoSim);
		grpPromocao.add(rbPromocaoNao);

		// Insere os componentes na primeira aba
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbCodigo);
		painel.add(lbNome);
		painel.add(lbValor);
		painel.add(lbDisponivel);
		painel.add(lbPromocao);
		painel.add(lbValorPromocao);
		painel.add(lbGenero);
		painel.add(tfCodigo);
		painel.add(tfNome);
		painel.add(tfValor);
		painel.add(rbDisponivelSim);
		painel.add(rbDisponivelNao);
		painel.add(rbPromocaoSim);
		painel.add(rbPromocaoNao);
		painel.add(tfValorPromocao);
		painel.add(btNovo);
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btSair);
		painel.add(cbAcao);
		painel.add(cbFiccao);
		painel.add(cbTerror);
		painel.add(cbComedia);
		painel.add(cbOutro);

		// Aciona os métodos dos JButton de FILME
		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				liberarTelaFilme();
			}
		});

		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				limparTela();
				bloquearTela();
			}
		});

		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				janela.dispose();
			}
		});

		bloquearTela();

		// Configura a janela
		janela.setVisible(true);

	}// fim do método inicia()

	/*
	 * Método responsável por desbloquar a tela de FILME
	 */
	public void liberarTelaFilme() {
		tfCodigo.setEditable(true);
		tfNome.setEditable(true);
		tfValor.setEditable(true);
		tfValorPromocao.setEditable(true);
		tfCodigo.grabFocus();
		btSalvar.setVisible(true);
		btNovo.setVisible(false);
		btCancelar.setVisible(true);
		btSair.setVisible(false);
		cbAcao.setEnabled(true);
		cbComedia.setEnabled(true);
		cbFiccao.setEnabled(true);
		cbOutro.setEnabled(true);
		cbTerror.setEnabled(true);
		rbDisponivelSim.setEnabled(true);
		rbDisponivelNao.setEnabled(true);
		rbPromocaoSim.setEnabled(true);
		rbPromocaoNao.setEnabled(true);
	}

	/*
	 * Método responsável por tela de FILME
	 */
	public void bloquearTela() {
		tfCodigo.setEditable(false);
		tfNome.setEditable(false);
		tfValor.setEditable(false);
		tfValorPromocao.setEditable(false);
		btSalvar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);
		btCancelar.setVisible(false);
		cbAcao.setEnabled(false);
		cbComedia.setEnabled(false);
		cbFiccao.setEnabled(false);
		cbOutro.setEnabled(false);
		cbTerror.setEnabled(false);
		rbDisponivelSim.setEnabled(false);
		rbDisponivelNao.setEnabled(false);
		rbPromocaoNao.setEnabled(false);
		rbPromocaoSim.setEnabled(false);
	}

	/*
	 * Método responsável por limpar os dados da tela de FILME
	 */
	public void limparTela() {
		tfCodigo.setText(null);
		tfNome.setText(null);
		tfValor.setText(null);
		tfValorPromocao.setText(null);
		cbAcao.setSelected(false);
		cbComedia.setSelected(false);
		cbFiccao.setSelected(false);
		cbOutro.setSelected(false);
		cbTerror.setSelected(false);
		grpDisponivel.clearSelection();
		grpPromocao.clearSelection();
	}

}// fim da classe