import java.util.Scanner;

public class Ejemplo1{
  public static void main(String args[]){

  Scanner ing = new Scanner(System.in);
  String nombre = "";
  int antiguedad = 0, Clave = 0;

  System.out.println("|*************************************************************|");
  System.out.println("||Hola, bienvenido al sistema vacacional de Coca-Cola Company||");
  System.out.println("|*************************************************************|");
  System.out.println("");
  System.out.println("");

  System.out.println("Cual es el nombre del trabajador?");
  nombre = ing.nextLine();

 System.out.println("Cuanto anios de servicio lleva este trbajador");
  antiguedad = ing.nextInt();

  System.out.println("A que clave pertenece este trabajador");
  System.out.println("1, 2, 3");
  Clave = ing.nextInt();
  System.out.println("");
  System.out.println("");
  if(Clave == 1){
    if(antiguedad == 1){
       System.out.println(nombre + " de la clave 1 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 6 dias de vaciones");
    } else if(antiguedad > 1 && antiguedad <= 6){
       System.out.println(nombre + " de la clave 1 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 14 dias de vaciones");
    } else if(antiguedad >= 7){
       System.out.println(nombre + " de la clave 1 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 20 dias de vaciones");
    } else if(antiguedad < 1) {
       System.out.println("Error, usted no lleva el suficiente tiempo para recibir vacaciones");
    }
  } else if(Clave == 2){
     if(antiguedad == 1){
       System.out.println(nombre + " de la clave 2 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 7 dias de vaciones");
    } else if(antiguedad > 1 && antiguedad <= 6){
       System.out.println(nombre + " de la clave 1 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 15 dias de vaciones");
    } else if(antiguedad >= 7){
       System.out.println(nombre + " de la clave 1 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 22 dias de vaciones");
    } else if(antiguedad < 1){
       System.out.println("Error, usted no lleva el suficiente tiempo para recibir vacaciones");
    }
  } else if(Clave == 3){
     if(antiguedad == 1){
       System.out.println(nombre + " de la clave 3 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 10 dias de vaciones");
    } else if(antiguedad > 1 && antiguedad <= 6){
       System.out.println(nombre + " de la clave 3 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 20 dias de vaciones");
    } else if(antiguedad >= 7){
       System.out.println(nombre + " de la clave 1 tiene " + antiguedad + " anios de antiguadad");
       System.out.println("merece 30 dias de vaciones");
    } else if(antiguedad < 1){
       System.out.println("Error, usted no lleva el suficiente tiempo para recibir vacaciones");
    }
  } else {
     System.out.println("Esa departamento no existe");
  }
  System.out.println("");
  System.out.println("");
  System.out.println("|************************************************************************|");
  System.out.println("||Muchas gracias por utilizar nuestro sistema espero que este satisfecho||");
  System.out.println("|************************************************************************|");
 }
}