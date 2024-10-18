import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte4 extends JFrame {
    JList<String> Lis;
    JComboBox<String> LisC;
    String[] estados = {"Rio Grande do Sul", "Bahia", "São Paulo", "Rio de Janeiro", "Minas Gerais", "Acre", "Pernambuco", "Espírito Santo"};
    JButton botEX, botEXC;
    JLabel txt1, txt2;

    public parte4() {
        super("Exemplo de List e ComboBox");
        Container tela = getContentPane();
        setLayout(null);

        botEX = new JButton("Exibir Lista");
        botEXC = new JButton("Exibir ComboBox");
        txt1 = new JLabel("");
        txt2 = new JLabel("");
        Lis = new JList<>(estados);
        LisC = new JComboBox<>(estados);

        JScrollPane painelRolagemLista = new JScrollPane(Lis);

        Lis.setVisibleRowCount(5);
        LisC.setMaximumRowCount(5);

        Lis.setForeground(Color.blue);
        Lis.setFont(new Font("Arial", Font.BOLD, 16));
        Lis.setBackground(new Color(173, 216, 230));
        Lis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        painelRolagemLista.setBounds(40, 50, 150, 100);
        botEX.setBounds(270, 50, 120, 30);
        txt1.setBounds(50, 150, 200, 30);
        LisC.setBounds(40, 200, 150, 30);
        botEXC.setBounds(270, 200, 150, 30);
        txt2.setBounds(40, 230, 200, 30);

        botEX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] selecionados = Lis.getSelectedValues();
                StringBuilder resultados = new StringBuilder("Valores selecionados:\n");
                for (Object selecionado : selecionados) {
                    resultados.append(selecionado.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, resultados.toString());
            }
        });

        botEXC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt2.setText("O estado é: " + LisC.getSelectedItem().toString());
            }
        });

        tela.add(painelRolagemLista);
        tela.add(botEX);
        tela.add(txt1);
        tela.add(LisC);
        tela.add(botEXC);
        tela.add(txt2);
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new parte4().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}