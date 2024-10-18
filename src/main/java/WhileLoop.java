/* Los bucles while (while loop) nos permiten realizar una accion de forma repetida, cuando no sabemos el numero de
   veces que vamos a realizar dicha accion.
   Ejemplo: Quieres recibir notificaciones en tu movil mientras el usuario esta con internet vamos a recibir
   notificaciones. En este caso, usamos el bucle while. Mientras el usuario esta con internet recibira notificaciones.
   Todo esto sin saber cuando el usuario se desconectara del internet. Ademas, en los bucles while a diferencia de los
   bucles for no lleva contador aunque podamos emplearlo. */

public class WhileLoop {
    public static void main(String[] args){

        /* Ejemplo 1: bucle while "is raining" infinito

              boolean isRaining = true;

              while(isRaining){

            - while(isRaining) -> se traduce a "mientas (esta lloviendo)" lo de dentro del parentesis es una
              "condicion", normalmente siempre necesitamos una con esta estructura de control, por lo tanto,
               debemos inicializar la mayoria de las veces un boolean como hemos hecho al principio
               (boolean isRaining = true;).

               System.out.println("Is raining");

            - El resultado de  while(isRaining){  System.out.println("Is raining"); } -> seria infinito ya que
              la condicion es "true" (hay que tener cuidado porque se nos peta el ordenador en el run ya que no pararia
              de salir en el terminal "is raining"), si fuera "false" directamente no sale nada despues de hacer el run.
            */

        double vehicleSpeed = 0.0;
        double speedLimit = 100.0;

        while(vehicleSpeed < speedLimit){

            /* while(vehicleSpeed < speedLimit) -> Estamos diciendo que mientras (0.0 sea menor que 100.0). */

            vehicleSpeed += 12.5;

            /* Y vehicleSpeed += 12.5; -> estamos sumando la velocidad del vehiculo 12.5 generando asi 8 vueltas
               hasta que llegue al resultado esperado que es que sea igual a 100.0 */

            System.out.println("The speed of the vehicle is: "+vehicleSpeed);

            /* Por tanto el resultado es sumar 12.5 ya que comenzamos desde (0+12,5 que es igual a 12,5 "vuelta 0") y
               las otras 7 vueltas se generan porque el resultado alcanzar es 100.0 que es la velocidad limite.

               En el terminal veremos este resultado: "The speed of the vehicle is: 12.5" (vuelta "0"),
               "The speed of the vehicle is: 25.0" (vuelta "1"), "The speed of the vehicle is: 37.5" (vuelta "2"),
               "The speed of the vehicle is: 50.0" (vuelta "3"), "The speed of the vehicle is: 62.5"(vuelta "4"),
               "The speed of the vehicle is: 75.0" (vuelta "5"), "The speed of the vehicle is: 87.5" (vuelta "6"),
               "The speed of the vehicle is: 100.0"(vuelta "7").  */

            /* En este caso, esto con un "bucle for" se puede hacer pero sin embargo, lo mas efectivo es que siempre
               que tengas una condicion utilices el "bucle while". Ejemplo de solo while: mientras que un boton
               no sea pulsado que se ejecute una funcion.
               En cambio, los "bucles for" utilizalos mas cuando dependan de tamaños o elementos, o cosas asi. */

            }
        }
    }
    /*  */

