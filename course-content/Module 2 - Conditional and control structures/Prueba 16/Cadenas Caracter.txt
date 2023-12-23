import java.util.Scanner;

public class Caracter{
  public static void main(String args[]){
  Scanner ing = new Scanner(System.in);
  String nombre1 = "", nombre2 = "";

  System.out.print("Ingrese un primer nombre: ");
  nombre1 = ing.nextLine();
  System.out.print("Ingrese un segundo nombre: ");
  nombre2 = ing.nextLine();

  if(nombre1.equalsIgnoreCase(nombre2)){
   System.out.println("Los nombres son iguales");
  }else if(nombre1 != nombre2){
   System.out.println("Los nombres son diferentes");
  }

 }
}