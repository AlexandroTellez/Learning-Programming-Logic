/* Las funciones (Functions) nos permiten evitar la duplicidad de codigo, es decir, evitar que escribamos el mismo
   codigo varias veces.
   Ejemplo: Imaginate que tienes una aplicacion con usuarios y quieres calcular la edad del usuario porque sabes
   su edad de nacimiento, como lo calculas? -> coges el año en el que estamos y su fecha de nacimiento, realizamos
   una resta y ya sabrias la edad del usuario.
   Pues una funcion sirve para que no tengas que hacer el calculo de la edad todo el rato con cada usuario, y poder
   meter la logica en una funcion y ahorrarte tiempo y ganar optimizacion el programa.
   Otra ventaja que tiene es dar semantica, esto quiere decir, que el codigo se entienda mejor. Ya que si ves en tu
   programa una funcion que se llama "calcularEdadUsuario" ya sabes de que trata simplemente al verlo.
*/

public class Functions {

    /* las funciones se componen de 3 tipos de accesibilidad:

         public: que significa que es acesible a cualquier clase de nuestra aplicacion.

         private: que significa que es acesible solo dentro de la clase en la que se ha creado.Normamente, es para que
         esa funcion solo se utilice dentro de una clase. Se suele utilizar para calculos intermedios.

         protected: que significa que es acesible solo dentro del paquete que ha sido creada. Un buen ejemplo es
         este caso, que estamos dentro del "paquete java" y si pusieramos esa accesibilidad, la funcion solo seria
         acesible para sus clases y subclases dentro de ese paquete (Arrays, ArraysDosDimensiones,ControlStructures,...)
         Por defecto, esta es la accesibilidad que se pone si no señalamos nada en la funcion.

        */

    /* Nuestra funcion cuentan con:

       1. La accesibilidad: public, private y protected.
       2. Tipo de variable (es lo que queremos que nos devuelva): int, double, long, String, etc. Tambien, puede no
       devolver nada en ese caso pondremos "void" que es el que utilizamos cuando queremos que imprima por consola.
       3. Nombre de la funcion.
       4. Parentesis (): que es donde pondriamos dentro los parametros de entrada que quisieramos poner. En el caso, de
       poner "void" al imprimir algo en consola seria los parametros de salida, en vez de entrada.
       5. Llaves {}: que son las que utilizamos para dentro pooner todos los otros datos de la funcion.

    */

    /* Ejemplo 1: Funcion void devolviendo el valor por la consola (terminal local)


    public static void main(String[] args) {

        String myName = "Arturo";
        printMessage(myName,30);

        - Todas las variables que queramos inicializar en nuestra funcion debemos ponerla en main.
    }
         - Importante: para poder imprimir esta funcion, necesitamos que tenga el mismo objeto que la funcion "main"
           que es con la que hacemos el "run" y asi se pueda imprimir por consola. Ademas, tiene que tener dentro de
           la funcion "main" inicializada la variable poniendolo asi:

            public static void main(String[] args) {

                printMessage();
             }

           - Tambien, en vez de poner ("public void printMessage()") debemos poner ("public static void printMessage()").

    public static void printMessage(String personName, int personAge) {

        System.out.println("Hola estoy imprimiendo la funcion y me llamo: "+personName+ " y tengo "+personAge+" años ");
      }
   }

        - (String personName) -> en este caso, especificificamos el tipo que queremos y despues el nombre de la
        variable. No es necesario que "myName" y "personName" se pongan igual porque "my name sirve para especificar
        el nombre de Arturo y "personName" sirve para decir que el String que recibimos de "myName" en esta otra
        funcion se va a llamar "personName". Por eso es importante que el tipo de la variable (en este caso String)
        sea el mismo para que le devuelva el valor sin errores.

        Por tanto, si debajo ponemos("System.out.println("Hola estoy imprimiendo la funcion y me llamo: "+personName);")
        nos imprimira en la consola: "Hola estoy imprimiendo la funcion y me llamo: Arturo".

        Si queremos añadir mas parametros los ponemos primero aqui ("(String personName, int personAge)") y despues,
        ("printMessage(myName,30);"), y por ultimo en ("System.out.println("Hola estoy imprimiendo la funcion y me
        llamo: "+personName+ " y tengo "+personAge+" años ");"), asi el resultado sera:
        ("Hola estoy imprimiendo la funcion y me llamo: Arturo y tengo 30 años").



     */

    /* Ejemplo 2: Funcion String devolviendo un mensaje de una persona y nosotros lo imprimiremos en la consola.

    public static void main(String[] args) {

        String arturoInformation = buildPersonInformation("Arturo",30);
        System.out.println(arturoInformation);

    }

    public static String buildPersonInformation (String personName, int personAge) {
        return ("Hola estoy imprimiendo la funcion y me llamo: "+personName+ " y tengo "+personAge+" años ");

         }

        - En este caso eliminamos el "void" y añadimos el "String" que es el valor que queremos que devuelva,y
           en vez de poner " System.out.println" ponemos "return".

           Tammbien, debes tener en cuenta que debes adaptar la informacion a lo que estas requiriendo ahora por eso
           cambiamos el nombre de la funcion "printMessage" por "buildPersonInformation". Recuerda, que debe ser
           descriptivo y corto (tus colaboradores deben entender la funcion solo viendo el nombre).

           Ademas, debes de modificar la inicializacion en la funcion "main", cambiando "printMessage(myName,30);" por
           "String arturoInformation = buildPersonInformation(myName,30);" y "System.out.println(arturoInformation);"
           con estas dos ultimas le decimos:
           1. "String arturoInformation = buildPersonInformation("Arturo",30);" -> que es tipo String y
            "arturoinformation" es igual a la  funcion de abajo que hemos creado con sus respectivos parametros
           ("public static String buildPersonInformation (String personName, int personAge)").

           2. System.out.println(arturoInformation); -> le decimos que imprima la informacion de "arturoInformation" que
           como lo hemos enlazado al inicializarlo en main con nuestra funcion, nos imprimira el resultado de la funcion
           -> ("Hola estoy imprimiendo la funcion y me llamo: Arturo y tengo 30 años ").

           Ventaja de utilizar una funcion: es que podemos reutilizarla y ahora podriamos utilizar la misma informacion
           para añadir mas personas.
      */

    /* Ejemplo 3: Funcion String devolviendo un mensaje de varias persona y nosotros lo imprimiremos en la consola.
     */
    public static void main(String[] args) {

        String arturoInformation = buildPersonInformation("Arturo",30);
        String miguelInformation = buildPersonInformation("Miguel",30);
        System.out.println(arturoInformation);
        System.out.println(miguelInformation);

        /* añadimos copiando, pegando y modificando a la otra persona y la funcion de "buildPersonInformation"
           funcionara igual para las nuevas personas/usuarios.
        */
    }

    public static String buildPersonInformation (String personName, int personAge) {
        return ("Hola estoy imprimiendo la funcion y me llamo: " + personName + " y tengo " + personAge + " años ");
    }
    /* El resultado esperado en la consola seria:

    ("Hola estoy imprimiendo la funcion y me llamo: Arturo y tengo 30 años")
    ("Hola estoy imprimiendo la funcion y me llamo: Miguel y tengo 30 años ")

    */
}
