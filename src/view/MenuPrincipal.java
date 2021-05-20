package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Classe responsável por armazenar atributos e métodos do menu principal
 * 
 * @author Diego Munhoz
 * @since 04/03/2021
 * @version 1.0
 */
public class MenuPrincipal {

	// declaraçao de variaveis
	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menuCadastro;
	private JMenu menuConsulta;
	private JMenu menuSair;
	private JMenuItem itemMenuCadastrarCliente;
	private JMenuItem itemMenuCadastrarVendedor;
	private JMenuItem itemMenuCadastrarFilme;
	private JMenuItem itemMenuCadastrarLocacao;
	private JMenuItem itemMenuConsultaCliente;
	private JMenuItem itemMenuConsultaVendedor;
	private JMenuItem itemMenuConsultaFilme;
	private JMenuItem itemMenuSair;

	public void iniciaGui() {

		// Criação das instancias
		janela = new JFrame();

		barraMenu = new JMenuBar();
		menuCadastro = new JMenu();
		menuConsulta = new JMenu();

		itemMenuCadastrarCliente = new JMenuItem();
		itemMenuCadastrarVendedor = new JMenuItem();
		itemMenuCadastrarFilme = new JMenuItem();
		itemMenuCadastrarLocacao = new JMenuItem();
		itemMenuConsultaCliente = new JMenuItem();
		itemMenuConsultaVendedor = new JMenuItem();
		itemMenuConsultaFilme = new JMenuItem();

		itemMenuSair = new JMenuItem();
		menuSair = new JMenu();

		menuCadastro.setText("CADASTRO");
		menuConsulta.setText("CONSULTA");
		menuSair.setText("SAIR");

		// Adicionando os rotulos aos intens de menu
		itemMenuCadastrarCliente.setText("Cliente");
		itemMenuCadastrarVendedor.setText("Vendedor");
		itemMenuCadastrarFilme.setText("Filme");
		itemMenuCadastrarLocacao.setText("Locação");
		itemMenuConsultaCliente.setText("Cliente");
		itemMenuConsultaVendedor.setText("Vendedor");
		itemMenuConsultaFilme.setText("Filme");
		itemMenuSair.setText("Sair");

		// Adicionando os menus a barra de menu
		barraMenu.add(menuCadastro);
		barraMenu.add(menuConsulta);
		barraMenu.add(menuSair);

		// Adicionando os itens de menu no menuCadastro
		menuCadastro.add(itemMenuCadastrarCliente);
		menuCadastro.add(itemMenuCadastrarVendedor);
		menuCadastro.add(itemMenuCadastrarFilme);
		menuCadastro.add(itemMenuCadastrarLocacao);

		// adicionando os itens de menu no menuConsulta
		menuConsulta.add(itemMenuConsultaCliente);
		menuConsulta.add(itemMenuConsultaVendedor);
		menuConsulta.add(itemMenuConsultaFilme);

		// adicionando os itens de menu no menuSair
		menuSair.add(itemMenuSair);

		// Configurando as ações dos itens de menu
		itemMenuCadastrarCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new CadastrarCliente().iniciaGui();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		itemMenuCadastrarVendedor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new CadastrarVendedor().iniciaGui();
				;
			}
		});
		itemMenuCadastrarFilme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new CadastrarFilme().iniciaGui();
			}
		});
		itemMenuCadastrarLocacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new CadastrarLocacao().iniciaGui();
			}
		});

		itemMenuConsultaVendedor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ConsultarVendedor().iniciaGui();
			}
		});
		itemMenuConsultaFilme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ConsultarFilme().iniciaGui();
			}
		});
		itemMenuConsultaCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ConsultarCliente().iniciaGui();
			}
		});

		itemMenuSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int x = JOptionPane.showConfirmDialog(null, "Encerrar Sistema?", "Atenção", JOptionPane.YES_OPTION,
						JOptionPane.CANCEL_OPTION);
				if ((x == JOptionPane.YES_OPTION)) {
					System.exit(0);
				}
			}
		});

		// Configuraçoes da janela
		janela.setJMenuBar(barraMenu);
		janela.setTitle("LOCADORA");
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		janela.setVisible(true);

	}
}
