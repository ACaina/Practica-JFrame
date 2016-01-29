
package Gui01;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Gui01 {

    private JButton miboton;
    private Container panel;
    public Gui01(){
        JFrame frame=new JFrame("ejemplos 01");
        panel=frame.getContentPane();
        miboton =new JButton("aceptar");
        panel.add(miboton);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Gui01 g= new Gui01();
    }
}