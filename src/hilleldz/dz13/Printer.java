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
        this.tonerLevel = 100.0;
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
    // Стояла задача "Реализовать уменьшение кол-ва тонера при печати листа c одной/двух сторон"
    // На сколько я имею представление о печати принтера, тонер уменьшается одинаково не зависимо от того
    // идет печать с двух сторон или с одной. Разный расход только бумаги. Точно так же и подсчет страниц
    // происходит одинакого, ведь если принтер имеет возможность только односторонней печати, то он не перевочаивает лист,
    // и таким образом не считает пустую страницу в напечатанные. Таким образом отличаться будет только количество
    // напечатанных листов. Тоесть, если у меня есть электронная книга, в которой 100 листов, я запускаю ее на печать
    // то логика работает так, как описано в методе ниже:

    public void printPages(int sheet) {
        if (sheet < 0) {
            System.out.println("Невозможно напечатать отрицательное количество листов!");
            return;
        }
        int pages = sheet * 2;
        printedPages += pages;
        if (isDuplex) {
            System.out.println("Запуск двусторонней печати...");
            System.out.println("Печать завершена. Напечатано " + pages + " страниц, " + sheet + " листов.");
        } else {
            System.out.println("Запуск односторонней печати...");
            System.out.println("Печать завершена. Напечатано " + pages + " страниц, " + sheet * 2 + " листов.");
        }
        tonerLevel -= TONER_PER_PAGE * pages;
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
