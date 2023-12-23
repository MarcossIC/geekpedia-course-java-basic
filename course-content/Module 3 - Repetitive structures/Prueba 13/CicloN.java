public class CicloN{
  public static void main(String args[]){
   System.out.println(" Serie con for: ");
   for(int i = 1; i <=10; i++){
     System.out.print(i);
     if(i<=9){
       System.out.print(", ");
     }
   }
   int i = 1;
   System.out.println("");
   System.out.println(" Serie con while: ");
   while(i <= 10){
     System.out.print(i);
     if(i<=9){
       System.out.print(", ");
     }
     i = i + 1;
   }
   i = 1;
   System.out.println("");
   System.out.println(" Serie con Do-while: ");
   do{
     System.out.print(i);
     if(i<=9){
       System.out.print(", ");
     }
     i++;
   }while(i <= 10 );
 }
}