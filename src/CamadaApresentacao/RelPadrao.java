package CamadaApresentacao;

import CamadaLogica.Relatorio;
import javax.swing.JOptionPane;
import util.SystemControl;

/**
 *
 * @author Bruno Yoshino
 */
public class RelPadrao extends javax.swing.JDialog {

    private int codigo;    
    private String[] vetOpcoes = new String[20];
    private final SystemControl  sc = new SystemControl();
    private int tl;
    private String tabela;
    private int posDefault;
    boolean jtableEditavel;
    private final Relatorio rel = new Relatorio();

    public RelPadrao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        txtValor.setVisible(true);
        lbData.setVisible(false);
        dataInicio.setVisible(false);
        dataFim.setVisible(false);
        lbA.setVisible(false);
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
        lbTexto = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        dataInicio = new br.com.marciorl.beans.DateChooser();
        lbA = new javax.swing.JLabel();
        dataFim = new br.com.marciorl.beans.DateChooser();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbOpcao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbOpcao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOpcaoItemStateChanged(evt);
            }
        });

        lbTexto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTexto.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbData.setText("Data:");

        lbA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbA.setText("a");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTexto)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbA)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sair.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/relatorio.png"))); // NOI18N
        jButton2.setText("Gerar Relatorio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpcaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOpcaoItemStateChanged
        ControlaComboBox();
    }//GEN-LAST:event_cbOpcaoItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String lista[] = {"PDF","Local"};
        Object valor;
        do{
            valor = JOptionPane.showInputDialog(this, "Atenção", 
                    "A geração do Relatorio será em:", JOptionPane.INFORMATION_MESSAGE,
                    null, lista, lista[0]);
        }while(valor == null);

        switch(tabela)
        {
            case "AjusteEstoqueProduto": AjusteProduto(""+valor); break;
            case "AjusteEstoqueFolha": AjusteFolha(""+valor); break;

        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void configuraOpcoes(String[] vetOpcoes, int tl, int posDefault, String tabela)
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
    }
    
    private void ControlaComboBox() //alterar os campos conforme a opcao selecionada
    {
        String nome = (String) cbOpcao.getSelectedItem();
        
        if(nome.contains("Data"))
        {
            txtValor.setVisible(false);
            lbData.setVisible(true);
            dataInicio.setVisible(true);
        }
        else
        {
            if(nome.contains("Periodo"))
            {
                txtValor.setVisible(false);
                lbData.setVisible(true);
                dataInicio.setVisible(true);
                dataFim.setVisible(true);
                lbA.setVisible(true);

            }
            else
            {
                txtValor.setVisible(true);
                lbData.setVisible(false);
                dataInicio.setVisible(false);
                dataFim.setVisible(false);
                lbA.setVisible(false);
            }
        }
    }
    
    private void AjusteProduto(String op)
    {
        /*
        try {
            if(op.equals("PDF"))
                rel.ImprimirRelatorioPDF(Pedido.RelatorioPedido(txtValor.getText(), cbOpcao.getSelectedIndex(), dataInicio.getData(), dataFim.getData()), "Relatorios\\Pedido.jasper");
            else
                rel.ImprimirRelatorio(Pedido.RelatorioPedido(txtValor.getText(), cbOpcao.getSelectedIndex(), dataInicio.getData(), dataFim.getData()), "Relatorios\\Pedido.jasper", "Relatorio Pedido");
        } catch (JRException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
    
    private void AjusteFolha(String op)
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbOpcao;
    private br.com.marciorl.beans.DateChooser dataFim;
    private br.com.marciorl.beans.DateChooser dataInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}