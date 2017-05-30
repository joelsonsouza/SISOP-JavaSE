/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansRegistrarMov;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloConection.ConexaoBD;



public class DaoRegMov {
    
    ConexaoBD conex = new ConexaoBD();
    BeansRegistrarMov mod = new BeansRegistrarMov(); 
    //ConexaoBD conexPlaca = new ConexaoBD();
    
    String tipo;
    int idTipo;
 
    
    public void Salvar (BeansRegistrarMov mod) {              
        
        SalvaIdRaiz(mod.getDescricao());

        conex.conexao();
       
            try {
                            
            PreparedStatement pst = conex.con.prepareStatement
                ("insert into tbl_regmov (ano, mes, tipo, id_tipo, detalhamento, valor)"
                + " values(?,?,?,?,?,?)");
                     
                     pst.setInt(1, mod.getAno());
                     pst.setString(2, mod.getMes());
                     pst.setString(3, mod.getTipo());
                     pst.setInt(4, idTipo); //CRIAR FUNÇÃO
                     pst.setString(5, mod.getDetalhamento());;
                     pst.setDouble(6, mod.getValor());
                                                         
                     pst.execute();
                    JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
 
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Campo(s) obrigatório(s) sem preenchimento:\nOu erro de Banco de dados:\n"+ex);
            }
        conex.desconecta();
    }
     
    public  BeansRegistrarMov PesquisarReg (BeansRegistrarMov mod){
    
        conex.conexao();
    
        conex.executaSql("select a.id_regmov, a.ano, a.mes, a.tipo, b.descricaotipo, a.detalhamento, a.valor\n"
                        +"from tbl_regmov as a inner join  tbl_roots as b \n"
                        +"on (a.id_tipo = b.id_tipo)"
                        + "where id_regmov ="+mod.getCodigo());
                    try {
                        conex.rs.first();
                        mod.setCodigo(conex.rs.getInt("id_regmov")); //refazer para dados tbl_reg_at
                        mod.setAno(conex.rs.getInt("ano"));
                        mod.setMes(conex.rs.getString("mes"));
                        mod.setTipo(conex.rs.getString("tipo"));
                        mod.setDescricao(conex.rs.getString("descricaotipo"));
                        mod.setDetalhamento(conex.rs.getString("detalhamento")); 
                        mod.setValor(conex.rs.getDouble("valor"));
                       
                        



                    }catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao selecionar dados\n"+ex);
                    }

                    conex.desconecta();
                    return mod;
    }
   
    public void Editar (BeansRegistrarMov mod){
        
        SalvaIdRaiz(mod.getDescricao());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement
            ("update tbl_regmov set ano=?, mes=?, tipo=?, id_tipo=?, detalhamento=?, valor=? where id_regmov=? ");

                     pst.setInt(1, mod.getAno());
                     pst.setString(2, mod.getMes());
                     pst.setString(3, mod.getTipo());
                     pst.setInt(4, idTipo); //CRIAR FUNÇÃO
                     pst.setString(5, mod.getDetalhamento());
                     pst.setDouble(6, mod.getValor());
                     pst.setInt(7, mod.getCodigo());
                     pst.execute();
            
                     JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }   
    conex.desconecta();  
    }
    
    public void Excluir (BeansRegistrarMov mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_regmov as a where a.id_regmov=?");
            
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão:\nErro:"+ex);
        }    
    conex.desconecta();
    }
    

    public void SalvaIdRaiz(String descricao) {
    
        
        conex.conexao();
        conex.executaSql("select * from tbl_roots where descricaotipo = '"+descricao+"'");
        try {
            conex.rs.first();
            idTipo=conex.rs.getInt("id_tipo");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar raiz\nErro:"+ex);
        }
        conex.desconecta();
    }

    public void PesquisarGasto (int cod){
    
    conex.conexao();
    
        try {
            conex.executaSql("select * from tbl_roots where id_tipo="+cod);
            conex.rs.first();
            tipo = conex.rs.getString("descricaotipo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro\nERRO: "+ex);  
            
        }
    conex.desconecta();
    }
}
    
    


