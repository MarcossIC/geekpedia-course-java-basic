import java.util.Scanner;

public class CortarC{ 
  public static void main(String args[]){

   Scanner ing = new Scanner(System.in);
   String cadenaO = "", cadenaSub = "";
   int numCaracter = 0, desde = 0, hasta = 0;
   
   System.out.print("Ingrese una cadena de caracteres: ");
   cadenaO = ing.nextLine();
   System.out.println("");
   numCaracter = cadenaO.length();
   System.out.println("La cadena de caracteres " + cadenaO + " posee una cantidad de " + 
                        numCaracter + " caracteres.");
   
   System.out.print("Desde que caracter desea obtener la nueva cadena: ");
   desde = ing.nextInt();
   System.out.print("Hasta que caracter desea obtener la nueva cadena: ");
   hasta = ing.nextInt();
   System.out.println("");
   cadenaSub = cadenaO.substring(desde, hasta);

   System.out.println("La nueva cadena es: " + cadenaSub); 
   System.out.println("La cadena original es: " + cadenaO);


 }
}