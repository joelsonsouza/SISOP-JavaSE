/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoMaster;

import Beans.BeansCorretista;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import Beans.BeansTabelas;
import Dao.DaoCorretista;
import modeloConection.ConexaoBD;
import controller.CampoNumerico;
import controller.UpperCase;

public class Corretista extends javax.swing.JFrame {

    BeansCorretista mod = new BeansCorretista();
    DaoCorretista control = new DaoCorretista();
    ConexaoBD conex = new ConexaoBD();
    int flag=1;
 
    public Corretista() {
        initComponents();
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonImprimir.setEnabled(false);        
        jTextFieldNome.setDocument(new UpperCase());
        jTextFieldEmpresa.setDocument(new UpperCase());
        jTextFieldCargo.setDocument(new UpperCase());
        jInternalFrameBuscaCorretista.setVisible(false);
    }

    /**1
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBuscaCorretista = new javax.swing.JInternalFrame();
        jScrollPaneMarca = new javax.swing.JScrollPane();
        jTableCorretista = new javax.swing.JTable();
        jButtonSairIF = new javax.swing.JButton();
        jLabelFaixaMenu1 = new javax.swing.JLabel();
        JlabelFundoMenuIF = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabelBuscaImagem = new javax.swing.JLabel();
        jButtonDeletaImagem = new javax.swing.JButton();
        jButtonInsereimagem = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabelSexo = new javax.swing.JLabel();
        jLabelEscolaridade = new javax.swing.JLabel();
        jComboBoxEscolaridade = new javax.swing.JComboBox();
        jLabelDtNasc = new javax.swing.JLabel();
        jDateChooserDtNasc = new com.toedter.calendar.JDateChooser();
        jComboBoxTipVinc = new javax.swing.JComboBox();
        jLabelTipVin = new javax.swing.JLabel();
        jLabelTrabalhando = new javax.swing.JLabel();
        jComboBoxTrabalhando = new javax.swing.JComboBox();
        jLabelEmpresa = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabelCel = new javax.swing.JLabel();
        jFormattedTextFieldCel = new javax.swing.JFormattedTextField();
        jLabelFone = new javax.swing.JLabel();
        jFormattedTextFieldFone = new javax.swing.JFormattedTextField();
        jCheckBoxCorretistaAtivar = new javax.swing.JCheckBox();
        jLabelSalario = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
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
        jLabelFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Corretista");
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBuscaCorretista.setTitle("Selecionar Corretista");
        jInternalFrameBuscaCorretista.setVisible(true);
        jInternalFrameBuscaCorretista.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCorretista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableCorretista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCorretista.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCorretista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCorretistaMouseClicked(evt);
            }
        });
        jScrollPaneMarca.setViewportView(jTableCorretista);

        jInternalFrameBuscaCorretista.getContentPane().add(jScrollPaneMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 250));

        jButtonSairIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSairIF.setToolTipText("Sair");
        jButtonSairIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairIFActionPerformed(evt);
            }
        });
        jInternalFrameBuscaCorretista.getContentPane().add(jButtonSairIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 45, 30));

        jLabelFaixaMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu1.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        jInternalFrameBuscaCorretista.getContentPane().add(jLabelFaixaMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        JlabelFundoMenuIF.setBackground(new java.awt.Color(255, 255, 255));
        JlabelFundoMenuIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        JlabelFundoMenuIF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jInternalFrameBuscaCorretista.getContentPane().add(JlabelFundoMenuIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 600, 330));

        getContentPane().add(jInternalFrameBuscaCorretista);
        jInternalFrameBuscaCorretista.setBounds(40, 40, 530, 310);

        jLabelCod.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCod.setText("Código:");
        getContentPane().add(jLabelCod);
        jLabelCod.setBounds(120, 40, 60, 25);

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCod);
        jTextFieldCod.setBounds(180, 40, 60, 25);

        jLabelBuscaImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/semfoto.png"))); // NOI18N
        jLabelBuscaImagem.setToolTipText("Foto");
        getContentPane().add(jLabelBuscaImagem);
        jLabelBuscaImagem.setBounds(20, 40, 90, 80);

        jButtonDeletaImagem.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDeletaImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/deletefoto.png"))); // NOI18N
        jButtonDeletaImagem.setToolTipText("Remover Foto");
        jButtonDeletaImagem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jButtonDeletaImagem);
        jButtonDeletaImagem.setBounds(20, 120, 50, 40);

        jButtonInsereimagem.setBackground(new java.awt.Color(255, 255, 255));
        jButtonInsereimagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/inserefoto.png"))); // NOI18N
        jButtonInsereimagem.setToolTipText("Inserir Foto");
        jButtonInsereimagem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonInsereimagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsereimagemActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsereimagem);
        jButtonInsereimagem.setBounds(70, 120, 50, 40);

        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(140, 80, 40, 25);

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(180, 80, 380, 25);

        jComboBoxSexo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "FEMININO", "MASCULINO" }));
        jComboBoxSexo.setToolTipText("");
        getContentPane().add(jComboBoxSexo);
        jComboBoxSexo.setBounds(180, 110, 130, 25);

        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelSexo.setText("Sexo:");
        getContentPane().add(jLabelSexo);
        jLabelSexo.setBounds(140, 110, 40, 25);

        jLabelEscolaridade.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEscolaridade.setText("Escolaridade:");
        getContentPane().add(jLabelEscolaridade);
        jLabelEscolaridade.setBounds(-20, 170, 110, 25);

        jComboBoxEscolaridade.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBoxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "ENSINO FUNDAMENTAL INCOMPLETO", "ENSINO FUNDAMENTAL COMPLETO", "ENSINO MÉDIO INCOMPLETO", "ENSINO MÉDIO COMPLETO", "ENSINO SUPERIO INCOMPLETO", "ENSINO SUPERIOR COMPLETO", "PÓS-GRADUAÇÃO" }));
        getContentPane().add(jComboBoxEscolaridade);
        jComboBoxEscolaridade.setBounds(90, 170, 200, 25);

        jLabelDtNasc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelDtNasc.setText("Dt. Nascimento:");
        getContentPane().add(jLabelDtNasc);
        jLabelDtNasc.setBounds(340, 110, 90, 25);

        jDateChooserDtNasc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(jDateChooserDtNasc);
        jDateChooserDtNasc.setBounds(430, 110, 130, 25);

        jComboBoxTipVinc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBoxTipVinc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "COMISSIONADO", "CONCURSADO", "CLT", "ESTÁGIO", "PRESTAÇÃO DE SERVIÇO" }));
        getContentPane().add(jComboBoxTipVinc);
        jComboBoxTipVinc.setBounds(90, 210, 200, 25);

        jLabelTipVin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTipVin.setText("Tipo de Vínculo:");
        getContentPane().add(jLabelTipVin);
        jLabelTipVin.setBounds(0, 210, 90, 25);

        jLabelTrabalhando.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTrabalhando.setText("Trabalhando:");
        getContentPane().add(jLabelTrabalhando);
        jLabelTrabalhando.setBounds(260, 170, 110, 25);

        jComboBoxTrabalhando.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBoxTrabalhando.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "SIM", "NÃO" }));
        jComboBoxTrabalhando.setToolTipText("");
        getContentPane().add(jComboBoxTrabalhando);
        jComboBoxTrabalhando.setBounds(370, 170, 90, 25);

        jLabelEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpresa.setText("Empresa:");
        getContentPane().add(jLabelEmpresa);
        jLabelEmpresa.setBounds(280, 210, 90, 25);

        jTextFieldEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldEmpresa);
        jTextFieldEmpresa.setBounds(370, 210, 190, 25);

        jLabelCargo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCargo.setText("Cargo:");
        getContentPane().add(jLabelCargo);
        jLabelCargo.setBounds(50, 250, 40, 25);

        jTextFieldCargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldCargo);
        jTextFieldCargo.setBounds(90, 250, 190, 25);

        jLabelCel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCel.setText("Celular:");
        getContentPane().add(jLabelCel);
        jLabelCel.setBounds(40, 290, 50, 25);

        try {
            jFormattedTextFieldCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextFieldCel);
        jFormattedTextFieldCel.setBounds(90, 290, 130, 25);

        jLabelFone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelFone.setText("Fone:");
        getContentPane().add(jLabelFone);
        jLabelFone.setBounds(330, 290, 40, 25);

        try {
            jFormattedTextFieldFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextFieldFone);
        jFormattedTextFieldFone.setBounds(370, 290, 140, 25);

        jCheckBoxCorretistaAtivar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxCorretistaAtivar.setText("Ativo?");
        jCheckBoxCorretistaAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCorretistaAtivarActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxCorretistaAtivar);
        jCheckBoxCorretistaAtivar.setBounds(490, 40, 70, 23);

        jLabelSalario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelSalario.setText("Salário:");
        getContentPane().add(jLabelSalario);
        jLabelSalario.setBounds(300, 250, 70, 25);

        jTextFieldSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldSalario);
        jTextFieldSalario.setBounds(370, 250, 70, 25);

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
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
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
        jLabel1.setBounds(10, 360, 220, 14);

        jLabelFaixaMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        getContentPane().add(jLabelFaixaMenu);
        jLabelFaixaMenu.setBounds(0, 0, 770, 30);

        jLabelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        jLabelFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 30, 790, 360);

        jLabelFundo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        jLabelFundo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabelFundo1);
        jLabelFundo1.setBounds(0, 30, 790, 360);

        setSize(new java.awt.Dimension(628, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        TbCadastros cad = new TbCadastros();
        cad.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMouseClicked
    jTextFieldCod.setText(null);
    jTextFieldCargo.setText(null);
    jTextFieldEmpresa.setText(null);
    jTextFieldNome.setText(null);
    jDateChooserDtNasc.setDate(null);
    jCheckBoxCorretistaAtivar.setSelected(false);
    jFormattedTextFieldCel.setText("");
    jFormattedTextFieldFone.setText(""); 
    jComboBoxEscolaridade.setSelectedItem("SELECIONE");
    jComboBoxSexo.setSelectedItem("SELECIONE");
    jComboBoxTipVinc.setSelectedItem("SELECIONE");
    jComboBoxTrabalhando.setSelectedItem("SELECIONE");
    jTextFieldSalario.setText("");
    
    jButtonApagar.setEnabled(false);
    jButtonEditar.setEnabled(false);
    jButtonIncluir.setEnabled(true);
    }//GEN-LAST:event_jButtonLimparMouseClicked

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
        mod.setNomecorretista(jTextFieldNome.getText()); //corrigir BEANS
        mod.setSexo((String)(jComboBoxSexo.getSelectedItem()));
        mod.setEscolaridade((String)(jComboBoxEscolaridade.getSelectedItem()));
        mod.setTipovinculo((String)(jComboBoxTipVinc.getSelectedItem()));
        mod.setEmpresa(jTextFieldEmpresa.getText());//corrigir BEANS
        mod.setCargo(jTextFieldCargo.getText()); //corrigir BEANS
        mod.setTelefone(jFormattedTextFieldFone.getText());
        mod.setCelular(jFormattedTextFieldCel.getText());
        mod.setDtnasc(jDateChooserDtNasc.getDate());
        mod.setStatus(jCheckBoxCorretistaAtivar.isSelected());
        mod.setTrabalhando((String)jComboBoxTrabalhando.getSelectedItem());
        mod.setSalario(Double.parseDouble(jTextFieldSalario.getText()));  

       control.Editar(mod);
       jButtonIncluir.setEnabled(false);
      
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        
        mod.setNomecorretista(jTextFieldNome.getText()); 
        mod.setSexo((String)(jComboBoxSexo.getSelectedItem()));
        mod.setEscolaridade((String)(jComboBoxEscolaridade.getSelectedItem()));
        mod.setTipovinculo((String)(jComboBoxTipVinc.getSelectedItem()));
        mod.setEmpresa(jTextFieldEmpresa.getText());
        mod.setCargo(jTextFieldCargo.getText()); 
        mod.setTelefone(jFormattedTextFieldFone.getText());
        mod.setCelular(jFormattedTextFieldCel.getText());
        mod.setDtnasc(jDateChooserDtNasc.getDate());
        mod.setStatus(jCheckBoxCorretistaAtivar.isSelected());
        mod.setTrabalhando((String)jComboBoxTrabalhando.getSelectedItem());
        mod.setSalario(Double.parseDouble(jTextFieldSalario.getText()));  
        control.Salvar(mod);
        
        mod.setNomecorretista(jTextFieldNome.getText());
        BeansCorretista model = control.Pesquisar(mod);
        jTextFieldCod.setText(String.valueOf(model.getCodigo()));
        
        jButtonIncluir.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonApagar.setEnabled(true);

    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
     PreencherTabelaIF("select id_corretista, nomecorretista from tbl_corretista order by nomecorretista");
     jInternalFrameBuscaCorretista.setVisible(true);
  
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        if(flag==1){
            int Confirm = JOptionPane.showConfirmDialog(null,"Excluir registro?"," Excluir", JOptionPane.YES_NO_OPTION);
                if (Confirm == JOptionPane.YES_OPTION) {
                mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
                mod.setNomecorretista(jTextFieldNome.getText());
                control.Excluir(mod); 
                jTextFieldCod.setText(null);
                jTextFieldCargo.setText(null);
                jTextFieldEmpresa.setText(null);
                jTextFieldNome.setText(null);
                jDateChooserDtNasc.setDate(null);
                jFormattedTextFieldCel.setText("");
                jFormattedTextFieldFone.setText("");
                jComboBoxEscolaridade.setSelectedItem("SELECIONE");
                jComboBoxSexo.setSelectedItem("SELECIONE");
                jComboBoxTipVinc.setSelectedItem("SELECIONE");
                jComboBoxTrabalhando.setSelectedItem("SELECIONE");
                jTextFieldSalario.setText("");
                jButtonApagar.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonIncluir.setEnabled(true);

                }else if (Confirm == JOptionPane.NO_OPTION){
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
         }
        else{
            int Confirm = JOptionPane.showConfirmDialog(null,"Excluir registro?"," Excluir", JOptionPane.YES_NO_OPTION);
                if (Confirm == JOptionPane.YES_OPTION) {
                mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
                mod.setNomecorretista(jTextFieldNome.getText());
                control.Excluir(mod);       
                }else if (Confirm == JOptionPane.NO_OPTION){
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonInsereimagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsereimagemActionPerformed
        
        JFileChooser fileChosChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        String diretorioBase = System.getProperty("users.Joelson+")+"/Desktop";
        File dir = new File(diretorioBase);
        fileChosChooser.setCurrentDirectory(dir);

        fileChosChooser.setFileFilter(filtro);

        int resposta = fileChosChooser.showOpenDialog(new JDialog());
        
        File file = new File("");
        
        if(resposta == JFileChooser.APPROVE_OPTION){
                file = fileChosChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Arquivo selecionado com Sucesso");
         
        }else if(resposta == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Cancelado");
                        
        }
    }//GEN-LAST:event_jButtonInsereimagemActionPerformed

    private void jCheckBoxCorretistaAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCorretistaAtivarActionPerformed
        
    }//GEN-LAST:event_jCheckBoxCorretistaAtivarActionPerformed

    private void jTableCorretistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCorretistaMouseClicked
        String nome = ""+jTableCorretista.getValueAt(jTableCorretista.getSelectedRow(), 1);
        mod.setNomecorretista(nome);
        BeansCorretista model = control.Pesquisar(mod);

        jTextFieldCod.setText(String.valueOf(model.getCodigo()));
        jTextFieldNome.setText(model.getNomecorretista());
        jComboBoxSexo.setSelectedItem(model.getSexo());       
        jFormattedTextFieldCel.setText(String.valueOf(model.getCelular()));       
        jFormattedTextFieldFone.setText(String.valueOf(model.getTelefone()));
        jComboBoxEscolaridade.setSelectedItem(model.getEscolaridade());
        jComboBoxTipVinc.setSelectedItem(model.getTipovinculo());
        jDateChooserDtNasc.setDate(model.getDtnasc());
        jCheckBoxCorretistaAtivar.setSelected(model.isStatus());
        jComboBoxTrabalhando.setSelectedItem(model.getTrabalhando());
        jTextFieldSalario.setText(String.valueOf(model.getSalario()));
        jTextFieldEmpresa.setText(model.getEmpresa());
        jTextFieldCargo.setText(model.getCargo());

        jButtonEditar.setEnabled(true);
        jButtonApagar.setEnabled(true);
        jButtonIncluir.setEnabled(false);

        conex.desconecta();
        jInternalFrameBuscaCorretista.dispose();

    }//GEN-LAST:event_jTableCorretistaMouseClicked

    private void jButtonSairIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairIFActionPerformed
        jInternalFrameBuscaCorretista.dispose();
    }//GEN-LAST:event_jButtonSairIFActionPerformed

    
    public void PreencherTabelaIF(String SQL){
      ArrayList dados = new ArrayList();
      String[] colunas = new String[]{"",""};
      
      conex.conexao();
      conex.executaSql(SQL);

      try{
          conex.rs.first();       
          do{
              dados.add(new Object[]{conex.rs.getInt("id_corretista"),
                                     conex.rs.getString("nomecorretista")
                                   
                                    });
 
          }while(conex.rs.next());
      
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList\nErro:"+ex);
        }
          
     BeansTabelas modelo = new BeansTabelas(dados, colunas);
      
     jTableCorretista.setModel(modelo);
     jTableCorretista.getColumnModel().getColumn(0).setPreferredWidth(45);
     jTableCorretista.getColumnModel().getColumn(0).setResizable(true);
     jTableCorretista.getColumnModel().getColumn(0).setHeaderValue("COD");
     jTableCorretista.getColumnModel().getColumn(1).setPreferredWidth(450);
     jTableCorretista.getColumnModel().getColumn(1).setResizable(true); //não redimensionaveL
     jTableCorretista.getColumnModel().getColumn(1).setHeaderValue("NOME");
           

     jTableCorretista.getTableHeader().setReorderingAllowed(false); //não reordenavel
     jTableCorretista.setAutoResizeMode(jTableCorretista.AUTO_RESIZE_OFF); //não redmencionar
     jTableCorretista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selicioar um dado por vez
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
    private javax.swing.JButton jButtonDeletaImagem;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonInsereimagem;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSairIF;
    private javax.swing.JCheckBox jCheckBoxCorretistaAtivar;
    private javax.swing.JComboBox jComboBoxEscolaridade;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JComboBox jComboBoxTipVinc;
    private javax.swing.JComboBox jComboBoxTrabalhando;
    private com.toedter.calendar.JDateChooser jDateChooserDtNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone;
    private javax.swing.JInternalFrame jInternalFrameBuscaCorretista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBuscaImagem;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelEscolaridade;
    private javax.swing.JLabel jLabelFaixaMenu;
    private javax.swing.JLabel jLabelFaixaMenu1;
    private javax.swing.JLabel jLabelFone;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundo1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTipVin;
    private javax.swing.JLabel jLabelTrabalhando;
    private javax.swing.JScrollPane jScrollPaneMarca;
    private javax.swing.JTable jTableCorretista;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
