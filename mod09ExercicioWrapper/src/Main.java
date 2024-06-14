import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsiusPrimitive = scanner.nextDouble();

        Double celsiusWrapper = Double.valueOf(celsiusPrimitive);

        Temperature temperature = new Temperature(celsiusPrimitive);

        Double fahrenheit = temperature.convertToFahrenheit();
        System.out.println(celsiusWrapper + " graus Celsius " + " Equivale a " + fahrenheit + " graus Fahrenheit");

        scanner.close();
    }

}