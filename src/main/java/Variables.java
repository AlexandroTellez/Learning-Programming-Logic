/* Las variables nos permiten almacenar información y las utilizamos para resolver nuestros problemas.
   Son cajas donde metemos nuestra información. Es lom que más se utiliza en el programa.  */

public class Variables {

    /* El metodo main es el metodo principal que se necesita para ejecutar nuestra aplicación
    y lo primero que se ejecutara */

    public static void main(String[]args){

        /* System.out.println() sirve para imprimir un texto, es decir, String. */
        /* Ejemplo: System.out.println("Hola, mundo"); */
        /* Recuerda todas las sentencias en Java necesitan un punto y coma ";" al final. */

        /* Para declarar una variable en Java hay que popner primero el tipo de la variable,
        luego se pone el nombre de la variable y ponemos punto y coma o le damos un valor. */

        /* Ejemplo imprimiendo variables(String, char, int, :
        String nombrePersona = "Juan";
            System.out.println( "Hola me llamo "+nombrePersona);
        */

        String nombrePersona = "Juan"; //Se utiliza para texto y recurda poner comilas dobles "".
        char inicialNombre = 'J'; //Se utiliza para letras y recuerda poner comillas simples ''.

        short edad = 25; //Se utiliza para numeros más pequeños (no se utiliza casi)
        int edadPersona = 20; //-2,147,483,648 y el máximo 2,147,483,647 (la que más se utiliza en enteros)
        long numeroTelefono = 65578412; //Se utiliza para numeros grandes.
        double precioEnUsd = 54.40; //Se utiliza para numeros decimales (es el que más se usa y más preciso).
        float precioEnUsd2 = 54.40f; //Se utiliza para numeros decimales (es menos preciso y se utiliza menos).

        boolean esMayorDeEdad = true; //Se utiliza para saber si algo es true o false.

            System.out.println("Hola me llamo "+nombrePersona+" y tengo "+edadPersona+ " años");

    }
}

