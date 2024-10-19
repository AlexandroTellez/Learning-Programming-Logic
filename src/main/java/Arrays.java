/* Los arrays nos permiten guardar varios elementos de un mismo tipo de variable.
 Ejemplo: guardar un listado de telefonos. */

/* Cuando se utilizan los Arrays? al tener un tamaño fijo se utilizan para acciones que no van a
   cambiar de tamaño, es decir, para acciones fijas. De forma automatica NO puede cambiar de
   tamaño. Ejemplo: En un panel de administración tienes una serie de permisos, esos permisos
   como siempre van a ser los mismos (editar, ver, o compartir),pueden ser Arrays. En codigo seria asi:
   Boolean permisoArturo[] = {true, false, true} -> el primer true es "editar", el falso "ver"
   y el tercer true es "compartir". */

public class Arrays {

    public static void main(String[]args){
        /*  Cuando ponemos la variable "myArray" con "[]" esto ultimo es para meter dentro los indices,
        es decir, ahi dentro podremos guardar una lista de variables.  */

        /* En este caso estamos inicializando un nuevo Array con 3 elementos "[3]"
         Recuerdad, que se empieza desde el 0 a inicializar la lista de variables.

         Ejemplo de Array:

         String myArray[];

         myArray = new String[3];

         myArray[0] = "Arturo";
         myArray[1] = "Miguel";
         myArray[2] = "Juan";

          System.out.println(myArray[1]);

          /* Al poner [1] nos saldra cuando hagamos el "run" el nombre de "Miguel".*/

        /* Otra forma de crear un array.

         Recuerda que si dejamos el valor vacio "[]" podemos poner entreparentesis todas las variables que queramos. */

        String myArray[] = {"Pedro", "Miguel"};
        System.out.println(myArray[0]);

        /* Al poner [0] nos saldra cuando hagamos el "run" el nombre de "Pedro".*/
        /* Recuerda: Si un valor te da "null" significa que no tiene nada, que es una variable con contenido vacio.*/
    }
}
