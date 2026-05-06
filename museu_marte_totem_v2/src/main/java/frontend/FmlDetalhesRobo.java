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
        UtilTela.configurarDialogo(this, robo.getNome(), 430, 820);
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
        scrollDetalhes.getVerticalScrollBar().setUnitIncrement(16);
        btnSalvarNota.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { salvarNota(); }});
        btnVoltar.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { dispose(); }});
    }

    protected void carregarDadosRobo() {
        lblTitulo.setText(robo.getNome());
        ImageIcon icone = UtilTela.carregarIcone(robo.getImagem(), 360, 190);
        if (icone != null) {
            lblImagem.setIcon(icone);
            lblImagem.setText("");
        }
        int posicaoAvaliacao = pnlPrincipal.getComponentZOrder(lblAvaliacao);
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Nome do robo", robo.getNome());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Dados de lancamento", robo.getDadosLancamento());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Veiculo de lancamento", robo.getVeiculoLancamento());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Local de lancamento", robo.getLocalLancamento());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Entrada em orbita de Marte", robo.getEntradaOrbitaMarte());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Dados de aterrissagem em Marte", robo.getDadosAterrissagem());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Local de pouso", robo.getLocalPouso());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Plataforma", robo.getPlataforma());
        posicaoAvaliacao = adicionarBlocoTexto(posicaoAvaliacao, "Curiosidades", robo.getCuriosidades());
        adicionarBlocoTexto(posicaoAvaliacao, "Descricao historica", robo.getDescricaoHistorica());
    }

    protected int adicionarBlocoTexto(int indice, String titulo, String conteudo) {
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
        txtConteudo.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        txtConteudo.setMaximumSize(new Dimension(360, 200));
        txtConteudo.setAlignmentX(Component.LEFT_ALIGNMENT);
        pnlPrincipal.add(Box.createVerticalStrut(10), indice++);
        pnlPrincipal.add(lblTituloCampo, indice++);
        pnlPrincipal.add(Box.createVerticalStrut(4), indice++);
        pnlPrincipal.add(txtConteudo, indice);
        return indice + 1;
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
