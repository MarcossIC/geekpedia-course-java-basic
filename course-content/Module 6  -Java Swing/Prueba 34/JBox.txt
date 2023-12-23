import javax.swing.*;
import java.awt.event.*;

public class Box extends JFrame implements ItemListener{
  
 private JComboBox box1;

 public Box(){
  setLayout(null);

  box1 = new JComboBox();
  box1.setBounds(10,10,80,20);
  add(box1);
  box1.addItem("rojo");
  box1.addItem("negro");
  box1.addItem("Azul");
  box1.addItem("verde");
  box1.addItem("amarillo");
  box1.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent a){
  if(a.getSource() == box1){
   String text = box1.getSelectedItem().toString();
   setTitle(text);
  }
 }

 public static void main(String args[]){
   Box interfaz = new Box();
   interfaz.setBounds(0,0,200,200);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}