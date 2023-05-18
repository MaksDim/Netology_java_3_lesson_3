public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();
        //тест-кейс 1
        int bonusBelowLimitForRegistered = service.calculate(true, 1000);
        System.out.println("Ваш бонус составляет " + bonusBelowLimitForRegistered + " рублей");
        //тест-кейс 2
        int bonusOverLimitForRegistered = service.calculate(true, 1_000_000);
        System.out.println("Ваш бонус составляет " + bonusOverLimitForRegistered + " рублей");
        //тест-кейс 3
        int bonusBelowLimitForUnregistered = service.calculate(false, 1000);
        System.out.println("Ваш бонус составляет " + bonusBelowLimitForUnregistered + " рублей");
        //тест-кейс 4
        int bonusOverLimitForUnregistered = service.calculate(false, 1_000_000);
        System.out.println("Ваш бонус составляет " + bonusOverLimitForUnregistered + " рублей");

    }
}
