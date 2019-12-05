/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.VooDAO;
import model.Voo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe TI
 */
public class Voo_Filtrado extends javax.swing.JFrame {
    
    int paginas = 0;
    List<Voo> voos;
    int contador;
    int pagina = 1;

    /**
     * Creates new form Voo_Filtrado
     */
    public Voo_Filtrado() {
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

        jSeparator3 = new javax.swing.JSeparator();
        AeroChega1 = new javax.swing.JLabel();
        nomeChega3 = new javax.swing.JLabel();
        AeroPart1 = new javax.swing.JLabel();
        Comp1 = new javax.swing.JLabel();
        AeroChega3 = new javax.swing.JLabel();
        jbtnSelecionar3 = new javax.swing.JButton();
        DtaHora1 = new javax.swing.JLabel();
        DtaHora3 = new javax.swing.JLabel();
        nomePart1 = new javax.swing.JLabel();
        nomePart3 = new javax.swing.JLabel();
        nomeChega1 = new javax.swing.JLabel();
        vlrDta3 = new javax.swing.JLabel();
        vlrDta1 = new javax.swing.JLabel();
        vlrComp3 = new javax.swing.JLabel();
        vlrComp1 = new javax.swing.JLabel();
        Comp3 = new javax.swing.JLabel();
        jbtnSelecionar1 = new javax.swing.JButton();
        jbtnSelecionar4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        DtaHora4 = new javax.swing.JLabel();
        DtaHora2 = new javax.swing.JLabel();
        nomePart4 = new javax.swing.JLabel();
        nomePart2 = new javax.swing.JLabel();
        nomeChega2 = new javax.swing.JLabel();
        vlrDta4 = new javax.swing.JLabel();
        vlrComp4 = new javax.swing.JLabel();
        Comp4 = new javax.swing.JLabel();
        AeroPart4 = new javax.swing.JLabel();
        nomeChega4 = new javax.swing.JLabel();
        AeroChega4 = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();
        vlrDta2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        vlrComp2 = new javax.swing.JLabel();
        jlblPagina = new javax.swing.JLabel();
        jbtnSelecionar2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        AeroChega2 = new javax.swing.JLabel();
        AeroPart2 = new javax.swing.JLabel();
        Comp2 = new javax.swing.JLabel();
        AeroPart3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AeroChega1.setText("Aeroporto de Chegada:");

        nomeChega3.setText("Congonhas");

        AeroPart1.setText("Aeroporto de Partida:");

        Comp1.setText("Companhia Aerea:");

        AeroChega3.setText("Aeroporto de Chegada:");

        jbtnSelecionar3.setText(">");
        jbtnSelecionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelecionar3ActionPerformed(evt);
            }
        });

        DtaHora1.setText("Data/Hora:");

        DtaHora3.setText("Data/Hora:");

        nomePart1.setText("Salgado Filho");

        nomePart3.setText("Salgado Filho");

        nomeChega1.setText("Congonhas");

        vlrDta3.setText("11/10/2019 12:45");

        vlrDta1.setText("11/10/2019 11:30");

        vlrComp3.setText("Azul");

        vlrComp1.setText("Gol");

        Comp3.setText("Companhia Aerea:");

        jbtnSelecionar1.setText(">");
        jbtnSelecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelecionar1ActionPerformed(evt);
            }
        });

        jbtnSelecionar4.setText(">");
        jbtnSelecionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelecionar4ActionPerformed(evt);
            }
        });

        DtaHora4.setText("Data/Hora:");

        DtaHora2.setText("Data/Hora:");

        nomePart4.setText("Salgado Filho");

        nomePart2.setText("Salgado Filho");

        nomeChega2.setText("Congonhas");

        vlrDta4.setText("11/10/2019 14:00");

        vlrComp4.setText("Gol");

        Comp4.setText("Companhia Aerea:");

        AeroPart4.setText("Aeroporto de Partida:");

        nomeChega4.setText("Congonhas");

        AeroChega4.setText("Aeroporto de Chegada:");

        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        vlrDta2.setText("11/10/2019 12:30");

        btnVoltar.setText("Voltar");

        vlrComp2.setText("Latam");

        jlblPagina.setText("1");

        jbtnSelecionar2.setText(">");
        jbtnSelecionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelecionar2ActionPerformed(evt);
            }
        });

        AeroChega2.setText("Aeroporto de Chegada:");

        AeroPart2.setText("Aeroporto de Partida:");
        AeroPart2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Comp2.setText("Companhia Aerea:");

        AeroPart3.setText("Aeroporto de Partida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DtaHora1)
                                    .addComponent(Comp1))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vlrDta1)
                                    .addComponent(vlrComp1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AeroPart1)
                                    .addComponent(AeroChega1))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeChega1)
                                    .addComponent(nomePart1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jbtnSelecionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DtaHora3)
                                    .addComponent(Comp3))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vlrDta3)
                                    .addComponent(vlrComp3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AeroPart3)
                                    .addComponent(AeroChega3))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeChega3)
                                    .addComponent(nomePart3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSelecionar3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DtaHora4)
                                    .addComponent(Comp4))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vlrDta4)
                                    .addComponent(vlrComp4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AeroPart4)
                                    .addComponent(AeroChega4))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeChega4)
                                    .addComponent(nomePart4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSelecionar4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DtaHora2)
                                    .addComponent(Comp2))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vlrDta2)
                                    .addComponent(vlrComp2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AeroPart2)
                                    .addComponent(AeroChega2))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeChega2)
                                    .addComponent(nomePart2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSelecionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(jlblPagina)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvancar)
                        .addGap(109, 109, 109))))
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AeroPart1)
                    .addComponent(nomePart1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AeroChega1)
                            .addComponent(nomeChega1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DtaHora1)
                            .addComponent(vlrDta1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbtnSelecionar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comp1)
                    .addComponent(vlrComp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AeroPart2)
                    .addComponent(nomePart2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AeroChega2)
                            .addComponent(nomeChega2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DtaHora2)
                            .addComponent(vlrDta2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbtnSelecionar2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comp2)
                    .addComponent(vlrComp2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AeroPart3)
                    .addComponent(nomePart3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AeroChega3)
                            .addComponent(nomeChega3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DtaHora3)
                            .addComponent(vlrDta3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbtnSelecionar3)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comp3)
                    .addComponent(vlrComp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AeroPart4)
                    .addComponent(nomePart4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AeroChega4)
                            .addComponent(nomeChega4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DtaHora4)
                            .addComponent(vlrDta4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbtnSelecionar4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comp4)
                    .addComponent(vlrComp4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar)
                    .addComponent(btnVoltar)
                    .addComponent(jlblPagina))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void filtrar(List<Voo> lista){
        paginas = Math.round( lista.size()/4 );
        this.voos = lista;    
        contador = 0;
        carregarPagina();
   
    }
    
    private void carregarPagina(){
       contador = voos.size() - pagina*4;
        
       if(contador != -3){
        Voo voo1 = voos.get(pagina*4-4);
            AeroPart1.setVisible(true);
            AeroChega1.setVisible(true);
            DtaHora1.setVisible(true);
            Comp1.setVisible(true);
            nomePart1.setVisible(true);
            nomeChega1.setVisible(true);
            vlrDta1.setVisible(true);
            vlrComp1.setVisible(true);
            nomePart1.setText(VooDAO.getAeroporto(voo1.getAero_partida()));
            nomeChega1.setText(VooDAO.getAeroporto(voo1.getAero_chegada()));
            vlrDta1.setText(voo1.getData_hora());
            vlrComp1.setText(VooDAO.getCompanhia(voo1.getId_companhia()));
            if(contador != -2){
                if(contador != -1){
                    if(contador != 0){
                        
                    }
                }
            }
       }
       
        
        
       
    }
    
    public void limpar(){
        AeroPart1.setVisible(false);
        AeroChega1.setVisible(false);
        DtaHora1.setVisible(false);
        Comp1.setVisible(false);
        nomePart1.setVisible(false);
        nomeChega1.setVisible(false);
        vlrDta1.setVisible(false);
        vlrComp1.setVisible(false);
        AeroPart2.setVisible(false);
        AeroChega2.setVisible(false);
        DtaHora2.setVisible(false);
        Comp2.setVisible(false);
        nomePart2.setVisible(false);
        nomeChega2.setVisible(false);
        vlrDta2.setVisible(false);
        vlrComp2.setVisible(false);
        AeroPart3.setVisible(false);
        AeroChega3.setVisible(false);
        DtaHora3.setVisible(false);
        Comp3.setVisible(false);
        nomePart3.setVisible(false);
        nomeChega3.setVisible(false);
        vlrDta3.setVisible(false);
        vlrComp3.setVisible(false);
        AeroPart4.setVisible(false);
        AeroChega4.setVisible(false);
        DtaHora4.setVisible(false);
        Comp4.setVisible(false);
        nomePart4.setVisible(false);
        nomeChega4.setVisible(false);
        vlrDta4.setVisible(false);
        vlrComp4.setVisible(false);
        jbtnSelecionar1.setVisible(false);
        jbtnSelecionar2.setVisible(false);
        jbtnSelecionar3.setVisible(false);
        jbtnSelecionar4.setVisible(false);
        jSeparator1.setVisible(false);
        jSeparator2.setVisible(false);
        jSeparator3.setVisible(false);
        jSeparator4.setVisible(false);
        btnVoltar.setVisible(false);
        btnAvancar.setVisible(false);
    }
    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void jbtnSelecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelecionar1ActionPerformed
        Tela_Principal tela = new Tela_Principal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnSelecionar1ActionPerformed

    private void jbtnSelecionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelecionar2ActionPerformed
        
        
        
        Tela_Principal tela = new Tela_Principal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnSelecionar2ActionPerformed

    private void jbtnSelecionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelecionar3ActionPerformed
        Tela_Principal tela = new Tela_Principal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnSelecionar3ActionPerformed

    private void jbtnSelecionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelecionar4ActionPerformed
        Tela_Principal tela = new Tela_Principal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnSelecionar4ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AeroChega1;
    private javax.swing.JLabel AeroChega2;
    private javax.swing.JLabel AeroChega3;
    private javax.swing.JLabel AeroChega4;
    private javax.swing.JLabel AeroPart1;
    private javax.swing.JLabel AeroPart2;
    private javax.swing.JLabel AeroPart3;
    private javax.swing.JLabel AeroPart4;
    private javax.swing.JLabel Comp1;
    private javax.swing.JLabel Comp2;
    private javax.swing.JLabel Comp3;
    private javax.swing.JLabel Comp4;
    private javax.swing.JLabel DtaHora1;
    private javax.swing.JLabel DtaHora2;
    private javax.swing.JLabel DtaHora3;
    private javax.swing.JLabel DtaHora4;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbtnSelecionar1;
    private javax.swing.JButton jbtnSelecionar2;
    private javax.swing.JButton jbtnSelecionar3;
    private javax.swing.JButton jbtnSelecionar4;
    private javax.swing.JLabel jlblPagina;
    private javax.swing.JLabel nomeChega1;
    private javax.swing.JLabel nomeChega2;
    private javax.swing.JLabel nomeChega3;
    private javax.swing.JLabel nomeChega4;
    private javax.swing.JLabel nomePart1;
    private javax.swing.JLabel nomePart2;
    private javax.swing.JLabel nomePart3;
    private javax.swing.JLabel nomePart4;
    private javax.swing.JLabel vlrComp1;
    private javax.swing.JLabel vlrComp2;
    private javax.swing.JLabel vlrComp3;
    private javax.swing.JLabel vlrComp4;
    private javax.swing.JLabel vlrDta1;
    private javax.swing.JLabel vlrDta2;
    private javax.swing.JLabel vlrDta3;
    private javax.swing.JLabel vlrDta4;
    // End of variables declaration//GEN-END:variables
}
