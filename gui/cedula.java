package bimestre2.semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cedula {
    private JFormattedTextField TEXT;
    private JButton VALIDARButton;
    private JLabel RESULT;
    int n = 0;
    int c = 0;
    int div ;

    public cedula() {
        VALIDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String validada = ("Cedula correcta");
                String Novalidada = ("Cedula incorrecta "+ "--Número de digitos de la cedula incorrectos");
                n = Integer.parseInt(TEXT.getText());
                boolean esCedula = false ;
                while (n > 0){
                    div = n/10;
                    c = c+1;
                    n = div;
                }
                if (c == 10){
                    esCedula = true;
                    RESULT.setText(String.valueOf(validada));
                }else{
                    RESULT.setText(String.valueOf(Novalidada));
                }
            }
        });
    }
}