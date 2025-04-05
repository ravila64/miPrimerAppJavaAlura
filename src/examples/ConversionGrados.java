package examples;

public class ConversionGrados {
    public static void main(String[] args) {
        float celsius = 30;
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Grados celsius "+celsius);
        System.out.println("Grados fahrenheit "+fahrenheit);
        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", celsius, fahrenheit);
        System.out.println(mensaje);
        int tempCelsius = (int) celsius;
        int tempFahrenheit = (int) fahrenheit;
        System.out.println("Temperatura fahrenheit entera "+tempFahrenheit);
        System.out.println("Temperatura celsius entera "+tempCelsius);

    }
}
