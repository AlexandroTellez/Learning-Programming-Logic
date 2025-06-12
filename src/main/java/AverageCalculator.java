/* AverageCalculator: este es un ejercicio de una calculadora estadistica para practicar especialmente los bucles.
   Por tanto, va a consistir en calcular la media de una serie de numeros.

Como escribimos por consola? con una entrada de datos, en java lo hacemos con la clase "Scanner" y creando una nueva
instancia (instancia es cuando creas un objeto a partir de una clase). Esta clase viene del paquete "java.util.Scanner",
la tendras que importar (normalmente pegas esto "import java.util.Scanner;" arriba de la pagina).
En este ejercicio se desglosara como hacer.
*/

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /* Scanner sc = new Scanner(System.in); -> esto sirve para inicializar el obejeto "sc" de la clase "Scanner"
           que enlazando lo con "(System.in), produce que podamos leer dentro de consola y escrbir dentro el numero
           que queremos calcular en nuuestra calculadora. */

        double[] numbers = new double[3];
        /* Aqui inicializamos nuestro array, en este caso de tipo "double" con nombre de la variable "numbers" y
           3 elementos en el array. */

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el número " + (i+1));
            numbers[i] = sc.nextDouble();

            /*
             -  for (int i = 0; i <3; i++) -> sirve para que se cree un bucle en el que se ejecuta una vez
               ("int i = 0") porque cuando ponemos igual a cero la "i" significa que es una vuelta (el 0 es por donde
               se empieza en programacion por eso equivale a 1).
               Despues, seguira ejecutandose hasta que llege a 2 (0,1,2) ya que si llega a 3 en este caso (" i < 3;")
               seria "false" y daria error.
               Continuaria, en esta funcion incrementandose de 1 a 1 ya que ponemos ("i++").

             - ("System.out.println") -> se imprime en pantalla por la funcion  este mensaje: ("Introduce el
               numero ("aqui pondras el numero en consola que deseas") (y "(i+1)" significa que en vez de empezar a
               contar desde el cero, empezara desde el 1 y te lo pondra en columna descendente (1,2,3...)") En consola
               deberia aparecere este mensaje: "Introduce el número 1" y despues igual pero cambiando el 1 por el 2, y
               el 2 por 3 (se acaba en el tres porque es los elementos que hemos puesto en el array).

             -  numbers[i] = sc.nextDouble(); ->  significa que la variable "numbers[i]" equivale a "[i]" que quiere
                decir que el numero "numbers" puede estar en cualquier posicion de "i" (0,1,2) y ("sc.nextDouble()") es
                para  que recoja el valor. Asi se pueda recoger el valor en la consola cuando lo escribamos.
            */

        }
            System.out.println("El resultado de la media es: "+ calculateAverage(numbers));

            /* System.out.println("El resultado de la media es: "+ calculateAverage(numbers)); ->
               Aqui lo que le estamos diciendo es  se imprimira el resultado obtenido de la funcion "calculateAverage"
               y cuando se tenga dicho resultado se imprimira en la consola: El resultado de la media es
               (el numero que sea el resultado de la funcion "calculateAverage").
            */
    }
    /* Como se saca la media de algo? sencillamente, tenemos que sumar todos los numeros de los que queramos sacar la
       media y despues, dividirlo por el numero de elementos que tenemos. Ejemplo: Tenemos un array de (5,3,1) los tres
       elementos que hemos inicializado en nuestro array y queremos sacar la media entre 3 (tres porque son los
       elementos que tenemos): 5+3+1= 9 y despues 9/3 = 3. El resultado de media de los 3 elementos es 3.
    */


    private static double calculateAverage(double[] numbers){
            return sumNumbers(numbers) / numbers.length;
            /* return sumNumbers(numbers) / numbers.length; -> que significa que del resultado de "sumNumbers" la
             funcion donde hemos hecho el for para que todo se sume de forma secuencial hasta llegar al resultado total
             de la suma de los numeros introducidos, en este caso los 3 elementos) y lo dividira entre el numero de
             longitud de elementos que tenemos en la variable "numbers" (el tamaño del array) que al ser un array en
             nuestro caso le hemos puesto solo 3 elementos. Por tanto, se dividira el resultado de la funcion
             "sumNumbers(numbers)" entre 3.
            */
    }
    private static double sumNumbers(double[] numbers) {
        double sum = 0; /* Inicializamos una variable de "sum" para sumar que poniendo lo asi equivale a cero (es lo
                           mismo que si ponemos "double sum;")
                         */

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

            /*
             -  for (int i = 0; i < numbers.length; i++) -> significa que "para va a dar una sola vuelta (0), se
                ejecutara siempre que sea menor a la longitud de la variable "numbers" en este caso hemos puesto 3
                (double[] numbers = new double[3];), por tanto debe ser menor que 3, y que se incremente ("i++").

             -  sum = sum + numbers[i]; (tambien puedes escribirlo asi "sum += numbers[i];") -> lo primero que queremos
                hacer es sumar los 3 numeros que introduzcas. Por tanto, lo que hace es sumar primero, el primer numero
                a modo de secuencia y asi sucesivamente hasta que ha sumado todos. Ejemplo: introducimos el 3 y despues
                el 4 y por ultimo el 5, y seria: 0 = 0 + 3 que esto nos daria igual a un resultado de 3, ya que
                sustituimos la variable "sum" por cero en la primera vuelta (vuelta 0) porque es el valor que le hemos
                dado al principio ("double sum = 0;"), y ahora en la segunda vuelta (vuelta 1) pondriamos el 3 = 3 + 4
                sustituyendo el resultado de la primera vuelta (vuelta 0) por 3 en la variable suma y ahora dandonos un
                resultado de  7. Y con el 5 seria igual solo que finalizando con el resultado final de los tres
                elementos. Por tanto el calculo seria sustitur 7 por "sum" ya que es el resultado del primer calculo y
                realizar ahora el siguiente calculo: 7 = 7 + 5 que es 12, asi tendriamos el resultado
                final que  despues tenemos que divir entre el numero de elementos para sacar el promedio.
            */
        }
        return sum;
    }

}
/*  */