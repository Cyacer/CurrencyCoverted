
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            System.out.println("\n\nConversor de Moedas");
            System.out.println("1. Converter USD para EUR");
            System.out.println("2. Converter USD para GBP");
            System.out.println("3. Converter USD para AUD");
            System.out.println("4. Converter USD para CAD");
            System.out.println("5. Converter USD para CHF");
            System.out.println("6. Converter USD para CNY");
            System.out.println("7. Converter USD para BRL");
            System.out.println("8. Converter USD para JPY");
            System.out.println("9. Ver Historico de Conversoes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opçao: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 9) {
                converter.printHistory();
                continue;
            }

            System.out.print("Digite o valor em USD: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    converter.convert("USD", "EUR", amount);
                    break;
                case 2:
                    converter.convert("USD", "GBP", amount);
                    break;
                case 3:
                    converter.convert("USD", "AUD", amount);
                    break;
                case 4:
                    converter.convert("USD", "CAD", amount);
                    break;
                case 5:
                    converter.convert("USD", "CHF", amount);
                    break;
                case 6:
                    converter.convert("USD", "CNY", amount);
                    break;
                case 7:
                    converter.convert("USD", "BRL", amount);
                    break;
                case 8:
                    converter.convert("USD", "JPY", amount);
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }

        scanner.close();
    }
}
