import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.text.*;

public class parte2_3_4 extends JFrame 
{
    JLabel r1,r2,r3,r4,imagem,imagem2,imagem3,imagem4;
    JTextField tx1,tx2,tx3,tx4;
    MaskFormatter mscCPF,mscTEL,mscDATA,mscCEP;
    public parte2_3_4()
    
    {
    super("Telegram");
    Container tela = getContentPane();
    
    Container cor = getContentPane();
    cor.setBackground(new Color(0xAD, 0xD8, 0xE6));
    
    ImageIcon icone = new ImageIcon("tele.png");
    setIconImage(icone.getImage());
    
    setResizable(false);
    
    setLayout(null);

    r1 = new JLabel("CEP");
    r2 = new JLabel("Data");
    r3 = new JLabel("Telefone");
    r4 = new JLabel("CPF");
    
    r1.setBounds(50,50,80,20);
    r2.setBounds(50,100,80,20);
    r3.setBounds(50,150,80,20);
    r4.setBounds(50,200,80,20);
    
    try
    {
        mscCPF = new MaskFormatter("###.###.###-##");
        mscTEL = new MaskFormatter("(##) #####-####");
        mscDATA = new MaskFormatter("##/##/####");
        mscCEP = new MaskFormatter("######-###");
    }
    catch(ParseException excp)
    {}
        
    tx1 = new JFormattedTextField(mscCEP);
    tx2 = new JFormattedTextField(mscDATA);
    tx3 = new JFormattedTextField(mscTEL);
    tx4 = new JFormattedTextField(mscCPF);
    
    tx1.setBounds(150,50,90,20);
    tx2.setBounds(150,100,100,20);
    tx3.setBounds(150,150,140,20);
    tx4.setBounds(150,200,120,20);
    
    
    r1.setForeground(new Color(255,255,255));
    r2.setForeground(new Color(255,255,255));
    r3.setForeground(new Color(255,255,255));
    r4.setForeground(new Color(255,255,255));
    
    tx1.setBackground(new Color(220,240,255));
    tx2.setBackground(new Color(220,240,255));
    tx3.setBackground(new Color(220,240,255));
    tx4.setBackground(new Color(220,240,255));
    
    tx1.setForeground(new Color(0,0,0));
    tx2.setForeground(new Color(0,0,0));
    tx3.setForeground(new Color(0,0,0));
    tx4.setForeground(new Color(0,0,0));
    
    
    r1.setFont(new Font("Courier New",Font.BOLD,16));
    r2.setFont(new Font("Courier New",Font.BOLD,16));
    r3.setFont(new Font("Courier New",Font.BOLD,16));
    r4.setFont(new Font("Courier New",Font.BOLD,16));
    
    tx1.setFont(new Font("Courier New",Font.BOLD,14));
    tx2.setFont(new Font("Courier New",Font.BOLD,14));
    tx3.setFont(new Font("Courier New",Font.BOLD,14));
    tx4.setFont(new Font("Courier New",Font.BOLD,14));
    
    tx1.requestFocus();
    
    tx1.setHorizontalAlignment(JTextField.LEFT);
    tx2.setHorizontalAlignment(JTextField.CENTER);
    tx3.setHorizontalAlignment(JTextField.LEFT);
    tx4.setHorizontalAlignment(JTextField.LEFT);
    
    ImageIcon foto = new ImageIcon("contato.png");
    imagem = new JLabel(foto);
    imagem.setBounds(480, 190, 150, 200);
    
    ImageIcon foto2 = new ImageIcon("telefone.png");
    imagem2 = new JLabel(foto2);
    imagem2.setBounds(480, 100, 150, 200);
        
    ImageIcon foto3 = new ImageIcon("grupo.png");
    imagem3 = new JLabel(foto3);
    imagem3.setBounds(480,10, 150, 200);
    
    ImageIcon foto4 = new ImageIcon("status.png");
    imagem4 = new JLabel(foto4);
    imagem4.setBounds(480,-75, 150, 200);
    
    tela.add(imagem);
    tela.add(imagem2);
    tela.add(imagem3);
    tela.add(imagem4);
    
    tela.add(r1);
    tela.add(r2);
    tela.add(r3);
    tela.add(r4);   
    tela.add(tx1);
    tela.add(tx2);
    tela.add(tx3);
    tela.add(tx4);
    
    setSize(600,350);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String args[])
    {
        parte2_3_4 app = new parte2_3_4();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    