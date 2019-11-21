package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.insert;
import modelo.Cadastro;
import modelo.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTextField textFieldEndereco;
	private JTextField textFieldDescricao;
	private JTextField textFieldQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPizzariaDoPica = new JLabel("Pizzaria do Pica Pau");
		lblPizzariaDoPica.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPizzariaDoPica.setForeground(new Color(220, 20, 60));
		lblPizzariaDoPica.setBounds(34, 16, 314, 49);
		contentPane.add(lblPizzariaDoPica);
		
		JRadioButton radioButtonBordaRecheada = new JRadioButton("Borda Recheada");
		radioButtonBordaRecheada.setBackground(new Color(255, 245, 238));
		radioButtonBordaRecheada.setBounds(74, 229, 109, 23);
		contentPane.add(radioButtonBordaRecheada);
		
		JRadioButton radioButtonBordaNormal = new JRadioButton("Borda Normal");
		radioButtonBordaNormal.setBackground(new Color(255, 250, 240));
		radioButtonBordaNormal.setForeground(new Color(0, 0, 0));
		radioButtonBordaNormal.setBounds(74, 255, 109, 23);
		contentPane.add(radioButtonBordaNormal);
		
		JComboBox comboBoxPizzas = new JComboBox();
		comboBoxPizzas.setModel(new DefaultComboBoxModel(new String[] {"", "Calabresa", "Frango c/ catupiry", "Portuguesa", "Marguerita", "Mussarela", "Brigadeiro", "Napolitana", "Romeu e Julieta", "Atum", "California"}));
		comboBoxPizzas.setBounds(130, 169, 145, 20);
		contentPane.add(comboBoxPizzas);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setBounds(195, 230, 80, 20);
		contentPane.add(textFieldQuantidade);
		textFieldQuantidade.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(130, 76, 145, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldDescricao = new JTextField();
		textFieldDescricao.setBounds(74, 303, 201, 89);
		contentPane.add(textFieldDescricao);
		textFieldDescricao.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(130, 107, 145, 20);
		contentPane.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(130, 138, 145, 20);
		contentPane.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		JLabel labelTipoBorda = new JLabel("Qual borda?");
		labelTipoBorda.setBounds(74, 208, 80, 14);
		contentPane.add(labelTipoBorda);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o:");
		labelEndereco.setBounds(74, 138, 58, 14);
		contentPane.add(labelEndereco);
		
		JLabel labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(74, 110, 46, 14);
		contentPane.add(labelTelefone);
		
		JLabel labelSabor = new JLabel("Sabor:");
		labelSabor.setBounds(74, 171, 46, 14);
		contentPane.add(labelSabor);
		
		JLabel labelQuantidade = new JLabel("Quantidade:");
		labelQuantidade.setBounds(201, 208, 74, 14);
		contentPane.add(labelQuantidade);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(74, 79, 46, 14);
		contentPane.add(labelNome);
		
		JLabel labelValorTotal = new JLabel("Valor total");
		labelValorTotal.setBounds(148, 403, 58, 14);
		contentPane.add(labelValorTotal);
		
		JLabel labelValor = new JLabel("");
		labelValor.setBounds(130, 428, 89, 28);
		contentPane.add(labelValor);
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setForeground(new Color(240, 128, 128));
		buttonCadastrar.setBackground(new Color(240, 128, 128));
		buttonCadastrar.setBounds(130, 467, 89, 23);
		contentPane.add(buttonCadastrar);
		
		JLabel labelFundo = new JLabel("");
		labelFundo.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\Pizzaria\\src\\img\\wwpPizza.jpg"));
		labelFundo.setBounds(-14, -34, 378, 600);
		contentPane.add(labelFundo);
	
		buttonCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//construir classe modelo Cliente//
				Cadastro c = new Cadastro();
				
				//contruir classe para inserir dados//
				insert d = new insert();
				
				if(e.getSource()==buttonCadastrar) {
					
					c.setNome(textFieldNome.getText());
					c.setTelefone(textFieldTelefone.getText());
					c.setEndereco(textFieldEndereco.getText());
					c.setSabor(String.valueOf(comboBoxPizzas.getSelectedItem()));
					
					if(e.getSource()==radioButtonBordaNormal) {
						c.setBorda("Borda normal");
					}
					if(e.getSource()==radioButtonBordaRecheada) {
						c.setBorda("Borda recheada");
					}
					
					c.setQuantidade(Float.parseFloat(textFieldQuantidade.getText()));
					c.setDescricao(textFieldDescricao.getText());
					
					float quantidade = c.getQuantidade();
					
					if(c.getSabor().equals("Calabresa")) {
						c.setPreco(quantidade * 21.50);
					}
					else if(c.getSabor().equals("Frango c/ catupiry")) {
						c.setPreco(quantidade * 31.50);
					}
					else if(c.getSabor().equals("Portuguesa")) {
						c.setPreco(quantidade * 28.50);
					}
					else if(c.getSabor().equals("Marguerita")) {
						c.setPreco(quantidade * 27.50);
					}
					else if(c.getSabor().equals("Mussarela")) {
						c.setPreco(quantidade * 20.00);
					}
					else if(c.getSabor().equals("Brigadeiro")) {
						c.setPreco(quantidade * 25.50);
					}
					else if(c.getSabor().equals("Napolitana")) {
						c.setPreco(quantidade * 25.50);
					}
					else if(c.getSabor().equals("Romeu e Julieta")) {
						c.setPreco(quantidade * 29.50);
					}
					else if(c.getSabor().equals("Atum")) {
						c.setPreco(quantidade * 20.50);
					}
					else if(c.getSabor().equals("California")) {
						c.setPreco(quantidade * 22.50);
					}
					else if(c.getSabor().equals("")) {
						c.setPreco(quantidade * 0);
					}
					
					JOptionPane.showInputDialog(null, "Sua compra ficou no valor de R$ " + c.getPreco());
				}
			}
		});
	}
}
