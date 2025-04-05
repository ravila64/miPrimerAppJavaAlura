import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to SCREEN MATCH");
        System.out.println("pelicula : Matriz");
        int fechaLanzamiento = 1999;
        boolean planIncliudo= true;
        double notaPelicula=8.2;
        double media = (8.2 + 6.0 + 9.0)/3;
        DecimalFormat df = new DecimalFormat("#.##");
        String resultado = df.format(media);
        System.out.println("Fecha de lanzamiento "+fechaLanzamiento);
        System.out.println("Media "+media);
        System.out.println("Media "+Math.round(media));
        System.out.println("Media "+resultado);

      }
}