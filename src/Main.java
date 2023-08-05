// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int amount = 200; // начальный счет;
        int addamount = 1620; // сумма пополнения счета;
        int bonus = 1; // 1 бонусный рубль за каждые 100 рублей;
        if (addamount > 1000) {
            System.out.println("Итоговый счет:");
            System.out.println(amount + addamount + (addamount / 100) + " рублей");

            System.out.println("Количество бонусных рублей:");
            System.out.println((addamount / 100) + " бонусных рубля(ей)");
        } else {
            System.out.println("Итоговый счет:");
            System.out.println((amount + addamount + " рублей"));
            System.out.println("Бонусы не начисляются:");
            // Итоговый счет: 1523 //
            // Количество бонусных рублей: 3 //

        }
    }


}