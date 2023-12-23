import java.util.Scanner;

public class Secion{
  public static void main(String args[]){
   Scanner ing = new Scanner(System.in);
   String usuario = "", password = "";
   String usuarioG = "", passwordG = "";

   System.out.println("*********************************************");
   System.out.println(" Hola esta es una prueba de inicio de secion");
   System.out.println("*********************************************");
   System.out.println("");
   System.out.println("");

   System.out.println("Primero crea un usuario");

   System.out.println("");
   System.out.print("Dime el nombre de usuario que desea crear: ");
   usuario = ing.nextLine();
   usuarioG = usuario;

   System.out.print("Dime una contrasenia para el usuario: ");
   password = ing.nextLine();
   passwordG = password;
   System.out.println("");

   System.out.println("Su usuario ha sido creado con exito");
   System.out.println("");

   System.out.print("Dime su nombre de usuario: ");
   usuario = ing.nextLine();

   System.out.print("Dime su contrasenia: ");
   password = ing.nextLine();
   System.out.println("");

   if(usuarioG.equals(usuario) && passwordG.equals(password)){
     System.out.println("Inicio de secion correcto");
   } else {
     System.out.println("nombre de usuario o contrasenia incorrectos");
   }
   System.out.println("");
   System.out.println("****************************************");
   System.out.println(" Muchas gracias por probar este sistema");
   System.out.println("****************************************");
 }
} 