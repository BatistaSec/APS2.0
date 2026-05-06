package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * Teclado virtual simples para uso no totem touchscreen.
 */
public class FmlTecladoVirtual extends JDialog {

    protected String textoFinal;
    protected boolean confirmado;

    public FmlTecladoVirtual(String textoInicial) {
        initComponents();
        UtilTela.configurarDialogo(this, "Teclado Virtual", 420, 560);
        setModal(true);
        textoFinal = textoInicial;
        confirmado = false;
        txtDigitacao.setText(textoFinal == null ? "" : textoFinal);
        configurarTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlConteudo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        pnlCabecalho = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        txtDigitacao = new javax.swing.JTextField();
        pnlTeclas = new javax.swing.JPanel();
        pnlRodape = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));
        pnlTopo.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 5, 15));
        pnlTopo.setOpaque(false);
        pnlTopo.setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setOpaque(false);
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Teclado Virtual");
        pnlCabecalho.add(lblTitulo, java.awt.BorderLayout.NORTH);
        lblInfo.setFont(new java.awt.Font("SansSerif", 0, 15));
        lblInfo.setForeground(new java.awt.Color(245, 245, 245));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("Toque nas letras para pesquisar um robo");
        pnlCabecalho.add(lblInfo, java.awt.BorderLayout.CENTER);
        pnlTopo.add(pnlCabecalho, java.awt.BorderLayout.NORTH);
        txtDigitacao.setEditable(false);
        txtDigitacao.setFont(new java.awt.Font("SansSerif", 1, 20));
        pnlTopo.add(txtDigitacao, java.awt.BorderLayout.SOUTH);
        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);
        pnlTeclas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        pnlTeclas.setOpaque(false);
        pnlTeclas.setLayout(new java.awt.GridLayout(5, 6, 8, 8));
        pnlConteudo.add(pnlTeclas, java.awt.BorderLayout.CENTER);
        pnlRodape.setOpaque(false);
        btnCancelar.setBackground(new java.awt.Color(103, 100, 246));
        btnCancelar.setFont(new java.awt.Font("SansSerif", 1, 16));
        btnCancelar.setForeground(java.awt.Color.WHITE);
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(160, 50));
        pnlRodape.add(btnCancelar);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void configurarTela() {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (String letra : letras) pnlTeclas.add(criarBotaoTecla(letra));
        btnEspaco = criarBotaoTecla("ESPACO");
        btnApagar = criarBotaoTecla("APAGAR");
        btnLimpar = criarBotaoTecla("LIMPAR");
        btnConfirmar = criarBotaoTecla("OK");
        pnlTeclas.add(btnEspaco);
        pnlTeclas.add(btnApagar);
        pnlTeclas.add(btnLimpar);
        pnlTeclas.add(btnConfirmar);
        btnCancelar.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { dispose(); }});
    }

    protected JButton criarBotaoTecla(final String texto) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("SansSerif", Font.BOLD, 16));
        botao.setFocusPainted(false);
        botao.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { tratarToqueTecla(texto); }});
        return botao;
    }

    protected void tratarToqueTecla(String tecla) {
        String textoAtual = txtDigitacao.getText();
        if ("APAGAR".equals(tecla)) {
            if (textoAtual.length() > 0) txtDigitacao.setText(textoAtual.substring(0, textoAtual.length() - 1));
            return;
        }
        if ("LIMPAR".equals(tecla)) { txtDigitacao.setText(""); return; }
        if ("ESPACO".equals(tecla)) { txtDigitacao.setText(textoAtual + " "); return; }
        if ("OK".equals(tecla)) { textoFinal = txtDigitacao.getText(); confirmado = true; dispose(); return; }
        txtDigitacao.setText(textoAtual + tecla);
    }

    public String getTextoFinal() { return textoFinal; }
    public boolean isConfirmado() { return confirmado; }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField txtDigitacao;
    protected JButton btnApagar;
    protected JButton btnLimpar;
    protected JButton btnEspaco;
    protected JButton btnConfirmar;
    protected JButton btnCancelar;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlRodape;
    private javax.swing.JPanel pnlTeclas;
    private javax.swing.JPanel pnlTopo;
    // End of variables declaration//GEN-END:variables

}
