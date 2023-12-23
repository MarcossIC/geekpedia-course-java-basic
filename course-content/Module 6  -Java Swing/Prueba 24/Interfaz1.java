import javax.swing.*;

public class Interfaz1 extends JFrame{
  private JLabel Etiqueta1;
  
  public Interfaz1(){
   setLayout(null);
   Etiqueta1 = new JLabel("Mi primera interfaz, Hola mundo");
   Etiqueta1.setBounds(100,-125,200,300);
   add(Etiqueta1);
  }
  
 public static void main(String args[]){
  Interfaz1 Interfaz2 = new Interfaz1();  
  Interfaz2.setBounds(0,0,400,300);
  Interfaz2.setVisible(true);
  Interfaz2.setLocationRelativeTo(null);
 }

}