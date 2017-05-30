/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.BeansDetalhamento;
import Beans.BeansRegistrarMov;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Joelson
 */
public class DaoDetalhamento {
  
    ConexaoBD conex = new ConexaoBD();
    BeansDetalhamento modDet = new BeansDetalhamento();
    BeansRegistrarMov reg = new BeansRegistrarMov();
    
    
    public void Salvar (BeansDetalhamento modDet){
    
    conex.conexao();
    
    try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_detdesc (detalhamento) values(?)");
            pst.setString(1, modDet.getDescricao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Detalhamento Salvo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Detalhamento já cadastado");
        }
  
    conex.desconecta(); 
    }
    
    public  BeansDetalhamento Pesquisar (BeansDetalhamento modDet){
    
    conex.conexao();
    conex.executaSql("select *from tbl_detdesc where detalhamento ilike'%"+ modDet.getDescricao()+"%'");
        try {
            conex.rs.first();
            modDet.setCodigo(conex.rs.getInt("id_det"));
            modDet.setDescricao(conex.rs.getString("detalhamento"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }  
    conex.desconecta();
    return modDet;
    }
   
    public void Editar (BeansDetalhamento modDet){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_detdesc set detalhamento=? where id_det=?");
            pst.setString(1, modDet.getDescricao().toUpperCase());
            pst.setInt(2, modDet.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "detalhamento já cadastado");
        }
    conex.desconecta(); 
    }
    
    public void Excluir(BeansDetalhamento modDet){
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_detdesc where id_det=? and detalhamento=?");
            pst.setString(2, modDet.getDescricao());
            pst.setInt(1, modDet.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }    
    conex.desconecta();
    
    }   
}

