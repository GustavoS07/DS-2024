import javax.swing.JOptionPane;
public class OrganizarNumero {
    public static void main(String[] args) {
        double num1, num2, num3;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));

        if (num1 > num2 & num1 > num3) {
            if (num2 > num3) {
                JOptionPane.showMessageDialog(null, "A ordem correta é: " + num1 + ", " + num2 + ", " + num3);
            } else {
                JOptionPane.showMessageDialog(null, "A ordem correta é: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 > num1 & num2 > num3) {
            if (num1 > num3) {
                JOptionPane.showMessageDialog(null, "A ordem correta é: " + num2 + ", " + num1 + ", " + num3);
            } else {
                JOptionPane.showMessageDialog(null, "A ordem correta é: " + num2 + ", " + num3 + ", " + num1);
            }
        } else if (num3 > num1 & num3 > num2) {
            if (num1 > num2) {
                JOptionPane.showMessageDialog(null, "A ordem correta é: " + num3 + ", " + num1 + ", " + num2);
            } else {
                JOptionPane.showMessageDialog(null, "A ordem correta é: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}