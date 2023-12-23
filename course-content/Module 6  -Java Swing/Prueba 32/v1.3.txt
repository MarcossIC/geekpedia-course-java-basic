import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{

 private JButton boton1, boton2;
 private JTextField textf1;
 private JTextArea texta1;
 private JScrollPane scroll1;

 String texto = "";

 public Interfaz(){
  setLayout(null);
  
  textf1 = new JTextField();
  textf1.setBounds(10,10,150,30);
  add(textf1);

  boton1 = new JButton("Agregar");
  boton1.setBounds(240,10,90,30);
  add(boton1);
  boton1.addActionListener(this);

  texta1 = new JTextArea();
  scroll1 = new JScrollPane(texta1);
  scroll1.setBounds(10,50,400,300);
  add(scroll1);

  boton2 = new JButton("Cerrar");
  boton2.setBounds(420,330,90,30);
  add(boton2);
  boton2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent a){
  if(a.getSource() == boton1){
   texto += textf1.getText() + "\n";
   texta1.setText(texto);
   textf1.setText(null);
  }
  if(a.getSource() == boton2){
   System.exit(0);
  }
 }


 public static void main(String args[]){
   Interfaz interfaz1 = new Interfaz();
   interfaz1.setBounds(0,0,540,400);
   interfaz1.setVisible(true);
   interfaz1.setResizable(false);
   interfaz1.setLocationRelativeTo(null);
 }
}