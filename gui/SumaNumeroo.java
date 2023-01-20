package bimestre2.semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumeroo {
    private JPanel PanelPrincipal;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JButton button1;
    private JLabel lbl_resultado;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;

    public SumaNumeroo() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(formattedTextField1.getText()) + Integer.parseInt(formattedTextField2.getText());
                lbl_resultado.setText(String.valueOf(suma));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta = Integer.parseInt(formattedTextField1.getText()) - Integer.parseInt(formattedTextField2.getText());
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mult = Integer.parseInt(formattedTextField1.getText()) * Integer.parseInt(formattedTextField2.getText());
                lbl_resultado.setText(String.valueOf(mult));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int div = Integer.parseInt(formattedTextField1.getText()) / Integer.parseInt(formattedTextField2.getText());
                lbl_resultado.setText(String.valueOf(div));
            }
        });
    }
    public static void main(String[] args) {
        JFrame INICIO = new JFrame("SumaNumero");
        INICIO.setContentPane(new SumaNumeroo().PanelPrincipal);
        INICIO.pack();
        INICIO.setVisible(true);
    }
}
