import javax.swing.*;
public class Percursos {
    private double kmPercorrida;
    private double valorCombustivel;    
    private double valorPedagio;
    
    public Percursos()
    {
        this(0,0,0);
    }

    public Percursos(double kmPercorrida, double valorCombustivel, double valorPedagio) {
        this.kmPercorrida = kmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
    public void CadastrarPercurso()
    {
        this.setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos km você percorreu: ")));
        this.setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustivel: ")));
        this.setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedagio: ")));
    }
    
        public void ListarPercurso()
    {
        JOptionPane.showMessageDialog(null,"Você percorreu: "+this.getKmPercorrida()+" km.\n"+"Valor do combustivel R$"+this.getValorCombustivel()+" /L\n"+"Valor gasto em pedagio: "+this.getValorPedagio()+"R$");
    }
}















