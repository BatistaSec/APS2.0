package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import pesquisa.EstatisticasSistema;

/**
 * Tela de avaliacao final da experiencia do visitante.
 */
public class FmlAvaliacaoFinal extends JDialog {


    public FmlAvaliacaoFinal() {
        initComponents();
        UtilTela.configurarDialogo(this, "Avaliacao Final", 420, 360);
        setModal(true);
        configurarTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlConteudo = new javax.swing.JPanel();
        pnlCentro = new javax.swing.JPanel();
        pnlTextos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        pnlEstrelas = new frontend.PainelEstrelas();
        pnlRodape = new javax.swing.JPanel();
        btnConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));
        pnlCentro.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        pnlCentro.setOpaque(false);
        pnlCentro.setLayout(new java.awt.BorderLayout(10, 10));
        pnlTextos.setOpaque(false);
        pnlTextos.setLayout(new java.awt.BorderLayout());
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Avalie a exposicao");
        pnlTextos.add(lblTitulo, java.awt.BorderLayout.NORTH);
        lblSubtitulo.setFont(new java.awt.Font("SansSerif", 0, 15));
        lblSubtitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("De uma nota geral de 1 a 5 estrelas");
        pnlTextos.add(lblSubtitulo, java.awt.BorderLayout.CENTER);
        pnlCentro.add(pnlTextos, java.awt.BorderLayout.NORTH);
        pnlCentro.add(pnlEstrelas, java.awt.BorderLayout.CENTER);
        pnlConteudo.add(pnlCentro, java.awt.BorderLayout.CENTER);
        pnlRodape.setOpaque(false);
        btnConcluir.setBackground(new java.awt.Color(255, 0, 15));
        btnConcluir.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnConcluir.setForeground(java.awt.Color.WHITE);
        btnConcluir.setText("Finalizar visita");
        btnConcluir.setFocusPainted(false);
        btnConcluir.setPreferredSize(new java.awt.Dimension(320, 60));
        pnlRodape.add(btnConcluir);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void configurarTela() {
        montarEstruturaAvaliacao();
        btnConcluir.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { concluirAvaliacao(); }});
    }

    protected void montarEstruturaAvaliacao() {
        pnlConteudo.removeAll();
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));

        pnlCentro = new javax.swing.JPanel(new java.awt.BorderLayout(10, 16));
        pnlCentro.setOpaque(false);
        pnlCentro.setBorder(BorderFactory.createEmptyBorder(24, 20, 12, 20));

        pnlTextos = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 6));
        pnlTextos.setOpaque(false);
        lblTitulo = new javax.swing.JLabel("Avalie a exposicao", javax.swing.SwingConstants.CENTER);
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        lblSubtitulo = new javax.swing.JLabel("De uma nota geral de 1 a 5 estrelas", javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setForeground(new java.awt.Color(210, 210, 220));
        lblSubtitulo.setFont(new Font("SansSerif", Font.PLAIN, 15));
        pnlTextos.add(lblTitulo);
        pnlTextos.add(lblSubtitulo);
        pnlCentro.add(pnlTextos, java.awt.BorderLayout.NORTH);

        pnlEstrelas = new PainelEstrelas();
        pnlCentro.add(pnlEstrelas, java.awt.BorderLayout.CENTER);
        pnlConteudo.add(pnlCentro, java.awt.BorderLayout.CENTER);

        pnlRodape = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 12));
        pnlRodape.setOpaque(false);
        btnConcluir = new javax.swing.JButton("Finalizar visita");
        btnConcluir.setBackground(new java.awt.Color(255, 0, 15));
        btnConcluir.setForeground(java.awt.Color.WHITE);
        btnConcluir.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnConcluir.setFocusPainted(false);
        btnConcluir.setBorder(BorderFactory.createEmptyBorder(12, 16, 12, 16));
        btnConcluir.setPreferredSize(new java.awt.Dimension(320, 54));
        pnlRodape.add(btnConcluir);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);

        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }

    protected void concluirAvaliacao() {
        int nota = pnlEstrelas.getNotaSelecionada();
        if (nota <= 0) {
            JOptionPane.showMessageDialog(this, "Escolha de 1 a 5 estrelas antes de finalizar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EstatisticasSistema.getInstancia().registrarNotaFinal(nota);
        JOptionPane.showMessageDialog(this, "Obrigado pela visita ao museu! Sua opiniao e muito importante. O sistema retornara ao inicio.", "Mensagem final", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected PainelEstrelas pnlEstrelas;
    protected javax.swing.JButton btnConcluir;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlRodape;
    private javax.swing.JPanel pnlTextos;
    // End of variables declaration//GEN-END:variables

}
