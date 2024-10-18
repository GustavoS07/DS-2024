import javax.swing.JOptionPane;
public class pessoa {

    private String nome;
    private String endereco;
    private double salario;
    private String telefone;
    private String email;
    
    public pessoa()
    {
        this("","",0,"","");
    }

    public pessoa(String nome, String endereco, double salario, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void InserirDadosPessoais()
    {
        this.setNome (JOptionPane.showInputDialog("Digite seu nome: "));
        this.setEndereco ( JOptionPane.showInputDialog("Digite seu endereço: "));
        this.setSalario (Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario ")));
        this.setTelefone  (JOptionPane.showInputDialog("Digite seu telefone: "));
        this.setEmail  (JOptionPane.showInputDialog("Digite seu email: "));
    }
    
    public void apresentarPessoa()
    {
        JOptionPane.showMessageDialog(null," nome: "+this.getNome()+"\n Endereço: "+this.getEndereco()+"\n Salario: "+this.getSalario()+"\n Telefone: "+this.getTelefone()+"\n Email: "+this.getEmail());
    }
    
}
