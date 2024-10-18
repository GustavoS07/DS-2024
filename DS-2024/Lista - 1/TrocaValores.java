import javax.swing.JOptionPane;

public class TrocaValores {
    public static void main(String[] args) {
        int valor1, valor2, temp;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a variável valor1:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a variável valor2:"));

        temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        JOptionPane.showMessageDialog(null, "Agora, a variável valor1 contém: " + valor1+ " e, a variável valor2 contém: " + valor2);        
    }
}