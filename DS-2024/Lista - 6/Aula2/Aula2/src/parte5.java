import javax.swing.*;
import java.awt.*;

public class parte5 extends JFrame {
    JLabel rotulo;
    JTextArea texto;

    public parte5() {
        super("Parte 5");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        rotulo = new JLabel("CAIXA DE TEXTO");
        rotulo.setBounds(50, 20, 100, 20);
        tela.add(rotulo);
        
        texto = new JTextArea(20, 30);
        texto.setBounds(50, 50, 250, 250);
        tela.add(texto);
        
        setSize(400, 350);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        parte5 app = new parte5();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}