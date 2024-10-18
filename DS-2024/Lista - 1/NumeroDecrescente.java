import javax.swing.JOptionPane;

public class NumeroDecrescente {
    public static void main(String[] args) {
        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        JOptionPane.showMessageDialog(null, "A ordem decrescente é: ");
        for (int i = num; i >= 0; i--) 
        {
            JOptionPane.showMessageDialog(null, + i);
        }
    }
}