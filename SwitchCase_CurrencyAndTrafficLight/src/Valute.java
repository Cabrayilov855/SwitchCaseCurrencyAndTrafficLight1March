import java.util.Scanner;

public class Valute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valyuta adını daxil edin \n AZN\n USD \n EUR");
        String currency = sc.nextLine();
        System.out.println("Çevirmək istədiyiniz valyuta daxil edin : ");
        String convertCurrency = sc.next();
        System.out.println("Məbləği daxil edin");
        double amount = sc.nextInt();

        switch (currency) {
            case "AZN", "azn":
                switch (convertCurrency) {
                    case "USD", "usd":
                        System.out.println(amount = amount * 0.59);
                        break;
                    case "EUR", "eur":
                        System.out.println(amount = amount * 0.55);
                        break;
                }
                break;
            case "USD", "usd":
                switch (convertCurrency) {
                    case "AZN", "azn":
                        System.out.println(amount = amount * 1.7);
                        break;
                    case "EUR", "eur":
                        System.out.println(amount = amount * 0.93);
                        break;
                }
                break;
            case "EUR", "eur":
                switch (convertCurrency) {
                    case "USD", "usd":
                        System.out.println(amount = amount * 1.07);
                        break;
                    case "AZN", "azn":
                        System.out.println(amount = amount * 1.83);
                        break;
                }
                break;
        }

    }
}
