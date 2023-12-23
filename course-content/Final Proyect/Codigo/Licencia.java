import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JTextArea area1;
  private JScrollPane scroll1;
  private JCheckBox check1;
  private JButton boton1, boton2;
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida recuperarV = new Bienvenida();
    nombre = recuperarV.texto;

    label1 = new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Arial", 3, 14));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);
    label2.setBounds(315, 135, 300, 300);
    add(label2);

    area1 = new JTextArea();
    area1.setEditable(false);
    area1.setFont(new Font("Arial", 0, 9));
    area1.setText("\n\n          TÉRMINOS Y CONDICIONES");
    scroll1 = new JScrollPane(area1);
    scroll1.setBounds(10, 40, 575, 200);
    add(scroll1);

    check1 = new JCheckBox("Yo " + nombre + " acepto");
    check1.setBounds(10, 250, 300, 30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10, 290, 100, 30);
    boton1.addActionListener(this);
    boton1.setFont(new Font("Arial", 0, 14));
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120, 290, 100, 30);
    boton2.addActionListener(this);
    boton2.setFont(new Font("Arial", 0, 14));
    boton2.setEnabled(true);
    add(boton2);  
  } 

  public void stateChanged(ChangeEvent e){
   if(check1.isSelected() == true){
     boton1.setEnabled(true);
     boton2.setEnabled(false);
   } else {
     boton1.setEnabled(false);
     boton2.setEnabled(true);
   }
  }

  public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){ 
       Principal interfaz3 = new Principal();
       interfaz3.setBounds(0, 0, 650, 550);
       interfaz3.setVisible(true);
       interfaz3.setResizable(false);
       interfaz3.setLocationRelativeTo(null);
       this.setVisible(false);
     }
     if(e.getSource() == boton2){
       Bienvenida interfaz1 = new Bienvenida();
       interfaz1.setBounds(0, 0, 350, 450);
       interfaz1.setVisible(true);
       interfaz1.setResizable(false);
       interfaz1.setLocationRelativeTo(null);
       this.setVisible(false);
     }
  }
  
  public static void main(String args[]){
    Licencia interfaz2 = new Licencia();
    interfaz2.setBounds(0, 0, 600, 360);
    interfaz2.setVisible(true);
    interfaz2.setResizable(false);
    interfaz2.setLocationRelativeTo(null);    

  }
}