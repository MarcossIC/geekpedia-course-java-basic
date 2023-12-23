public class Vector{
  public static void main(String args[]){
   
   int Num[] = new int[5];
   int i = 0;
   Num[0] = 10;
   Num[1] = 20;
   Num[2] = 30;
   Num[3] = 40;
   Num[4] = 50;
   for(i = 0; i < Num.length; i++){
     System.out.println("El valor de la posicion " + i + " es: " + Num[i]);
   }

 }
}