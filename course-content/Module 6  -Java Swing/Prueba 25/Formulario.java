import javax.swing.*;

public class Formulario extends JFrame{

 public Formulario (){
  setLayout(null);   
 }
 
 public static void main(String args[]){
  Formulario interfaz1 = new Formulario();
  interfaz1.setBounds(0,0,400,550);  
  interfaz1.setVisible(true);
  interfaz1.setLocationRelativeTo(null);
  interfaz1.setResizable(false);
 }

}