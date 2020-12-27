package hilleldz.dz13;

public class MainPrinter {

    public static void main(String[] args) {

        Printer printer1 = new Printer(true);
        printer1.printPages(100);
        printer1.printerInfo();
        printer1.tonerRefill(120);
        printer1.tonerRefill(14);
        printer1.tonerRefill(1);

        System.out.println();


        Printer printer2 = new Printer(false);
        printer2.printPages(100);
        printer2.printerInfo();
        printer2.tonerRefill(0.5);
        printer2.printerInfo();


    }
}
