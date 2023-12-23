import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BoxRGB extends JFrame implements ActionListener{
 
 private JLabel label1, label2, label3;
 private JComboBox box1, box2, box3;
 private JButton boton1;

 public BoxRGB(){
  setLayout(null);
 
  label1 = new JLabel("Rojo");
  label1.setBounds(10,10,100,10);
  add(label1);
 
  box1 = new JComboBox();
  box1.setBounds(120, 10, 50, 30);
  for(int i = 0; i <= 255; i++){
   box1.addItem(String.valueOf(i));
  }
  add(box1);
  
  label2 = new JLabel("Verde");
  label2.setBounds(10,50,100,10);
  add(label2);
  
  box2 = new JComboBox();
  box2.setBounds(120, 50, 50, 30);
  for(int i = 0; i <= 255; i++){
   box2.addItem(String.valueOf(i));
  }
  add(box2);
  
  label3 = new JLabel("Azul");
  label3.setBounds(10, 90, 100, 10);
  add(label3);
  
  box3 = new JComboBox();
  box3.setBounds(120, 90, 50, 30);
  for(int i = 0; i <= 255; i++){
   box3.addItem(String.valueOf(i));
  }
  add(box3);
  
  boton1 = new JButton("Fijar color");
  boton1.setBounds(10, 130, 100, 30);
  add(boton1);
  boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
   String a = box1.getSelectedItem().toString();
   String b = box2.getSelectedItem().toString();
   String c = box3.getSelectedItem().toString();

   int rojo = Integer.parseInt(a);
   int verde = Integer.parseInt(b);
   int azul = Integer.parseInt(c);
   
   Color color1 = new Color(rojo,verde,azul);
   boton1.setBackground(color1);   
  }
 }

 public static void main(String args[]){
   BoxRGB interfaz = new BoxRGB();
   interfaz.setBounds(0,0,250,250);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);

 }
}

 





















