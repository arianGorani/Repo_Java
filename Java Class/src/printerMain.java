public class printerMain {

    public static void main(String[] args) {

        printerMethods p1 = new printerMethods();

        p1.printerSummary();

        p1.print(10);

        p1.printerSummary();

        p1.print(20, true);

        p1.printerSummary();

        p1.print(15, true);

        p1.printerSummary();

        p1.addToner(-10);
        p1.addPaper(-5);

        p1.printerSummary();

        p1.print(48, true);

        p1.printerSummary();

        p1.addToner(65);
        p1.addPaper(38);

        p1.printerSummary();

        p1.print(80, true);

        p1.print(80);

        p1.printerSummary();

        p1.addToner(30);
        p1.addPaper(20);

        p1.printerSummary();

    }
}
