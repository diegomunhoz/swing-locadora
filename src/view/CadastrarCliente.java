package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import controller.EstadoController;
import model.Estado;

/**
 * @author dmunhoz
 *
 */
public class CadastrarCliente {

	private JFrame janela;
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbEndereco;
	private JLabel lbCpf;
	private JLabel lbRg;
	private JLabel lbDataNascimento;
	private JLabel lbSexo;
	private JLabel lbTelefone;
	private JLabel lbCelular;
	private JLabel lbEmail;
	private JLabel lblougradoro;
	private JLabel lbNumero;
	private JLabel lbComplemento;
	private JLabel lbCidade;
	private JLabel lbEstado;
	private JLabel lbBairro;
	private JLabel lbCep;
	@SuppressWarnings("rawtypes")
	private JComboBox cbLougradouro;
	@SuppressWarnings("rawtypes")
	private JComboBox cbEstado;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfNumero;
	private JTextField tfComplemento;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfCep;
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JFormattedTextField tfData;
	private JFormattedTextField tfTelefone;
	private JFormattedTextField tfCelular;
	private JTextField tfEmail;
	private JRadioButton rbMasculino;
	private JRadioButton rbFeminino;
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btNovo;
	private JButton btSair;
	public String lougradouros[] = { " - ", "Alameda", "Avenida", "Estrada", "Quadra", "Rodovia", "Rua", "Travessa" };
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;
	private MaskFormatter fmtCelular;
	private MaskFormatter fmtCep;
	private ButtonGroup grupoRadioSexo;

	private JPanel painel;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void iniciaGui() throws ParseException {

		// Criação das instancias de formato
		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##)####-####");
		fmtCelular = new MaskFormatter("(##)#####-####");
		fmtCep = new MaskFormatter("#####-###");

		// Cria o objeto dos grupos de botões
		grupoRadioSexo = new ButtonGroup();

		// inicialização das instancias
		janela = new JFrame();
		painel = (JPanel) janela.getContentPane();
		lbCodigo = new JLabel();
		lbNome = new JLabel();
		lbEndereco = new JLabel();
		lbCpf = new JLabel();
		lbRg = new JLabel();
		lbDataNascimento = new JLabel();
		lbSexo = new JLabel();
		lbEmail = new JLabel();
		lbTelefone = new JLabel();
		lbCelular = new JLabel();
		lblougradoro = new JLabel();
		lbNumero = new JLabel();
		lbComplemento = new JLabel();
		lbCidade = new JLabel();
		lbEstado = new JLabel();
		lbBairro = new JLabel();
		lbCep = new JLabel();
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfEndereco = new JTextField();
		tfTelefone = new JFormattedTextField(fmtTelefone);
		tfCelular = new JFormattedTextField(fmtCelular);
		tfEmail = new JTextField();
		tfEndereco = new JTextField();
		tfNumero = new JTextField();
		tfComplemento = new JTextField();
		tfBairro = new JTextField();
		tfCep = new JFormattedTextField(fmtCep);
		rbMasculino = new JRadioButton();
		rbFeminino = new JRadioButton();
		btSalvar = new JButton();
		btCancelar = new JButton();
		btNovo = new JButton();
		btSair = new JButton();
		tfCpf = new JFormattedTextField(fmtCpf);
		tfRg = new JFormattedTextField(fmtRg);
		tfData = new JFormattedTextField(fmtDataNascimento);
		tfCidade = new JTextField();
		cbLougradouro = new JComboBox(lougradouros);
		cbEstado = new JComboBox();

		// Adicionando os botões ao grupo
		grupoRadioSexo.add(rbMasculino);
		grupoRadioSexo.add(rbFeminino);

		// configuraçao de texto das labels
		lbCodigo.setText("Código:");
		lbNome.setText("Nome:");
		lbEndereco.setText("Endereço:");
		lbCpf.setText("CPF:");
		lbRg.setText("RG:");
		lbDataNascimento.setText("Nascimento:");
		lbSexo.setText("Sexo:");
		lbTelefone.setText("Telefone:");
		lbCelular.setText("Celular:");
		lbEmail.setText("Email:");
		lblougradoro.setText("Log:");
		lbNumero.setText("Nº:");
		lbComplemento.setText("Compl:");
		lbCidade.setText("Cidade:");
		lbEstado.setText("Estado:");
		lbBairro.setText("Bairro:");
		lbCep.setText("CEP:");

		// configurações das coordenadas dos componentes de código
		lbCodigo.setBounds(20, 25, 70, 25);
		tfCodigo.setBounds(80, 25, 50, 25);

		// configurações das coordenadas dos componentes de nome
		lbNome.setBounds(150, 25, 70, 25);
		tfNome.setBounds(200, 25, 370, 25);

		// configurações das coordenadas dos componentes de CPF

		lbCpf.setBounds(20, 60, 70, 25);
		tfCpf.setBounds(80, 60, 100, 25);

		// configurações das coordenadas dos componentes de rg
		lbRg.setBounds(200, 60, 30, 25);
		tfRg.setBounds(248, 60, 110, 25);

		// configurações das coordenadas dos componentes de data
		lbDataNascimento.setBounds(380, 60, 120, 25);
		tfData.setBounds(470, 60, 100, 25);

		// configurações das coordenadas dos componentes de Endereço
		lblougradoro.setBounds(20, 105, 90, 25);
		cbLougradouro.setBounds(80, 105, 90, 25);

		lbEndereco.setBounds(180, 105, 70, 25);
		tfEndereco.setBounds(248, 105, 230, 25);

		lbComplemento.setBounds(20, 145, 90, 25);
		tfComplemento.setBounds(80, 145, 70, 25);
		lbCidade.setBounds(400, 145, 90, 25);
		tfCidade.setBounds(460, 145, 110, 25);
		lbEstado.setBounds(20, 190, 90, 25);
		cbEstado.setBounds(80, 190, 110, 25);
		lbBairro.setBounds(180, 145, 90, 25);
		tfBairro.setBounds(248, 145, 140, 25);
		lbNumero.setBounds(492, 105, 80, 25);
		tfNumero.setBounds(520, 105, 50, 25);

		// configurações dos componentes de sexo
		rbMasculino.setText("Masculino");
		rbFeminino.setText("Feminino");
		lbSexo.setBounds(350, 190, 70, 25);
		rbMasculino.setBounds(390, 190, 90, 25);
		rbFeminino.setBounds(480, 190, 80, 25);

		// configurações dos componentes de cep
		lbCep.setBounds(200, 190, 70, 25);
		tfCep.setBounds(248, 190, 90, 25);

		// configurações das coordenadas dos componentes de Telefone
		lbTelefone.setBounds(80, 240, 120, 25);
		tfTelefone.setBounds(150, 240, 120, 25);

		// configurações das coordenadas dos componentes de Celular
		lbCelular.setBounds(290, 240, 120, 25);
		tfCelular.setBounds(350, 240, 150, 25);

		// configurações das coordenadas dos componentes de email
		lbEmail.setBounds(20, 280, 120, 25);
		tfEmail.setBounds(80, 280, 490, 25);

		// Configuracões dos Botões
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		btNovo.setText("Novo");
		btSair.setText("Sair");
		btSalvar.setBounds(160, 315, 130, 30);
		btNovo.setBounds(160, 315, 130, 30);
		btCancelar.setBounds(300, 315, 130, 30);
		btSair.setBounds(300, 315, 130, 30);

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				limparCampos();
				bloqueioInicial();
			}
		});
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				novo();
			}
		});

		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela.setVisible(false);
			}
		});

		// Configurações do painel da janela
		painel.setLayout(null);
		painel.setBorder(new TitledBorder("Clientes"));
		painel.add(lbCodigo);
		painel.add(tfCodigo);
		painel.add(lbNome);
		painel.add(tfNome);
		painel.add(lbEndereco);
		painel.add(tfEndereco);
		painel.add(lbCpf);
		painel.add(tfCpf);
		painel.add(lbRg);
		painel.add(tfRg);
		painel.add(lbDataNascimento);
		painel.add(tfData);
		painel.add(lbSexo);
		painel.add(rbMasculino);
		painel.add(rbFeminino);
		painel.add(lbTelefone);
		painel.add(tfTelefone);
		painel.add(lbCelular);
		painel.add(tfCelular);
		painel.add(lbEmail);
		painel.add(tfEmail);
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btNovo);
		painel.add(btSair);
		painel.add(cbLougradouro);
		painel.add(lblougradoro);
		painel.add(lbNumero);
		painel.add(tfNumero);
		painel.add(lbCidade);
		painel.add(tfCidade);
		painel.add(lbEstado);
		painel.add(cbEstado);
		painel.add(lbComplemento);
		painel.add(tfComplemento);
		painel.add(lbBairro);
		painel.add(tfBairro);
		painel.add(lbCep);
		painel.add(tfCep);

		carregarComboEstados();
		bloqueioInicial();

		// Configurações da janela
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janela.setTitle("CADASTRO DE CLIENTES");
		janela.setSize(605, 405);
//		janela.setUndecorated(true);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}// fim do método

	public void bloqueioInicial() {
		btNovo.setVisible(true);
		btSair.setVisible(true);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		tfCodigo.setEditable(false);
		tfCpf.setEditable(false);
		tfRg.setEditable(false);
		tfData.setEditable(false);
		tfNome.setEditable(false);
		tfCep.setEditable(false);
		tfBairro.setEditable(false);
		cbLougradouro.setEnabled(false);
		tfEndereco.setEditable(false);
		tfNumero.setEditable(false);
		tfComplemento.setEditable(false);
		tfCidade.setEditable(false);
		cbEstado.setEnabled(false);
		rbMasculino.setEnabled(false);
		rbFeminino.setEnabled(false);
		tfTelefone.setEditable(false);
		tfCelular.setEditable(false);
		tfEmail.setEditable(false);
	}

	public void limparCampos() {
		tfCodigo.setText("");
		tfNome.setText("");
		tfCpf.setText(null);
		tfRg.setText(null);
		tfRg.setText(null);
		tfData.setText(null);
		tfEndereco.setText(null);
		tfNumero.setText(null);
		tfComplemento.setText(null);
		tfCep.setText(null);
		tfBairro.setText(null);
		grupoRadioSexo.clearSelection();
		tfTelefone.setText(null);
		tfCelular.setText(null);
		tfEmail.setText(null);
		tfCidade.setText(null);
		cbLougradouro.setSelectedIndex(0);
		cbEstado.setSelectedIndex(0);
	}

	public void novo() {
		btNovo.setVisible(false);
		btSair.setVisible(false);
		btSalvar.setVisible(true);
		btCancelar.setVisible(true);
		tfCodigo.setEditable(true);
		tfCpf.setEditable(true);
		tfRg.setEditable(true);
		tfData.setEditable(true);
		tfNome.setEditable(true);
		tfCep.setEditable(true);
		tfBairro.setEditable(true);
		cbLougradouro.setEnabled(true);
		tfEndereco.setEditable(true);
		tfNumero.setEditable(true);
		tfComplemento.setEditable(true);
		tfCidade.setEditable(true);
		cbEstado.setEnabled(true);
		rbFeminino.setEnabled(true);
		rbMasculino.setEnabled(true);
		tfTelefone.setEditable(true);
		tfCelular.setEditable(true);
		tfEmail.setEditable(true);
		tfCodigo.grabFocus();
	}

	/*
	 * método para preencher a combo de estados
	 */
	private void carregarComboEstados() {
		// valor inicial da combo
		cbEstado.addItem("-Selecione Estado-");

		// laço de repetição para carregar a combo de estados
		for (Estado estado : new EstadoController().getEstados()) {
			cbEstado.addItem(estado.getNome());
		}

	}

}// fim da classe
