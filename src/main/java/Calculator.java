/* Calculator: este es un ejercicio de una calculadora para poder usar lo aprendido con estructuras de control y
funciones. Al no crear un servidor y simplemente hacerlo todo en la clase, vamos a imprimir los resultados de nuestras
operaciones por la consola del terminal.

Como escribimos por consola? con una entrada de datos, en java lo hacemos con la clase "Scanner" y creando una nueva
instancia (instancia es cuando creas un objeto a partir de una clase). Esta clase viene del paquete "java.util.Scanner",
la tendras que importar (normalmente pegas esto "import java.util.Scanner;" arriba de la pagina).
En este ejercicio se desglosara como hacer.
*/

import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        /* Scanner sc = new Scanner(System.in); -> esto sirve para inicializar el obejeto "sc" de la clase "Scanner"
        que enlazando lo con "(System.in), produce que podamos leer dentro de consola. */

        System.out.println("Introduce el primer número");
        double firstNumber = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        double secondNumber = sc.nextDouble();
        System.out.println("Introduce la operación");
        String operation = sc.next();

        /*
        - System.out.println("Introduce el primer número"); -> sirve para imprimir la frase "Introduce el
          primer número".
          sc.nextDouble(); -> sirve para que lo que introduzcamos por consola lo almacene en una variable al querer
          realizar una calculadora, nuestra variable sera "double firstNumber" por los numeros decimales y su respectivo
          nombre de variable, y sera igual a  "sc.nextDouble()" que sginifica como lo leeremos, en este caso con
          "double" los respectivos numeros decimales que pongamos en nuestra calculadora.
        - System.out.println("Introduce el segundo número");  double secondNumber = sc.nextDouble() -> sera el segundo
           numero que utilizaremos para despues poder hacer los calculos unos con otros.
        - System.out.println("Introduce la operación"); String operation = sc.next(); -> es lo que vamos a poner para
          poder especificar nuestra operacion (+,-,*,/).
        */

        double result = doCalculation(firstNumber,secondNumber,operation);

        System.out.println("El resultado de la operación "+operation+" es: "+result);

        /*
        - double result = doCalculation(firstNumber,secondNumber,operation); -> sirve para poner una nueva variable
          "result" gracias al resultado de la funcion "doCalculation" que nos sirve para hacer los calculos
          expuestos en la funcion (+,-,*,/).
        - System.out.println("El resultado de la operación "+operation+" es: "+result); -> imprime el mensaje:
          ("Elm resultado de la operación (el signo que se haya puesto) es (el resultado obtenido del calculo)").


          System.out.println("El primer número recibido es: " + firstNumber);
          System.out.println("El segundo número recibido es: " + secondNumber);
          System.out.println("La operación es: " + operation);

        + (A la que tengamos las funciones esta parte no es necesaria, solo nos servia para entender mejor el ejercicio,
           al princio).
        - System.out.println("El número recibido es: "+firstNumber); -> sirve para imprimir el numero de "firstNumber",
          en la consola del terminal te dejara todo vacio para que puedas introductir tu el numero que deseas. Recuerda,
          el numero en decimal escribelo con coma ",", si no te deja y te sale error prueba con el punto".Ej: 12,3 o 12.3
        - System.out.println("El segundo número recibido es: "+secondNumber); -> lo mismo con el segundo numero.
        - System.out.println("La operación es: "+operation); -> de esta forma en la consola una vez introduzcamos la
          operacion (+,-,*,/) nos saldra ese mensaje ("La operación es:").
        */
    }
        private static double doCalculation(double firstNumber, double secondNumber, String operation){
            switch (operation) {
                case "+" -> {
                    return sum(firstNumber, secondNumber);
                }
                case "-" -> {
                    return minus(firstNumber, secondNumber);
                }
                case "*" -> {
                    return multiply(firstNumber, secondNumber);
                }
                case "/" -> {
                    return divide(firstNumber, secondNumber);
                }
                default -> {
                    throw new IllegalArgumentException("Operación desconocida");
                }
                /*
                 - switch (operation) case "+" -> { return sum(firstNumber, secondNumber); } -> significa que "en el
                   caso de que sea suma ("+") se devolvera ("return") la funcion suma con las varibles (firstNumber,
                   secondNumber) y se hara igual con las demas de abajo (-, *, /).
                 -  default -> {throw new IllegalArgumentException("Operación desconocida"); } -> significa que en el
                    caso de que ningun "case" o ningun valor sea correcto se imprimira "Operación desconocida". Cuando
                    salga un valor incorrecto se lanzara esa excepcion y te aparecera el mensaje en rojo en la consola.
                */
            }

        }

        /*
             -  (otra opcion con if-else):
                 if(operation.equals("+")){
                return sum(firstNumber, secondNumber);
                }
                --- nota: if(operation.equals("+")){ return sum(firstNumber, secondNumber); } -> significa que "si la
                operacion es igual a el signo de "+" entonces devolvera (return) la funcion
                sum(firstNumber, secondNumber); se hara igual con las demas de abajo (-, *, /).

                else if(operation.equals("-")){
                    return minus(firstNumber, secondNumber);
                  }

                else if(operation.equals("*")){
                    return multiply(firstNumber, secondNumber);
                  }

                else if(operation.equals("/")){
                    return divide(firstNumber,secondNumber);
                  }
                else {
                    System.out.println("Operación desconocida");
                     return -1;
                  }
             --- Esto solo es otra forma de hacerlo con if-else pero con el swith te queda mas limpio y mas
                 sintetizado.

             -  System.out.println("Operación desconocida"); return -1; -> Sirve para que cuando no nos de ningun signo
                como el que tenemos en nuestras funciones, devuelva (return) "-1" como resultado.

             -  (otra opcion en vez de System.out.println) throw new IllegalArgumentException("Operación no conocida");
                -> esto es una excepción y se pone cuando queremos crear "excepciones" en este caso, tambien podemos
                utilizar otro "return" por si el signo no es (+) o cualquiera de las otras operaciones que hemos puesto
                (que es lo que hemos realizado).  Entonces, esta excepcion en concreto nor sirve  para cuando no haya
                ninguna de las operaciones de las  funciones que hemos realizado en el programa, lanze un mensaje de
                ("Operación no conocida").
         */

        private static double sum(double firstNumber, double secondNumber){
            return firstNumber + secondNumber;
        }
            /* private static double sum(double firstNumber, double secondNumber) {return firstNumber + secondNumber;}->
               en esta parte lo que hacemos es una "funcion de suma", poniendo las dos variables que hemos creado al
               principio con sus tipos de datos (double firstNumber, double secondNumber) y diciendo en el "return" la
               operacion que deseamos en este caso hemos puesto (+) en medio de las dos variables, si cambiamos el (+)
               y el nombre ("sum") por otra operacion como resta, multiplicacion, division, etc... tambien lo hace
               (lo veremos en las otras funciones).
            */
        private static double minus(double firstNumber, double secondNumber){
            return firstNumber - secondNumber;
        }

        private static double multiply(double firstNumber, double secondNumber){
            return firstNumber * secondNumber;
        }

        private static double divide(double firstNumber, double secondNumber){
            return firstNumber / secondNumber;
        }
}
/*  */