import javax.swing.*;
import java.awt.event.*;

public class Prueba extends JFrame implements ActionListener{

  private JButton boton1, boton2, boton3, boton4;
  private JLabel label1, label2;

  public Prueba(){ 
   setLayout(null);
   boton1 = new JButton("1");
   boton1.setBounds(10,100,90,30);
   add(boton1);
   boton1.addActionListener(this);

   boton2 = new JButton("2");
   boton2.setBounds(110,100,90,30);
   add(boton2);
   boton2.addActionListener(this);

   boton3 = new JButton("3");
   boton3.setBounds(210,100,90,30);
   add(boton3);
   boton3.addActionListener(this);

   boton4 = new JButton("Cerrar");
   boton4.setBounds(250,250,90,30);
   add(boton4);
   boton4.addActionListener(this); 

   label1 = new JLabel("Version 1.1");
   label1.setBounds(20,20,300,30);
   add(label1);

   label2 = new JLabel("En espera...");
   label2.setBounds(10, 40,300,30);
   add(label2);
  }
  public void actionPerformed(ActionEvent a){
   if(a.getSource() == boton1){
    label2.setText("Has presionado el boton 1");
   }
   if(a.getSource() == boton2){
    label2.setText("Has presionado el boton 2");
   }
   if(a.getSource() == boton3){
    label2.setText("Has presionado el boton 3");
   }
   if(a.getSource() == boton4){
    System.exit(0);
   }
  }
  public static void main(String args[]){
   Prueba interfaz = new Prueba();
   interfaz.setBounds(0,0,400,350);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}