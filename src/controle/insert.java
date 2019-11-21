package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Cadastro;
import visao.TelaPrincipal;

public class insert {
	
	
	//construir objeto de conexao//
	ConexaoDAO bd = new ConexaoDAO();
	
	//contruir objeto de tela cliente//
	TelaPrincipal dados = new TelaPrincipal();
	
	//passar no metodo de cadastros parametro da casse modelo cliente//
	public void cadastrar(Cadastro c) {
		
		//solicitar conexao ao banco//
		bd.conectaBanco();
		
		try {
			
			//dentro do objeto bd tem todas as informações de conexao e variavel stmt//
			
			//prepara o banco e inseri informações e cada ? indica o campo na tabela//
			
			PreparedStatement pst = bd.con.prepareStatement("insert into tbCadastro (nome,telefone,endereco,sabor,borda,quantidade,descricao,valorTotal) values(?,?,?,?,?,?,?,?,?)");
		
					
					//comando para inserir primeiro campo na tabela//
					pst.setString(1,c.getNome()) ;
					pst.setString(2,c.getTelefone()) ;
					pst.setString(3,c.getEndereco()) ;
					pst.setString(4,c.getSabor()) ;
					pst.setString(5,c.getBorda()) ;
					pst.setFloat(6,c.getQuantidade());
					pst.setString(7,c.getDescricao());
					pst.setFloat(8,c.getPreco());
			       
			       //executa comando na tabela///
			       
			       pst.executeUpdate();
			       
			       
			       //termina comando inserir informações no banco fecha o banco//
			       
			       pst.close();
			       
			       //mensagem caso inserir//
			       JOptionPane.showMessageDialog(null, "cadastrado com sucesso");
			       
			       //mensagem de erro caso nao consiga se conectar//
			       
		}catch(SQLException ex) {
			 JOptionPane.showMessageDialog(null, "cadastro nao realizado" +ex.getMessage());
		       
		}
	}



}
