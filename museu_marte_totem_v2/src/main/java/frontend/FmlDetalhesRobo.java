package frontend;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import models.RoboExplorador;
import pesquisa.EstatisticasSistema;

/**
 * Tela individual de detalhes do robo.
 */
public class FmlDetalhesRobo extends JDialog {

    protected RoboExplorador robo;
    protected int indiceRobo;

    public FmlDetalhesRobo(RoboExplorador robo, int indiceRobo) {
        initComponents();
        this.robo = robo;
        this.indiceRobo = indiceRobo;
        UtilTela.configurarDialogo(this, robo.getNome(), 430, 760);
        setModal(true);
        configurarTela();
        carregarDadosRobo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlConteudo = new javax.swing.JPanel();
        scrollDetalhes = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        lblAvaliacao = new javax.swing.JLabel();
        pnlEstrelas = new frontend.PainelEstrelas();
        pnlBotoes = new javax.swing.JPanel();
        btnSalvarNota = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));
        pnlConteudo.setLayout(new java.awt.BorderLayout());
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.Y_AXIS));
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nome do robo");
        lblTitulo.setAlignmentX(0.5F);
        pnlPrincipal.add(lblTitulo);
        lblImagem.setForeground(new java.awt.Color(245, 245, 245));
        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("Imagem ilustrativa");
        lblImagem.setAlignmentX(0.5F);
        lblImagem.setPreferredSize(new java.awt.Dimension(360, 190));
        pnlPrincipal.add(lblImagem);
        lblAvaliacao.setFont(new java.awt.Font("SansSerif", 0, 15));
        lblAvaliacao.setForeground(new java.awt.Color(245, 245, 245));
        lblAvaliacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvaliacao.setText("De uma nota de 1 a 5 estrelas para este robo");
        lblAvaliacao.setAlignmentX(0.5F);
        pnlPrincipal.add(lblAvaliacao);
        pnlEstrelas.setAlignmentX(0.5F);
        pnlPrincipal.add(pnlEstrelas);
        pnlBotoes.setOpaque(false);
        criarBotaoSecundario(btnSalvarNota, "Salvar nota");
        criarBotaoSecundario(btnVoltar, "Voltar");
        pnlBotoes.add(btnSalvarNota);
        pnlBotoes.add(btnVoltar);
        pnlPrincipal.add(pnlBotoes);
        scrollDetalhes.setViewportView(pnlPrincipal);
        pnlConteudo.add(scrollDetalhes, java.awt.BorderLayout.CENTER);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarBotaoSecundario(javax.swing.JButton botao, String texto) {
        botao.setBackground(new java.awt.Color(103, 100, 246));
        botao.setFont(new Font("SansSerif", Font.BOLD, 16));
        botao.setForeground(java.awt.Color.WHITE);
        botao.setText(texto);
        botao.setFocusPainted(false);
        botao.setPreferredSize(new Dimension(160, 50));
    }

    protected void configurarTela() {
        montarEstruturaDetalhes();
        scrollDetalhes.getVerticalScrollBar().setUnitIncrement(16);
        scrollDetalhes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        btnSalvarNota.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { salvarNota(); }});
        btnVoltar.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { dispose(); }});
    }

    protected void montarEstruturaDetalhes() {
        pnlConteudo.removeAll();
        pnlConteudo.setLayout(new java.awt.BorderLayout(0, 0));
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));

        JPanel pnlCabecalho = new JPanel();
        pnlCabecalho.setLayout(new javax.swing.BoxLayout(pnlCabecalho, javax.swing.BoxLayout.Y_AXIS));
        pnlCabecalho.setBackground(new java.awt.Color(24, 24, 28));
        pnlCabecalho.setBorder(BorderFactory.createEmptyBorder(16, 16, 10, 16));

        lblTitulo = new JLabel("", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTitulo.setMaximumSize(new Dimension(360, 34));

        lblImagem = new JLabel("Imagem ilustrativa", SwingConstants.CENTER);
        lblImagem.setForeground(new java.awt.Color(210, 210, 220));
        lblImagem.setOpaque(true);
        lblImagem.setBackground(new java.awt.Color(39, 39, 46));
        lblImagem.setPreferredSize(new Dimension(360, 170));
        lblImagem.setMaximumSize(new Dimension(360, 170));
        lblImagem.setMinimumSize(new Dimension(360, 170));
        lblImagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblImagem.setBorder(BorderFactory.createLineBorder(new java.awt.Color(70, 70, 82)));

        pnlCabecalho.add(lblTitulo);
        pnlCabecalho.add(Box.createVerticalStrut(12));
        pnlCabecalho.add(lblImagem);
        pnlConteudo.add(pnlCabecalho, java.awt.BorderLayout.NORTH);

        pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.Y_AXIS));
        pnlPrincipal.setBackground(new java.awt.Color(24, 24, 28));
        pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 16, 10, 16));

        scrollDetalhes = new JScrollPane(pnlPrincipal);
        scrollDetalhes.setBorder(null);
        scrollDetalhes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollDetalhes.getViewport().setBackground(new java.awt.Color(24, 24, 28));
        pnlConteudo.add(scrollDetalhes, java.awt.BorderLayout.CENTER);

        JPanel pnlAvaliacao = new JPanel();
        pnlAvaliacao.setLayout(new javax.swing.BoxLayout(pnlAvaliacao, javax.swing.BoxLayout.Y_AXIS));
        pnlAvaliacao.setOpaque(true);
        pnlAvaliacao.setBackground(new java.awt.Color(24, 24, 28));
        pnlAvaliacao.setBorder(BorderFactory.createEmptyBorder(8, 16, 14, 16));

        lblAvaliacao = new JLabel("Avalie este robo", SwingConstants.CENTER);
        lblAvaliacao.setFont(new Font("SansSerif", Font.PLAIN, 15));
        lblAvaliacao.setForeground(new java.awt.Color(245, 245, 245));
        lblAvaliacao.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnlEstrelas = new PainelEstrelas();
        pnlEstrelas.setAlignmentX(Component.CENTER_ALIGNMENT);

        pnlBotoes = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 6));
        pnlBotoes.setOpaque(false);
        btnSalvarNota = new javax.swing.JButton("Salvar nota");
        btnVoltar = new javax.swing.JButton("Voltar");
        criarBotaoSecundario(btnSalvarNota, "Salvar nota");
        criarBotaoSecundario(btnVoltar, "Voltar");
        pnlBotoes.add(btnSalvarNota);
        pnlBotoes.add(btnVoltar);

        pnlAvaliacao.add(lblAvaliacao);
        pnlAvaliacao.add(Box.createVerticalStrut(6));
        pnlAvaliacao.add(pnlEstrelas);
        pnlAvaliacao.add(Box.createVerticalStrut(6));
        pnlAvaliacao.add(pnlBotoes);
        pnlConteudo.add(pnlAvaliacao, java.awt.BorderLayout.SOUTH);

        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }

    protected void carregarDadosRobo() {
        pnlPrincipal.removeAll();
        lblTitulo.setText(robo.getNome());
        ImageIcon icone = UtilTela.carregarIcone(robo.getImagem(), 360, 170);
        if (icone != null) {
            lblImagem.setIcon(icone);
            lblImagem.setText("");
        }

        adicionarBlocoTexto("Nome do robo", robo.getNome());
        adicionarBlocoTexto("Dados de lancamento", robo.getDadosLancamento());
        adicionarBlocoTexto("Veiculo de lancamento", robo.getVeiculoLancamento());
        adicionarBlocoTexto("Local de lancamento", robo.getLocalLancamento());
        adicionarBlocoTexto("Entrada em orbita de Marte", robo.getEntradaOrbitaMarte());
        adicionarBlocoTexto("Dados de aterrissagem em Marte", robo.getDadosAterrissagem());
        adicionarBlocoTexto("Local de pouso", robo.getLocalPouso());
        adicionarBlocoTexto("Plataforma", robo.getPlataforma());
        adicionarBlocoTexto("Curiosidades", robo.getCuriosidades());
        adicionarBlocoTexto("Descricao historica", robo.getDescricaoHistorica());
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }

    protected void adicionarBlocoTexto(String titulo, String conteudo) {
        JPanel pnlBloco = new JPanel();
        pnlBloco.setLayout(new javax.swing.BoxLayout(pnlBloco, javax.swing.BoxLayout.Y_AXIS));
        pnlBloco.setBackground(new java.awt.Color(39, 39, 46));
        pnlBloco.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new java.awt.Color(70, 70, 82)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        pnlBloco.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnlBloco.setMaximumSize(new Dimension(360, 220));

        JLabel lblTituloCampo = new JLabel(titulo);
        lblTituloCampo.setForeground(UtilTela.COR_PRIMARIA);
        lblTituloCampo.setFont(new Font("SansSerif", Font.BOLD, 16));
        lblTituloCampo.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextArea txtConteudo = new JTextArea(conteudo);
        txtConteudo.setLineWrap(true);
        txtConteudo.setWrapStyleWord(true);
        txtConteudo.setEditable(false);
        txtConteudo.setFocusable(false);
        txtConteudo.setBackground(new java.awt.Color(39, 39, 46));
        txtConteudo.setForeground(new java.awt.Color(245, 245, 245));
        txtConteudo.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtConteudo.setBorder(BorderFactory.createEmptyBorder(6, 0, 0, 0));
        txtConteudo.setRows(calcularLinhas(conteudo));
        txtConteudo.setMaximumSize(new Dimension(338, 150));
        txtConteudo.setAlignmentX(Component.LEFT_ALIGNMENT);

        pnlBloco.add(lblTituloCampo);
        pnlBloco.add(txtConteudo);
        pnlPrincipal.add(pnlBloco);
        pnlPrincipal.add(Box.createVerticalStrut(10));
    }

    protected int calcularLinhas(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 2;
        }
        int linhas = (texto.length() / 48) + 1;
        return Math.max(2, Math.min(6, linhas));
    }

    protected void salvarNota() {
        int nota = pnlEstrelas.getNotaSelecionada();
        if (nota <= 0) {
            JOptionPane.showMessageDialog(this, "Selecione de 1 a 5 estrelas antes de salvar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EstatisticasSistema.getInstancia().registrarNotaRobo(indiceRobo, nota);
        JOptionPane.showMessageDialog(this, "Nota salva com sucesso! Obrigado pela avaliacao.", "Avaliacao registrada", JOptionPane.INFORMATION_MESSAGE);
        pnlEstrelas.limpar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected JLabel lblImagem;
    protected PainelEstrelas pnlEstrelas;
    protected javax.swing.JButton btnSalvarNota;
    protected javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollDetalhes;
    // End of variables declaration//GEN-END:variables

}
