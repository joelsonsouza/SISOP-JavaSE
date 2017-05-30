/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.BeansRoots;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;



/**
 *
 * @author Joelson
 */
public class DaoRoots {
  
    ConexaoBD conex = new ConexaoBD();
    BeansRoots modRoots = new BeansRoots();
    
    
    
    
    public void Salvar (BeansRoots modSal){
    
    conex.conexao();
    
    try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_roots (tipo, descricaotipo, periodo) values(?,?,?)");
            pst.setString(1, modSal.getTipo());
            pst.setString(2, modSal.getDescricao());
            pst.setString(3, modSal.getPeriodo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro já cadastado");
        }
  
    conex.desconecta(); 
    }
    
    public void Editar (BeansRoots modSal){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_roots set tipo=?, descricaotipo=?, periodo=? where id_tipo=?");
            pst.setString(1, modSal.getTipo().toUpperCase());
            pst.setString(2, modSal.getDescricao().toUpperCase());
            pst.setString(3, modSal.getPeriodo());  
            pst.setInt(4, modSal.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro já cadastado\n"+ex);
        }
    conex.desconecta(); 
    }
    
    public  BeansRoots Pesquisar (BeansRoots modSal){
    
    conex.conexao();
    conex.executaSql("select *from tbl_roots where descricaotipo ilike'%"+ modRoots.getDescricao()+"%'");
        try {
            conex.rs.first();
            modSal.setCodigo(conex.rs.getInt("id_tipo"));
            modSal.setTipo(conex.rs.getString("tipo"));
            modSal.setDescricao(conex.rs.getString("descricaotipo"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }  
    conex.desconecta();
    return modSal;
    }
     
    public void Excluir(BeansRoots modSal){
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_roots where id_tipo=? and descricaotipo=?");
            pst.setString(2, modSal.getDescricao());
            pst.setInt(1, modSal.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão:\nErro:"+ex);
        }    
    conex.desconecta();
    
    }   
}

