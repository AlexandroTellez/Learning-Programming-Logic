/* Los arrays de dos dimesiones nos permiten guardar varios elementos de diferentes tipos de variables
dentro de una matriz. Imaginatelo como una tabla de 3 columnas y 3 filas, como un excel. Ejemplo:
columna 1 (String): nombre, columna 2 (String): dirección y columna 3 (Long): telefono.  */

public class ArraysDosDimensiones {

    public static void main(String[]args){

        /* Las matrices de 2 dimensiones son similares a la de una dimensión lo unico que debes
         tener en cuenta que los corchetes se dviden 2: el primero para las filas y el segundo
         para las columnas "[][]".
         Ten en cuenta que en este caso es como un array que guarda mas arrays.

         Ejemplo 1: String myMatrix[][] = {
                {"Pedro", "Madrid"},
                {"Arturo", "Madrid"},
                {"Miguel", "Barcelona"}
        };

            System.out.println(myMatrix[2][1]);

         - De esta forma nos imprime el resultado de la fila 2 (miguel y barcelona) y nos seleciona
         la columna 1 (barcelona) si quisiera que me seleccionara el nombre de miguel en vez de poner
         [1] pondria [0] en el apartado columna.

         - Ejemplo 2: En este otro estoy sustituyendo de la fila 2 y columna 1 "Barcelona" por "Cordoba".

        String myMatrix[][] = {
                {"Pedro", "Madrid"},
                {"Arturo", "Madrid"},
                {"Miguel", "Barcelona"}
        };
        myMatrix[2][1] = "Cordoba";

            System.out.println(myMatrix[2][1]);  */

        /*- Ejemplo 3: creacion de juego de "3 en raya" (el de las x y los circulos en una matriz)
          En esta parte solo hemos añadido la fila 0 y columna 0 poniendo la x para que se viera
          un ejemplo de como se añade la informacion.*/

        char myMatrix[][] = new char [3][3];

            myMatrix[0][0] = 'X';

            System.out.println(myMatrix[2][1]);

        /* Extra: recuerda que todo debes ponerlo  en ingles.  */

    }
}
