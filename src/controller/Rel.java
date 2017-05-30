/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author joels
 */
public class Rel {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void RelGasPorAno (String ano){

                try{
                    conex.conexao();
                    conex.executaSql("SELECT a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor FROM tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) WHERE a.tipo = 'GASTO' and a.ano = '"+ano+"' order by mes,periodo");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/TemplateMovFinanceiras.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelGasPorMes (String ano, String mes){

                try{
                    conex.conexao();
                    conex.executaSql("select a.id_regmov, a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor from tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) where b.tipo='GASTO' and a.ano='"+ano+"' and a.mes='"+mes+"' order by periodo");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/TemplateMovFinanceiras.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelGasPorPeriodo (String ano, String mes, String periodo){

                try{
                    conex.conexao();
                    conex.executaSql("select a.id_regmov, a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor from tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) where b.tipo='GASTO' and a.ano='"+ano+"' and a.mes='"+mes+"' and b.periodo='"+periodo+"' order by descricaotipo desc");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/TemplateMovFinanceiras.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelRenPorAno (String ano){

                try{
                    conex.conexao();
                    conex.executaSql("SELECT a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor FROM tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) WHERE a.tipo = 'RENDA' and a.ano = '"+ano+"' order by mes,periodo DESC");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Renda.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelRenPorMes (String ano, String mes){

                try{
                    conex.conexao();
                    conex.executaSql("select a.id_regmov, a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor from tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) where b.tipo='RENDA' and a.ano='"+ano+"' and a.mes='"+mes+"'order by descricaotipo desc");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Renda.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelAplPorAno (String ano){

                try{
                    conex.conexao();
                    conex.executaSql("SELECT a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor FROM tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) WHERE a.tipo = 'GASTO' and a.ano = '"+ano+"'  and b.descricaotipo = 'FUND DE INVESTIMENTO' ");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Poupanca.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelAplPorMes (String ano, String mes){

                try{
                    conex.conexao();
                    conex.executaSql("select a.id_regmov, a.ano, a.mes, b.periodo, b.descricaotipo, a.detalhamento, a.valor from tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) where b.tipo='GASTO' and b.descricaotipo = 'FUND DE INVESTIMENTO' and a.ano='"+ano+"' and a.mes='"+mes+"'order by descricaotipo desc");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Poupanca.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void RelGasRenPorMes (String ano, String mes){

                try{
                    conex.conexao();
                    conex.executaSql("select a.id_regmov, a.ano, a.mes, b.tipo, b.periodo, b.descricaotipo, a.detalhamento, a.valor from tbl_regmov as a inner join tbl_roots as b on (a.id_tipo = b.id_tipo) where  a.ano='"+ano+"' and a.mes='"+mes+"'order by tipo desc, periodo desc");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Saldo.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
    }
    
    public void Caju (String nome){ //Caju: Método para emissão de relatórios de contas bancárias
        try{
                    conex.conexao();
                    conex.executaSql("SELECT a.id_contbank, b.nomecorretista, c.nomebank, a.tipocard, a.namecard, a.nuncard, a.agencont, a.dvencimento, a.cvv FROM tbl_contbank as a\n" +
"inner join tbl_corretista as b on (a.id_corretista = b.id_corretista)\n" +
"inner join tbl_bank as c on (a.id_bank = c.id_bank)\n" +
"where b.nomecorretista = '"+nome+"'");
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/ContasBancarias.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
                    JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
                    jv.setVisible(true);//chama para visualização
                    //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
                }
        
                catch (JRException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao carregar relatório\nErro:"+ex); 
               }
        
    
    }
    
}
