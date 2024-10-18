import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InformacoesAluno extends JFrame {
    JLabel txt1, txt2, txt3, txt4, txt5;
    JTextArea caixa3;

    public InformacoesAluno(String nome, String matricula, String curso, String serie, String turno, String restricoesMedicas, JFrame parent) {
        super("Informações do Aluno");
        Container tela = getContentPane();
        tela.setBackground(new Color(240, 240, 240));
        setLayout(null);

        txt1 = new JLabel("Nome: " + nome);
        txt1.setBounds(20, 30, 300, 20);
        txt1.setFont(new Font("Arial", Font.BOLD, 16));
        txt1.setForeground(Color.BLACK);

        txt2 = new JLabel("Matrícula: " + matricula);
        txt2.setBounds(20, 60, 300, 20);
        txt2.setFont(new Font("Arial", Font.BOLD, 16));
        txt2.setForeground(Color.BLACK);

        txt3 = new JLabel("Curso: " + curso);
        txt3.setBounds(20, 90, 300, 20);
        txt3.setFont(new Font("Arial", Font.BOLD, 16));
        txt3.setForeground(Color.BLACK);

        txt4 = new JLabel("Série: " + serie);
        txt4.setBounds(20, 120, 300, 20);
        txt4.setFont(new Font("Arial", Font.BOLD, 16));
        txt4.setForeground(Color.BLACK); 

        txt5 = new JLabel("Turno: " + turno);
        txt5.setBounds(20, 150, 300, 20);
        txt5.setFont(new Font("Arial", Font.BOLD, 16));
        txt5.setForeground(Color.BLACK); 

        JLabel lal = new JLabel("Restrições Médicas:");
        lal.setBounds(20, 180, 300, 20);
        lal.setFont(new Font("Arial", Font.BOLD, 16));
        lal.setForeground(Color.BLACK); 

        caixa3 = new JTextArea(restricoesMedicas);
        caixa3.setEditable(false);
        caixa3.setFont(new Font("Arial", Font.PLAIN, 14));
        caixa3.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(caixa3);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(20, 210, 400, 150);

        JButton volt = new JButton("Voltar");
        volt.setBounds(160, 380, 100, 30);
        volt.setFont(new Font("Arial", Font.BOLD, 16));
        volt.setBackground(Color.LIGHT_GRAY); 
        volt.setForeground(Color.BLACK);

        volt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                parent.setVisible(true);
            }
        });

        tela.add(volt);
        tela.add(txt1);
        tela.add(txt2);
        tela.add(txt3);
        tela.add(txt4);
        tela.add(txt5);
        tela.add(lal);
        tela.add(scrollPane);

        setSize(450, 450);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
