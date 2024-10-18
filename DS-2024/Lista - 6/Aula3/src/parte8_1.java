import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte8_1 extends JFrame {
    public static void main(String[] args) {
        parte8_1 app = new parte8_1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    JButton botaosair;

    public parte8_1() {
        super("8.1");
        Container tela = getContentPane();
        setLayout(null);

        botaosair = new JButton("Sair");
        botaosair.setBounds(100, 50, 100, 20);
        botaosair.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            }
        );

        tela.add(botaosair);
        setSize(300, 150);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
