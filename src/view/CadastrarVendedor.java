package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.EstadoController;
import controller.VendedorController;
import model.Estado;
import model.Vendedor;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe respons�vel por armazenar atributos e m�todos da tela Vendedor
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class CadastrarVendedor {

	// vari�veis do frame principal
	private JFrame janela;
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbAreaVenda;
	private JLabel lbCidade;
	private JLabel lbEstado;
	private JLabel lbSexo;
	private JLabel lbIdade;
	private JLabel lbSalario;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfAreaVenda;
	private JTextField tfCidade;
	private JComboBox cboxEstado;
	private JTextField tfIdade;
	private JTextField tfSalario;
	private JRadioButton rbMasculino;
	private JRadioButton rbFeminino;
	private ButtonGroup grpSexo;
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btNovo;
	private JButton btSair;
	private JPanel painel;

	private String estados[] = {};

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("CADASTRO DE VENDEDOR");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(600, 360);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		// configurando a a��o do clique X do Frame
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// cria as instancias dos objetos da aba VENDEDOR
		lbCodigo = new JLabel("C�digo:");
		lbNome = new JLabel("Nome:");
		lbAreaVenda = new JLabel("Area de Venda:");
		lbCidade = new JLabel("Cidade:");
		lbEstado = new JLabel("Estado:");
		lbSexo = new JLabel("Sexo:");
		lbIdade = new JLabel("Idade:");
		lbSalario = new JLabel("Sal�rio:");
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfAreaVenda = new JTextField();
		tfCidade = new JTextField();
		cboxEstado = new JComboBox(estados);
		tfIdade = new JTextField();
		tfSalario = new JTextField();
		rbMasculino = new JRadioButton("Masculino");
		rbFeminino = new JRadioButton("Feminino");
		grpSexo = new ButtonGroup();
		btSalvar = new JButton("SALVAR");
		btCancelar = new JButton("CANCELAR");
		btNovo = new JButton("NOVO");
		btSair = new JButton("SAIR");

		// define localiza��o dos componentes de VENDEDOR
		lbCodigo.setBounds(20, 20, 80, 20);
		lbNome.setBounds(20, 50, 40, 20);
		lbAreaVenda.setBounds(20, 80, 90, 20);
		lbCidade.setBounds(20, 110, 60, 20);
		lbEstado.setBounds(20, 140, 60, 20);
		lbSexo.setBounds(20, 170, 40, 20);
		lbIdade.setBounds(20, 200, 40, 20);
		lbSalario.setBounds(20, 230, 50, 20);
		tfCodigo.setBounds(120, 17, 420, 25);
		tfNome.setBounds(120, 47, 420, 25);
		tfAreaVenda.setBounds(120, 77, 420, 25);
		tfCidade.setBounds(120, 107, 420, 25);
		cboxEstado.setBounds(120, 137, 300, 25);
		rbMasculino.setBounds(120, 167, 80, 25);
		rbFeminino.setBounds(220, 167, 80, 25);
		tfIdade.setBounds(120, 197, 420, 25);
		tfSalario.setBounds(120, 227, 420, 25);
		btNovo.setBounds(135, 270, 150, 30);
		btSalvar.setBounds(135, 270, 150, 30);
		btCancelar.setBounds(305, 270, 150, 30);
		btSair.setBounds(305, 270, 150, 30);

		// adiciona os bot�es ao grupo da aba VENDEDOR
		grpSexo.add(rbMasculino);
		grpSexo.add(rbFeminino);

		// Aciona os m�todos dos JButton de VENDEDOR
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				salvar();
			}
		});

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// m�todo para limpar os campos da tela
				limparTela();
				// m�todo para bloquear os campos da tela
				bloquearTela();
			}
		});

		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// m�todo para desbloquear a tela
				liberarTela();
			}
		});

		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// fecha a janela e mant�m o menu aberto
				janela.dispose();
			}
		});

		// Insere os componentes na segunda aba
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbCodigo);
		painel.add(lbNome);
		painel.add(lbAreaVenda);
		painel.add(lbCidade);
		painel.add(lbEstado);
		painel.add(lbSexo);
		painel.add(lbIdade);
		painel.add(lbSalario);
		painel.add(tfCodigo);
		painel.add(tfNome);
		painel.add(tfAreaVenda);
		painel.add(tfCidade);
		painel.add(cboxEstado);
		painel.add(rbMasculino);
		painel.add(rbFeminino);
		painel.add(tfIdade);
		painel.add(tfSalario);
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btNovo);
		painel.add(btSair);

		// chamando o m�todo para carregar a combo de estados
		carregarComboEstados();

		// bloqueando a tela ao iniciar
		bloquearTela();

		// configurar a visibilidade da tela
		janela.setVisible(true);

	}// fim do m�todo gui

	/*
	 * m�todo para bloquar a tela de cadastro
	 */
	private void bloquearTela() {
		tfCodigo.setEditable(false);
		tfNome.setEditable(false);
		tfAreaVenda.setEditable(false);
		tfCidade.setEditable(false);
		cboxEstado.setEnabled(false);
		tfIdade.setEditable(false);
		tfSalario.setEditable(false);
		rbMasculino.setEnabled(false);
		rbFeminino.setEnabled(false);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);
	}

	/*
	 * m�todo para liberar os campos da tela de cadastro
	 */
	private void liberarTela() {
		tfCodigo.setEditable(true);
		tfNome.setEditable(true);
		tfAreaVenda.setEditable(true);
		tfCidade.setEditable(true);
		cboxEstado.setEnabled(true);
		tfIdade.setEditable(true);
		tfSalario.setEditable(true);
		rbMasculino.setEnabled(true);
		rbFeminino.setEnabled(true);
		btSalvar.setVisible(true);
		btCancelar.setVisible(true);
		btNovo.setVisible(false);
		btSair.setVisible(false);
		tfCodigo.grabFocus();
	}

	/*
	 * m�todo para limpar os campos da tela de cadastro
	 */
	private void limparTela() {
		tfCodigo.setText(null);
		tfNome.setText(null);
		tfAreaVenda.setText(null);
		tfCidade.setText(null);
		tfIdade.setText(null);
		tfSalario.setText(null);
		grpSexo.clearSelection();
		cboxEstado.setSelectedIndex(0);
	}

	/*
	 * m�todo para preencher a combo de estados
	 */
	private void carregarComboEstados() {
		// valor inicial da combo
		cboxEstado.addItem("-Selecione Estado-");

		// la�o de repeti��o para carregar a combo de estados
		for (Estado estado : new EstadoController().getEstados()) {
			cboxEstado.addItem(estado.getNome());
		}

	}

	/*
	 * m�todo para receber a��o do clique salvar
	 */
	public void salvar() {

		// salvar o vendedor apenas se estiver v�lido todos os dados
		if (validar()) {
			
			/*
			 * procedimentos de grava��o do objeto Vendedor no arquivo TXT
			 */
			Vendedor vendedor = getVendedor();
			
			// chamando o m�todo respons�vel por gravar o arquivo TXT
			new VendedorController().gravarTxtVendedor(vendedor);
			
			// limpar a tela preenchida
			limparTela();
			
			// bloquear a tela 
			bloquearTela();
			
			// exibindo mensagem de sucesso para o usuario
			JOptionPane.showMessageDialog(null, Mensagem.vendedorGravado, Titulo.cadastroVendedor, 1);

		}

	}

	/*
	 * m�todo para validar os campos da tela
	 */
	private boolean validar() {

		// valida��o do campo c�digo
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// informando o usuario que o c�digo n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// informando ao usuario que o c�digo � inv�lido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do campo nome
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			// informando o usuario que o nome n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfNome.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do campo area de venda
		if (Valida.isEmptyOrNull(tfAreaVenda.getText())) {
			// informando o usuario que a area de venda n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.areaVendaVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfAreaVenda.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do campo cidade
		if (Valida.isEmptyOrNull(tfCidade.getText())) {
			// informando o usuario que a cidade n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.cidadeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCidade.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o da combo de estado
		if (cboxEstado.getSelectedIndex() == 0) {
			// informando o usuario que o estado n�o foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			cboxEstado.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do radio button de sexo
		if (!rbMasculino.isSelected()) {
			if (!rbFeminino.isSelected()) {
				// informando o usuario que o sexo n�o foi selecionado
				JOptionPane.showMessageDialog(null, Mensagem.sexoVazio, Titulo.cadastroVendedor, 0);
				// retornar false para o m�todo
				return false;
			}
		}

		// valida��o do campo idade
		if (Valida.isEmptyOrNull(tfIdade.getText())) {
			// informando o usuario que a idade n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.idadeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfIdade.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			// informando ao usuario que a idade � inv�lida
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfIdade.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do campo salario
		if (Valida.isEmptyOrNull(tfSalario.getText())) {
			// informando o usuario que o salario n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.salarioVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfSalario.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isDouble(tfSalario.getText())) {
			// informando ao usuario que o salario � inv�lido
			JOptionPane.showMessageDialog(null, Mensagem.salarioInvalido, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfSalario.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// devolvendo true caso esteja tudo v�lido
		return true;

	}// fim do m�todo validar
	
	/*
	 * m�todo para valorizar um objeto vendedor utilizando os campos da tela
	 */
	private Vendedor getVendedor() {
		
		// instanciando o objeto vendedor para retorno do m�todo
		Vendedor vendedor = new Vendedor();
		
		// valorizando o objeto vendedor
		vendedor.setCodigo(Util.getInt(tfCodigo.getText()));
		vendedor.setNome(tfNome.getText());
		vendedor.setAreaVenda(tfAreaVenda.getText());
		vendedor.setCidade(tfCidade.getText());
		vendedor.setEstado(cboxEstado.getSelectedItem() + "");
		
		// condicional tern�ria - if em uma linha -> ? se -> : sen�o
		vendedor.setSexo((rbMasculino.isSelected()) ? 'M' : 'F');
		
		vendedor.setIdade(Util.getInt(tfIdade.getText()));
		vendedor.setSalario(Util.getDouble(tfSalario.getText()));
		
		// retornando o objeto valorizado
		return vendedor;
		
	}// fim do m�todo getVendedor
	
	
	
	
	
	

}// fim da classe



