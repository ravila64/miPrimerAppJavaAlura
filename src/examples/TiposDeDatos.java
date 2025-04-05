package examples;
//import  java.lang.String;

public class TiposDeDatos {

    public static void main(String[] args) {
    int valor = 10;
    valor += 15;   // se asigna 25
    System.out.println("valor "+valor);

    // example 2
        int num = 5;
        int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado);
        --num;
        System.out.println(num); // imprime 6
        num += 30;
        resultado = -num;
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6
        resultado = --num;
        System.out.println(resultado);
        resultado -= 10; // resultado = resultado - 10;
        System.out.println(resultado);
        // variables tipo texto
        String sinopsis1="Matrix es una paradoja";
        System.out.println("variable {sinopsis} "+sinopsis1);
        String fechaDeLanzamiento = "1999";
        String sinopsis = "Matrix es una paradoja. La mejor película del fin del milenio.";
        sinopsis +=" Fue lanzada en " + fechaDeLanzamiento;
        System.out.println(sinopsis);
        /* esto es un ejemplo de string con textblock */
        String lineas= """
                prueba en varias lineas
                linea 2
                Fue lanzada en : 
                """+fechaDeLanzamiento;
        System.out.println(lineas);
        /* Otro textBlock*/
        String mensaje = """
                  Hola, mundo !
                  Este es un Text Block.
                  El permite escribir textos com múltiples lineas
                sin necesitar usar caracteres de escape o saltos de linea manualmente o concatenaciones.
                  """;
        System.out.println("mensaje:"+mensaje);
        System.out.println("");
        /*Ejemplos del stribg format*/
        String nombre = "Juan";
        int aulas = 4;
        double dolar = 10;
        mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas 
                  dar tu primeros pasos en este lenguaje 
                  con un valor de %.2f dolares""".formatted(nombre, aulas,dolar);

        System.out.println("MENSAJE:"+mensaje);
        System.out.println("");
        /* others examples*/
        nombre = "Maria";
        int edad = 30;
        double valor2 = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor2));
        // probar String.format()
        String str2 = String.format("Nombre es %s, tengo %d años, Gaste %.2f dolares", nombre, edad, valor2);
        System.out.println(str2);
        // casting variables
        int x = 10;
        double y = x; // casting implícito
        System.out.println("valor de x "+x+" valor de y "+y);
        double xx = 10.5;
        int yy = (int) xx; // casting explícito
        System.out.println("valor de xx "+xx+ " Valor de yy "+yy);
        // imprimir el tipo de una variable
        double xy = 10;
        System.out.println(((Object)xy).getClass().getName());
        // casteo de variables
        double p=125420.99;
        int q = (int) p;
        System.out.println("Valor de p "+p+" Valor de q "+q);
        // prueba de luri
        String saludo = "Hola, mi nombre es ";
        String nombre1 = "Alicia ";
        String continuacion = "y mi edad es ";
        int edad1 = 17;
        String mensaje2 = """
               %s %s 
               %s %d años
                """.formatted(saludo,nombre1,continuacion,edad1);
        System.out.println(mensaje2);

    }
}
