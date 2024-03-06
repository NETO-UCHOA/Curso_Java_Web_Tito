package aula12.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import aula12.model.Cao;

public class RepositorioCao {
	
	public void incluir(Cao cao) throws Exception{
		String sql = "INSERT INTO cachorro (nome,sexo,raca) VALUES(?,?,?)";
		try {
			Connection con = GerenciadorConexao.conectar();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, cao.getNome());
			pstm.setString(2, cao.getSexo());
			pstm.setString(3, cao.getRaca());
			
			pstm.execute();
			
			con.close();
		}catch(SQLException e) {
			throw new Exception();
		}
		
	}
	
	public void excluir(Integer id) throws Exception{
		String sql = "DELETE FROM cachorro WHERE id=?";
		try {
			Connection con = GerenciadorConexao.conectar();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			
			pstm.execute();
			
			con.close();
		}catch(SQLException e) {
			throw new Exception();
		}
	}
	
	public void alterar(Cao cao) throws Exception {
		String sql = "UPDATE cachorro SET nome=?, sexo=?, raca=? WHERE id=?";
		try {
			Connection con = GerenciadorConexao.conectar();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(4, cao.getId());
			pstm.setString(1, cao.getNome());
			pstm.setString(2, cao.getSexo());
			pstm.setString(3, cao.getRaca());
			
			pstm.execute();
			
			con.close();
		}catch(SQLException e) {
			throw new Exception();
		}
	}
	
	public List<Animal> listar() throws Exception{
		
	}
	
	public Animal get(Integer id) throws Exception {
		
	}

}
