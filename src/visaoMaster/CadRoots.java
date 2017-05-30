/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoMaster;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Beans.BeansRoots;
import Beans.BeansTabelas;
import Dao.DaoRoots;
import modeloConection.ConexaoBD;
import controller.UpperCase;

/**
 *
 * @author Professor
 */
public class CadRoots extends javax.swing.JFrame {
    
    ConexaoBD conex = new ConexaoBD();
    BeansRoots mod = new BeansRoots(); 
    DaoRoots control = new DaoRoots();
    int flag;
    
    
    public CadRoots() {
        initComponents();
       
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonImprimir.setEnabled(false);
        jLabelDescObg.setVisible(false);
        jTextFieldDescricao.setDocument(new UpperCase());
         jInternalFrameBuscaRaiz.setVisible(false);
         jLabelTipoObg.setVisible(false);
         jLabelDescObg.setVisible(false);
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBuscaRaiz = new javax.swing.JInternalFrame();
        jScrollPaneModelo = new javax.swing.JScrollPane();
        jTableRaiz = new javax.swing.JTable();
        jButtonSairIF = new javax.swing.JButton();
        jLabelFaixaMenu1 = new javax.swing.JLabel();
        JlabelFundoMenuIF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jComboBoxPeriodo = new javax.swing.JComboBox();
        jLabelPeriodp = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jLabelTipoObg = new javax.swing.JLabel();
        jLabelDescObg = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFaixaMenu = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Raizes");
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBuscaRaiz.setTitle("Selecionar Descrição");
        jInternalFrameBuscaRaiz.setVisible(true);
        jInternalFrameBuscaRaiz.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableRaiz.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTableRaiz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableRaiz.setGridColor(new java.awt.Color(255, 255, 255));
        jTableRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRaizMouseClicked(evt);
            }
        });
        jScrollPaneModelo.setViewportView(jTableRaiz);

        jInternalFrameBuscaRaiz.getContentPane().add(jScrollPaneModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 410, 130));

        jButtonSairIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSairIF.setToolTipText("Sair");
        jButtonSairIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairIFActionPerformed(evt);
            }
        });
        jInternalFrameBuscaRaiz.getContentPane().add(jButtonSairIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 30));

        jLabelFaixaMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu1.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        jInternalFrameBuscaRaiz.getContentPane().add(jLabelFaixaMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        JlabelFundoMenuIF.setBackground(new java.awt.Color(255, 255, 255));
        JlabelFundoMenuIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        JlabelFundoMenuIF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jInternalFrameBuscaRaiz.getContentPane().add(JlabelFundoMenuIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 420, 180));

        getContentPane().add(jInternalFrameBuscaRaiz);
        jInternalFrameBuscaRaiz.setBounds(100, 10, 430, 190);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Descricão:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 130, 80, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Período:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 80, 50, 30);

        jTextFieldDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(90, 130, 240, 30);

        jLabelCod.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCod.setText("Código:");
        getContentPane().add(jLabelCod);
        jLabelCod.setBounds(30, 40, 50, 30);

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setEnabled(false);
        getContentPane().add(jTextFieldCod);
        jTextFieldCod.setBounds(90, 40, 60, 30);

        jComboBoxPeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FIXO", "EVENTUAL" }));
        getContentPane().add(jComboBoxPeriodo);
        jComboBoxPeriodo.setBounds(390, 80, 140, 30);

        jLabelPeriodp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPeriodp.setText("Tipo:");
        jLabelPeriodp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabelPeriodp);
        jLabelPeriodp.setBounds(30, 80, 50, 30);

        jComboBoxTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GASTO", "RENDA" }));
        jComboBoxTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTipoMouseClicked(evt);
            }
        });
        getContentPane().add(jComboBoxTipo);
        jComboBoxTipo.setBounds(90, 80, 240, 30);

        jLabelTipoObg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelTipoObg.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTipoObg.setText("*");
        getContentPane().add(jLabelTipoObg);
        jLabelTipoObg.setBounds(40, 80, 30, 30);

        jLabelDescObg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDescObg.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDescObg.setText("*");
        getContentPane().add(jLabelDescObg);
        jLabelDescObg.setBounds(20, 130, 20, 30);

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/incluir.png"))); // NOI18N
        jButtonIncluir.setToolTipText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIncluir);
        jButtonIncluir.setBounds(10, 0, 45, 30);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/salvar.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(60, 0, 45, 30);

        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/apagar.png"))); // NOI18N
        jButtonApagar.setToolTipText("Deletar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApagar);
        jButtonApagar.setBounds(110, 0, 45, 30);

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/limpar.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimparMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonLimpar);
        jButtonLimpar.setBounds(160, 0, 45, 30);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Buscar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(210, 0, 45, 30);

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir");
        getContentPane().add(jButtonImprimir);
        jButtonImprimir.setBounds(260, 0, 45, 30);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(310, 0, 45, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("* Campos de preenchimento obrigatório.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 170, 220, 14);

        jLabelFaixaMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        getContentPane().add(jLabelFaixaMenu);
        jLabelFaixaMenu.setBounds(0, 0, 620, 30);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 30, 660, 180);

        setSize(new java.awt.Dimension(618, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        TbPanelControl selecTab = new TbPanelControl();
        selecTab.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMouseClicked
        jInternalFrameBuscaRaiz.setVisible(false);
         jLabelTipoObg.setVisible(false);
         jLabelDescObg.setVisible(false);
         jComboBoxTipo.setSelectedItem(null);
         jComboBoxPeriodo.setEnabled(false);
        
        jTextFieldDescricao.setText("");
        jTextFieldCod.setText("");
        jComboBoxPeriodo.setSelectedItem(null);
        jButtonIncluir.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparMouseClicked

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        if (jTextFieldDescricao.getText().isEmpty() || jComboBoxPeriodo.getSelectedItem() == null) {
            if(jTextFieldDescricao.getText().isEmpty()){
                jLabelDescObg.setVisible(true);
                JOptionPane.showMessageDialog(null, "Campo Obrigatório");
                jTextFieldDescricao.requestFocus();
            }
            if(jComboBoxPeriodo.getSelectedItem() == null){
                jLabelTipoObg.setVisible(true);
                JOptionPane.showMessageDialog(null, "Campo Obrigatório");
                jTextFieldDescricao.requestFocus();
            }
        }else {
        mod.setTipo((String) jComboBoxTipo.getSelectedItem());
        mod.setPeriodo((String) jComboBoxPeriodo.getSelectedItem());
        mod.setDescricao(jTextFieldDescricao.getText());
        
        control.Salvar(mod);
        jLabelDescObg.setVisible(false); 
        jLabelTipoObg.setVisible(false);
        }    
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
     
        if (jTextFieldDescricao.getText().isEmpty() || jComboBoxPeriodo.getSelectedItem() == null) {
            if(jTextFieldDescricao.getText().isEmpty()){
                jLabelDescObg.setVisible(true);
                JOptionPane.showMessageDialog(null, "Campo Obrigatório");
                jTextFieldDescricao.requestFocus();
            }
            if(jComboBoxPeriodo.getSelectedItem() == null){
                jLabelTipoObg.setVisible(true);
                JOptionPane.showMessageDialog(null, "Campo Obrigatório");
                jTextFieldDescricao.requestFocus();
            }
        }else {
        mod.setTipo((String) jComboBoxTipo.getSelectedItem());
        mod.setPeriodo((String) jComboBoxPeriodo.getSelectedItem());
        mod.setDescricao(jTextFieldDescricao.getText());
        
        control.Editar(mod);
        jLabelDescObg.setVisible(false); 
        jLabelTipoObg.setVisible(false);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
       if(flag==1){ //verificar possibilidade de remoção da flag
        mod.setDescricao(jTextFieldDescricao.getText()); 
        JOptionPane.showMessageDialog(null, "Excluir Registro?");
        control.Excluir(mod);
        
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonIncluir.setEnabled(true);
        jTextFieldDescricao.setText("");
        jTextFieldCod.setText("");
        
        }else{
            
           int Confirm = JOptionPane.showConfirmDialog(null,"Excluir registro?"," Excluir", JOptionPane.YES_NO_OPTION);
            if (Confirm == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
            mod.setDescricao(jTextFieldDescricao.getText());
            control.Excluir(mod); 
                jButtonEditar.setEnabled(false);
                jButtonApagar.setEnabled(false);
                jButtonIncluir.setEnabled(true);
            }else if (Confirm == JOptionPane.NO_OPTION){
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        PreencherTabelaIF("select id_tipo, tipo, descricaotipo from tbl_roots order by descricaotipo");
        
        jInternalFrameBuscaRaiz.setVisible(true);
       
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableRaizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRaizMouseClicked
        String descricao = ""+jTableRaiz.getValueAt(jTableRaiz.getSelectedRow(), 1);
        
            conex.executaSql("select id_tipo, tipo, descricaotipo from tbl_roots  where descricaotipo ilike '%"+descricao+"%'");
            try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_tipo"));
            mod.setDescricao(conex.rs.getString("descricaotipo"));
            mod.setTipo(conex.rs.getString("tipo"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado\n"+ex);
        }

        jTextFieldCod.setText(String.valueOf(mod.getCodigo()));
        jTextFieldDescricao.setText(mod.getDescricao());
        jComboBoxPeriodo.setSelectedItem(mod.getTipo());
        

        jInternalFrameBuscaRaiz.dispose();
        jButtonApagar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonIncluir.setEnabled(false);
    }//GEN-LAST:event_jTableRaizMouseClicked

    private void jButtonSairIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairIFActionPerformed
        jInternalFrameBuscaRaiz.dispose();
    }//GEN-LAST:event_jButtonSairIFActionPerformed

    private void jComboBoxTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoMouseClicked
        
        
    }//GEN-LAST:event_jComboBoxTipoMouseClicked

    public void PreencherTabelaIF(String SQL){
      ArrayList dados = new ArrayList();
      String[] colunas = new String[]{"","",""};
      
      conex.conexao();
      conex.executaSql(SQL);

      try{
          conex.rs.first();       
          do{
              dados.add(new Object[]{conex.rs.getInt("id_tipo"),
                                     conex.rs.getString("descricaotipo"),
                                     conex.rs.getString("tipo")
                                   
                                    });
 
          }while(conex.rs.next());
      
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList\nErro:"+ex);
        }
          
     BeansTabelas modelo = new BeansTabelas(dados, colunas);
      
     jTableRaiz.setModel(modelo);
     jTableRaiz.getColumnModel().getColumn(0).setPreferredWidth(45);
     jTableRaiz.getColumnModel().getColumn(0).setResizable(true);
     jTableRaiz.getColumnModel().getColumn(0).setHeaderValue("COD");
     jTableRaiz.getColumnModel().getColumn(1).setPreferredWidth(171);
     jTableRaiz.getColumnModel().getColumn(1).setResizable(true); //não redimensionaveL
     jTableRaiz.getColumnModel().getColumn(1).setHeaderValue("DESCRIÇÃO");
     jTableRaiz.getColumnModel().getColumn(2).setPreferredWidth(171);
     jTableRaiz.getColumnModel().getColumn(2).setResizable(true); //não redimensionaveL
     jTableRaiz.getColumnModel().getColumn(2).setHeaderValue("TIPO");
           

     jTableRaiz.getTableHeader().setReorderingAllowed(false); //não reordenavel
   //jTableRaiz.setAutoResizeMode(jTableRaiz.AUTO_RESIZE_OFF); //não redmencionar
     jTableRaiz.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selicioar um dado por vez
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelFundoMenuIF;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSairIF;
    private javax.swing.JComboBox jComboBoxPeriodo;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JInternalFrame jInternalFrameBuscaRaiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDescObg;
    private javax.swing.JLabel jLabelFaixaMenu;
    private javax.swing.JLabel jLabelFaixaMenu1;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelPeriodp;
    private javax.swing.JLabel jLabelTipoObg;
    private javax.swing.JScrollPane jScrollPaneModelo;
    private javax.swing.JTable jTableRaiz;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
}