import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = -0;
        double media = 0;
        int cantidad = 0;
        while (nota != -1) {
            System.out.print("Nota pelicula MATRIX-->[Salir con -1, en nota] ");
            nota = teclado.nextDouble();
            if (nota != -1) {
                cantidad++;
                media = media + nota;
            }
        }
        System.out.println("");
        double res = media / cantidad;
        String salida = """
                Media de la notas de MATRIX %.2f
                media %.2f
                cantidad %d
                """.formatted(res, media, cantidad);
        System.out.println(salida);
    }
}
