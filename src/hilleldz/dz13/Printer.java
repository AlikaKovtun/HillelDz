package hilleldz.dz13;

public class Printer {

    private double tonerLevel;
    private int printedPages;
    private boolean isDuplex;
    private static final double TONER_MAX_LVL = 100;
    private static final double TONER_PER_PAGE = 0.005;

    // Я считаю, что при создании нового принтера необходимо указывать только дуплексный он или нет,
    // так как напечатанных страниц у него пока ноль, тонер заполнен на максимум, эти параметры задаем по умолчанию

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
        this.printedPages = 0;
        this.tonerLevel = TONER_MAX_LVL;
    }

    // Для уровня тонера нужен только геттер, так как мы не должны иметь возможност просто менять уровень,
    // делать это можно только через метод заправки тонера
    public double getTonerLevel() {
        return tonerLevel;
    }

    // То же самое и с количеством напечатанных страниц, только просматривать, а не задавать количество
    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    // А здесь нужен сеттер, так как я думаю есть возможность установить в принтер новые детали, чтобы он стал дуплексным
    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public void tonerRefill(double level) {
        double tonerNeeded = TONER_MAX_LVL - tonerLevel;
        if (level < 0 || level > TONER_MAX_LVL) System.out.println("Некорректное значение!");
        else if (tonerNeeded == level) {
            tonerLevel = TONER_MAX_LVL;
            System.out.println("Тонер заполнен на максимум!");
        } else if (tonerNeeded < level)
            System.out.println("Слишком много тонера! Для максимального заполнения необходимо " +
                    " заполнить " + tonerNeeded + "% ");
        else if (tonerNeeded > level) {
            tonerLevel += level;
            System.out.println("Тонер заполнен на " + tonerLevel);
        }
    }

    public void printPages(int sheet) {
        if (sheet < 0) {
            System.out.println("Невозможно напечатать отрицательное количество листов!");
            return;
        }
        if (isDuplex) {
            System.out.println("Запуск двусторонней печати...");
            System.out.println("Печать завершена. Напечатано " + sheet * 2 + " страниц на " + sheet + " листах.");
            tonerLevel -= TONER_PER_PAGE * (sheet * 2);
            printedPages += sheet * 2;
        } else {
            System.out.println("Запуск односторонней печати...");
            System.out.println("Печать завершена. Напечатано " + sheet + " страниц на " + sheet + " листах.");
            tonerLevel -= TONER_PER_PAGE * sheet;
            printedPages += sheet;
        }

    }

    public void printerInfo() {
        System.out.println("=============================");
        System.out.println("Информация о текущем принтере:");
        System.out.println("=============================");
        System.out.println("Напечатано страниц: " + printedPages);
        System.out.println("Уровень тонера: " + tonerLevel);
        String s = (isDuplex)? "Принтер дуплексный" : "Принтер односторонний";
        System.out.println(s);
    }
}
