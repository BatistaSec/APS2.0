package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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
        UtilTela.configurarDialogo(this, "Teclado Virtual", 430, 620);
        setModal(true);
        textoFinal = textoInicial;
        confirmado = false;
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
        montarEstruturaTeclado();
        adicionarLinhaTeclas("Q", "W", "E", "R", "T", "Y", "U");
        adicionarLinhaTeclas("I", "O", "P", "A", "S", "D", "F");
        adicionarLinhaTeclas("G", "H", "J", "K", "L", "Z", "X");
        adicionarLinhaTeclas("C", "V", "B", "N", "M");
        adicionarLinhaComandos();
        btnCancelar.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { dispose(); }});
    }

    protected void montarEstruturaTeclado() {
        pnlConteudo.removeAll();
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));

        pnlTopo = new javax.swing.JPanel(new java.awt.BorderLayout(0, 10));
        pnlTopo.setOpaque(false);
        pnlTopo.setBorder(BorderFactory.createEmptyBorder(16, 16, 4, 16));

        lblTitulo = new javax.swing.JLabel("Teclado Virtual", javax.swing.SwingConstants.CENTER);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));

        lblInfo = new javax.swing.JLabel("Digite o nome do robo", javax.swing.SwingConstants.CENTER);
        lblInfo.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblInfo.setForeground(new java.awt.Color(210, 210, 220));

        pnlCabecalho = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 4));
        pnlCabecalho.setOpaque(false);
        pnlCabecalho.add(lblTitulo);
        pnlCabecalho.add(lblInfo);

        txtDigitacao = new javax.swing.JTextField(textoFinal == null ? "" : textoFinal);
        txtDigitacao.setEditable(false);
        txtDigitacao.setFont(new Font("SansSerif", Font.BOLD, 20));
        txtDigitacao.setBackground(new java.awt.Color(250, 250, 250));
        txtDigitacao.setForeground(new java.awt.Color(30, 30, 35));
        txtDigitacao.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));

        pnlTopo.add(pnlCabecalho, java.awt.BorderLayout.NORTH);
        pnlTopo.add(txtDigitacao, java.awt.BorderLayout.SOUTH);
        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);

        pnlTeclas = new javax.swing.JPanel();
        pnlTeclas.setLayout(new javax.swing.BoxLayout(pnlTeclas, javax.swing.BoxLayout.Y_AXIS));
        pnlTeclas.setOpaque(false);
        pnlTeclas.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlConteudo.add(pnlTeclas, java.awt.BorderLayout.CENTER);

        pnlRodape = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 8));
        pnlRodape.setOpaque(false);
        btnCancelar = new javax.swing.JButton("Cancelar");
        estilizarBotaoTecla(btnCancelar, new java.awt.Color(72, 72, 84));
        btnCancelar.setPreferredSize(new java.awt.Dimension(180, 44));
        pnlRodape.add(btnCancelar);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);

        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }

    protected void adicionarLinhaTeclas(String... teclas) {
        javax.swing.JPanel linha = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));
        linha.setOpaque(false);
        for (String tecla : teclas) {
            JButton botao = criarBotaoTecla(tecla);
            botao.setPreferredSize(new java.awt.Dimension(48, 42));
            linha.add(botao);
        }
        pnlTeclas.add(linha);
    }

    protected void adicionarLinhaComandos() {
        javax.swing.JPanel linha = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 4));
        linha.setOpaque(false);
        btnEspaco = criarBotaoTecla("ESPACO");
        btnApagar = criarBotaoTecla("APAGAR");
        btnLimpar = criarBotaoTecla("LIMPAR");
        btnConfirmar = criarBotaoTecla("OK");
        btnEspaco.setPreferredSize(new java.awt.Dimension(100, 42));
        btnApagar.setPreferredSize(new java.awt.Dimension(88, 42));
        btnLimpar.setPreferredSize(new java.awt.Dimension(82, 42));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(70, 42));
        linha.add(btnEspaco);
        linha.add(btnApagar);
        linha.add(btnLimpar);
        linha.add(btnConfirmar);
        pnlTeclas.add(linha);
    }

    protected JButton criarBotaoTecla(final String texto) {
        JButton botao = new JButton(texto);
        estilizarBotaoTecla(botao, "OK".equals(texto) ? new java.awt.Color(255, 0, 15) : new java.awt.Color(103, 100, 246));
        botao.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { tratarToqueTecla(texto); }});
        return botao;
    }

    protected void estilizarBotaoTecla(JButton botao, java.awt.Color cor) {
        botao.setBackground(cor);
        botao.setForeground(java.awt.Color.WHITE);
        botao.setFont(new Font("SansSerif", Font.BOLD, 13));
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createEmptyBorder(8, 6, 8, 6));
        botao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
