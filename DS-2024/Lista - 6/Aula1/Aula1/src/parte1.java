import java.awt.*;
import javax.swing.*;
public class parte1 extends JFrame{
    public parte1(){
    super("Telegram"); 
    setSize(400,250); //largura e comprimento
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    Container cor = getContentPane();
    cor.setBackground(new Color(0xAD, 0xD8, 0xE6));
    ImageIcon icone = new ImageIcon("tele.png");
    setIconImage(icone.getImage());
    }
    
    public static void main(String args[])
    {
    parte1 pt1 = new parte1();
    pt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}