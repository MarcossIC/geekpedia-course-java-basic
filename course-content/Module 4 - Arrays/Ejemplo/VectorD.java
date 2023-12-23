import java.util.Scanner;

public class VectorD{
  public static void main(String args[]){

   Scanner ing = new Scanner(System.in); 
   int long1 = 0;
     
   System.out.print("Cuantos numeros deseas ingresar: ");
   long1 = ing.nextInt();
   System.out.println("");

   int num[] = new int[long1];

   for(int i = 0; i < num.length; i++){
     System.out.print("Ingresa el valor de la posicion " + (i + 1) + ": ");
     num[i] = ing.nextInt(); 
   }

   for(int i = 0; i < num.length; i++){
     System.out.print("[" + num[i] + "]");
   }
 }
}