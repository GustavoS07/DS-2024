import javax.swing.*;
public class calculadora 
{
    private double n1;
    private double n2;
    private double result;
    
    public calculadora()
    {
        this(0,0,0);
    }

    public calculadora(double n1, double n2, double result) {
        this.n1 = n1;
        this.n2 = n2;
        this.result = result;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public void somar(){
    
    this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero")));
    this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero")));
    this.setResult(this.getN1() + this.getN2());
    JOptionPane.showMessageDialog(null,"O resultado da soma é: "+this.getResult());
    }
    
    public void subtrair(double nu1, double nu2){
    
    this.setN1(nu1);
    this.setN2(nu2);
    this.setResult(this.getN1() - this.getN2());
    JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+this.getResult());
    }
    public double multiplicar(){
    
    this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero")));
    this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero")));
    this.setResult(this.getN1() * this.getN2());
    return this.getResult(); 
    }
    public double dividir(double nu1,double nu2){
    
    this.setN1(nu1);
    this.setN2(nu2);
    this.setResult(this.getN1() / this.getN2());
    return this.getResult(); 
    }
    
}
