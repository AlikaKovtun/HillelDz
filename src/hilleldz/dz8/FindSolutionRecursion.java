package hilleldz.dz8;

public class FindSolutionRecursion {

    public static void main(String[] args) {
        System.out.println(solutionRecursion(13));

    }

    public static String solutionRecursion(double number) {
        String s = "";
        if (number == 1) return "1";
        else if (number < 1) return null;
        else if (number % 3 == 0)
            return s = solutionRecursion(number / 3) + "*3";

        else
            return s = solutionRecursion(number - 5) + "+5";

    }


}
