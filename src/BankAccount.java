public class BankAccount {
    public static void main(String[] args) {
        float bank_total = 2175.37f;
        bank_total -= 302.50;
        bank_total += 50.03;
        bank_total = (bank_total/2) + 20;
        bank_total--;
        bank_total *= 2;
        bank_total++;

        // I couldn't think of another way to do it so i just used printf
        System.out.printf("%.2f", bank_total);
        System.out.println();
    }
}
