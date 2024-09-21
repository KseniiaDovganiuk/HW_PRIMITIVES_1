public class Main {
    public static void main(String[] args) {

        int ticketСost = 1000; // стоимость билета
        int bonusRate = 20; // количество рублей для одной бонусной мили
        int bonusMiles = ticketCost / bonusRate; // количество бонусных миль

        System.out.println(bonusMiles + " бонусных миль");

    }
}
