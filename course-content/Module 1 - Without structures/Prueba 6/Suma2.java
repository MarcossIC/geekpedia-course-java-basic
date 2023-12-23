import java.util.Scanner;

public class Suma2{
  public static void main(String args[]){
   Scanner ing = new Scanner(System.in);
   String nombre = "";
   int Num1 = 0, Num2 = 0, result = 0;
   
   System.out.println("Cual es su nombre?");
   nombre = ing.nextLine();
   
   System.out.println("Dame el primer valor para tu suma: ");
   Num1 = ing.nextInt();  
   System.out.println("Dame el segundo valor para tu suma: ");
   Num2 = ing.nextInt();  
   
   result = Num1 + Num2;
   
   System.out.println("Hola " + nombre + " el resultado de su suma es: " + result);
 }
}