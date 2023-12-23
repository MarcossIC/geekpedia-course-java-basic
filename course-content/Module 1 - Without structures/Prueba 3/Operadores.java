public class Operadores{
  public static void main(String args[]){
   int Num_1 = 4;  
   int Num_2 = 4;

   float resultado = 0;
   resultado = Num_1 * (Num_1 +  Num_2);
   System.out.println("Su resultado correcto: " + resultado);  

   resultado = Num_1 * Num_1 +  Num_2;
   System.out.println("Su resultado incorrecto: " + resultado);  
 }
}