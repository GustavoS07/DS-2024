package conecta;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {
    final private String driver ="com.mysql.cj.jdbc.Driver";
    final private String url ="jdbc:mysql://localhost/pet";
    final private String usuario ="root";
    final private String senha ="";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
        }catch (ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null,"Driver nao localizado"+Driver);
            result = false;
        }catch (SQLException Fonte){
            JOptionPane.showMessageDialog(null,"Fonte nao localizada"+Fonte);
        }
        return result;
    }
    
    public void desconecta() {
        try {
            conexao.close();
        }catch(SQLException fecha){
            JOptionPane.showMessageDialog(null,"Erro ao Fechar Banco");
        }
    }
    
    public void executaSQL(String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro no codigo sql"+erro);
        }
    }
}
