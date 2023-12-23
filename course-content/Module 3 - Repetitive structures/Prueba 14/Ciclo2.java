public class Ciclo2{
  public static void main(String args[]){
   int a = 1;
   int i = 99;
   System.out.println("Serie con while: ");
   while(i>=95){
     System.out.print(a);
     if(a<=5){
       System.out.print(", ");
     }
     a = a + 1;
     System.out.print(i);
     i = i - 1; 
     if(i>=95){
       System.out.print(", ");
     }
     }
   a = 1;
   i = 99;
   System.out.println("");
   System.out.println("Serie con for: "); 
   for(i = 99; i>=95; i--){
     System.out.print(a);
      if(a <= 5){
        System.out.print(", "); 
      }
      a = a + 1;
      System.out.print(i);
      if(i > 95){
        System.out.print(", "); 
      }
   }
   a = 1;
   i = 99;
   System.out.println("");
   System.out.println("Serie con Do-while: "); 
   do{
     System.out.print(a);
     if(a<=5){
       System.out.print(", ");
     }
     a = a + 1;
     System.out.print(i);
     i = i - 1; 
     if(i>=95){
       System.out.print(", ");
     }
   }while(i >=95 );
 }
}