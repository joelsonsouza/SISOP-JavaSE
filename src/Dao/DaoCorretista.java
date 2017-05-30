/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Beans.BeansCorretista;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;


public class DaoCorretista {
    
    ConexaoBD conex = new ConexaoBD();
    BeansCorretista mod = new BeansCorretista();
    
    public void Salvar (BeansCorretista mod){
    
        conex.conexao();
        
            try {
            PreparedStatement pst = conex.con.prepareStatement
            ("insert into tbl_corretista (nomecorretista,sexo,dtnasc,escolaridade,trabalhando,tipovinculo,"
                                        + "empresa,cargo,salario,telefone,celular,status)"
                                        + " values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomecorretista().toUpperCase());
            pst.setString(2, mod.getSexo());
            pst.setDate(3, new java.sql.Date(mod.getDtnasc().getTime()));
            pst.setString(4, mod.getEscolaridade());
            pst.setString(5, mod.getTrabalhando());
            pst.setString(6, mod.getTipovinculo());
            pst.setString(7, mod.getEmpresa().toUpperCase());
            pst.setString(8, mod.getCargo().toUpperCase());
            pst.setDouble(9, mod.getSalario());
            pst.setString(10, mod.getTelefone());
            pst.setString(11, mod.getCelular());            
            pst.setBoolean(12, mod.isStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Corretista já cadastrado\nErro: "+ex);
        }
        conex.desconecta();
    }
    
    public BeansCorretista Pesquisar (BeansCorretista mod){
    
        conex.conexao();
        conex.executaSql("select *from tbl_corretista where nomecorretista ilike'%"+mod.getNomecorretista()+"%'");
        try {

            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_corretista"));
            mod.setNomecorretista(conex.rs.getString("nomecorretista"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setDtnasc(conex.rs.getDate("dtnasc")); 
            mod.setEscolaridade(conex.rs.getString("escolaridade"));
            mod.setTrabalhando(conex.rs.getString("trabalhando"));
            mod.setTipovinculo(conex.rs.getString("tipovinculo"));
            mod.setEmpresa(conex.rs.getString("empresa"));
            mod.setCargo(conex.rs.getString("cargo"));
            mod.setSalario(conex.rs.getDouble("salario"));
            mod.setCelular(conex.rs.getString("celular"));
            mod.setTelefone(conex.rs.getString("telefone"));                       
            mod.setStatus(conex.rs.getBoolean("status"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }
        
        conex.desconecta();
        return mod;
    }
   
    public void Editar (BeansCorretista mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement
            ("update tbl_corretista set nomecorretista=?,sexo=?,dtnasc=?,escolaridade=?,trabalhando=?,tipovinculo=?,empresa=?,"
                                        + "cargo=?,salario=?,telefone=?,celular=?,"
                                        + "status=? where id_corretista=?");

            
            pst.setString(1, mod.getNomecorretista().toUpperCase());
            pst.setString(2, mod.getSexo());
            pst.setDate(3, new java.sql.Date(mod.getDtnasc().getTime()));
            pst.setString(4, mod.getEscolaridade());
            pst.setString(5, mod.getTrabalhando());
            pst.setString(6, mod.getTipovinculo());
            pst.setString(7, mod.getEmpresa().toUpperCase());
            pst.setString(8, mod.getCargo().toUpperCase());
            pst.setDouble(9, mod.getSalario());
            pst.setString(10, mod.getTelefone());
            pst.setString(11, mod.getCelular());            
            pst.setBoolean(12, mod.isStatus());
            pst.setInt(13, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }
    
    conex.desconecta();
    }
    
    public void Excluir (BeansCorretista mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_corretista where id_corretista=? and nomecorretista=? and status=false");
            
            pst.setString(2, mod.getNomecorretista());
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\n"
            + "Para realisar a exclusão o corretista não pode estar ativo\nErro:"+ex);   
        }       
    conex.desconecta();
    }
    
}


