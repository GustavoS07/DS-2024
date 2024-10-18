import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class Calculadora  extends JFrame{
    JLabel txt1,txt2,result,txt3;
    JTextField caixa1,caixa2;
    JButton add,sub,mul,div,sair,limpar,hab,desa,ocul,exib;
    
    public Calculadora(){
        
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        ImageIcon icone = new ImageIcon("icone.png");
        setIconImage(icone.getImage());

        tela.setBackground(new Color(54,54,54));
        
        txt1 = new JLabel("1° Número:");
        txt1.setBounds(50,50,250,20);
        txt1.setFont(new Font("Courier New",Font.BOLD,28));
        txt1.setForeground(new Color(255,255,255));
        
        caixa1 = new JTextField(50);
        caixa1.setBounds(220,50,125,25);
        caixa1.setFont(new Font("Courier New",Font.BOLD,28));
        caixa1.requestFocus();
        caixa1.setForeground(new Color(255,255,255));
        caixa1.setBackground(new Color(128,128,128));

        txt2 = new JLabel("2° Número:");
        txt2.setBounds(50,100,250,20);
        txt2.setFont(new Font("Courier New",Font.BOLD,28));
        txt2.setForeground(new Color(255,255,255));
        
        caixa2 = new JTextField(50);
        caixa2.setBounds(220,100,125,25);
        caixa2.setFont(new Font("Courier New",Font.BOLD,28));
        caixa2.setForeground(new Color(255,255,255));
        caixa2.setBackground(new Color(128,128,128));
        
        txt3 = new JLabel("Desenvolvido por: Gustavo de Souza Morais - 2 AMS");
        txt3.setBounds(0,295,400,20);
        txt3.setFont(new Font("Courier New",Font.BOLD,14));
        txt3.setForeground(new Color(255,255,255));
        
        result = new JLabel("");
        result.setBounds(150,180,250,80);
        result.setFont(new Font("Courier New",Font.BOLD,48));
        result.setForeground(new Color(255,255,255));
        
        add = new JButton ("+");
        add.setBounds(380,20,50,50);
        add.setFont(new Font("Courier New",Font.BOLD,27));
        add.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                int num1,num2,soma;
                soma = 0;
                num1 = Integer.parseInt(caixa1.getText());
                num2 = Integer.parseInt(caixa2.getText());
                soma = num1+num2;
                result.setVisible(true);
                result.setText(""+soma);
            }
        }
    );
        result.setVisible(false);
        add.setMnemonic(KeyEvent.VK_A);
        add.setBackground(new Color(128,128,128));
        add.setForeground(new Color(255,255,255));

        
        sub = new JButton ("-");
        sub.setBounds(480,20,50,50);
        sub.setFont(new Font("Courier New",Font.BOLD,27));
        sub.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                int num1,num2,sub;
                sub = 0;
                num1 = Integer.parseInt(caixa1.getText());
                num2 = Integer.parseInt(caixa2.getText());
                sub = num1-num2;
                result.setVisible(true);
                result.setText(""+sub);
            }
        }
    );
        result.setVisible(false);
        sub.setMnemonic(KeyEvent.VK_S);
        sub.setBackground(new Color(128,128,128));
        sub.setForeground(new Color(255,255,255));
        
        mul = new JButton ("X");
        mul.setBounds(380,100,50,50);
        mul.setFont(new Font("Courier New",Font.BOLD,27));
        mul.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                int num1,num2,mul;
                mul= 0;
                num1 = Integer.parseInt(caixa1.getText());
                num2 = Integer.parseInt(caixa2.getText());
                mul = num1*num2;
                result.setVisible(true);
                result.setText(""+mul);
            }
        }
    );
        result.setVisible(false);
        mul.setMnemonic(KeyEvent.VK_M);
        mul.setBackground(new Color(128,128,128));
        mul.setForeground(new Color(255,255,255));
        
        div = new JButton ("/");
        div.setBounds(480,100,50,50);
        div.setFont(new Font("Courier New",Font.BOLD,27));
        div.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                int num1,num2,div;
                div = 0;
                num1 = Integer.parseInt(caixa1.getText());
                num2 = Integer.parseInt(caixa2.getText());
                div = num1/num2;
                result.setVisible(true);
                result.setText(""+div);
            }
        }
    );
        result.setVisible(false);
        div.setMnemonic(KeyEvent.VK_D);
        div.setBackground(new Color(128,128,128));
        div.setForeground(new Color(255,255,255));
        
        sair = new JButton ("SAIR");
        sair.setBounds(614,281,70,30);
        sair.setFont(new Font("Courier New",Font.BOLD,14));      
        sair.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }
    );
        sair.setBackground(new Color(128,128,128));
        sair.setForeground(new Color(255,255,255));
        
        limpar = new JButton("Limpar");
        limpar.setBounds(550,20,130,30);
        limpar.setFont(new Font("Courier New",Font.BOLD,14));      
        limpar.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                caixa1.setText(null);
                caixa2.setText(null);
                caixa1.requestFocus();
            }
        }
    );
        limpar.setBackground(new Color(128,128,128));
        limpar.setForeground(new Color(255,255,255));
        
        desa = new JButton("Desabilitar");
        desa.setBounds(550,70,130,30);
        desa.setFont(new Font("Courier New",Font.BOLD,14));      
        desa.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                result.setEnabled(false);
            }
        }
    );
        desa.setBackground(new Color(128,128,128));
        desa.setForeground(new Color(255,255,255));
        
        hab = new JButton("Habilitar");
        hab.setBounds(550,120,130,30);
        hab.setFont(new Font("Courier New",Font.BOLD,14));      
        hab.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                result.setEnabled(true);
            }
        }
    );
        hab.setBackground(new Color(128,128,128));
        hab.setForeground(new Color(255,255,255));
        
        ocul = new JButton("Ocultar");
        ocul.setBounds(550,170,130,30);
        ocul.setFont(new Font("Courier New",Font.BOLD,14));      
        ocul.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                result.setVisible(false);

            }
        }
    );  
        ocul.setBackground(new Color(128,128,128));
        ocul.setForeground(new Color(255,255,255));
        
        exib = new JButton("Exibir");
        exib.setBounds(550,220,130,30);
        exib.setFont(new Font("Courier New",Font.BOLD,14));      
        exib.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                result.setVisible(true);

            }
        }
    ); 
        exib.setBackground(new Color(128,128,128));
        exib.setForeground(new Color(255,255,255));
        
        tela.add(exib);
        tela.add(ocul);
        tela.add(hab);
        tela.add(desa);       
        tela.add(result);               
        tela.add(sair);
        tela.add(limpar);
        tela.add(div);
        tela.add(mul);
        tela.add(sub);
        tela.add(add);
        tela.add(txt1);
        tela.add(txt2);
        tela.add(txt3);
        tela.add(caixa1);        
        tela.add(caixa2);
        
        setResizable(false);
        setSize(700, 350);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
public static void main(String args[]){
 Calculadora app = new Calculadora();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } }