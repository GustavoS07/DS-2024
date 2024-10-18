import javax.swing.*;
public class principal 
{
    public static void main(String[]args)
    {
    double valVend, result;
       
    Vendedor vend = new Vendedor();
    
    JOptionPane.showMessageDialog(null,"Bem vindo ao calculador de salario!!!");
    
    valVend = Double.parseDouble (JOptionPane.showInputDialog("Digite o que você vendeu este mês: "));
    
    result = vend.calculoComissao(valVend);
    JOptionPane.showMessageDialog(null,"Olá "+vend.getNome()+" seu salario total é: "+result);
    }
}
