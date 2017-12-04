/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import alerta.TimeManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import servidor.AlarmCliente;
import servidor.ServerData;

/**
 *
 * @author hidan
 */
public class Tela extends javax.swing.JFrame {

    int contador = 0;
    AlarmCliente cliente;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        hora = new javax.swing.JTextField();
        minuto = new javax.swing.JTextField();
        segundo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonAdicionarTempo = new javax.swing.JButton();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoConectar = new javax.swing.JButton();
        botaoPuxar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        hora.setText("0");

        minuto.setText("0");

        segundo.setText("0");

        jLabel1.setText("Hora:");

        jLabel2.setText("Minuto:");

        jLabel3.setText("Segundo:");
        this.botaoPuxar.setVisible(false);
        buttonAdicionarTempo.setText("Adicionar Timer");
        buttonAdicionarTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarTempoActionPerformed(evt);
            }
        });

        jLabel4.setText("Descricao:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(buttonAdicionarTempo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionarTempo)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        botaoConectar.setText("Conectar");
        botaoConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConectarActionPerformed(evt);
            }
        });

        botaoPuxar.setText("Push");
        botaoPuxar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPuxarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPuxar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(botaoConectar)
                .addGap(18, 18, 18)
                .addComponent(botaoPuxar)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Tempo Inicial", "Tempo Final", "Remover"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void agendaTimer()
    {
        
    }
    
    private void buttonAdicionarTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarTempoActionPerformed
        // Enviar valores para o método "adicionarTempo" em vez de adicionar aqui
        // Para só ter que mexer em um lugar durante a manutenção do codigo
        long tempo = Integer.parseInt(segundo.getText())
                + Integer.parseInt(minuto.getText()) * 60
                + Integer.parseInt(hora.getText()) * 60 * 60;
        TimeManager timer = new TimeManager(this, tempo, descricao.getText(), contador);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        jTable2.getModel().setValueAt(descricao.getText(), contador, 0);
        Date data = cal.getTime();
        jTable2.getModel().setValueAt(sdf.format(data.getTime()), contador, 1);

        data.setHours(data.getHours() + Integer.parseInt(hora.getText()));
        data.setMinutes(data.getMinutes() + Integer.parseInt(minuto.getText()));
        data.setSeconds(data.getSeconds() + Integer.parseInt(segundo.getText()));
        jTable2.getModel().setValueAt(sdf.format(data.getTime()), contador, 2);
        contador++;
        JButton botao = new JButton();
        botao.setText("Delete");
        //botao.addActionListener(al);
    }//GEN-LAST:event_buttonAdicionarTempoActionPerformed

    private void botaoConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConectarActionPerformed
        this.botaoPuxar.setVisible(true);
        // Botao para deixar o cliente Online
        if (cliente == null) {
            try {
                cliente = new AlarmCliente();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_botaoConectarActionPerformed

    private void botaoPuxarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPuxarActionPerformed
        try {
            ArrayList<ServerData> temp;
            temp = (ArrayList<ServerData>) cliente.request();
            System.out.println("Numero de valores recebidos:"+temp.size());
            for (ServerData serverData : temp) {
                adicionarTempo(serverData);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_botaoPuxarActionPerformed
    private void adicionarTempo(ServerData sd){
                
        TimeManager timer = new TimeManager(this, sd.getTempoFinal(), sd.getDescricao(), contador);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        jTable2.getModel().setValueAt(sd.getDescricao(), contador, 0);
        jTable2.getModel().setValueAt(sdf.format(sd.getTempoAtual()), contador, 1);
        jTable2.getModel().setValueAt(sdf.format(sd.getTempoFinal()), contador, 2);
        contador++;
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    public void deletarLinha(int index) {

        ((DefaultTableModel) jTable2.getModel()).removeRow(index);
        // jTable2.getModel().addRow(new Object[]{null,null,null,null});
        // Adicionar linhas depois 
        contador--;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConectar;
    private javax.swing.JButton botaoPuxar;
    private javax.swing.JButton buttonAdicionarTempo;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField minuto;
    private javax.swing.JTextField segundo;
    // End of variables declaration//GEN-END:variables
}
