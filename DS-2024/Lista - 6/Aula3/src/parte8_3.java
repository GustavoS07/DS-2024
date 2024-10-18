
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class parte8_3 extends JFrame {
    JLabel labelNum1, labelNum2, labelExibir;
    JTextField fieldNum1, fieldNum2;
    JButton buttonSomar;

    public parte8_3() {
        super("8.3");
        Container container = getContentPane();
        setLayout(null);
        
        labelNum1 = new JLabel("Primeiro Número: ");
        labelNum2 = new JLabel("Segundo Número: ");
        fieldNum1 = new JTextField(5);
        fieldNum2 = new JTextField(5);
        labelExibir = new JLabel("");
        buttonSomar = new JButton("Somar");
        
        labelNum1.setBounds(50,20,120,20);
        labelNum2.setBounds(50,60,120,20);
        fieldNum1.setBounds(170,20,200,20);
        fieldNum2.setBounds(170,60,200,20);
        labelExibir.setBounds(50,120,200,20);
        buttonSomar.setBounds(150,100,80,20);
        
        buttonSomar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    int num1, num2, soma;
                    num1 = Integer.parseInt(fieldNum1.getText());
                    num2 = Integer.parseInt(fieldNum2.getText());
                    soma = num1 + num2;
                    labelExibir.setVisible(true);
                    labelExibir.setText("A soma é: " + soma);
                }
            }
        );
        labelExibir.setVisible(false);
        
        container.add(labelNum1);
        container.add(labelNum2);
        container.add(fieldNum1);
        container.add(fieldNum2);
        container.add(labelExibir);
        container.add(buttonSomar);
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        parte8_3 app = new parte8_3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
