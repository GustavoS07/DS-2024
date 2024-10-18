package conexao;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {

    final private String driver = "com.mysql.cj.jdbc.Driver"; 
    final private String url = "jdbc:mysql://localhost/clientes";
    final private String usuario ="root";
    final private String senha ="";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset; 
    
    public boolean conecta(){
    boolean result = true;
    try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,usuario,senha);
        JOptionPane.showMessageDialog(null,"Conexão Estabelecida", "Mensagem do Progama", JOptionPane.INFORMATION_MESSAGE);
    }catch(ClassNotFoundException Driver) {
        JOptionPane.showMessageDialog(null,"Driver não localizado"+Driver,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;
    }catch (SQLException Fonte){
        JOptionPane.showMessageDialog(null,"Driver não localizado"+Fonte,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;
    }
        return result;
    }

public void desconecta() {
    try {
        conexao.close();
        JOptionPane.showMessageDialog(null,"Fonte não localizada","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    }
    catch(SQLException fecha){
        JOptionPane.showMessageDialog(null,"erro ao fechar o banco","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);      
    }
    }
public void executaSQL(String sql){
    try{
        statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultset = statement.executeQuery(sql);
    }
    catch(SQLException excecao){
        JOptionPane.showMessageDialog(null,"erro no comando SQL! \n Erro: "+ excecao, "Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
    }
    }
}
   