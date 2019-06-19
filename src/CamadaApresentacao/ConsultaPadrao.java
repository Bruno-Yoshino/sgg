/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CamadaApresentacao;

import CamadaLogica.ReadOnlyTableModel;
import CamadaNegocio.*;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 吉野　廉
 * @author 羽根川　翼
 * @author モニカ
 * @author 阿賀野
 * @author 矢矧
 * 
 * @author 弐条
 * @author 七草
 */
public class ConsultaPadrao extends javax.swing.JDialog {

    /**
     * Creates new form ConsultaPadrao
     * @param parent
     * @param modal
     */
    private int codigo;    
    private String[] vetOpcoes = new String[20];
    private int tl;
    private String tabela;
    private int posDefault;
    private final int x, y;
    boolean jtableEditavel;
    
    public ConsultaPadrao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cbFlagCliente.setVisible(false);
        cbOpcao.requestFocus();
        dateInicio.setVisible(false);
        dateFim.setVisible(false);
        jla.setVisible(false);
        txtValor.setText("");
        x = txtValor.getX();
        y = txtValor.getY();
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
        cbOpcao = new javax.swing.JComboBox<>();
        cbFlagCliente = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLTexto = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtCPF = new br.com.ikeda.beans.jFormatTextCpf();
        txtCNPJ = new br.com.ikeda.beans.jFormatTextCnpj();
        dateInicio = new br.com.marciorl.beans.DateChooser();
        dateFim = new br.com.marciorl.beans.DateChooser();
        jla = new javax.swing.JLabel();
        btnLocalizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbOpcao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOpcaoItemStateChanged(evt);
            }
        });
        cbOpcao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbOpcaoFocusLost(evt);
            }
        });

        cbFlagCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbFlagCliente.setText("Pessoa Fisica?");
        cbFlagCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbFlagClienteKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Opção:");

        jLTexto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLTexto.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorFocusGained(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });

        txtCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCNPJKeyPressed(evt);
            }
        });

        jla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jla.setText("a");

        btnLocalizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Localizar 32.png"))); // NOI18N
        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sair.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFlagCliente)
                .addGap(44, 44, 44)
                .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLocalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cbFlagCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTexto)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jla)
                            .addComponent(dateFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificaconsulta(boolean valor)
    {
        jtableEditavel = valor == true;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public void configuraOpcoes(String[] vetOpcoes, int tl, int posDefault, String tabela, boolean flag)
    {
        this.tl = tl;
        this.vetOpcoes = vetOpcoes;
        this.posDefault = posDefault;
        this.tabela = tabela;
        this.setTitle("Localiza " + tabela);
        for (int i = 0; i < tl; i++)
        {
            cbOpcao.addItem(vetOpcoes[i]);
        }
        cbOpcao.setSelectedIndex(posDefault);
        if(tabela.equals("Cliente"))
            cbFlagCliente.setVisible(true);
    }
    
    private void ControlaComboBox() //alterar os campos conforme a opcao selecionada
    {
        String nome = (String) cbOpcao.getSelectedItem();

        dateInicio.setVisible(false);
        dateFim.setVisible(false);
        jla.setVisible(false);
        txtCNPJ.setVisible(false);
        txtCPF.setVisible(false);
        if(nome.equals("Data"))
        {
            txtValor.setVisible(false);
            dateInicio.setVisible(true);
            dateInicio.setLocation(x+105,y-3);
            jLTexto.setText("Data");
        }
        else
        {
            if(nome.equals("Periodo"))
            {
                txtValor.setVisible(false);
                dateInicio.setVisible(true);
                dateInicio.setLocation(x+105,y-3);
                jla.setVisible(true);
                jla.setLocation(x+110,y-3);
                dateFim.setVisible(true);
                dateFim.setLocation(x+115,y-3);
                jLTexto.setText("Periodo");

            }
            else
            {
                if(nome.equals("CPF"))
                {
                    txtCPF.setLocation(x+105,y-3);
                    txtCPF.setVisible(true);
                    cbFlagCliente.setVisible(false);
                    txtValor.setVisible(false);
                    jLTexto.setText("CPF");
                }
                else
                {
                    if(nome.equals("CNPJ"))
                    {
                        txtCNPJ.setLocation(x+105,y-3);
                        txtCNPJ.setVisible(true);
                        cbFlagCliente.setVisible(false);
                        txtValor.setVisible(false);
                        jLTexto.setText("CNPJ");
                    } 
                    else
                    {
                        if(tabela.equals("Cliente"))
                            cbFlagCliente.setVisible(true);
                        txtValor.setVisible(true);
                        jLTexto.setText("Valor");
                    }
                }
            }
        }
    }
    
    /*        vet[0] = "Código";
        vet[1] = "Nome";
        vet[2] = "CPF";
        vet[3] = "CNPJ";*/
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2)
        {
            if (jTable1.getSelectedRow() >= 0)
            {
                if (jtableEditavel == true)
                {
                    codigo = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                    this.dispose();
                }
                else
                {
                    codigo = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Você deve selecionar um registro", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusGained
        txtValor.setText("");
    }//GEN-LAST:event_txtValorFocusGained

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        codigo = 0;
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cbOpcaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOpcaoItemStateChanged
      ControlaComboBox();
    }//GEN-LAST:event_cbOpcaoItemStateChanged

    private void cbOpcaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbOpcaoFocusLost
      ControlaComboBox();
    }//GEN-LAST:event_cbOpcaoFocusLost

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        switch(tabela)
        {
            case "Estado": Estado(); break;
            case "Cidade": Cidade(); break;
            case "Funcionario": Funcionario(); break;
            case "Folha": Folha(); break;
            case "TipoConta": TipoConta(); break;
            case "Cliente": Cliente(); break;
            case "Produto": Produto(); break;
            case "DetalheServico": DetalheServico(); break;
            case "Servico": Servico(); break;
            case "Fornecedor": Fornecedor(); break;
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        btnLocalizarActionPerformed(null);
    }//GEN-LAST:event_txtValorKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        btnLocalizarActionPerformed(null);
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtCNPJKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNPJKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        btnLocalizarActionPerformed(null);
    }//GEN-LAST:event_txtCNPJKeyPressed

    private void cbFlagClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbFlagClienteKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        btnLocalizarActionPerformed(null);
    }//GEN-LAST:event_cbFlagClienteKeyPressed
    
    private void Estado() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Estado.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = Estado.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("uf_codigo"), 
                    rs.getString("uf_sigla")
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Cidade() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Cidade.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = Cidade.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("cid_codigo"), 
                    rs.getString("cid_nome"), 
                    rs.getString("uf_sigla")
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Folha() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Folha.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = Folha.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("fo_codigo"), 
                    rs.getString("fo_tamanho"),
                    rs.getString("fo_descricao"),
                    rs.getDouble("fo_altura"),
                    rs.getString("fo_largura"),
                    rs.getBoolean("fo_status")
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Produto() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Produto.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = Produto.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {//pro_codigo, pro_nome, pro_tipo, pro_status, pro_caminho
                    rs.getInt(1), 
                    rs.getString(2),
                    rs.getString(3).charAt(0) == 'i' ? "Interno" : "Externo",
                    rs.getBoolean(4) ? "Ativo" : "Não Ativo"
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void DetalheServico() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            DetalheServico.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = DetalheServico.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {//"Código", "Descricao", "Status"}
                    rs.getInt(1), 
                    rs.getString(2),
                    rs.getBoolean(3) ? "Ativo" : "Não Ativo"
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Servico() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Servico.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = Servico.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {//"Código", "Nome", "Status"}
                    rs.getInt(1), 
                    rs.getString(2),
                    rs.getBoolean(3) ? "Ativo" : "Não Ativo"
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Funcionario() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Funcionario.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            if(tipo == 1)
            {
                rs = Funcionario.buscarDados(txtCPF.getText(), tipo);
            }
            else
                rs = Funcionario.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {//"Código", "Nome", "CPF", "Telefone", "Celular", "Data Adimicao", "Data Demição"
                model.addRow(new Object[]
                {
                    rs.getInt(1), 
                    rs.getString(3), 
                    rs.getString(7), 
                    rs.getString(13), 
                    rs.getString(14), 
                    LocalDate.parse(rs.getString(16)),
                    rs.getString(17) == null ? "" : LocalDate.parse(rs.getString(17))
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Fornecedor() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Fornecedor.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = Fornecedor.buscarDados(txtValor.getText(), tipo);
            /*
            forn_codigo, forn_cid, forn_nome, "
                        + "forn_telefone, "
                        + "forn_celular, forn_email
            */
            while (rs.next())
            {//"Código", "Nome", "Telefone", "Celular", "E-mail"
                model.addRow(new Object[]
                {
                    rs.getInt(1), 
                    rs.getString(3), 
                    rs.getString(4), 
                    rs.getString(5), 
                    rs.getString(6)
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void Cliente() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            Cliente.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            switch(tipo)
            {
                case 1: rs = Cliente.buscarDados(txtValor.getText(), tipo, true); break;
                
                case 2: rs = Cliente.buscarDados(txtValor.getText(), tipo, false); break;
                
                default: rs = Cliente.buscarDados(txtValor.getText(), tipo, cbFlagCliente.isSelected()); 
            }
            while (rs.next())
            {//"Código", "Nome", "CPF/CNPJ", "Telefone", "Celular", "Enderecço", "Numero", "Complemento", "Status"
                //c.cli_codigo, c.cli_nome, f.cli_cpf, j.cli_cnpj, 
                //c.cli_telefone, c.cli_celular, c.cli_endereco, c.cli_numero, c.cli_complemento
                model.addRow(new Object[]
                {
                    rs.getInt(1), 
                    rs.getString(2), 
                    rs.getString(3),
                    rs.getString(4), 
                    rs.getString(5), 
                    rs.getString(6), 
                    rs.getString(7), 
                    rs.getString(8), 
                    rs.getBoolean(9) ? "Ativo" : "Não Ativo"
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }
    
    private void TipoConta() 
    {
        try
        {
            ResultSet rs;
            int tipo = cbOpcao.getSelectedIndex();
            TipoConta.configuraModel(jTable1);
            ReadOnlyTableModel model = (ReadOnlyTableModel) jTable1.getModel();
            rs = TipoConta.buscarDados(txtValor.getText(), tipo);
            while (rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("tc_codigo"), 
                    rs.getString("tc_tipo")
                });
            }
        } 
        catch (SQLException sqlEmp)
        {
            System.out.println("Erro: \n" + sqlEmp.toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox cbFlagCliente;
    private javax.swing.JComboBox<String> cbOpcao;
    private br.com.marciorl.beans.DateChooser dateFim;
    private br.com.marciorl.beans.DateChooser dateInicio;
    private javax.swing.JLabel jLTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jla;
    private br.com.ikeda.beans.jFormatTextCnpj txtCNPJ;
    private br.com.ikeda.beans.jFormatTextCpf txtCPF;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
