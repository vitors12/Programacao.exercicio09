import java.util.Scanner;

public class exercicio09 {
    public static void main (String [] args) {
        double tempFahrenheit, tempCelsius;
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit");
        tempFahrenheit = ler.nextDouble();
        tempCelsius = 5 * ((tempFahrenheit-32) / 9);
        System.out.println("A temperatura em graus Celsius e " + tempCelsius);

}
}
