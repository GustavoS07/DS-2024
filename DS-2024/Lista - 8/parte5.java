import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte5 extends JFrame {
    private JLabel rotulo1, rotulo2, rotulo3, texto;
    private JCheckBox negrito, italico, normal, negritoitalico;
    private JRadioButton tam1, tam2, tam3, tam4;
    private ButtonGroup grupo;
    private String[] cor = {"Sem Cor", "Vermelho", "Azul", "Verde", "Amarelo", "Branco", "Preto"};
    private JComboBox<String> lista;
    private int tamfonte = 12;
    private int estilo = Font.PLAIN;

    public parte5() {
        super("Exemplo Combo Check Radio BOX");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");
        texto = new JLabel("Programa feito em Java");
        lista = new JComboBox<>(cor);
        lista.setMaximumRowCount(7);
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Italico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);

        rotulo1.setBounds(40, 20, 70, 20);
        rotulo2.setBounds(200, 20, 70, 20);
        rotulo3.setBounds(300, 20, 70, 20);
        texto.setBounds(100, 200, 300, 20);
        lista.setBounds(40, 50, 150, 20);
        negrito.setBounds(200, 50, 100, 20);
        italico.setBounds(200, 70, 100, 20);
        normal.setBounds(200, 90, 100, 20);
        negritoitalico.setBounds(200, 110, 150, 20);
        tam1.setBounds(350, 50, 100, 20);
        tam2.setBounds(350, 70, 100, 20);
        tam3.setBounds(350, 90, 100, 20);
        tam4.setBounds(350, 110, 100, 20);

        lista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (lista.getSelectedItem().toString()) {
                    case "Sem Cor":
                        texto.setForeground(Color.black);
                        break;
                    case "Vermelho":
                        texto.setForeground(Color.red);
                        break;
                    case "Azul":
                        texto.setForeground(Color.blue);
                        break;
                    case "Verde":
                        texto.setForeground(Color.green);
                        break;
                    case "Amarelo":
                        texto.setForeground(Color.yellow);
                        break;
                    case "Branco":
                        texto.setForeground(Color.white);
                        break;
                    case "Preto":
                        texto.setForeground(Color.black);
                        break;
                }
            }
        });

        tam1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 12;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tam2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 14;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tam3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 16;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tam4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 18;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        negrito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.BOLD;
                normal.setSelected(false);
                italico.setSelected(false);
                negritoitalico.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        italico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.ITALIC;
                normal.setSelected(false);
                negrito.setSelected(false);
                negritoitalico.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        normal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.PLAIN;
                negrito.setSelected(false);
                italico.setSelected(false);
                negritoitalico.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        negritoitalico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.BOLD + Font.ITALIC;
                negrito.setSelected(false);
                italico.setSelected(false);
                normal.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto);
        tela.add(negrito);
        tela.add(italico);
        tela.add(normal);
        tela.add(negritoitalico);
        tela.add(tam1);
        tela.add(tam2);
        tela.add(tam3);
        tela.add(tam4);
        tela.add(lista);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        parte5 app = new parte5();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
