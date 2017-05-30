/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author Joelson
 */
public class ConexaoBD {
    
    public Statement stm; // Preparar e realisar pesquisas
    public ResultSet rs; // Guardar Consulta realisada
    private String driver = "org.postgresql.Driver"; //Driver de conecçao
    private String caminho = "jdbc:postgresql://localhost:5432/sinf"; //Caminho do Banco de Dados
    private String usuario = "postgres"; //Usuário do BD
    private String senha = "JOELSONSS"; //Senha do BD
    public  Connection con; //Responssável por realizar a conecção ao banco
    
    public void conexao(){ //Método responssável por realizar a conexão com o BD
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conecção ao Banco bem sucedida");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão com o Banco de dados:\n"+ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Campo obrigatório sem preenchimento:\n"+ex.getMessage());
        }
        
    }
    
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar no banco:\n"+ex.getMessage());
        }
    
    
    
    }
        
    
    public void desconecta(){ //Método responssável por realizar a Saída do BD
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "BD desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerar a conexão com o Banco de dados:\n"+ex.getMessage());
        }
        
    }
    

}  
    
    
    
    
