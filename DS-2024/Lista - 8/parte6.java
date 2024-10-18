import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.Timer;

public class Parte6 extends JFrame{
JButton botao1, botao2, botaoErro, botaoInfo, botaoAlerta, botaoPergunta, botaoNenhum, botaoCopiar, botaoLimpar;
String nome;
JLabel rotulo, rotulo1, rotulo2, rotulo3, rotulo4, rotulo5;
JTextField texto1, texto2;
int ds, dia, mes, ano, t, hh, mm, ss, h;
Calendar data, hora;
String diasemana[] = {"Domingo", "Segunda - Feira", "Terça - Feira", "Quarta - Feira",
"Quinta - Feira", "Sexta - Feira", "Sábado"};
String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
DecimalFormat formato;


public Parte6 (){
super("Exemplo de Botões com Dica");
Container tela = getContentPane();
tela.setLayout(null);
botao1 = new JButton("Olá");
botao2 = new JButton("Sair");
botao1.setBounds(100,50,100,20);
botao2.setBounds(100,100,100,20);
botao1.setToolTipText("Botão usado para abrir algo");
botao2.setToolTipText("Botão que será usado para sair");
UIManager.put("ToolTip.background",SystemColor.info);

nome = JOptionPane.showInputDialog("Entre com seu nome: ");
rotulo = new JLabel("");
rotulo.setBounds(10,30,350,20);
rotulo.setText("O nome digitado foi: "+nome.toUpperCase());



botao2.addActionListener(
new ActionListener(){
public void actionPerformed(ActionEvent e) {
int opcao;
Object[] botoes = {"Sim","Não"};
opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
if (opcao==JOptionPane.YES_OPTION)
System.exit(0); }});






botaoErro = new JButton("Erro");
botaoInfo = new JButton("Informação");
botaoAlerta = new JButton("Exclamação");
botaoPergunta = new JButton("Pergunta");
botaoNenhum = new JButton("Nenhum");
botaoErro.setBounds(220,20,100,20);
botaoInfo.setBounds(220,50,100,20);
botaoAlerta.setBounds(220,80,150,20);
botaoPergunta.setBounds(220,110,100,20);
botaoNenhum.setBounds(220,140,100,20);

botaoErro.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){JOptionPane.showMessageDialog(null,"Você escolheu erro","Mensagem de Erro",JOptionPane.ERROR_MESSAGE,null);
        }});
botaoInfo.addActionListener(
        new ActionListener(){ 
            public void actionPerformed(ActionEvent e){JOptionPane.showMessageDialog(null,"Você escolheu informação","Mensagem deInformação",JOptionPane.INFORMATION_MESSAGE,null);
        }});
botaoAlerta.addActionListener(
        new ActionListener(){ 
            public void actionPerformed(ActionEvent e){JOptionPane.showMessageDialog(null,"Você escolheu exclamação","Mensagem deExclamação",JOptionPane.WARNING_MESSAGE,null);
        }});
botaoPergunta.addActionListener(
        new ActionListener(){ 
            public void actionPerformed(ActionEvent e){JOptionPane.showMessageDialog(null,"Você escolheu pergunta","Mensagem dePergunta",JOptionPane.QUESTION_MESSAGE,null);
        }});
botaoNenhum.addActionListener(
        new ActionListener(){ 
            public void actionPerformed(ActionEvent e){JOptionPane.showMessageDialog(null,"Você escolheu nenhum","Mensagem",JOptionPane.PLAIN_MESSAGE,null);}});



rotulo1 = new JLabel("Nome: ");
rotulo2 = new JLabel("Nome: ");
texto1 = new JTextField(20);
texto2 = new JTextField(20);
botaoCopiar = new JButton("Copiar");
botaoLimpar = new JButton("Limpar");
rotulo1.setBounds(20,200,50,20);
rotulo2.setBounds(20,220,50,20);
texto1.setBounds(60,200,180,20);
texto2.setBounds(60,220,180,20);
botaoCopiar.setBounds(20,250,100,20);
botaoLimpar.setBounds(180,250,100,20);
botaoCopiar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
texto2.setText(texto1.getText().toUpperCase());}});
botaoLimpar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
texto1.setText("");
texto2.setText("");
texto1.requestFocus();}});


rotulo3 = new JLabel("");
rotulo4 = new JLabel("");
rotulo3.setBounds(300,200,280,20);
rotulo4.setBounds(300,220,280,20);
data = Calendar.getInstance();
ds = data.get(Calendar.DAY_OF_WEEK);
dia = data.get(Calendar.DAY_OF_MONTH);
mes = data.get(Calendar.MONTH);
ano = data.get(Calendar.YEAR);
rotulo3.setText("Data: "+ds+" "+dia+"/"+(mes+1)+"/"+ano);
rotulo4.setText("Data: "+diasemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);



rotulo5 = new JLabel("");
rotulo5.setBounds(300,180,280,20);
ActionListener tarefa = (new ActionListener(){
public void actionPerformed(ActionEvent e){
HORAS();
}
});
javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
time.start();

tela.add(rotulo5);
tela.add(rotulo3);
tela.add(rotulo4);
tela.add(rotulo1);
tela.add(rotulo2);
tela.add(texto1);
tela.add(texto2);
tela.add(botaoCopiar);
tela.add(botaoLimpar);
tela.add(botaoErro);
tela.add(botaoInfo);
tela.add(botaoAlerta);
tela.add(botaoPergunta);
tela.add(botaoNenhum);
tela.add(rotulo);
tela.add(botao1);
tela.add(botao2);
setSize(600,400);
setVisible(true);
setLocationRelativeTo(null);
}
    public static void main(String[] args) {
        Object linguagens [] = {"Java","Delphi","C++","Visual Basic"};
Object opcao = JOptionPane.showInputDialog(null,"Qual sua linguagem favorita?" ,"Enquete",JOptionPane.QUESTION_MESSAGE,null,linguagens,linguagens[0]);
JOptionPane.showMessageDialog(null,"Você escolheu: "+opcao);

        
Parte6 app = new Parte6 ();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void HORAS(){
hora = Calendar.getInstance();
hh = hora.get(Calendar.HOUR_OF_DAY);
mm = hora.get(Calendar.MINUTE);
ss = hora.get(Calendar.SECOND);
formato = new DecimalFormat("00");
rotulo5.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
}
private String formatar(int num){
formato = new DecimalFormat("00");
return formato.format(num);
}
}
