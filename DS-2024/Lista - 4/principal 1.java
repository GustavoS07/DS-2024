import javax.swing.*; 
public class principal 
{
    
    public static void main(String[]args)
    
    {
        calculadora cal = new calculadora();
        
        int i=0;
        double ret, num1,num2;
        do{
        
            i = Integer.parseInt (JOptionPane.showInputDialog("Escolha uma opção: \n1-Soma\n2-Subtração\n3-Multiplicação\n4-divisão\n5-sair"));
            
            switch(i)
            {
                case 1:     
                    cal.somar();
                    break;
                
                case 2:
                    
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
                    cal.subtrair(num1,num2);
                    break;
                    
                case 3:
                    ret=cal.multiplicar();
                    JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+ret);
                    break;
                case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
                    ret=cal.dividir(num1,num2);
                    JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+ret);
                    break;
                case 5 :
                    JOptionPane.showMessageDialog(null,"Programa Finalizado!");
                    i=0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"opção invalida!!!");
            }
            
        }while (i !=0);
    }
}
