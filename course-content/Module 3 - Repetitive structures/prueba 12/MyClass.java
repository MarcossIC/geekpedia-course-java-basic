public class MyClass {
        public static void main(String args[]) {
            boolean x = true;
            int c = 9;
            do{

                c++;
                x = c==10;

            } while (!x );
            System.out.println("do while: "+c);
            // Si suma por lo menos 1
            c = 9;
            x = true;

            while( !x ) {
                c++;
                x = c==10;

            };
            // No entra al ciclo por que primero comprueba. 
            System.out.println("while "+c);


        }
    }