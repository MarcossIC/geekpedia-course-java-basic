public class OpVarias{
  public static void main(String args[]){
   
   int operacion = 1;
   int Num1 = 4;
   int Num2 = 2;
   int result = 0;

   if(operacion == 1){
      result = Num1 + Num2;
      System.out.println("El resultado de su Suma es: " + result);
   } else if(operacion == 2){
      result = Num1 - Num2;
      System.out.println("El resultado de su Resta es: " + result); 
   } else if(operacion == 3){
      result = Num1 * Num2;
      System.out.println("El resultado de su Multiplicacion es: " + result);
   } else if(operacion == 4){
      result = Num1 / Num2;
      System.out.println("El resultado de su Division es: " + result);
   } else {
      System.out.println("Esa opcion no existe");
   }
 }
}