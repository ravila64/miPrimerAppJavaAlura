import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre de la pelicula ");
        String pelicula = teclado.nextLine();
        System.out.print("Fecha de lanzamiento ");
        int fechaLanzamiento = teclado.nextInt();
        System.out.print("Nota de la pelicula");
        double nota = teclado.nextDouble();
        System.out.println("");
        String salida = """
                Nombre %s
                Fecha de lanzamiento  %s
                Nota %.2f
                """.formatted(pelicula, fechaLanzamiento, nota);
        System.out.println(salida);
    }
}
