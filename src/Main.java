public class Main {
    public static void main(String[] args) {

        int ticket_cost = 1000; // стоимость билета
        int bonus_rate = 20; // количество рублей для одной бонусной мили
        int bonus_miles = ticket_cost / bonus_rate; // количество бонусных миль

        System.out.println(bonus_miles + " бонусных миль");

    }
}
