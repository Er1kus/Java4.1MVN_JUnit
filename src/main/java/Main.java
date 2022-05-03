public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actual = service.calculate(1_666_666, true);
        long expected = 500;
        System.out.println("OP: " + expected + " ФР: " + actual);

        long actual1 = service.calculate(9999, false);
        long expected1 = 1;
        System.out.println("OP: " + expected1 + " ФР: " + actual1);

    }
}
