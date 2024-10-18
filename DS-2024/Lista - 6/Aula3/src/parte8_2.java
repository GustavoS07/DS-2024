import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte8_2 extends JFrame {
    JPasswordField campoSenha;
    JLabel rotuloSenha, rotuloExibir;
    JButton botaoMostrar;

    public parte8_2() {
        super("8.2");
        Container container = getContentPane();
        setLayout(null);
        
        rotuloSenha = new JLabel("Insira a senha:");
        campoSenha = new JPasswordField(10);
        rotuloExibir = new JLabel("Senha digitada:");
        botaoMostrar = new JButton("Exibir");
        rotuloExibir.setVisible(false);
        
        rotuloSenha.setBounds(50, 20, 120, 20);
        campoSenha.setBounds(50, 60, 200, 20);
        rotuloExibir.setBounds(50, 120, 200, 20);
        botaoMostrar.setBounds(150, 100, 80, 20);
        
        botaoMostrar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String senha = new String(campoSenha.getPassword());
                    rotuloExibir.setVisible(true);
                    rotuloExibir.setText(senha);
                }
            }
        );
        
        container.add(rotuloSenha);
        container.add(campoSenha);
        container.add(rotuloExibir);
        container.add(botaoMostrar);
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        parte8_2 app = new parte8_2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
