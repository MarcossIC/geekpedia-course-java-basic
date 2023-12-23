import javax.swing.*;
import java.awt.event.*;

public class Suma extends JFrame implements ActionListener{

 private JButton boton1;
 private JLabel label1, label2, label3;
 private JTextField text1, text2;

 public Suma(){
  setLayout(null);
  label1 = new JLabel("Valor 1");
  label1.setBounds(50,5,100,30);
  add(label1);

  label2 = new JLabel("Valor 2");
  label2.setBounds(50,35,100,30);
  add(label2);

  label3 = new JLabel("Resultado:");
  label3.setBounds(120,80,100,30);
  add(label3);

  text1 = new JTextField();
  text1.setBounds(120,10,150,20);
  add(text1);

  text2 = new JTextField();
  text2.setBounds(120,40,150,20);
  add(text2);

  boton1 = new JButton("Sumar");
  boton1.setBounds(10,80,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
   int a = 0, b = 0, r = 0;

   a = Integer.parseInt(text1.getText());
   b = Integer.parseInt(text2.getText());
   r = a + b;
   label3.setText("Resultado: " + r);
  }
  
 }
 public static void main(String args[]){
   Suma interfaz = new Suma();
   interfaz.setBounds(0,0,350,200);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}













