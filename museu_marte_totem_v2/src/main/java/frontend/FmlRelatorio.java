package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import pesquisa.EstatisticasSistema;

/**
 * Tela que apresenta os dados estatisticos da exposicao.
 */
public class FmlRelatorio extends JDialog {


    public FmlRelatorio() {
        initComponents();
        UtilTela.configurarDialogo(this, "Relatorio Estatistico", 430, 700);
        setModal(true);
        configurarTela();
        atualizarRelatorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlConteudo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        scrollRelatorio = new javax.swing.JScrollPane();
        txtRelatorio = new javax.swing.JTextArea();
        pnlRodape = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));
        pnlTopo.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 5, 15));
        pnlTopo.setOpaque(false);
        pnlTopo.setLayout(new java.awt.BorderLayout());
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Relatorio da Exposicao");
        pnlTopo.add(lblTitulo, java.awt.BorderLayout.NORTH);
        lblSubtitulo.setFont(new java.awt.Font("SansSerif", 0, 15));
        lblSubtitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Dados salvos em arquivo local");
        pnlTopo.add(lblSubtitulo, java.awt.BorderLayout.SOUTH);
        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);
        scrollRelatorio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 15));
        txtRelatorio.setEditable(false);
        txtRelatorio.setBackground(new java.awt.Color(39, 39, 46));
        txtRelatorio.setColumns(20);
        txtRelatorio.setFont(new java.awt.Font("Monospaced", 0, 14));
        txtRelatorio.setForeground(new java.awt.Color(245, 245, 245));
        txtRelatorio.setRows(5);
        txtRelatorio.setText("Relatorio exibido aqui");
        txtRelatorio.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        scrollRelatorio.setViewportView(txtRelatorio);
        pnlConteudo.add(scrollRelatorio, java.awt.BorderLayout.CENTER);
        pnlRodape.setOpaque(false);
        criarBotaoSecundario(btnAtualizar, "Atualizar");
        criarBotaoSecundario(btnVoltar, "Voltar");
        pnlRodape.add(btnAtualizar);
        pnlRodape.add(btnVoltar);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarBotaoSecundario(javax.swing.JButton botao, String texto) {
        botao.setBackground(new java.awt.Color(103, 100, 246));
        botao.setFont(new Font("SansSerif", Font.BOLD, 16));
        botao.setForeground(java.awt.Color.WHITE);
        botao.setText(texto);
        botao.setFocusPainted(false);
        botao.setPreferredSize(new java.awt.Dimension(160, 50));
    }

    protected void configurarTela() {
        btnAtualizar.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { atualizarRelatorio(); }});
        btnVoltar.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { dispose(); }});
    }

    protected void atualizarRelatorio() {
        txtRelatorio.setText(EstatisticasSistema.getInstancia().gerarRelatorioTexto());
        txtRelatorio.setCaretPosition(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextArea txtRelatorio;
    protected javax.swing.JButton btnAtualizar;
    protected javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlRodape;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JScrollPane scrollRelatorio;
    // End of variables declaration//GEN-END:variables

}
