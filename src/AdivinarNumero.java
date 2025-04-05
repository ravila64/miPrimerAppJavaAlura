import java.util.Random;
import java.util.Scanner;
// Crea un programa que simule un juego de adivinanzas.
// El programa debe generar un número aleatorio entre 0 y 100,
// y pedir al usuario que intente adivinar ese número en un
// máximo de 5 intentos. En cada intento, el programa debe
// informar si el número ingresado por el usuario es mayor
// o menor que el número generado.
public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = -1;
        int veces = 0;
        boolean acerto=false;
        int random = new Random().nextInt(50);
        System.out.println("Numero al azar "+random);
        while (numero != random) {
            System.out.print("Digite numero al azar entre 0 y 100 ");
            numero = teclado.nextInt();
            veces++;
            if (numero == random && veces < 5) {
                System.out.println("Haz adivinado el numero "+numero);
                System.out.println("Numero dado por el computador "+random);
                System.out.println("Adivino en "+veces+" veces !!!");
                acerto=true;
                break;
            }else{
                if (numero > random){
                    System.out.println(numero+" Numero es menor");
                }else{
                    System.out.println(numero+" Numero es mayor");
                }
            }
            if (veces==5 && !acerto){
                System.out.println("No adivino el numero, el numero era: "+random);
                break;
            }
        }
    }
}
