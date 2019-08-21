/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CamadaApresentacao;

import CamadaNegocio.Funcionario;
import Controller.CaixaController;
import util.SystemControl;
import util.mensagens;

/**
 *
 * @author 吉野　廉
 * @author 吉野　鈴
 * @author アナスタシア
 * @author 早川　茜
 * @author 高村　結衣
 * @author 里川　麗奈
 */
public class MovAjustarCaixaBanco extends javax.swing.JDialog {

    private final SystemControl sc = new SystemControl();
    private final mensagens m = new mensagens();
    private final CaixaController cc = new CaixaController();
    
    public MovAjustarCaixaBanco(java.awt.Frame parent, boolean modal, Funcionario f) {
        super(parent, modal);
        initComponents();
        txtCodigo.setEnabled(false);
        btnCancelar.setName("btnCancelar");
        btnGravar.setName("btnGravar");
        btnLocalizar.setName("btnLocalizar");
        btnSair.setName("btnSair");
        sc.HabilityComponents(jPanel2.getComponents(), false);
        sc.Initialize(jPanel3.getComponents());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelTexto = new javax.swing.JLabel();
        txtValor = new br.com.ikeda.beans.jTextFieldMonetario();
        rbAdicionar = new javax.swing.JRadioButton();
        rbRetirar = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnGravar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLocalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Nome da Caixa:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        labelTexto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTexto.setText("Saldoa ser Debitado:");

        txtValor.setText(".0");

        rbAdicionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbAdicionar.setSelected(true);
        rbAdicionar.setText("Debitar");
        rbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdicionarActionPerformed(evt);
            }
        });

        rbRetirar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbRetirar.setText("Creditar");
        rbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRetirarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Saldo Atual:");

        txtSaldo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(rbAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(rbRetirar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbAdicionar))
                    .addComponent(rbRetirar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTexto)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGravar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Gravar16.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.setName("btnGravar"); // NOI18N
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sair.png"))); // NOI18N
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancelar16.png.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLocalizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Localizar 16.png"))); // NOI18N
        btnLocalizar.setText("Localizar");
        btnLocalizar.setName("btnLocalizar"); // NOI18N
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnLocalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        switch(cc.varidar(txtValor.getText(), txtNome.getText(), txtSaldo.getText(), Integer.parseInt(txtCodigo.getText()), rbAdicionar.isSelected()))
        {
            case 1: m.InformationMessage("Informe o valor!", "Atenção"); txtValor.requestFocus(); txtValor.setText(""); break;
            case 2: m.InformationMessage("Valor a ser retirado é maior que o saldo Atual!", "Atenção"); txtValor.requestFocus();  break;
            default:
            if(cc.lancarAjuste())
            {
                m.InformationMessage("Ajustado com Sucesso!", "Informação");
                sc.limpar(jPanel2.getComponents());
                sc.Initialize(jPanel3.getComponents());
            }
            else
            {
                m.ErroMessage("Erro", "Atenção");
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        sc.limpar(jPanel2.getComponents());
        sc.Initialize(jPanel3.getComponents());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        ConsultaPadrao consCaixaBanco = new ConsultaPadrao(null, true);
        String[] vet = new String[1];
        vet[0] = "Nome";
        consCaixaBanco.configuraOpcoes(vet, 1, 0, "CCaixabanco", false);
        consCaixaBanco.verificaconsulta(true);
        consCaixaBanco.setVisible(true);
        if (consCaixaBanco.getCodigo() != 0)
        {
            cc.buscarCaixa();
            txtCodigo.setText(""+cc.getC().getCodigo());
            txtNome.setText(""+cc.getC().getNome());
            txtSaldo.setText(""+cc.getC().getSaldoI());
            consCaixaBanco.dispose();
        }
        else
        {
            consCaixaBanco.dispose();
            btnLocalizar.requestFocus();
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void rbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdicionarActionPerformed
        if(rbAdicionar.isSelected())
        {
            rbRetirar.setSelected(false);
            labelTexto.setText("Saldo a ser Debitado:");
        }
    }//GEN-LAST:event_rbAdicionarActionPerformed

    private void rbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRetirarActionPerformed
        if(rbRetirar.isSelected())
        {
            rbAdicionar.setSelected(false);
            labelTexto.setText("Saldo a ser Creditado:");
        }
    }//GEN-LAST:event_rbRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JRadioButton rbAdicionar;
    private javax.swing.JRadioButton rbRetirar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSaldo;
    private br.com.ikeda.beans.jTextFieldMonetario txtValor;
    // End of variables declaration//GEN-END:variables
}
