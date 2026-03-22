 import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== Currency Converter ======");
        System.out.println("Note: Rates are approximate and may vary.\n");

        System.out.println("1. USD (America)");
        System.out.println("2. GBP (UK)");
        System.out.println("3. AUD (Australia)");
        System.out.println("4. NZD (New Zealand)");
        System.out.println("5. CNY (China)");
        System.out.println("6. RUB (Russia)");
        System.out.println("7. CAD (Canada)");
        System.out.println("8. EUR (Germany)");
        System.out.println("9. INR (India)");

        System.out.print("\nSelect FROM currency (1-9): ");
        int from = sc.nextInt();

        System.out.print("Select TO currency (1-9): ");
        int to = sc.nextInt();

        if (from < 1 || from > 9 || to < 1 || to > 9) {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // ✅ Rates based on INR (Indian Rupees)
        double[] rate = {
            83.2,   // USD → INR
            105.0,  // GBP → INR
            54.5,   // AUD → INR
            50.5,   // NZD → INR
            11.5,   // CNY → INR
            0.91,   // RUB → INR
            61.5,   // CAD → INR
            90.0,   // EUR → INR
            1.0     // INR
        };

        String[] currency = {
            "USD", "GBP", "AUD", "NZD", "CNY", "RUB", "CAD", "EUR", "INR"
        };

        // Step 1: Convert FROM → INR
        double inr = amount * rate[from - 1];

        // Step 2: Convert INR → TO
        double result = inr / rate[to - 1];

        System.out.println("\nConverted Amount: " + result + " " + currency[to - 1]);

        sc.close();
    }
}