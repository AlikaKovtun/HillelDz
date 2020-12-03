package hilleldz.dz6;

public class BodyMassIndex {
    public static double calculateBodyMassIndex(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }

    public static String interpretation(double bmi) {
        if (bmi < 16) {
            return "выраженный дефицит массы тела";
        } else if (bmi >= 16 && bmi < 18.5) {
            return "недостаточная (дефицит) масса тела";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "норма";
        } else if (bmi >= 25 && bmi < 30) {
            return "избыточная масса тела (предожирение)";
        } else if (bmi >= 30 && bmi < 35) {
            return "ожирение";
        } else if (bmi >= 35 && bmi < 40) {
            return "ожирение резкое";
        } else
            return "очень резкое ожирение";
    }

    public static void printResult(String name, double weight, double height, double bmi) {
        String diagnoz = interpretation(bmi);

        System.out.printf(name + ", при Вашем росте " + height + " м и весе " + weight + " кг Ваш индекс массы тела" +
                " составляет %.2f", bmi);
        System.out.printf(" кг/м" + (char)178 + ", и это " + diagnoz + ".");
    }
}
