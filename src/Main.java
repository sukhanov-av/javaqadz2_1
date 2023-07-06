public class Main {

    public static void main(String[] args) {

        int phoneBalance = 50;
        int phonePayment = 1200;

        int bonus;
        if (phonePayment > 1000) {
            bonus = phonePayment / 100;
        } else {
            bonus = 0;
        }
        int balance = phoneBalance + phonePayment + bonus;

        System.out.println("Java-телеком приветствует вас!");
        System.out.println("Ваш счет составляет " + balance + " руб. ");
        System.out.println("Ваш бонус " + bonus + "руб.");
//int percent = isRegistered ? 3 : 1;
    }
}