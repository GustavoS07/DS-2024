import javax.swing.*;
public class Vendedor {
    
    private String nome;
    private double salario;
    
    public Vendedor()
    {
        this("",0);
    }

    public Vendedor(String nome, double salario) 
    {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculoComissao(double ValorVendido)
    {   
        this.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        this.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario base: ")));
        this.setSalario ((ValorVendido/10)+this.getSalario());
        return this.getSalario();
    }
}
