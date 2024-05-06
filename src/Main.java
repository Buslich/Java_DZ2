public class Main {
    public static void main(String[] args) {

        // переменная стоимости билета
        double ticketPrice = 14000.0;

        // переменная стоимости рублей для одной мили
        int milescost = 20; //

        // Рассчет количества бонусных миль
        int miles = (int) (ticketPrice / milescost);

        // Вывод результата на экран
        System.out.println("Начислено бонусных миль за купленный билет: " + miles);
    }
}
