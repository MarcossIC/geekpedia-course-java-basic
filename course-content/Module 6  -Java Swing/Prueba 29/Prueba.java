import javax.swing.*;
import java.awt.event.*;

public class Prueba extends JFrame implements ActionListener{

  private JTextField texto1;
  private JLabel label1;
  private JButton boton1;

  public Prueba(){
   setLayout(null);
   label1 = new JLabel("usuario:");
   label1.setBounds(10,10,100,30);
   add(label1);

   texto1 = new JTextField();
   texto1.setBounds(120,17,150,20);
   add(texto1);

   boton1 = new JButton("Aceptar");
   boton1.setBounds(10,80,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    String texto = texto1.getText();
    setTitle(texto);
   }
  }

  public static void main(String args[]){
   Prueba interfaz = new Prueba();
   interfaz.setBounds(0,0,300,150);
   interfaz.setLocationRelativeTo(null);
   interfaz.setResizable(false);
   interfaz.setVisible(true);
 }

}