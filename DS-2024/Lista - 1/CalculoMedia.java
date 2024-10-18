import javax.swing.JOptionPane;

public class CalculoMedia {
    public static void main(String[] args) {
        int numAlunos = 1;
        double[][] notas = new double[numAlunos][4];
        String[] nomes = new String[numAlunos];
        int i, c;
        double soma;

        for (i = 0; i < numAlunos; i++) 
        {
            nomes[i] = JOptionPane.showInputDialog("Insira o nome do aluno");
            soma = 0;
            for (c = 0; c < 4; c++) 
            {
                notas[i][c] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (c + 1) + "ª nota do aluno:"));
                soma += notas[i][c];
            }
            double media = soma / 4;
            JOptionPane.showMessageDialog(null, "A média do aluno " + nomes[i] + " é: " + media);
        }
    }
}