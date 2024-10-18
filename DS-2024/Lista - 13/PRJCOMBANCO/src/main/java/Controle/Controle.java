package Controle;

import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.sql.*;
import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controle extends JFrame {
    Conexao con_cliente;
    Container tela = getContentPane();
    JLabel txt1, txt2, txt3, txt4, txt5;
    JTextField tcodigo, tnome, temail, tpes;
    JFormattedTextField tfone, tdata;
    JButton bt1, bt2, bt3, bt4, btReg, btLimp, btAlt, btApag, btPes;
    JTable tblClientes; 
    JScrollPane scp_tabela; 

    public Controle() {
        con_cliente = new Conexao();
        con_cliente.conecta();

        setTitle("Projeto com Banco");
        setResizable(false);
        setLayout(null);

        // Configuração dos rótulos
        txt1 = new JLabel("Código:");
        txt1.setBounds(85, 30, 100, 20);
        txt1.setFont(new Font("Arial", Font.BOLD, 18));

        txt2 = new JLabel("Nome:");
        txt2.setBounds(85, 80, 100, 20);
        txt2.setFont(new Font("Arial", Font.BOLD, 18));

        txt3 = new JLabel("Data:");
        txt3.setBounds(85, 130, 100, 20);
        txt3.setFont(new Font("Arial", Font.BOLD, 18));

        txt4 = new JLabel("Telefone:");
        txt4.setBounds(85, 180, 100, 20);
        txt4.setFont(new Font("Arial", Font.BOLD, 18));

        txt5 = new JLabel("Email:");
        txt5.setBounds(85, 230, 100, 20);
        txt5.setFont(new Font("Arial", Font.BOLD, 18));

        tcodigo = new JTextField("");
        tcodigo.setBounds(190, 30, 30, 25);
        tcodigo.setForeground(new Color(25, 25, 112));
        tcodigo.setFont(new Font("Arial", Font.PLAIN, 14));

        tnome = new JTextField("");
        tnome.setBounds(190, 80, 250, 25);
        tnome.setForeground(new Color(25, 25, 112));
        tnome.setFont(new Font("Arial", Font.PLAIN, 14));

        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            tdata = new JFormattedTextField(dataFormatter);
            tdata.setBounds(190, 130, 80, 25);
            tdata.setForeground(new Color(25, 25, 112));
            tdata.setFont(new Font("Arial", Font.PLAIN, 14));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            MaskFormatter telefoneFormatter = new MaskFormatter("(##) ####-####");
            tfone = new JFormattedTextField(telefoneFormatter);
            tfone.setBounds(190, 180, 110, 25);
            tfone.setForeground(new Color(25, 25, 112));
            tfone.setFont(new Font("Arial", Font.PLAIN, 14));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        temail = new JTextField("");
        temail.setBounds(190, 230, 250, 25);
        temail.setForeground(new Color(25, 25, 112));
        temail.setFont(new Font("Arial", Font.PLAIN, 14));

        bt1 = new JButton("Primeiro");
        bt1.setBounds(85, 290, 110, 30);
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    con_cliente.resultset.first();
                    mostrar_Dados();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar!");
                }
            }
        });

        bt2 = new JButton("Anterior");
        bt2.setBounds(200, 290, 110, 30);
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!con_cliente.resultset.isFirst()) {
                        con_cliente.resultset.previous();
                        mostrar_Dados();
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já está no primeiro registro.");
                    }
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar!");
                }
            }
        });

        bt3 = new JButton("Próximo");
        bt3.setBounds(315, 290, 110, 30);
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!con_cliente.resultset.isLast()) {
                        con_cliente.resultset.next();
                        mostrar_Dados();
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já está no último registro.");
                    }
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar!");
                }
            }
        });

        bt4 = new JButton("Último");
        bt4.setBounds(430, 290, 110, 30);
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    con_cliente.resultset.last();
                    mostrar_Dados();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar!");
                }
            }
        });

        btReg = new JButton("Registrar");
        btReg.setBounds(545, 30, 110, 30);
        btReg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = tnome.getText();
                String dat = tdata.getText();
                String email = temail.getText();
                String tele = tfone.getText();
                String sql;
                try {
                    sql = "INSERT INTO tbclientes (nome, telefone, email, dt_nasc) VALUES ('" + nome + "', '" + tele + "', '" + email + "', '" + dat + "')";
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("SELECT * FROM tbclientes ORDER BY cod");
                    preenchertabela();
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "Erro na gravação: " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btLimp = new JButton("Limpar");
        btLimp.setBounds(545, 90, 110, 30);
        btLimp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tcodigo.setText("");
                tnome.setText("");
                tdata.setText("");
                temail.setText("");
                tfone.setText("");
                tcodigo.requestFocus();
            }
        });

        btAlt = new JButton("Alterar");
        btAlt.setBounds(545, 150, 110, 30);
        btAlt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = tnome.getText();
                String dat = tdata.getText();
                String email = temail.getText();
                String tele = tfone.getText();
                String sql;

                try {
                    if (tcodigo.getText().equals("")) {
                        sql = "INSERT INTO tbclientes (nome, telefone, email, dt_nasc) VALUES ('" + nome + "', '" + tele + "', '" + email + "', '" + dat + "')";
                    } else {
                        sql = "UPDATE tbclientes SET nome='" + nome + "', telefone='" + tele + "', email='" + email + "', dt_nasc='" + dat + "' WHERE cod = " + tcodigo.getText();
                    }

                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("SELECT * FROM tbclientes ORDER BY cod");
                    preenchertabela();
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "Erro na alteração: " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btApag = new JButton("Excluir");
        btApag.setBounds(545, 210, 110, 30);
        btApag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sql;

                try {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro?", "Confirmar Exclusão", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        sql = "DELETE FROM tbclientes WHERE cod = " + tcodigo.getText();
                        int excluir = con_cliente.statement.executeUpdate(sql);
                        if (excluir == 1) {
                            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            con_cliente.executaSQL("SELECT * FROM tbclientes ORDER BY cod");
                            con_cliente.resultset.first();
                            preenchertabela();
                            posicionarRegistro();
                        } else {
                            JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } catch (SQLException excecao) {
                    JOptionPane.showMessageDialog(null, "Erro na exclusão: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        tpes = new JTextField("");
        tpes.setBounds(85, 540, 490, 25);
        tpes.setForeground(new Color(25, 25, 112));
        tpes.setFont(new Font("Arial", Font.PLAIN, 14));

        btPes = new JButton("Pesquisar");
        btPes.setBounds(580, 540, 110, 25);
        btPes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    String pesquisa = "select * from tbclientes where nome like '" + tpes.getText() + "%'";
                    con_cliente.executaSQL(pesquisa);
                    
                    if(con_cliente.resultset.first()) {
                        preenchertabela();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"\n Não existe dados com este paramêtro!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(SQLException errosql) {
                    JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        tela.add(tpes);
        tela.add(btPes);
        tela.add(btApag);
        tela.add(btReg);
        tela.add(btLimp);
        tela.add(btAlt);
        tela.add(bt1);
        tela.add(bt2);
        tela.add(bt3);
        tela.add(bt4);
        tela.add(txt1);
        tela.add(txt2);
        tela.add(txt3);
        tela.add(txt4);
        tela.add(txt5);
        tela.add(tcodigo);
        tela.add(tnome);
        tela.add(tdata);
        tela.add(tfone);
        tela.add(temail);

        // Configuração da tabela
        tblClientes = new JTable();
        scp_tabela = new JScrollPane(tblClientes);

        tblClientes.setBounds(85, 330, 600, 200);
        scp_tabela.setBounds(85, 330, 600, 200);

        tela.add(scp_tabela);

        tblClientes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tblClientes.setFont(new Font("Arial", Font.BOLD, 12));

        tblClientes.setModel(new DefaultTableModel(
            new Object[][]{
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String[]{"Código", "Nome", "Data Nascimento", "Telefone", "Email"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        tblClientes.setAutoCreateRowSorter(true); // Ativa a classificação ordenada da tabela

        setSize(800, 640);
        setVisible(true);
        setLocationRelativeTo(null);

        con_cliente.executaSQL("SELECT * FROM tbclientes ORDER BY cod");
        preenchertabela();
        posicionarRegistro();
    }

    public void preenchertabela() {
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(34);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);

        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0);

        try {
            con_cliente.resultset.beforeFirst();
            while (con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod"),
                    con_cliente.resultset.getString("nome"),
                    con_cliente.resultset.getString("dt_nasc"),
                    con_cliente.resultset.getString("telefone"),
                    con_cliente.resultset.getString("email")
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados da tabela: " + erro.getMessage());
        }
    }

    public void posicionarRegistro() {
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostrar_Dados() {
        try {
            tcodigo.setText(con_cliente.resultset.getString("cod"));
            tnome.setText(con_cliente.resultset.getString("nome"));
            tdata.setText(con_cliente.resultset.getString("dt_nasc"));
            tfone.setText(con_cliente.resultset.getString("telefone"));
            temail.setText(con_cliente.resultset.getString("email"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Controle app = new Controle();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
