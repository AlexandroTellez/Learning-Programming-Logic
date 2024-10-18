/* Los bucles for (forLoop) nos permiten realizar una accion de forma repetida, el numero de veces que tu quieras.
   Ejemplo: Quieres borrar todos los contactos de tu agenda de telefono. Imaginate que tienes 50 contactos, en
   vez de borrar individualmente cada uno, realizaras un bucle for que borre 50 veces para eliminar esos
   contactos. Asi, realizas todo de forma optima y ahorrando tiempo. */

public class ForLoop {

    public static void main(String[] args){

        /* for: significa "para" como veremos necesitamos el contado (int i = 0) , se suele poner "i" como valor
           contador como nomenclatura general, si necesitamos mas valores seguiremos por orden algabetico (i, j, k...)

           Ejemplo 1: Basico
            for (int i = 0; i < 10; i++){
                 System.out.println("Hola :"+i);
            }

           -> Ponemos lo primero el "for" que es la estructura de control que utilizaremos, despues dentro del
           parentesis escribiremos lo siguiente: la primera parte "int i = 0;" es el numero de veces que queremos que
           se ejecute, en este caso 0 (una sola vez), Esta variable será usada como contador para controlar cuántas
           veces se ejecuta el bucle.
           La segunda parte "i < 10;" antes de ejecutar cada iteración (vuelta) del bucle, se evalúa esta condición.
           Si la condición es verdadera, el bucle se ejecuta. Si es falsa, el bucle se detiene.
           En este caso, i < 10 significa que el bucle continuará ejecutándose mientras el valor de i sea menor que 10
           (Mientras i sea 0, 1, 2, ..., 9, el bucle se ejecuta. Cuando i llegue a 10, el bucle se detendrá
           porque 10 < 10 es falso).
           Y la tercera parte "i++" Después de que el cuerpo del bucle haya sido ejecutado, se ejecuta esta parte.
           En este caso, i++ es una forma abreviada de decir incrementa el valor de i en 1. Entonces, después de cada
           vuelta del bucle, el valor de i se incrementa de 1 en 1. (Después de que i es 0 en la primera iteración, se
           incrementará a 1 en la siguiente. Luego a 2, 3, y así sucesivamente hasta llegar a 9).
           De bajo la parte de "System.out.println("Hola :"+i);" siginifica que se imprimira hola 10 veces empezando
           desde 0 y al poner "+i" te pondra al lado un contador con las veces que se realiza comenzando desde cero.

           El resultado seria: Hola :0 Hola :1 Hola :2 Hola :3 Hola :4 Hola :5 Hola :6 Hola :7 Hola :8 Hola :9
           Y si quieres empezar contando desde uno simplemente cambias "("Hola :"+i)" por "("Hola :"+(i+1)". Y asi te
           da este resultado: Hola :1 Hola :2 Hola :3 Hola :4 Hola :5 Hola :6 Hola :7 Hola :8 Hola :9 Hola :10
           */

        /* Ejemplo 2: bucle repitiendo el 5, ejecutandose 0 (una vez) y dando 3 vueltas (0,1 y2) incrementadonse ( i++)

          int number = 5;

          for (int i = 0; i < 3; i++) {

          number += number;

          - number = number * number; es lo mismo -> 5 = 5*5, en este caso nos da 25 y eso se repite 3 veces/vueltas
           (0,1 y 2). Y Otra forma acortando seria: number *= number; es lo mismo -> number = number * number;

          System.out.println("El resultado es :"+number);

          El resultado es "El resultado es :25" (vuelta "0"). "El resultado es :625" (vuelta "1") y
          "El resultado es :390625" (vuelta "2"). Asi serian las 3 veces/vueltas.

         */

       /*Ejemplo 3: bucle con arrays que contienen nombres */

        String[] names = {"ARTURO", "PEDRO", "MIGUEL"};

        for (int i = 0; i < names.length; i++) {

            /* " i < names.length; "
             -> siginifica que dara tantas vueltas el bucle como la longitud de los nombres que
                haya en el array. En este caso, el array tiene 3 nombres por lo que dara 3 vuelvas al bucle */

            System.out.println("Los nombres son: "+names[i]);

            /* " ("Los nombres son: "+names[i]) "

             -> siginifica que dira los nombres en este caso al poner la "i"
             ira imprimiendo cada valor. Si quisieramos un valor en concreto por ejemplo Pedro pondriamos "[1]"
             en esa parte.
             El resultado del for seria: "Los nombres son: ARTURO" (vuelta "0"). Los nombres son: PEDRO. (vuelta "1").
             Los nombres son: MIGUEL (vuelta "2").

             En el caso de que en vez de poner "<" ponemos "<=" nos daria un error (ArrayIndexOutOfBoundsException) ya
             que se daria 4 vueltas y solo tenemos 3 nombres. Nos diria que la raiz en este caso "names.length" se
             ha salido del rango.

             */
        }
      }

    }


