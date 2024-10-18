import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte8_6 extends JFrame {
    JLabel label1, label2;
    JButton botaoDesabilitar, botaoHabilitar;

    public parte8_6() {
        super("8.6");
        Container container = getContentPane();
        setLayout(null);

        label1 = new JLabel("Primeiro texto");
        label2 = new JLabel("Segundo texto");
        botaoDesabilitar = new JButton("Desabilitar");
        botaoHabilitar = new JButton("Habilitar");

        label1.setBounds(50, 20, 100, 20);
        label2.setBounds(50, 60, 100, 20);
        botaoDesabilitar.setBounds(80, 100, 100, 20);
        botaoHabilitar.setBounds(250, 100, 100, 20);

        botaoDesabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setEnabled(false);
                label2.setEnabled(false);
            }
        });

        botaoHabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setEnabled(true);
                label2.setEnabled(true);
            }
        });

        container.add(label1);
        container.add(label2);
        container.add(botaoDesabilitar);
        container.add(botaoHabilitar);

        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        parte8_6 app = new parte8_6();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}