package hilleldz.dz6;

public class NumberGeneration {
    public static void main(String[] args) {
        int number = (int)( Math.random() * 6 + 1);
        System.out.println(number);

        switch (number) {
            case 1:
                System.out.println("Передвинтесь на один шаг вперед - это " + isEvenNumber(isEvenNumber(number)));
                break;
            case 2:
                System.out.println("Передвинтесь на два шага вперед - это " + isEvenNumber(isEvenNumber(number)));
                break;
            case 3:
                System.out.println("Передвинтесь на три шага вперед - это " + isEvenNumber(isEvenNumber(number)));
                break;
            case 4:
                System.out.println("Передвинтесь на четыре шага вперед - это " + isEvenNumber(isEvenNumber(number)));
                break;
            case 5:
                System.out.println("Передвинтесь на пять шагов вперед - это " + isEvenNumber(isEvenNumber(number)));
                break;
            case 6:
                System.out.println("Передвинтесь на шесть шагов вперед - это " + isEvenNumber(isEvenNumber(number)));
                break;

        }
    }

    public static boolean isEvenNumber(int number) {
        double ostatok = number%2;
        return ostatok==0? true : false;


    }

    public static String isEvenNumber(boolean b) {
        return (b) ? "четное число" : "нечетное число";

    }
}
