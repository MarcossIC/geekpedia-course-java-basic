public class CicloF{
  public static void main(String args[]){
   int a = 0;
   int i = 1;
   do{
     System.out.print(a);
     a = a + i;
     i = a - i;

     if(i<34){
      System.out.print(", ");
     }

   }while(i<34);
   a = 0;
   i = 1;
   System.out.println("");
   System.out.println("Serie con while: ");
   while( i < 34){
     System.out.print(a);
     a = a + i;
     i = a - i;
     if(i < 34){
      System.out.print(", ");
     }
   } 
   i = 1;
   a = 0;   
   System.out.println("");
   System.out.println("Serie con for: ");
   for(i = 1; i<=21; i=a-i){
     System.out.print(a);
     a = a + i;
     if(i < 21){
       System.out.print(", ");
     }
   }
 } 
}