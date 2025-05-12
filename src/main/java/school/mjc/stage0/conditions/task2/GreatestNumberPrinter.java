package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        GreatestNumberPrinter printer = new GreatestNumberPrinter();
        printer.printGreatest(4, 5);
        printer.printGreatest(4, 4);
    }
}
