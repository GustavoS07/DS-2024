package Controle;

import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frm_Login extends JFrame {
    Conexao con_cliente;
    Container tela;
    JPasswordField sen;
    JLabel usu, senh, titu;
    JTextField Cusu;
    JButton env;
    
    public frm_Login() {
        con_cliente = new Conexao();
        con_cliente.conecta();

        setTitle("Projeto com Banco");
        setResizable(false);
        setLayout(null);
        
    
        titu = new JLabel("Acesso ao Sistema");
        titu.setBounds(85, 30, 300, 30); 
        titu.setFont(new Font("Arial", Font.BOLD, 24));
        
        usu = new JLabel("Usuário:");
        usu.setBounds(50, 100, 100, 20);
        usu.setFont(new Font("Arial", Font.BOLD, 18));

        senh = new JLabel("Senha:");
        senh.setBounds(50, 140, 100, 20);
        senh.setFont(new Font("Arial", Font.BOLD, 18));

        Cusu = new JTextField();
        Cusu.setBounds(150, 100, 150, 25);

        sen = new JPasswordField();
        sen.setBounds(150, 140, 150, 25);

        env = new JButton("Entrar");
        env.setBounds(150, 200, 100, 30);

        env.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                try {
                    String pesquisa = "select * from tblusuario where usuario like '" + Cusu.getText() + "' && senha ="+ sen.getText()+"";
                    con_cliente.executaSQL(pesquisa);
                    
                    if(con_cliente.resultset.first()) {
                        Controle mostra  = new Controle();
                        mostra.setVisible(true);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"\n Usuario não cadastrado!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(SQLException errosql) {
                    JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        
        tela = getContentPane();
        tela.add(titu);
        tela.add(usu);
        tela.add(senh);
        tela.add(Cusu);
        tela.add(sen);
        tela.add(env);
        
        
        setSize(400, 300);
        setLocationRelativeTo(null);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        frm_Login app = new frm_Login();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
