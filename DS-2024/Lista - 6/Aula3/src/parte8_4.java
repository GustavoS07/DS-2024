import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte8_4 extends JFrame {
    JLabel labelPrimeiroNum, labelSegundoNum;
    JTextField campoNum1, campoNum2;  
    JButton botaoLimpar;

    public parte8_4() {
        super("8.4");
        Container container = getContentPane(); 
        setLayout(null);
        
        labelPrimeiroNum = new JLabel("Primeiro Número: ");
        labelSegundoNum = new JLabel("Segundo Número: ");
        campoNum1 = new JTextField(5);
        campoNum2 = new JTextField(5);
        botaoLimpar = new JButton("Limpar");
        
        labelPrimeiroNum.setBounds(50,20,120,20);
        labelSegundoNum.setBounds(50,60,120,20);
        campoNum1.setBounds(170,20,200,20);
        campoNum2.setBounds(170,60,200,20);
        botaoLimpar.setBounds(150,100,80,20);
        
        botaoLimpar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    campoNum1.setText("");
                    campoNum2.setText("");
                    campoNum1.requestFocus();
                }
            }
        );
        
        container.add(labelPrimeiroNum);
        container.add(labelSegundoNum);
        container.add(campoNum1);
        container.add(campoNum2);
        container.add(botaoLimpar);
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        parte8_4 app = new parte8_4();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}