public class Promedio{
  public static void main(String args[]){
   int Nota1 = 5;
   int Nota2 = 5;
   int Nota3 = 5;
   int Prom = 0;
   Prom = (Nota1 + Nota2 + Nota3) / 3;
   
   if(Prom >= 6){
     System.out.println("Has Aprobado con un promedio de: " + Prom);
   } else {
       System.out.println("Has Desaprobado con un promedio de: " + Prom);
     }
 }
}