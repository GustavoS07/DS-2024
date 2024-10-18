import javax.swing.*;
public class PrincipalViagem {
    public static void main (String[]args){
    Percursos perc = new Percursos();
    Custos cu = new Custos();
    int i;
    do{
    i = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO:\n1-Cadastrar dados da viagem\n2-Apresentar dados da viagem\n3-Apresentar custo da viagem\n4-SAIR"));
    switch(i)
            {
            case 1:
                perc.CadastrarPercurso();
                break;
            case 2:
                perc.ListarPercurso();
                break;
            case 3:
                cu.CalcularViagem(perc);
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Você escolheu sair!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção invalida");
            }
        }while (i!=4);
    }
}
