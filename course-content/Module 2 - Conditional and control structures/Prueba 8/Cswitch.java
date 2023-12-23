public class Cswitch{
  public static void main(String args[]){
   
   int Num1 = 3, Num2 = 5, result = 0;
   int parametro = 2;
   
   switch(parametro){
   
    case 1: result = Num1 + Num2;
            System.out.println("El resultado de su suma es: " + result);break; 

    case 2: result = Num1 - Num2;
            System.out.println("El resultado de su resta es: " + result);break; 

    case 3: result = Num1 * Num2;
            System.out.println("El resultado de su multiplicacion: " + result);break; 

    case 4: result = Num1 / Num2;
            System.out.println("El resultado de su division: " + result);break;  

    default: System.out.println("Error, esta opcion no existe");break;
   }

 }
}