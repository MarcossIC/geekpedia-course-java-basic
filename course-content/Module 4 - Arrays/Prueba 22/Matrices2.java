public class Matrices2{
  public static void main(String args[]){
   int contador = 1;
   int num[][] = new int[3][3];
   
   for(int j = 0; j < 3; j++){
     for(int i = 0; i < 3; i++){
       num[j][i] = contador;
       contador++;
       System.out.print("[" + num[j][i] + "]");
     }
     System.out.println("");
   }

 }
}