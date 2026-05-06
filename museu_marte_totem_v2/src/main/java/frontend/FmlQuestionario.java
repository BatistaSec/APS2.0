package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import pesquisa.CatalogoPerguntas;
import pesquisa.EstatisticasSistema;
import pesquisa.Pergunta;

/**
 * Tela do questionario interativo.
 */
public class FmlQuestionario extends JDialog {

    protected List<Pergunta> listaPerguntas;
    protected int[] respostas;
    protected int indicePerguntaAtual;
    protected JRadioButton[] rdbOpcoes;

    public FmlQuestionario() {
        initComponents();
        listaPerguntas = CatalogoPerguntas.getListaPerguntas();
        respostas = new int[listaPerguntas.size()];
        Arrays.fill(respostas, -1);
        indicePerguntaAtual = 0;
        UtilTela.configurarDialogo(this, "Questionario Interativo", 430, 620);
        setModal(true);
        configurarTela();
        carregarPerguntaAtual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        grupoOpcoes = new javax.swing.ButtonGroup();
        pnlConteudo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblProgresso = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        txtPergunta = new javax.swing.JTextArea();
        pnlOpcoes = new javax.swing.JPanel();
        rdbOpcao1 = new javax.swing.JRadioButton();
        rdbOpcao2 = new javax.swing.JRadioButton();
        rdbOpcao3 = new javax.swing.JRadioButton();
        rdbOpcao4 = new javax.swing.JRadioButton();
        pnlRodape = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));

        pnlTopo.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 5, 15));
        pnlTopo.setOpaque(false);
        pnlTopo.setLayout(new java.awt.BorderLayout());
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Quiz de Marte");
        pnlTopo.add(lblTitulo, java.awt.BorderLayout.NORTH);
        lblProgresso.setFont(new java.awt.Font("SansSerif", 0, 15));
        lblProgresso.setForeground(new java.awt.Color(245, 245, 245));
        lblProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgresso.setText("Pergunta 1 de 5");
        pnlTopo.add(lblProgresso, java.awt.BorderLayout.SOUTH);
        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);

        pnlCentro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 15));
        pnlCentro.setOpaque(false);
        pnlCentro.setLayout(new java.awt.BorderLayout(10, 10));
        txtPergunta.setEditable(false);
        txtPergunta.setBackground(new java.awt.Color(39, 39, 46));
        txtPergunta.setColumns(20);
        txtPergunta.setFont(new java.awt.Font("SansSerif", 1, 18));
        txtPergunta.setForeground(new java.awt.Color(245, 245, 245));
        txtPergunta.setLineWrap(true);
        txtPergunta.setRows(4);
        txtPergunta.setText("Pergunta exibida aqui");
        txtPergunta.setWrapStyleWord(true);
        txtPergunta.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        txtPergunta.setFocusable(false);
        pnlCentro.add(txtPergunta, java.awt.BorderLayout.NORTH);

        pnlOpcoes.setOpaque(false);
        pnlOpcoes.setLayout(new java.awt.GridLayout(4, 1, 8, 8));
        prepararRadio(rdbOpcao1, "Opcao 1");
        prepararRadio(rdbOpcao2, "Opcao 2");
        prepararRadio(rdbOpcao3, "Opcao 3");
        prepararRadio(rdbOpcao4, "Opcao 4");
        pnlCentro.add(pnlOpcoes, java.awt.BorderLayout.CENTER);
        pnlConteudo.add(pnlCentro, java.awt.BorderLayout.CENTER);

        pnlRodape.setOpaque(false);
        btnAnterior.setBackground(new java.awt.Color(103, 100, 246));
        btnAnterior.setFont(new java.awt.Font("SansSerif", 1, 16));
        btnAnterior.setForeground(java.awt.Color.WHITE);
        btnAnterior.setText("Anterior");
        btnAnterior.setFocusPainted(false);
        btnAnterior.setPreferredSize(new java.awt.Dimension(160, 50));
        pnlRodape.add(btnAnterior);
        btnProximo.setBackground(new java.awt.Color(103, 100, 246));
        btnProximo.setFont(new java.awt.Font("SansSerif", 1, 16));
        btnProximo.setForeground(java.awt.Color.WHITE);
        btnProximo.setText("Proxima");
        btnProximo.setFocusPainted(false);
        btnProximo.setPreferredSize(new java.awt.Dimension(160, 50));
        pnlRodape.add(btnProximo);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prepararRadio(javax.swing.JRadioButton radio, String texto) {
        grupoOpcoes.add(radio);
        radio.setBackground(new java.awt.Color(39, 39, 46));
        radio.setFont(new Font("SansSerif", Font.PLAIN, 16));
        radio.setForeground(new java.awt.Color(245, 245, 245));
        radio.setText(texto);
        radio.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        radio.setOpaque(true);
        pnlOpcoes.add(radio);
    }

    protected void configurarTela() {
        montarEstruturaQuestionario();
        rdbOpcoes = new JRadioButton[] {rdbOpcao1, rdbOpcao2, rdbOpcao3, rdbOpcao4};
        btnAnterior.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { voltarPergunta(); }});
        btnProximo.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { avancarOuFinalizar(); }});
    }

    protected void montarEstruturaQuestionario() {
        pnlConteudo.removeAll();
        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));

        pnlTopo = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 4));
        pnlTopo.setOpaque(false);
        pnlTopo.setBorder(BorderFactory.createEmptyBorder(16, 16, 0, 16));
        lblTitulo = new javax.swing.JLabel("Quiz de Marte", javax.swing.SwingConstants.CENTER);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblProgresso = new javax.swing.JLabel("Pergunta 1", javax.swing.SwingConstants.CENTER);
        lblProgresso.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblProgresso.setForeground(new java.awt.Color(210, 210, 220));
        pnlTopo.add(lblTitulo);
        pnlTopo.add(lblProgresso);
        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);

        pnlCentro = new javax.swing.JPanel(new java.awt.BorderLayout(10, 12));
        pnlCentro.setOpaque(false);
        pnlCentro.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));

        txtPergunta = new javax.swing.JTextArea();
        txtPergunta.setEditable(false);
        txtPergunta.setFocusable(false);
        txtPergunta.setLineWrap(true);
        txtPergunta.setWrapStyleWord(true);
        txtPergunta.setRows(4);
        txtPergunta.setFont(new Font("SansSerif", Font.BOLD, 17));
        txtPergunta.setBackground(new java.awt.Color(39, 39, 46));
        txtPergunta.setForeground(new java.awt.Color(245, 245, 245));
        txtPergunta.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        JScrollPane scrollPergunta = new JScrollPane(txtPergunta);
        scrollPergunta.setBorder(null);
        scrollPergunta.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlCentro.add(scrollPergunta, java.awt.BorderLayout.NORTH);

        grupoOpcoes = new ButtonGroup();
        pnlOpcoes = new javax.swing.JPanel(new java.awt.GridLayout(4, 1, 0, 10));
        pnlOpcoes.setOpaque(false);
        rdbOpcao1 = criarOpcao();
        rdbOpcao2 = criarOpcao();
        rdbOpcao3 = criarOpcao();
        rdbOpcao4 = criarOpcao();
        pnlOpcoes.add(rdbOpcao1);
        pnlOpcoes.add(rdbOpcao2);
        pnlOpcoes.add(rdbOpcao3);
        pnlOpcoes.add(rdbOpcao4);
        pnlCentro.add(pnlOpcoes, java.awt.BorderLayout.CENTER);
        pnlConteudo.add(pnlCentro, java.awt.BorderLayout.CENTER);

        pnlRodape = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));
        pnlRodape.setOpaque(false);
        btnAnterior = new javax.swing.JButton("Anterior");
        btnProximo = new javax.swing.JButton("Proxima");
        estilizarBotaoQuestionario(btnAnterior, new java.awt.Color(72, 72, 84));
        estilizarBotaoQuestionario(btnProximo, new java.awt.Color(103, 100, 246));
        pnlRodape.add(btnAnterior);
        pnlRodape.add(btnProximo);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);

        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }

    protected JRadioButton criarOpcao() {
        JRadioButton radio = new JRadioButton();
        grupoOpcoes.add(radio);
        radio.setBackground(new java.awt.Color(39, 39, 46));
        radio.setForeground(new java.awt.Color(245, 245, 245));
        radio.setFont(new Font("SansSerif", Font.PLAIN, 15));
        radio.setBorder(BorderFactory.createEmptyBorder(10, 12, 10, 12));
        radio.setOpaque(true);
        radio.setFocusPainted(false);
        return radio;
    }

    protected void estilizarBotaoQuestionario(javax.swing.JButton botao, java.awt.Color cor) {
        botao.setBackground(cor);
        botao.setForeground(java.awt.Color.WHITE);
        botao.setFont(new Font("SansSerif", Font.BOLD, 16));
        botao.setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));
        botao.setFocusPainted(false);
        botao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao.setPreferredSize(new java.awt.Dimension(160, 46));
    }

    protected void carregarPerguntaAtual() {
        Pergunta perguntaAtual = listaPerguntas.get(indicePerguntaAtual);
        lblProgresso.setText("Pergunta " + (indicePerguntaAtual + 1) + " de " + listaPerguntas.size());
        txtPergunta.setText(perguntaAtual.getEnunciado());
        grupoOpcoes.clearSelection();
        for (int i = 0; i < rdbOpcoes.length; i++) {
            rdbOpcoes[i].setText(perguntaAtual.getOpcoes()[i]);
            if (respostas[indicePerguntaAtual] == i) rdbOpcoes[i].setSelected(true);
        }
        btnAnterior.setEnabled(indicePerguntaAtual > 0);
        btnProximo.setText(indicePerguntaAtual == listaPerguntas.size() - 1 ? "Finalizar" : "Proxima");
    }

    protected boolean salvarRespostaAtual() {
        for (int i = 0; i < rdbOpcoes.length; i++) {
            if (rdbOpcoes[i].isSelected()) {
                respostas[indicePerguntaAtual] = i;
                return true;
            }
        }
        return false;
    }

    protected void avancarOuFinalizar() {
        if (!salvarRespostaAtual()) {
            JOptionPane.showMessageDialog(this, "Selecione uma opcao antes de continuar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (indicePerguntaAtual < listaPerguntas.size() - 1) {
            indicePerguntaAtual++;
            carregarPerguntaAtual();
        } else {
            finalizarQuestionario();
        }
    }

    protected void voltarPergunta() {
        salvarRespostaAtual();
        if (indicePerguntaAtual > 0) {
            indicePerguntaAtual--;
            carregarPerguntaAtual();
        }
    }

    protected void finalizarQuestionario() {
        if (!salvarRespostaAtual()) {
            JOptionPane.showMessageDialog(this, "Selecione uma opcao antes de finalizar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int acertos = calcularAcertos();
        EstatisticasSistema.getInstancia().registrarQuestionario(respostas, acertos);
        JOptionPane.showMessageDialog(this, montarMensagemResultado(acertos), "Resultado do Questionario", JOptionPane.INFORMATION_MESSAGE);
        FmlAvaliacaoFinal fmlAvaliacaoFinal = new FmlAvaliacaoFinal();
        fmlAvaliacaoFinal.setLocationRelativeTo(this);
        fmlAvaliacaoFinal.setVisible(true);
        dispose();
    }

    protected int calcularAcertos() {
        int acertos = 0;
        for (int i = 0; i < listaPerguntas.size(); i++) {
            if (respostas[i] == listaPerguntas.get(i).getIndiceCorreto()) acertos++;
        }
        return acertos;
    }

    protected String montarMensagemResultado(int acertos) {
        String mensagem = "Voce acertou " + acertos + " de " + listaPerguntas.size() + " pergunta(s). ";
        if (acertos == 5) return mensagem + "Excelente! Voce conhece muito bem os exploradores de Marte.";
        if (acertos >= 3) return mensagem + "Muito bom! Voce aprendeu bastante com a exposicao.";
        return mensagem + "Obrigado por participar! Continue explorando a exposicao para aprender ainda mais.";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel lblProgresso;
    protected javax.swing.JTextArea txtPergunta;
    protected ButtonGroup grupoOpcoes;
    protected javax.swing.JButton btnAnterior;
    protected javax.swing.JButton btnProximo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JPanel pnlRodape;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JRadioButton rdbOpcao1;
    private javax.swing.JRadioButton rdbOpcao2;
    private javax.swing.JRadioButton rdbOpcao3;
    private javax.swing.JRadioButton rdbOpcao4;
    // End of variables declaration//GEN-END:variables

}
