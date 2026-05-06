package frontend;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import models.CatalogoRobos;
import models.RoboExplorador;
import pesquisa.EstatisticasSistema;

/**
 * Menu principal do totem interativo.
 */
public class FmlMenuPrincipal extends JDialog {

    protected List<RoboExplorador> listaRobos;

    public FmlMenuPrincipal() {
        initComponents();
        listaRobos = CatalogoRobos.getListaRobos();
        UtilTela.configurarDialogo(this, "Museu de Marte", 430, 760);
        setModal(true);
        configurarTela();
        atualizarListaRobos("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblInstrucao = new javax.swing.JLabel();
        pnlBusca = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        btnTeclado = new javax.swing.JButton();
        btnLimparBusca = new javax.swing.JButton();
        scrollRobos = new javax.swing.JScrollPane();
        pnlListaRobos = new javax.swing.JPanel();
        pnlRodape = new javax.swing.JPanel();
        btnQuestionario = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlConteudo.setLayout(new java.awt.BorderLayout(10, 10));

        pnlTopo.setLayout(new java.awt.GridLayout(4, 1));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Museu Multitematico");
        pnlTopo.add(lblTitulo);

        lblSubtitulo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Totem de Robos Exploradores de Marte");
        pnlTopo.add(lblSubtitulo);

        lblInstrucao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblInstrucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrucao.setText("Toque em um cartao para abrir a pagina do robo.");
        pnlTopo.add(lblInstrucao);

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        pnlBusca.add(txtBusca);

        btnTeclado.setText("Teclado");
        btnTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecladoActionPerformed(evt);
            }
        });
        pnlBusca.add(btnTeclado);

        btnLimparBusca.setText("Limpar");
        btnLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaActionPerformed(evt);
            }
        });
        pnlBusca.add(btnLimparBusca);

        pnlTopo.add(pnlBusca);

        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);

        scrollRobos.setViewportView(pnlListaRobos);

        pnlConteudo.add(scrollRobos, java.awt.BorderLayout.CENTER);

        pnlRodape.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnQuestionario.setText("Responder questionario");
        btnQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionarioActionPerformed(evt);
            }
        });
        pnlRodape.add(btnQuestionario);

        btnRelatorio.setText("Ver relatorio estatistico");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        pnlRodape.add(btnRelatorio);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlRodape.add(btnSair);

        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTecladoActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private void btnQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuestionarioActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    protected void configurarTela() {
        montarEstruturaPrincipal();
        aplicarEstiloPrincipal();
        scrollRobos.getVerticalScrollBar().setUnitIncrement(16);
        scrollRobos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pnlListaRobos.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        pnlListaRobos.setLayout(new javax.swing.BoxLayout(pnlListaRobos, javax.swing.BoxLayout.Y_AXIS));
        txtBusca.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirTecladoVirtual();
            }
        });
        btnTeclado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTecladoVirtual();
            }
        });
        btnLimparBusca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtBusca.setText("");
                atualizarListaRobos("");
            }
        });
        btnQuestionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirQuestionario();
            }
        });
        btnRelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirRelatorio();
            }
        });
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sairSistema();
            }
        });
    }

    protected void montarEstruturaPrincipal() {
        pnlConteudo.removeAll();
        pnlConteudo.setLayout(new java.awt.BorderLayout(0, 0));

        pnlTopo = new javax.swing.JPanel();
        pnlTopo.setLayout(new javax.swing.BoxLayout(pnlTopo, javax.swing.BoxLayout.Y_AXIS));

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblInstrucao = new javax.swing.JLabel();
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblSubtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblInstrucao.setAlignmentX(Component.CENTER_ALIGNMENT);

        pnlBusca = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 0));
        txtBusca = new javax.swing.JTextField();
        btnTeclado = new javax.swing.JButton("Teclado");
        btnLimparBusca = new javax.swing.JButton("Limpar");
        pnlBusca.add(txtBusca);
        pnlBusca.add(btnTeclado);
        pnlBusca.add(btnLimparBusca);

        pnlTopo.add(lblTitulo);
        pnlTopo.add(Box.createVerticalStrut(6));
        pnlTopo.add(lblSubtitulo);
        pnlTopo.add(Box.createVerticalStrut(8));
        pnlTopo.add(lblInstrucao);
        pnlTopo.add(Box.createVerticalStrut(12));
        pnlTopo.add(pnlBusca);
        pnlConteudo.add(pnlTopo, java.awt.BorderLayout.NORTH);

        pnlListaRobos = new javax.swing.JPanel();
        pnlListaRobos.setLayout(new javax.swing.BoxLayout(pnlListaRobos, javax.swing.BoxLayout.Y_AXIS));
        scrollRobos = new javax.swing.JScrollPane(pnlListaRobos);
        pnlConteudo.add(scrollRobos, java.awt.BorderLayout.CENTER);

        pnlRodape = new javax.swing.JPanel();
        pnlRodape.setLayout(new javax.swing.BoxLayout(pnlRodape, javax.swing.BoxLayout.Y_AXIS));
        btnQuestionario = new javax.swing.JButton("Responder questionario");
        btnRelatorio = new javax.swing.JButton("Ver relatorio estatistico");
        btnSair = new javax.swing.JButton("Sair");
        btnQuestionario.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRelatorio.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSair.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnlRodape.add(btnQuestionario);
        pnlRodape.add(Box.createVerticalStrut(8));
        pnlRodape.add(btnRelatorio);
        pnlRodape.add(Box.createVerticalStrut(8));
        pnlRodape.add(btnSair);
        pnlConteudo.add(pnlRodape, java.awt.BorderLayout.SOUTH);

        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }

    protected void aplicarEstiloPrincipal() {
        pnlConteudo.setBackground(new java.awt.Color(24, 24, 28));

        pnlTopo.setBackground(new java.awt.Color(39, 39, 46));
        pnlTopo.setBorder(BorderFactory.createEmptyBorder(18, 14, 16, 14));
        pnlTopo.setOpaque(true);

        lblTitulo.setText("Museu de Marte");
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 26));
        lblTitulo.setForeground(new java.awt.Color(245, 245, 245));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        lblSubtitulo.setText("Totem dos Robos Exploradores");
        lblSubtitulo.setFont(new Font("SansSerif", Font.PLAIN, 15));
        lblSubtitulo.setForeground(new java.awt.Color(210, 210, 220));
        lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);

        lblInstrucao.setText("Pesquise ou toque em um cartao.");
        lblInstrucao.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblInstrucao.setForeground(new java.awt.Color(190, 190, 205));
        lblInstrucao.setHorizontalAlignment(SwingConstants.CENTER);

        pnlBusca.setOpaque(false);
        txtBusca.setEditable(false);
        txtBusca.setBackground(new java.awt.Color(250, 250, 250));
        txtBusca.setForeground(new java.awt.Color(30, 30, 35));
        txtBusca.setFont(new Font("SansSerif", Font.BOLD, 16));
        txtBusca.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
        txtBusca.setPreferredSize(new Dimension(150, 40));
        txtBusca.setToolTipText("Toque para usar o teclado virtual");

        estilizarBotao(btnTeclado, new java.awt.Color(103, 100, 246), 100, 40);
        estilizarBotao(btnLimparBusca, new java.awt.Color(72, 72, 84), 82, 40);
        estilizarBotao(btnQuestionario, new java.awt.Color(255, 0, 15), 340, 52);
        estilizarBotao(btnRelatorio, new java.awt.Color(103, 100, 246), 340, 52);
        estilizarBotao(btnSair, new java.awt.Color(72, 72, 84), 340, 52);

        pnlRodape.setBorder(BorderFactory.createEmptyBorder(10, 15, 16, 15));
        pnlRodape.setOpaque(false);
        scrollRobos.getViewport().setBackground(new java.awt.Color(24, 24, 28));
        scrollRobos.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));
        pnlListaRobos.setBackground(new java.awt.Color(24, 24, 28));
        pnlListaRobos.setOpaque(true);
    }

    protected void estilizarBotao(JButton botao, java.awt.Color cor, int largura, int altura) {
        botao.setBackground(cor);
        botao.setForeground(java.awt.Color.WHITE);
        botao.setFont(new Font("SansSerif", Font.BOLD, altura > 45 ? 18 : 16));
        botao.setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));
        botao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao.setFocusPainted(false);
        botao.setPreferredSize(new Dimension(largura, altura));
    }

    protected void abrirTecladoVirtual() {
        FmlTecladoVirtual fmlTecladoVirtual = new FmlTecladoVirtual(txtBusca.getText());
        fmlTecladoVirtual.setLocationRelativeTo(this);
        fmlTecladoVirtual.setVisible(true);
        if (fmlTecladoVirtual.isConfirmado()) {
            txtBusca.setText(fmlTecladoVirtual.getTextoFinal());
            atualizarListaRobos(txtBusca.getText());
        }
    }

    protected void atualizarListaRobos(String filtro) {
        pnlListaRobos.removeAll();
        int quantidadeExibida = 0;
        for (int i = 0; i < listaRobos.size(); i++) {
            final int indiceRobo = i;
            final RoboExplorador robo = listaRobos.get(i);
            if (deveExibirRobo(robo, filtro)) {
                JButton btnRobo = new JButton("<html><div style='text-align:left;'><b>" + robo.getNome()
                        + "</b><br/><span style='font-size:11px;'>" + robo.getPlataforma()
                        + "</span><br/><span style='color:#cccccc;'>Toque para ver detalhes</span></div></html>");
                btnRobo.setHorizontalAlignment(SwingConstants.LEFT);
                btnRobo.setFocusPainted(false);
                btnRobo.setBackground(new java.awt.Color(48, 48, 58));
                btnRobo.setForeground(new java.awt.Color(245, 245, 245));
                btnRobo.setFont(new Font("SansSerif", Font.BOLD, 17));
                btnRobo.setPreferredSize(new Dimension(360, 86));
                btnRobo.setMinimumSize(new Dimension(360, 86));
                btnRobo.setMaximumSize(new Dimension(360, 86));
                btnRobo.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new java.awt.Color(70, 70, 82)),
                        BorderFactory.createEmptyBorder(10, 15, 10, 15)));
                btnRobo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnRobo.setAlignmentX(Component.CENTER_ALIGNMENT);
                btnRobo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        abrirDetalhesRobo(robo, indiceRobo);
                    }
                });
                pnlListaRobos.add(btnRobo);
                pnlListaRobos.add(Box.createVerticalStrut(10));
                quantidadeExibida++;
            }
        }
        if (quantidadeExibida == 0) {
            JLabel lblSemResultados = new JLabel("Nenhum robo encontrado com esse filtro.", SwingConstants.CENTER);
            lblSemResultados.setForeground(new java.awt.Color(245, 245, 245));
            lblSemResultados.setAlignmentX(Component.CENTER_ALIGNMENT);
            pnlListaRobos.add(lblSemResultados);
        }
        pnlListaRobos.revalidate();
        pnlListaRobos.repaint();
    }

    protected boolean deveExibirRobo(RoboExplorador robo, String filtro) {
        if (filtro == null || filtro.trim().isEmpty()) {
            return true;
        }
        return robo.getNome().toLowerCase().contains(filtro.trim().toLowerCase());
    }

    protected void abrirDetalhesRobo(RoboExplorador robo, int indiceRobo) {
        EstatisticasSistema.getInstancia().registrarVisualizacaoRobo(indiceRobo);
        FmlDetalhesRobo fmlDetalhesRobo = new FmlDetalhesRobo(robo, indiceRobo);
        fmlDetalhesRobo.setLocationRelativeTo(this);
        fmlDetalhesRobo.setVisible(true);
    }

    protected void abrirQuestionario() {
        FmlQuestionario fmlQuestionario = new FmlQuestionario();
        fmlQuestionario.setLocationRelativeTo(this);
        fmlQuestionario.setVisible(true);
    }

    protected void abrirRelatorio() {
        FmlRelatorio fmlRelatorio = new FmlRelatorio();
        fmlRelatorio.setLocationRelativeTo(this);
        fmlRelatorio.setVisible(true);
    }

    protected void sairSistema() {
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente sair do totem?", "Confirmar saida", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnQuestionario;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTeclado;
    private javax.swing.JLabel lblInstrucao;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBusca;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlListaRobos;
    private javax.swing.JPanel pnlRodape;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JScrollPane scrollRobos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

}
