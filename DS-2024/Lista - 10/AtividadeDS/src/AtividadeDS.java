import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AtividadeDS extends JFrame {
    JLabel txt1, txt2, txt3, txt4, txt5;
    JTextField caixa1, caixa2;
    JTextArea caixa3;
    JRadioButton Eti, Mte, tec, pri, seg, ter;
    ButtonGroup curso, serie;
    JList<String> lista;
    JButton bt1, bt2, bt3;

    public AtividadeDS() {
        super("Formulário Aluno");
        Container tela = getContentPane();
        tela.setBackground(new Color(230, 230, 250));
        setLayout(null);

        txt1 = new JLabel("Nome:");
        txt1.setBounds(20, 60, 80, 20);
        txt1.setFont(new Font("Arial", Font.BOLD, 16));
        txt1.setForeground(Color.BLACK);

        caixa1 = new JTextField(20);
        caixa1.setBounds(80, 60, 300, 25);
        caixa1.setFont(new Font("Arial", Font.PLAIN, 14));

        txt2 = new JLabel("Matrícula:");
        txt2.setBounds(20, 100, 80, 20);
        txt2.setFont(new Font("Arial", Font.BOLD, 16));
        txt2.setForeground(Color.BLACK);

        caixa2 = new JTextField(20);
        caixa2.setBounds(100, 100, 100, 25);
        caixa2.setFont(new Font("Arial", Font.PLAIN, 14));

        txt3 = new JLabel("Dados Cadastrais do Aluno");
        txt3.setBounds(65, 10, 450, 20);
        txt3.setFont(new Font("Arial", Font.BOLD, 26));
        txt3.setForeground(new Color(70, 130, 180));

        txt4 = new JLabel("Informe os dados do aluno:");
        txt4.setBounds(20, 150, 450, 20);
        txt4.setFont(new Font("Arial", Font.BOLD, 20));
        txt4.setForeground(Color.BLACK);

        Eti = new JRadioButton("Etim");
        Eti.setBounds(20, 190, 98, 20);
        Eti.setFont(new Font("Arial", Font.BOLD, 16));
        Eti.setForeground(Color.BLACK);

        Mte = new JRadioButton("Mtec");
        Mte.setBounds(20, 220, 98, 20);
        Mte.setFont(new Font("Arial", Font.BOLD, 16));
        Mte.setForeground(Color.BLACK);

        tec = new JRadioButton("Técnico");
        tec.setBounds(20, 250, 98, 20);
        tec.setFont(new Font("Arial", Font.BOLD, 16));
        tec.setForeground(Color.BLACK);

        pri = new JRadioButton("1°série");
        pri.setBounds(150, 190, 98, 20);
        pri.setFont(new Font("Arial", Font.BOLD, 16));
        pri.setForeground(Color.BLACK);

        seg = new JRadioButton("2°série");
        seg.setBounds(150, 220, 98, 20);
        seg.setFont(new Font("Arial", Font.BOLD, 16));
        seg.setForeground(Color.BLACK);

        ter = new JRadioButton("3°série");
        ter.setBounds(150, 250, 98, 20);
        ter.setFont(new Font("Arial", Font.BOLD, 16));
        ter.setForeground(Color.BLACK);

        String[] turnos = {"Matutino", "Vespertino", "Noturno"};
        lista = new JList<>(turnos);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.setLayoutOrientation(JList.VERTICAL);
        lista.setFont(new Font("Arial", Font.BOLD, 16));
        lista.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(lista);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(280, 190, 130, 60);

        serie = new ButtonGroup();
        serie.add(pri);
        serie.add(seg);
        serie.add(ter);

        curso = new ButtonGroup();
        curso.add(Eti);
        curso.add(Mte);
        curso.add(tec);

        txt5 = new JLabel("Restrições Médicas:");
        txt5.setBounds(20, 280, 450, 20);
        txt5.setFont(new Font("Arial", Font.BOLD, 18));
        txt5.setForeground(Color.BLACK);

        caixa3 = new JTextArea(5, 20);
        caixa3.setFont(new Font("Arial", Font.PLAIN, 14));
        caixa3.setForeground(Color.BLACK);
        JScrollPane scrollPaneTexto = new JScrollPane(caixa3);
        scrollPaneTexto.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneTexto.setBounds(20, 310, 400, 100);

        bt1 = new JButton("Limpar");
        bt1.setBounds(170, 430, 100, 30);
        bt1.setFont(new Font("Arial", Font.BOLD, 16));
        bt1.setBackground(Color.LIGHT_GRAY);
        bt1.setForeground(Color.BLACK);

        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caixa1.setText("");
                caixa2.setText("");
                caixa3.setText("");
                caixa1.requestFocus();
                lista.clearSelection();
                curso.clearSelection();
                serie.clearSelection();
            }
        });

        bt2 = new JButton("Sair");
        bt2.setBounds(280, 430, 100, 30);
        bt2.setFont(new Font("Arial", Font.BOLD, 16));
        bt2.setBackground(Color.LIGHT_GRAY);
        bt2.setForeground(Color.BLACK);

        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        bt3 = new JButton("Dados");
        bt3.setBounds(20, 430, 140, 30);
        bt3.setFont(new Font("Arial", Font.BOLD, 16));
        bt3.setBackground(Color.LIGHT_GRAY);
        bt3.setForeground(Color.BLACK);

        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = caixa1.getText();
                String matricula = caixa2.getText();
                String cursoSelecionado = "";
                if (Eti.isSelected()) {
                    cursoSelecionado = "Etim";
                } else if (Mte.isSelected()) {
                    cursoSelecionado = "Mtec";
                } else if (tec.isSelected()) {
                    cursoSelecionado = "Técnico";
                }

                String serieSelecionada = "";
                if (pri.isSelected()) {
                    serieSelecionada = "1° série";
                } else if (seg.isSelected()) {
                    serieSelecionada = "2° série";
                } else if (ter.isSelected()) {
                    serieSelecionada = "3° série";
                }

                String turnoSelecionado = lista.getSelectedValue();
                String restricoesMedicas = caixa3.getText();

                new InformacoesAluno(nome, matricula, cursoSelecionado, serieSelecionada, turnoSelecionado, restricoesMedicas, AtividadeDS.this);
                setVisible(false);
            }
        });

        tela.add(bt3);
        tela.add(bt2);
        tela.add(bt1);
        tela.add(ter);
        tela.add(seg);
        tela.add(pri);
        tela.add(tec);
        tela.add(Mte);
        tela.add(Eti);
        tela.add(txt1);
        tela.add(scrollPaneTexto);
        tela.add(txt2);
        tela.add(txt3);
        tela.add(txt4);
        tela.add(txt5);
        tela.add(caixa1);
        tela.add(caixa2);
        tela.add(scrollPane);

        setSize(450, 520);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        AtividadeDS app = new AtividadeDS();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
