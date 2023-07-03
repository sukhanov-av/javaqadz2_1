public class Main {

    public static void main(String[] args) {

        int phonebalance = 50;
        int phonepayment = 1001;

        int bonus;
        if (phonepayment > 1000) {
            bonus = phonepayment / 100;
        } else {
            bonus = 0;
        }
        int balance = phonebalance + phonepayment + bonus;

        System.out.println("Java-телеком приветствует вас!");
        System.out.println("Ваш счет составляет " + balance + " руб. ");
        System.out.println("Ваш бонус " + bonus + "руб.");
//int percent = isRegistered ? 3 : 1;
    }
}