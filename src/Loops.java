import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota=0, media=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota pelicula MATRIX");
            nota = teclado.nextDouble();
            media = media + nota;
        }
        System.out.println("Media de la notas de MATRIX "+(media/3));
    }
}
