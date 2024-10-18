import javax.swing.JOptionPane;

public class SomaMultpli {
    public static void main(String[] args) {
        int soma = 0;
        double multi = 1;

        for (int i = 1; i <= 30; i++) 
        {
            if (i % 2 != 0) 
            {
                soma = soma+ i;
            } else 
            {
                multi = multi * i;
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre 0 e 30 é: " + soma+" e a multiplicação é: "+multi);
    }
}