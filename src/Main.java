public class Main {
    public static void main(String[] args) {

        int cBalance = 100;
        int rAmount = 1001;
        int bonus;
        int balance;
        if (rAmount > 1000) {
            bonus = (rAmount / 100);
            balance = (cBalance + rAmount + bonus);
        } else {
            balance = (cBalance + rAmount);
            bonus = 0;
        }

        System.out.println("Итоговый счёт - " + balance);
        System.out.println("Бонус - " + bonus);
    }
}