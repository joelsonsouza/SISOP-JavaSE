/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.BeansContasBancarias;
import Beans.BeansCorretista;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author joels
 */
public class DaoContasBancarias {
    
    ConexaoBD conex = new ConexaoBD();
    BeansContasBancarias mod = new BeansContasBancarias();
    int codCorrentista;
    int codBanco;
    
    public void Salvar ( BeansContasBancarias mod){
        SalvaIdCorrentista(mod.getCorrentista());
        SalvaIdBank(mod.getBanco());
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_contbank (id_corretista,tipoconta,id_bank,tipocard,namecard,nuncard,dvencimento,cvv,agencont) values(?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, codCorrentista);
            pst.setString(2,mod.getTipodeconta());
            pst.setInt(3,codBanco);
            pst.setString(4, mod.getTcard());
            pst.setString(5, mod.getNomecard());
            pst.setString(6,mod.getNumcard());
            pst.setDate(7, new java.sql.Date(mod.getVenccarad().getTime()));
             pst.setString(8, mod.getCvvcard());
             pst.setString(9, mod.getAgencont());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o registro!\nErro: "+ex);
        } 
    conex.desconecta();
    
    }
    
    public void Editar (BeansContasBancarias mod){
    
    
    }
    
   public BeansContasBancarias Pesquisar (BeansContasBancarias mod){
       
   conex.conexao();
    conex.executaSql("select a.id_contbank, b.nomecorretista, a.tipoconta, c.nomebank, a.tipocard, a.namecard, a.nuncard, a.agencont, a.dvencimento, a.cvv from tbl_contbank as a "
            + "inner join tbl_corretista as b on (a.id_corretista = b.id_corretista)"
            + "inner join tbl_bank as c on (a.id_bank = c.id_bank) where id_contbank="+ mod.getCod()+"");
        try {
            conex.rs.first();
            mod.setCod(conex.rs.getInt("id_contbank"));
            mod.setCorrentista(conex.rs.getString("nomecorretista"));
            mod.setTipodeconta(conex.rs.getString("tipoconta"));
            mod.setBanco(conex.rs.getString("nomebank"));
            mod.setTcard(conex.rs.getString("tipocard"));
            mod.setNomecard(conex.rs.getString("namecard"));
            mod.setNumcard(conex.rs.getString("nuncard"));
            mod.setAgencont(conex.rs.getString("agencont"));
            mod.setVenccarad(conex.rs.getDate("dvencimento"));
            mod.setCvvcard(conex.rs.getString("cvv"));
            
  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }
   
    conex.desconecta();
    return mod;
    }
    
    public void Excluir (BeansContasBancarias mod){
    
    
    }
    
    public void SalvaIdCorrentista(String nomecorrentista){
    
        conex.conexao();
        conex.executaSql("select * from tbl_corretista where nomecorretista = '"+nomecorrentista+"'");
        try {
            conex.rs.first();
            codCorrentista=conex.rs.getInt("id_corretista");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar correntista\nErro:"+ex);
        }
        conex.desconecta();
    }
    
     public void SalvaIdBank(String nomebank){
    
        conex.conexao();
        conex.executaSql("select * from tbl_bank where nomebank = '"+nomebank+"'");
        try {
            conex.rs.first();
            codBanco=conex.rs.getInt("id_bank");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar banco\nErro:"+ex);
        }
        conex.desconecta();
    }
}
