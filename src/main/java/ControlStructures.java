/* Las estructuras de control nos permiten establecer un flujo en nuestra aplicacion, utilizando
   diferentes estructuras como las secuenciales, iterativas/repetitivas o avanzadas. Aqui vemos las secunciales.
   Ejemplo: En youtube tienes la posibilidad de pagar el premium, si lo pagas no tendras anuncios pero si
   no lo pagas si tendras. Eso seria una estructura de control usando if-else. */

public class ControlStructures {

    public static void main(String[] args) {

       /* If -> significa "si", se utiliza como estructura de control.
        Ejemplo: si ocurre x hacemos y. (Si hay un accidente (x) llamaremos a emergencia (y).
        Sera algo que valoraremos como verdadero o falso, es decir, sera boolean. */

        /* Es bueno saber para mejorar el codigo que if (isAdult == true) es lo mismo que
           if (isAdult), es decir, que se da por hecho que es verdad desde inicio. */

        /* Ejemplo 1: si (if) es adulto imprimimos "El usuario es adulto" sino (else) "el usuario
         no es adulto".

         boolean isAdult = false;

         if (isAdult) {
            System.out.println("El usuario es adulto");
         } else {
            System.out.println("El usuario no es adulto");
         }

         - boolean isAdult = false; si ponemos "false" estamos diciendo que el usuario no es adulto,
         es decir, cuando se haga la sentencia del if y el else, se imprimira "El usuario no es adulto".
         Si por el contrario fuera true (verdadero) se pone  donde esta "false" y se imprimiria
         "El usuario es adulto" ya que es verdadero.

         En una aplicacion se haria introduciendo si "es adulto" que lo haria el usuario y una vez
         hecha la sentencia se imprimiria una cosa o la otra dependiendo de lo que haya puesto. */

        //Ejemplo 2: Simulador de préstamos bancarios usando operadores logicos o matematicos

        /* Tipos de operadores:

         - Operadores logicos:
         1. && - AND: nos permite determinar si 2 cosas o 3 son verdaderas todas, si no son verdaderas
                      no se van a ejecutar.
         2. || - OR: nos permite determinar si alguna cosa es verdadera, si una es verdadera el resultado
                     seria verdadero.
         3. ! - NOT: esta es una negacion, es decir, nos permite invertir el valor lógico de una condición.
                    Si algo es verdadero, el operador NOT lo convierte en falso, y si es falso, lo convierte en verdadero.

         - Operadores comparacion:
         1. == - EQUALS: nor permite saber si dos cosas son iguales. Ej: si tenemos 2 usarios que se llaman Arturo
                         y los comparamos, nos dira que es igual.
         2. != - NOT EQUALS: nos permite saber si dos cosas son no son iguales. Ej: si tenemos 2 usarios que se llaman
                            Arturo y Miguel, y los comparamos, nos dira que no es igual.
         3. <, >, <=, >= : nos permite saber si algo es menor, mayor,  menor e igual, o mayor e igual.

         */

        /* Restricciones de nuestro simulador de préstamos:

           Salario anual del usuario es mayor a 100.000 -> le damos el préstamo.
           Salario anual del suario es mayor a 50.000 y  su edad es menor a 30 años -> le damos la mitad.

        */

        /* Paso a paso de como hacerla logica:
        * 1. declaramos las variables. y 2. creamos la sentencia. */

        /* Ejemplo 2 (continuacion): simulador de prestamo usando if, else if, else, && (y), <, >, <=, >=, ||(o),
                                    !(negacion).

        double salaryPerYear = 10_000;
        int age = 35;
        boolean isVip = false;
        boolean hasDebts = false;

        if(salaryPerYear >= 100_000 || isVip) {
            System.out.println("Te damos el prestamo completo");
        } else if (salaryPerYear >= 50_000 && age < 30){
            System.out.println("Te damos la mitad del prestamo");
        } else if (salaryPerYear >= 30_000 && age < 40) {
            System.out.println("Te damos un tercio del prestamo");
        } else if (!hasDebts) {
            System.out.println("Te damos el 10% del prestamo");
        }
        else {
            System.out.println("No te damos el prestamo");
        }

        - La explicacion:

         * Se empieza con la primera sentencia que seria "si el salario es mayor o igual 100.000 o es vip, se le dara
         el prestamo completo".
         * La segunda sentencia que seria "de lo contrario si el salario es mayor o igual 50.000 y la edad es menor
         a 30, se le dara la mitad del prestamo".
         * La tercera sentencia que seria "de lo contrario si el salario es mayor o igual 30.000 y la edad es menor
         a 40, se le dara un tercio del prestamo".
         * La cuarta sentencia que seria "de lo contrario si no tiene deudas, se le dara el 10% del prestamo".
         * La quinta sentencia que seria "sino no se le dara el prestamo".

         El resultado: "Te damos el 10% del prestamo", ya que declarando la variable hemos dicho que hasDebsts es falsa,
         por tanto, no tiene dedudas y las demas varibles y sentencias las cumple.

         */

        /* Ejemplo 3: Impuesto sobre tipos de productos usando Switch.  */
        /* Switch: es como el if else pero solo puede hacer comparaciones de igualdad. El switch lo que hace es
           evaluar el valor que le pasamos (en este caso productType) y dependiendo del valor puede hacer
           unas cosas o otras. */

        /* break: se utiliza obligatoriamente en el caso de switch pero se puede utilizar con bucles o funciones ( el
           el programa no termina sino el contexto en el que nos encontremos), aun asi se recomienda no usar fuera del
           switch. */

        String productType = "HEALTHY";

        switch(productType){
            case"HEALTHY":
                System.out.println("El impuesto es de 5%");
                break;
            case"BEAUTY":
                System.out.println("El impuesto es de 10%");
                break;
            case"ALCOHOL":
                System.out.println("El impuesto es de 20%");
                break;
            default:
                System.out.println("El tipo de producto es desconocido");
        }
        /* El resultado si ponemos "String productType = "HEALTHY";" seria "El impuesto es de 5%". */

        /* En el caso de utilizar if else seria: */

        if(productType.equals("HEALTHY")){
            System.out.println("El impuesto es de 5%");
        } else if (productType.equals("BEAUTY")){
            System.out.println("El impuesto es de 10%");
        } else if (productType.equals("ALCOHOL")){
            System.out.println("El impuesto es de 20%");
        } else {
            System.out.println("El tipo de producto es desconocido");
        }
        /* El resultado es el mismo pero se entiende mucho mejor la logica con el switch y ademas, la optimizacion
           hace que vaya un paco mas rapido. Por eso en estos casos utilizaremos mejor un switch.
           Pero RECUERDA que el switch solo funciona con tipos equals, es decir, que no funciona con operadores de
           <, >, <=, >= . Por tanto, en los otros casos usaremos eL if-else. */


    }
}
