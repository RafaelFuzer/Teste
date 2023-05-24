package br.sc.senac.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cadastro extends JFrame{
    private JTextField txtNome;
    private JTextField txtData;
    private JTextField txtCurso;
    private JTextField txtFase;
    private JLabel lblNome;
    private JLabel lblData;
    private JLabel lblCurso;
    private JLabel lblFase;
    private JButton btnCadastrar;
    private JPanel pnlCadastro;

    public Cadastro() {
        AddListener();
    }
    public void AddListener() {
        btnCadastrar.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(btnCadastrar, " Usuário cadastrado! "+
                        "\nNome: " + txtNome.getText() +
                                "\nData de Nascimento: "+ txtData.getText() +
                                "\nCurso: " + txtCurso.getText() +
                                "\nFase:" + txtFase.getText());

            }
        });
    }

    public static void main(String[] args) {
        Cadastro cad = new Cadastro();
        cad.setTitle("Teste Representacional");
        cad.setSize(500, 300);
        cad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cad.setContentPane(cad.pnlCadastro);
        cad.setVisible(true);
    }

}


