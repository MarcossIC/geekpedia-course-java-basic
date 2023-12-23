import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Termino extends JFrame implements ActionListener, ChangeListener{

  private JCheckBox check1;
  private JButton boton1;
  private JLabel label1;

  public Termino(){
   setLayout(null);
   
   label1 = new JLabel("Aceptar terminos y condiciones");
   label1.setBounds(10, 10, 400, 30);
   add(label1);
  
   check1 = new JCheckBox("Acepto");
   check1.setBounds(10, 50, 100, 30);
   check1.addChangeListener(this);
   add(check1);

   boton1 = new JButton("Continuar");
   boton1.setBounds(10, 100, 100, 30);
   boton1.addActionListener(this);
   add(boton1);
   boton1.setEnabled(false);
  }

  public void stateChanged(ChangeEvent e){
   if(check1.isSelected() == true){
   boton1.setEnabled(true);
   } else {
    boton1.setEnabled(false);
   }
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    System.exit(0);
   }
  }
  public static void main(String args[]){
   Termino interfaz = new Termino();   
   interfaz.setBounds(0, 0, 300, 200);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}