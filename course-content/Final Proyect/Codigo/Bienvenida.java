import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Bienvenida extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4;
  private JButton boton1;
  private JTextField field1;
  public static String texto = "";

  public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255, 0, 0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   label1 = new JLabel(imagen);
   label1.setBounds(50, 13, 250, 150);
   add(label1);

   label2 = new JLabel("Sistema de Control Vacacional"); 
   label2.setBounds(35,137,300,30);
   label2.setFont(new Font("Arial", 3, 19));
   label2.setForeground(new Color(255, 255, 255));
   add(label2);

   label3 = new JLabel("Ingrese usuario:");
   label3.setBounds(50, 215, 150, 25);
   label3.setFont(new Font("Arial", 1, 13));
   label3.setForeground(new Color(255, 255, 255));
   add(label3);

   label4 = new JLabel("©2017 The Coca-Cola Company.");
   label4.setBounds(85,370,230,30);
   label4.setFont(new Font("Arial", 0, 12));
   label4.setForeground(new Color(255, 255, 255));
   add(label4);
    
   field1 = new JTextField();
   field1.setBounds(45,240,250,26);
   field1.setBackground(new Color(224, 224, 224));
   field1.setFont(new Font("Arial", 1, 14));
   field1.setForeground(new Color(255, 0, 0));
   add(field1);
   
   boton1 = new JButton("Ingresar");
   boton1.setBounds(120,280,100,30);
   boton1.setFont(new Font("Arial", 1, 15));
   boton1.setForeground(new Color(255, 0, 0));
   boton1.setBackground(new Color(255, 255, 255));
   boton1.addActionListener(this);
   add(boton1);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
       texto = field1.getText().trim();
       if(texto.equals("")){
         JOptionPane.showMessageDialog(null, "Debe ingresar su nombre");
       } else {
         Licencia interfaz2 = new Licencia();
         interfaz2.setBounds(0, 0, 600, 360);
         interfaz2.setVisible(true);
         interfaz2.setResizable(false);
         interfaz2.setLocationRelativeTo(null);  
         this.setVisible(false); 
       }

    }
  }

  public static void main(String args[]){
    Bienvenida interfaz1 = new Bienvenida();
    interfaz1.setBounds(0, 0, 350, 450);
    interfaz1.setVisible(true);
    interfaz1.setResizable(false);
    interfaz1.setLocationRelativeTo(null);
 }
}