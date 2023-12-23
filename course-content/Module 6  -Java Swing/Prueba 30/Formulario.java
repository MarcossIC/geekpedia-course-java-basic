import javax.swing.*;

public class Formulario extends JFrame{

 private JTextField textf1;
 private JTextArea texta1;
 
 public Formulario(){
 setLayout(null);
 textf1 = new JTextField();
 textf1.setBounds(10,10,200,30);
 add(textf1);

 texta1 = new JTextArea();
 texta1.setBounds(10,50,400,300);
 add(texta1);

 }
 public static void main(String args[]){
   Formulario interfaz = new Formulario();
   interfaz.setBounds(0,0,540,400);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}