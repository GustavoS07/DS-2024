import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class atv12 extends JFrame {
    JMenuBar barra;
    JMenu ops, sbre, sb, ferr;
    JMenuItem adic, subtr, mult, divi, info, sair, fer;

    Somar somaDialog;
    Subtrair subtraiDialog;
    Multiplicar multDialog;
    Dividir divDialog;
    Informacoes infoDialog;
    Ferramentas ferramentasDialog;

    public atv12() {
        super("Atividade 12");
        Container tela = getContentPane();
        tela.setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);

        ops = new JMenu("Operações");
        sbre = new JMenu("Sobre");
        sb = new JMenu("Sair");
        ferr = new JMenu("Ferramentas");

        barra.add(ops);
        barra.add(sbre);
        barra.add(sb);
        barra.add(ferr);

        adic = new JMenuItem("Adição");
        subtr = new JMenuItem("Subtração");
        mult = new JMenuItem("Multiplicação");
        divi = new JMenuItem("Divisão");
        info = new JMenuItem("Informações");
        sair = new JMenuItem("Sair");
        fer = new JMenuItem("Ferramentas");

        adic.addActionListener(e -> {
            somaDialog = new Somar(null, "Adição", true);
            somaDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            somaDialog.setVisible(true);
        });

        subtr.addActionListener(e -> {
            subtraiDialog = new Subtrair(null, "Subtração", true);
            subtraiDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            subtraiDialog.setVisible(true);
        });

        mult.addActionListener(e -> {
            multDialog = new Multiplicar(null, "Multiplicação", true);
            multDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            multDialog.setVisible(true);
        });

        divi.addActionListener(e -> {
            divDialog = new Dividir(null, "Divisão", true);
            divDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            divDialog.setVisible(true);
        });

        info.addActionListener(e -> {
            infoDialog = new Informacoes(null, "Informações", true);
            infoDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            infoDialog.setVisible(true);
        });

        sair.addActionListener(e -> {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja fechar?", "Fechar", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION)
                System.exit(0);
        });

        fer.addActionListener(e -> {
            ferramentasDialog = new Ferramentas(null, "Ferramentas", true);
            ferramentasDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ferramentasDialog.setVisible(true);
        });

        ops.add(adic);
        ops.add(subtr);
        ops.addSeparator();
        ops.add(mult);
        ops.add(divi);
        sbre.add(info);
        sb.add(sair);
        ferr.add(fer);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            atv12 app = new atv12();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }

    private abstract class OperDialog extends JDialog {
        JButton voltar, calc, limpar;
        JLabel num1Lbl, num2Lbl, resultLbl;
        JTextField num1Fld, num2Fld;

        public OperDialog(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela = getContentPane();
            tela.setLayout(null);

            num1Lbl = new JLabel("1º Número:");
            num1Lbl.setBounds(50, 20, 100, 20);
            num2Lbl = new JLabel("2º Número:");
            num2Lbl.setBounds(50, 60, 100, 20);
            resultLbl = new JLabel("");
            resultLbl.setBounds(50, 140, 200, 20);
            num1Fld = new JTextField(5);
            num1Fld.setBounds(150, 20, 150, 20);
            num2Fld = new JTextField(5);
            num2Fld.setBounds(150, 60, 150, 20);

            calc = new JButton("Calcular");
            calc.setBounds(150, 100, 100, 20);
            limpar = new JButton("Limpar");
            limpar.setBounds(270, 100, 100, 20);
            voltar = new JButton("Voltar");
            voltar.setBounds(50, 200, 100, 20);

            tela.add(num1Lbl);
            tela.add(num2Lbl);
            tela.add(resultLbl);
            tela.add(num1Fld);
            tela.add(num2Fld);
            tela.add(calc);
            tela.add(limpar);
            tela.add(voltar);

            setSize(400, 300);
            setLocationRelativeTo(null);
        }

        protected void clearFields() {
            num1Fld.setText("");
            num2Fld.setText("");
            resultLbl.setText("");
        }
    }

    private class Somar extends OperDialog {
        public Somar(Frame owner, String title, boolean modal) {
            super(owner, title, modal);

            calc.addActionListener(e -> {
                try {
                    int n1 = Integer.parseInt(num1Fld.getText());
                    int n2 = Integer.parseInt(num2Fld.getText());
                    int soma = n1 + n2;
                    resultLbl.setText("Resultado: " + soma);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            limpar.addActionListener(e -> clearFields());

            voltar.addActionListener(e -> {
                setVisible(false);
                dispose();
            });
        }
    }

    private class Subtrair extends OperDialog {
        public Subtrair(Frame owner, String title, boolean modal) {
            super(owner, title, modal);

            calc.addActionListener(e -> {
                try {
                    int n1 = Integer.parseInt(num1Fld.getText());
                    int n2 = Integer.parseInt(num2Fld.getText());
                    int subtracao = n1 - n2;
                    resultLbl.setText("Resultado: " + subtracao);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            limpar.addActionListener(e -> clearFields());

            voltar.addActionListener(e -> {
                setVisible(false);
                dispose();
            });
        }
    }

    private class Multiplicar extends OperDialog {
        public Multiplicar(Frame owner, String title, boolean modal) {
            super(owner, title, modal);

            calc.addActionListener(e -> {
                try {
                    int n1 = Integer.parseInt(num1Fld.getText());
                    int n2 = Integer.parseInt(num2Fld.getText());
                    int multiplicacao = n1 * n2;
                    resultLbl.setText("Resultado: " + multiplicacao);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            limpar.addActionListener(e -> clearFields());

            voltar.addActionListener(e -> {
                setVisible(false);
                dispose();
            });
        }
    }

    private class Dividir extends OperDialog {
        public Dividir(Frame owner, String title, boolean modal) {
            super(owner, title, modal);

            calc.addActionListener(e -> {
                try {
                    int n1 = Integer.parseInt(num1Fld.getText());
                    int n2 = Integer.parseInt(num2Fld.getText());
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this, "Não é possível dividir por zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int divisao = n1 / n2;
                        resultLbl.setText("Resultado: " + divisao);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            limpar.addActionListener(e -> clearFields());

            voltar.addActionListener(e -> {
                setVisible(false);
                dispose();
            });
        }
    }

    private class Informacoes extends JDialog {
        JButton voltarBtn;

        public Informacoes(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela = getContentPane();
            tela.setLayout(new FlowLayout());

            JLabel nomeLbl = new JLabel("Feito por: Gustavo de Souza Morais");
            JLabel cursoLbl = new JLabel("Curso/Turma: 2 DS AMS TARDE");
            JLabel dataLbl = new JLabel("Data: 27 de junho de 2024");
            voltarBtn = new JButton("Voltar");

            voltarBtn.addActionListener(e -> {
                setVisible(false);
                dispose();
            });

            tela.add(nomeLbl);
            tela.add(cursoLbl);
            tela.add(dataLbl);
            tela.add(voltarBtn);

            setSize(300, 150);
            setLocationRelativeTo(null);
        }
    }

    private class Ferramentas extends JDialog {
        JButton somaBtn, subBtn, multBtn, divBtn, voltarBtn;
        JToolBar barraFerramentas;
        JTextArea textArea;

        public Ferramentas(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela = getContentPane();
            tela.setLayout(null);

            somaBtn = new JButton("+");
            subBtn = new JButton("-");
            multBtn = new JButton("x");
            divBtn = new JButton("÷");
            voltarBtn = new JButton("Voltar");

            barraFerramentas = new JToolBar("Ferramentas");
            barraFerramentas.setRollover(true);

            textArea = new JTextArea(10, 20);
            textArea.setBounds(30, 50, 250, 250);
            textArea.addMouseListener(new MouseAdapter() {
                public void mouseReleased(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        // Implemente o que desejar para o menu popup aqui
                    }
                }
            });

            somaBtn.setFont(new Font("Arial", Font.BOLD, 16));
            subBtn.setFont(new Font("Arial", Font.BOLD, 16));
            multBtn.setFont(new Font("Arial", Font.BOLD, 16));
            divBtn.setFont(new Font("Arial", Font.BOLD, 16));

            somaBtn.setToolTipText("Abre o menu de somas");
            subBtn.setToolTipText("Abre o menu de subtração");
            multBtn.setToolTipText("Abre o menu de multiplicação");
            divBtn.setToolTipText("Abre o menu de divisão");

            voltarBtn.setToolTipText("Voltar à página anterior");

            somaBtn.addActionListener(e -> {
                somaDialog = new Somar(null, "Adição", true);
                somaDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                somaDialog.setVisible(true);
            });

            subBtn.addActionListener(e -> {
                subtraiDialog = new Subtrair(null, "Subtração", true);
                subtraiDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                subtraiDialog.setVisible(true);
            });

            multBtn.addActionListener(e -> {
                multDialog = new Multiplicar(null, "Multiplicação", true);
                multDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                multDialog.setVisible(true);
            });

            divBtn.addActionListener(e -> {
                divDialog = new Dividir(null, "Divisão", true);
                divDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                divDialog.setVisible(true);
            });

            voltarBtn.addActionListener(e -> {
                setVisible(false);
                dispose();
            });

            barraFerramentas.add(somaBtn);
            barraFerramentas.add(subBtn);
            barraFerramentas.add(multBtn);
            barraFerramentas.add(divBtn);
            barraFerramentas.addSeparator();
            barraFerramentas.add(voltarBtn);
            barraFerramentas.setBounds(1, 1, 260, 50);

            tela.add(barraFerramentas);
            tela.add(textArea);

            setSize(320, 340);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
