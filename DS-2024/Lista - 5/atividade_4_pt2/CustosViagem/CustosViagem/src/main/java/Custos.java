import javax.swing.*;
public class Custos {
    private double TotalPercurso;
    public Custos()
    {
        this(0);
    }
    
    public Custos(double TotalPercurso) {
        this.TotalPercurso = TotalPercurso;
    }

    public double getTotalPercurso() {
        return TotalPercurso;
    }

    public void setTotalPercurso(double TotalPercurso) {
        this.TotalPercurso = TotalPercurso;
    }
    public void CalcularViagem()
    {
    
    }

    public void CalcularViagem(Percursos perc) 
    {
        this.setTotalPercurso((perc.getKmPercorrida() * perc.getValorCombustivel())+perc.getValorPedagio());
        JOptionPane.showMessageDialog(null,"Custo total da viagem: "+this.getTotalPercurso());     
    }
}

