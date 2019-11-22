package CamadaApresentacao;

import CamadaNegocio.Funcionario;
import Controller.LancarDespesaController;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.SystemControl;
import util.mensagens;


/**
 * @author 吉野　廉
 * @author 羽根川　翼
 * @author モニカ
 * @author 夕張
 * @author もも
 * @author 林道
 * @author 香取 
 * @author 鹿島
 * 
 * Tester 2019/07/23
 * @author 海星
 * @author 海流
 * @author 伊弉冉
 * @author 伊弉諾
 * 
 * Tester 2019/08/18   テスト完了。
 * @author 吉野　廉
 * @author 羽根川　翼
 * @author 海星
 * @author 海流
 * @author 伊弉冉
 * @author 伊弉諾
 */
public class MovDespesa extends javax.swing.JDialog {

    private final SystemControl sc = new SystemControl();
    private final mensagens m = new mensagens();
    private final LancarDespesaController ldc = new LancarDespesaController();
    private int op, flag;
    
    public MovDespesa(java.awt.Frame parent, boolean modal, Funcionario func) throws SQLException {
        super(parent, modal);
        initComponents();
        //this.setSize(this.getWidth(), this.getHeight()-115);
        setLocationRelativeTo(null);
        ldc.getCp().setFunc(func);
        
        btnNovo.setName("btnNovo");
        btnAlterar.setName("btnAlterar");
        btnCancelar.setName("btnCancelar");
        btnExcluir.setName("btnExcluir");
        btnGravar.setName("btnGravar");
        btnLocalizar.setName("btnLocalizar");
        btnaddTipo.setName("btnaddTipo");
        btnSair.setName("btnSair");
        
        labelBanco.setVisible(false);
        
        sc.HabilityComponents(jPanel1.getComponents(), false);
        sc.Initialize(jPanel2.getComponents()); 
        labelBanco.setVisible(true);
        dcDataPagamento.setEditable(false);
        txtValorPago.setEditable(false);
        cbOpActionPerformed(null);
        carregaTipo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbOp = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtCodBarra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelTexto3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        btnaddTipo = new javax.swing.JButton();
        dcDataVencimento = new br.com.marciorl.beans.DateChooser();
        dcDataPagamento = new br.com.marciorl.beans.DateChooser();
        labelTexto1 = new javax.swing.JLabel();
        labelBanco = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        labelTexto2 = new javax.swing.JLabel();
        txtValor = new br.com.ikeda.beans.jTextFieldMonetario();
        rbOp1 = new javax.swing.JRadioButton();
        rbOp2 = new javax.swing.JRadioButton();
        rbOp3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtValorPago = new br.com.ikeda.beans.jTextFieldMonetario();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLocalizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Valor do Documento:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Data Vencimento:");

        cbOp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbOp.setText("Foi pago?");
        cbOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Codigo de barra:");

        txtCodBarra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodBarra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodBarraFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Nome da Conta:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        labelTexto3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTexto3.setText("Data Pagamento:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Tipo:");

        cbTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnaddTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Novo 16.png"))); // NOI18N
        btnaddTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddTipoActionPerformed(evt);
            }
        });

        labelTexto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTexto1.setText("Valor Pago:");

        labelBanco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelBanco.setText(" ");

        txtLocal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        labelTexto2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTexto2.setText("Local:");

        rbOp1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbOp1.setText("Vista");
        rbOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOp1ActionPerformed(evt);
            }
        });

        rbOp2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbOp2.setText("Parcelado");
        rbOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOp2ActionPerformed(evt);
            }
        });

        rbOp3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbOp3.setText("Prazo");
        rbOp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOp3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Pagamento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnaddTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelTexto3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTexto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTexto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLocal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbOp1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbOp2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbOp3)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbOp))
                    .addComponent(labelBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnaddTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTexto2)
                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTexto3)
                        .addComponent(dcDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTexto1)
                        .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbOp1)
                    .addComponent(rbOp2)
                    .addComponent(rbOp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dcDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Novo 16.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Alterar16.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Excluir16.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Gravar16.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sair.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancelar16.png.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Localizar 16.png"))); // NOI18N
        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLocalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpActionPerformed
        if(cbOp.isSelected())
        {
            dcDataPagamento.setEditable(true);
            txtValorPago.setEditable(true);
            labelTexto1.setVisible(true);
            labelTexto2.setVisible(true);
            txtValorPago.setVisible(true);
            txtLocal.setVisible(true);
            labelTexto3.setVisible(true);
            dcDataPagamento.setVisible(true);
            rbOp1.setEnabled(false);
            rbOp2.setEnabled(false);
            rbOp3.setEnabled(false);
            dcDataVencimento.setEnabled(false);
        }
        else
        {
            dcDataPagamento.setEditable(false);
            txtValorPago.setEditable(false);
            labelTexto1.setVisible(false);
            labelTexto2.setVisible(false);
            txtValorPago.setVisible(false);
            txtLocal.setVisible(false);
            labelTexto3.setVisible(false);
            dcDataPagamento.setVisible(false);
            rbOp1.setEnabled(true);
            rbOp2.setEnabled(true);
            rbOp3.setEnabled(true);
            dcDataVencimento.setEnabled(true);
        }
    }//GEN-LAST:event_cbOpActionPerformed

    private void btnaddTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddTipoActionPerformed
       CadastroTipoConta frm = new CadastroTipoConta(null, true);
       frm.setTitle("Cadastro Tipo de Conta");
       frm.setVisible(true);
        try {
            carregaTipo();
        } catch (SQLException ex) {
            Logger.getLogger(MovDespesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddTipoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodigo.setText("0");
        sc.Edity(jPanel2.getComponents());
        sc.HabilityComponents(jPanel1.getComponents(), true);
        rbOp1.setSelected(true);
        rbOp1ActionPerformed(null);
        op = 1;
        flag = 1;
        dcDataVencimento.setData(Date.from(Instant.now()));
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        sc.limpar(jPanel1.getComponents());
        sc.Initialize(jPanel2.getComponents());
        sc.HabilityComponents(jPanel1.getComponents(), false);
        rbOp1.setSelected(true);
        rbOp1ActionPerformed(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        switch(ldc.validar(txtCodigo.getText(), (String) cbTipo.getSelectedItem(), txtNome.getText(), txtCodBarra.getText(), txtValor.getText().replace(",", "."), dcDataVencimento.getData(), txtValorPago.getText().replace(",", "."), dcDataPagamento.getData(), cbOp.isSelected(), labelBanco.getText(), txtLocal.getText(), op))
        {
            case -1: 
                if(ldc.gravar())
                {
                    m.InformationMessage("Lançado com Sucesso!", "Informação");
                    sc.limpar(jPanel1.getComponents());
                    sc.Initialize(jPanel2.getComponents());
                }
                else
                    m.ErroMessage("ERRO ao Gravar", "ERRO");
                break;
            case 1: m.InformationMessage("Informe o valor do Documento!", "Atenção"); txtValor.requestFocus(); break;
            case 2: m.InformationMessage("Informe o valor Pago!", "Atenção"); txtValorPago.requestFocus(); break;
            case 3: m.InformationMessage("Altere o Valor do Docuemnto ou o valor que foi Pago!", "Atenção"); break;
            case 5: 
                ldc.gravar();
                ldc.SeocndInserting(txtValor.getText().replace(",", "."), txtValorPago.getText().replace(",", "."), dcDataVencimento.getData());
                m.InformationMessage("Lançado com Sucesso!", "Informação");
                break;
            case 6:
                m.InformationMessage("Data de vencimento não pode ser moneor que hoje!", "Atenção"); dcDataVencimento.requestFocus(); break;
            case 7:
                m.InformationMessage("Informe a data de Vencimento!", "Atenção"); dcDataVencimento.requestFocus(); break;
            case 8:
                m.InformationMessage("Informe a data de pagamento!", "Atenção"); dcDataPagamento.requestFocus(); break;
            
            default: 
                if(flag == 1)
                {
                     if(op == 2)
                    {
                        GerenciarParcela frm = new GerenciarParcela(null, true, ldc.getCp(), null, null);
                        frm.setVisible(true);
                        if(frm.isFlag())
                        {
                            sc.limpar(jPanel1.getComponents());
                            sc.Initialize(jPanel2.getComponents());
                            sc.HabilityComponents(jPanel1.getComponents(), false);
                            rbOp1.setSelected(true);
                            rbOp1ActionPerformed(null);
                        }
                    }
                    else
                    {
                        //gravar Direto
                        if(ldc.gravar())
                        {
                            m.InformationMessage("Gravado com sucesso", "Informação");
                            sc.limpar(jPanel1.getComponents());
                            sc.Initialize(jPanel2.getComponents());
                            sc.HabilityComponents(jPanel1.getComponents(), false);
                            rbOp1.setSelected(true);
                            rbOp1ActionPerformed(null);
                        }
                        else
                        {
                            m.ErroMessage("Erro", "Erro");
                        }
                    }
                }
                else
                {
                    if(ldc.alterarDespesa())
                    {
                        m.InformationMessage("Alterado com sucesso", "Informação");
                        sc.limpar(jPanel1.getComponents());
                        sc.Initialize(jPanel2.getComponents());
                        sc.HabilityComponents(jPanel1.getComponents(), false);
                        rbOp1.setSelected(true);
                        rbOp1ActionPerformed(null);
                        flag = 1;
                    }
                    else
                    {
                        m.ErroMessage("ErroA", "ErroA");
                    }
                }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodBarraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodBarraFocusLost
        if(txtCodBarra.getText().trim().length() >= 3)
        {
            String texto, temp, temp2;
            texto = txtCodBarra.getText();
            temp2 = ""+ texto.charAt(0) + texto.charAt(1) + texto.charAt(2);
            temp = sc.BankCheck(temp2);
            if(temp.equals("Desconhecido"))
            {
                texto = "" + texto.charAt(0) + texto.charAt(1);
                temp = sc.BankCheck(texto);
            }
            labelBanco.setText(temp);
        }
    }//GEN-LAST:event_txtCodBarraFocusLost

    private void rbOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOp1ActionPerformed
        rbOp2.setSelected(false);
        rbOp3.setSelected(false);
        op = 1;
        dcDataVencimento.setEditable(false);
        dcDataVencimento.setEnabled(false);
    }//GEN-LAST:event_rbOp1ActionPerformed

    private void rbOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOp2ActionPerformed
        rbOp1.setSelected(false);
        rbOp3.setSelected(false);
        op = 2;
        dcDataVencimento.setEditable(true);
        dcDataVencimento.setEnabled(true);
    }//GEN-LAST:event_rbOp2ActionPerformed

    private void rbOp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOp3ActionPerformed
        rbOp2.setSelected(false);
        rbOp1.setSelected(false);
        op = 3;
        dcDataVencimento.setEditable(true);
        dcDataVencimento.setEnabled(true);
    }//GEN-LAST:event_rbOp3ActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        ConsultaPadrao consDespesa = new ConsultaPadrao(null, true);
        String[] vet = new String[2];
        vet[0] = "Data vencimento";
        vet[1] = "Periodo vencimento";
        consDespesa.configuraOpcoes(vet, 2, 1, "CLancarDespesa", false);
        consDespesa.verificaconsulta(true);
        consDespesa.setVisible(true);
        if (consDespesa.getCodigo() != 0)
        {
            txtCodigo.setText(String.valueOf(consDespesa.getCodigo()));
            consDespesa.dispose();
            txtCodigoFocusLost(null);
            sc.Alter(jPanel2.getComponents());
        }
        else
        {
            consDespesa.dispose();
            btnLocalizar.requestFocus();
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(m.Pergunta("Deseja excluir essa Despesa?", "Atenção") == JOptionPane.YES_OPTION)
        {
            if(ldc.checarContaPaga())
            {
                if(ldc.excluir())
                {
                    m.InformationMessage("Excluido com sucesso!", "Informação");
                    sc.limpar(jPanel1.getComponents());
                    sc.Initialize(jPanel2.getComponents());
                    sc.HabilityComponents(jPanel1.getComponents(), false);
                    rbOp1.setSelected(true);
                    rbOp1ActionPerformed(null);
                }
                else
                    m.ErroMessage("Erro", "Erro");

            }
            else
            {
                m.WarmingMessage("A conta ja foi paga!", "Atenção");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        sc.HabilityComponents(jPanel1.getComponents(), true);
        sc.Edity(jPanel2.getComponents());
        ldc.separarString(txtCodBarra, txtLocal);
        rbOp1.setEnabled(false);
        rbOp2.setEnabled(false);
        rbOp3.setEnabled(false);
        flag = 2;
        cbOp.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        if(!txtCodigo.getText().equals("0"))
        {
            if(ldc.buscar(txtCodigo.getText()) != null)
            {
                 ldc.separarString(txtCodBarra, txtNome);
                 txtValor.setText(""+sc.verificaValor(String.valueOf(ldc.getCp().getValorC())));
                 cbTipo.setSelectedItem(ldc.getCp().getTc().getTipo());
                 dcDataVencimento.setData(ldc.getCp().getDataV());
            }
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(!sc.help("SGG/SGGOnlineHelp/movdespesa.html", "C:/"))
        {
            sc.help("SGG/SGGOnlineHelp/movdespesa.html", "D:/");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void carregaTipo() throws SQLException
    {
        ldc.CarregaTipoConta(cbTipo);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnaddTipo;
    private javax.swing.JCheckBox cbOp;
    private javax.swing.JComboBox<String> cbTipo;
    private br.com.marciorl.beans.DateChooser dcDataPagamento;
    private br.com.marciorl.beans.DateChooser dcDataVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBanco;
    private javax.swing.JLabel labelTexto1;
    private javax.swing.JLabel labelTexto2;
    private javax.swing.JLabel labelTexto3;
    private javax.swing.JRadioButton rbOp1;
    private javax.swing.JRadioButton rbOp2;
    private javax.swing.JRadioButton rbOp3;
    private javax.swing.JTextField txtCodBarra;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private br.com.ikeda.beans.jTextFieldMonetario txtValor;
    private br.com.ikeda.beans.jTextFieldMonetario txtValorPago;
    // End of variables declaration//GEN-END:variables
}
