
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte8_5 extends JFrame {
    JLabel label1, label2;
    JButton botaoOcultar, botaoExibir;

    public parte8_5() {
        super("8.5");
        Container container = getContentPane();
        setLayout(null);

        label1 = new JLabel("Primeiro texto");
        label2 = new JLabel("Segundo texto");
        botaoOcultar = new JButton("Ocultar");
        botaoExibir = new JButton("Exibir");

        label1.setBounds(50, 20, 120, 20);
        label2.setBounds(50, 60, 120, 20);
        botaoOcultar.setBounds(100, 100, 80, 20);
        botaoExibir.setBounds(250, 100, 80, 20);

        botaoOcultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(false);
                label2.setVisible(false);
            }
        });

        botaoExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
                label2.setVisible(true);
            }
        });

        container.add(label1);
        container.add(label2);
        container.add(botaoOcultar);
        container.add(botaoExibir);

        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        parte8_5 app = new parte8_5();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
