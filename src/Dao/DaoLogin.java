/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.PreparedStatement;
import Beans.BeansLogin;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;



/**
 *
 * @author Joelson
 */
public class DaoLogin {
    
    ConexaoBD conex = new ConexaoBD();
    BeansLogin mod = new BeansLogin();
    String usuario;
    int codUsuario;
    Date dtacesso;
    Date horacesso;
    String data1, hora1;
    
   
    public void Salvar (BeansLogin mod){
    SalvaIdUsuario(mod.getUsuario());
    getPegaDataHoraAtual();
    //getPegaDataAtual();
    //getPegaHoraAtual();
    conex.conexao();
    
    try {
           PreparedStatement pst = conex.con.prepareStatement("insert into tbl_acessos (id_usuario,dtacesso,hracesso) values(?,?,?)");
 
            pst.setInt(1, codUsuario);
            
            pst.setString(2, data1);
            pst.setString(3, hora1);
            //pst.setDate(2, new java.sql.Date(dtacesso.getTime()));
           // pst.setDate(3, new java.sql.Date(horacesso.getTime()));
            pst.execute();
  
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, "Erro ao registrar o acesso\nERRO:"+ex);
        }
  
    conex.desconecta(); 
    }
    
    public  BeansLogin Pesquisar (BeansLogin mod){
    
    conex.conexao();
    conex.executaSql("select usuario, senha, perfil, nome from tbl_usuarios where usuario like'%"+ mod.getUsuario()+"%' and senha like'%"+ mod.getSenha()+"%'");
        try {
            conex.rs.first();
            mod.setUsuario(conex.rs.getString("usuario"));
            mod.setSenha(conex.rs.getString("senha"));
            mod.setPerfil(conex.rs.getString("perfil"));
            mod.setNome(conex.rs.getString("nome"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto");
        }  
    conex.desconecta();
    return mod;
    }

    public void SalvaIdUsuario(String usuario){
        //usuario = mod.getUsuario();
        conex.conexao();
        conex.executaSql("select *from tbl_usuarios where usuario = '"+usuario+"'");
        try {
            conex.rs.first();
            codUsuario=conex.rs.getInt("id_usuario");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao buscar Usuário"+ex);
        }
        conex.desconecta();
        
    }
    
    public BeansLogin PesquisarUsuario(BeansLogin mod){
    
        conex.conexao();
        conex.executaSql("select nome from tbl_usuarios where usuario ilike '%"+mod.getUsuario()+"%' LIMIT 1");
        try {
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome"));    
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado\nErro:"+ex);
        }
        conex.desconecta();
        return mod;    
    }

       public  SimpleDateFormat getPegaDataHoraAtual(){
                String data = "dd/MM/yyyy";	
                String hora = "h:mm - a";
		java.util.Date agora = new java.util.Date();
		SimpleDateFormat formata = new SimpleDateFormat(data);
		data1 = formata.format(agora);
		formata = new SimpleDateFormat(hora);
		hora1 = formata.format(agora);
        return formata;
	}

}