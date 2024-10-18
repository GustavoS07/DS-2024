import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade extends JFrame {
    JLabel txt1, txt2, txt3, txt4, txt5, txt6;
    JTextField caixa1, caixa2;
    JRadioButton M, F;
    ButtonGroup Grupo;
    JCheckBox Carro, barc, av;
    String[] estado = {"Solteiro(a)", "Casado(a)", "Viúvo(a)", "Separado(a)", "Divorciado(a)"};
    JComboBox<String> L1;
    JButton limp, envi;

    public Atividade() {
        super("Atividade_456");
        Container tela = getContentPane();
        setLayout(null);

        txt1 = new JLabel("Nome");
        txt1.setBounds(20, 10, 80, 20);
        txt1.setFont(new Font("Arial", Font.BOLD, 14));

        txt2 = new JLabel("Idade");
        txt2.setBounds(20, 50, 80, 20);
        txt2.setFont(new Font("Arial", Font.BOLD, 14));

        txt3 = new JLabel("Sexo");
        txt3.setBounds(20, 90, 80, 20);
        txt3.setFont(new Font("Arial", Font.BOLD, 14));

        txt4 = new JLabel("Interesses");
        txt4.setBounds(20, 130, 180, 20);
        txt4.setFont(new Font("Arial", Font.BOLD, 14));

        txt5 = new JLabel("Estado Civil");
        txt5.setBounds(20, 230, 180, 20);
        txt5.setFont(new Font("Arial", Font.BOLD, 14));

        txt6 = new JLabel("Gustavo Souza Morais 2°DS AMS");
        txt6.setBounds(0, 300, 400, 100);
        txt6.setFont(new Font("Arial", Font.CENTER_BASELINE, 18));

        caixa1 = new JTextField(20);
        caixa1.setBounds(80, 8, 180, 25);
        caixa1.setFont(new Font("Arial", Font.PLAIN, 14));
        caixa1.requestFocus();

        caixa2 = new JTextField(20);
        caixa2.setBounds(80, 48, 80, 25);
        caixa2.setFont(new Font("Arial", Font.PLAIN, 14));

        M = new JRadioButton("Masculino");
        M.setBounds(80, 90, 98, 20);
        M.setFont(new Font("Arial", Font.BOLD, 14));
        M.setMnemonic(KeyEvent.VK_M);

        F = new JRadioButton("Feminino");
        F.setBounds(190, 90, 98, 20);
        F.setFont(new Font("Arial", Font.BOLD, 14));
        F.setMnemonic(KeyEvent.VK_F);

        Grupo = new ButtonGroup();
        Grupo.add(M);
        Grupo.add(F);

        Carro = new JCheckBox("Automóveis");
        Carro.setBounds(25, 150, 110, 20);
        Carro.setFont(new Font("Arial", Font.BOLD, 14));

        barc = new JCheckBox("Barcos");
        barc.setBounds(25, 170, 80, 20);
        barc.setFont(new Font("Arial", Font.BOLD, 14));

        av = new JCheckBox("Aviões");
        av.setBounds(25, 190, 80, 20);
        av.setFont(new Font("Arial", Font.BOLD, 14));

        L1 = new JComboBox<>(estado);
        L1.setBounds(120, 230, 120, 20);
        L1.setFont(new Font("Arial", Font.BOLD, 14));
        L1.setSelectedIndex(-1);
        L1.setMaximumRowCount(7);

        limp = new JButton("Limpar os dados");
        limp.setBounds(20, 260, 150, 20);
        limp.setFont(new Font("Arial", Font.BOLD, 14));

        envi = new JButton("Enviar os dados");
        envi.setBounds(180, 260, 150, 20);
        envi.setFont(new Font("Arial", Font.BOLD, 14));

        limp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caixa1.setText("");
                caixa2.setText("");
                caixa1.requestFocus();
                L1.setSelectedIndex(-1);
                Carro.setSelected(false);
                barc.setSelected(false);
                av.setSelected(false);
                Grupo.clearSelection();
            }
        });
        tela.add(txt1);
        tela.add(caixa1);
        tela.add(txt2);
        tela.add(caixa2);
        tela.add(txt3);
        tela.add(M);
        tela.add(F);
        tela.add(txt4);
        tela.add(Carro);
        tela.add(barc);
        tela.add(av);
        tela.add(txt5);
        tela.add(L1);
        tela.add(limp);
        tela.add(envi);
        tela.add(txt6);

        setSize(380, 400);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    public static void main(String[] args) {
        Atividade app = new Atividade();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}