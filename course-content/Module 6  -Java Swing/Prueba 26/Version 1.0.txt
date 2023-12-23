import javax.swing.*;

public class Prueba extends JFrame{
 
  private JLabel label1;
  private JLabel label2;

  public Prueba (){
   setLayout(null);
   label1 = new JLabel("Interfaz grafica.");
   label1.setBounds(40,20,300,30);
   add(label1);
   label2 = new JLabel("Version 1.0");
   label2.setBounds(20,65,100,30);
   add(label2);
  }
  public static void main(String args[]){
   Prueba prueba1 = new Prueba();
   prueba1.setBounds(0,0,300,300);
   prueba1.setLocationRelativeTo(null);
   prueba1.setVisible(true);
   prueba1.setResizable(false);  

  }
}