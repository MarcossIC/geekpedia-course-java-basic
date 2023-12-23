import java.util.Scanner;

public class Matrices2{
  public static void main(String args[]){
   
   Scanner ing = new Scanner(System.in);
   int columna = 0, fila = 0, contador = 1;

   System.out.print("Dime cuantas filas desea tener: ");
   fila = ing.nextInt();
   System.out.print("Dime cuantas columnas desea tener: ");
   columna = ing.nextInt();
   
   int num[][] = new int [fila][columna];
   System.out.println("");

   for(int j = 0; j < fila; j++){
     for(int i = 0; i < columna; i++){
       num[j][i] = contador;
       contador++;
       System.out.print("[" + num[j][i] +"]");
     }
       System.out.println("");
   }
 }
}