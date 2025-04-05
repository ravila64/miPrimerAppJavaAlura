public class Decisiones {
    public static void main(String[] args) {
        int fechaLanzamiento = 1999;
        boolean planIncliudo = true;
        double notaPelicula = 8.2;
        String tipoPlan = "Plus";
        double media = (8.2 + 6.0 + 9.0) / 3;
        if (fechaLanzamiento >= 2022) {
            System.out.println("Pelicula mas poulares");
        } else {
            System.out.println("Pelicula antigua");
        }
        if (planIncliudo || tipoPlan.equals("Plus")) {
            System.out.println("Si esta en plan incluido, disgrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plam");
        }
    }
}
