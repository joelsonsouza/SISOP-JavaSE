/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansCadUsuarios;
import Beans.BeansLogin;
import modeloConection.ConexaoBD;



public class DaoCadUsuarios {
 
    ConexaoBD conex = new ConexaoBD();
    BeansCadUsuarios mod = new BeansCadUsuarios();
    
    public void Salvar(BeansCadUsuarios mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_usuarios (nome,usuario,senha,email,perfil,celular,ativo) values(?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2,mod.getLogin());
            pst.setString(3,mod.getSenha());
            pst.setString(4, mod.getEmail());
            pst.setString(5, mod.getPerfil());
            pst.setString(6,mod.getCelular());
             pst.setBoolean(7, mod.isAtivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Login já utilizado");
        } 
    conex.desconecta();
    }
    
    public void Editar(BeansCadUsuarios mod){
    
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_usuarios set nome=?,usuario=?,senha=?,email=?,perfil=?,celular=?,ativo=? where id_usuario=?");
            pst.setString(1, mod.getNome());
            pst.setString(2,mod.getLogin());
            pst.setString(3,mod.getSenha());
            pst.setString(4, mod.getEmail());
            pst.setString(5, mod.getPerfil());
            pst.setString(6,mod.getCelular());
            pst.setBoolean(7, mod.isAtivo());
            pst.setInt(8, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }
    
    conex.desconecta();
 
    }
    
    public void EditarMP(BeansCadUsuarios mod){
    
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_usuarios set senha=? where usuario=?");
            
            pst.setString(1,mod.getSenha());
            pst.setString(2, mod.getLogin());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }
    
    conex.desconecta();
 
    }
     
    public BeansCadUsuarios Pesquisar (BeansCadUsuarios mod){
    
    conex.conexao();
    conex.executaSql("select *from tbl_usuarios where usuario ilike'%"+ mod.getLogin()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_usuario"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setLogin(conex.rs.getString("usuario"));
            mod.setSenha(conex.rs.getString("senha"));
            mod.setEmail(conex.rs.getString("email"));
            mod.setPerfil(conex.rs.getString("perfil"));
            mod.setCelular(conex.rs.getString("celular"));
            mod.setAtivo(conex.rs.getBoolean("ativo"));
            
  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }     
    conex.desconecta();
    return mod;
    }
    
    public void Excluir (BeansCadUsuarios mod){
    
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_usuarios where id_usuario=? and nome=?");
            pst.setString(2, mod.getNome());
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }       
    conex.desconecta();
    
    }
    
    public BeansCadUsuarios RevelaPassword(BeansCadUsuarios mod){
    conex.conexao();
    conex.executaSql("select senha from tbl_usuarios where nome ilike '%"+mod.getNome()+"%'");
        try {
            conex.rs.first();
            mod.setSenha(conex.rs.getString("senha"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado"+ex);
        }     
    conex.desconecta();
    return mod;
    }
    
   

    
}
    
    

