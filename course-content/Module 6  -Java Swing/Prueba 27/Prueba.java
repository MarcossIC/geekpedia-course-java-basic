import javax.swing.*;
import java.awt.event.*;

public class Prueba extends JFrame implements ActionListener{
 
  JButton boton1;
  private JLabel label1;
  private JLabel label2;

  public Prueba(){
   setLayout(null);
   boton1 = new JButton("Cerrar");
   boton1.setBounds(300,250,100,30);
   add(boton1);
   boton1.addActionListener(this);
   label1 = new JLabel("Interfaz grafica");
   label1.setBounds(20,0,200,30);
   add(label1);
   label2 = new JLabel("Version 1.1");
   label2.setBounds(10,65,200,30);
   add(label2);
  }
 
  public void actionPerformed(ActionEvent a){
   if(a.getSource() == boton1){
    System.exit(0);
   }
  }  

 public static void main(String args[]){

  Prueba interfaz = new Prueba();
  interfaz.setBounds(0,0,450,350);
  interfaz.setLocationRelativeTo(null);
  interfaz.setResizable(false);
  interfaz.setVisible(true);  

 }

}