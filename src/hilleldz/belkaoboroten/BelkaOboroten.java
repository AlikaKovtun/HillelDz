package hilleldz.belkaoboroten;

import java.io.*;

public class BelkaOboroten {

    public static void main(String[] args) throws IOException {

        //Записываем весь журнал Жака в двумерный массив
        File file = new File("/Users/alika/Desktop/Belka/journalEvents_ru.csv");
        String[][] journal = new String[90][5];
        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null) {
            journal[i++] = st.split(",");
        }

        //Записываем в журнал events все уникальный события
        String[] events = unicElements(journal);

        double[] correlation = new double[26];
        int y = 0;

        for (String event : events) {
            int[] tableArray = tableFor(event, journal);
            correlation[y++] = phi(tableArray);
        }
        //Отфильтруем результаты и выведем только корреляцию > 0.1 или < -0.1
        System.out.println("Для корреляции > 0.1 или < -0.1:");
        for (int u = 0; u < events.length; u++) {
            if (correlation[u] > 0.1 || correlation[u] < -0.1) {
                System.out.print(events[u] + " : " + correlation[u]);
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Для нового события:");
        System.out.println("Арахис - зубы : " + phi(tableFor("ел арахис", "чистил зубы", journal)));
    }

    public static String[] unicElements(String[][] journal) {
        String[] events = new String[26];
        int k = 0;
        for (int e = 0; e < journal.length; e++) {
            for (int j = 0; j < journal[e].length; j++) {
                if (journal[e][j].equals("true") || journal[e][j].equals("false")) break;
                boolean isPresent = false;
                for (String s : events) {
                    if (s != null && s.equals(journal[e][j])) {
                        isPresent = true;
                        break;
                    }
                }
                if (!isPresent) events[k++] = journal[e][j];
            }
        }
        return events;
    }

    public static double phi(int[] array) {
        double phi = ((array[3] * array[0]) - (array[2] * array[1])) /
                (Math.sqrt((array[2] + array[3]) * (array[0] + array[1]) * (array[1] + array[3]) * (array[0] + array[2])));

        return phi;
    }

    public static int[] tableFor(String event, String[][] journal) {
        int[] tableArray = new int[4];
        boolean ForT = false;
        boolean isPresent = false;

        for (int e = 0; e < journal.length; e++) {
            for (int j = 0; j < journal[e].length; j++) {
                if (journal[e][j].equals("true")) ForT = true;
                if (journal[e][j].equals(event)) isPresent = true;
            }
            if (ForT == true && isPresent == true) {
                tableArray[3]++;
            } else if (ForT == false && isPresent == false) {
                tableArray[0]++;
            } else if (isPresent == true && ForT == false) {
                tableArray[1]++;
            } else {
                tableArray[2]++;
            }

            ForT = false;
            isPresent = false;
        }
        return tableArray;
    }

    public static int[] tableFor(String event, String event2, String[][] journal) {
        int[] tableArray = new int[4];
        boolean ForT = false;
        boolean isPresent1 = false;
        boolean isPresent2 = false;

        for (int e = 0; e < journal.length; e++) {
            for (int j = 0; j < journal[e].length; j++) {
                if (journal[e][j].equals("true")) ForT = true;
                if (journal[e][j].equals(event)) isPresent1 = true;
                if (journal[e][j].equals(event2)) isPresent2 = true;
            }
            if (ForT == true && isPresent1 == true && isPresent2 == false) {
                tableArray[3]++;
            } else if (ForT == false && isPresent1 == false) {
                tableArray[0]++;
            } else if (ForT == false && isPresent1 == true && isPresent2 == false) {
                tableArray[1]++;
            } else if (ForT == true && isPresent1 == false) {
                tableArray[2]++;
            }

            ForT = false;
            isPresent1 = false;
            isPresent2 = false;
        }
        return tableArray;
    }

}
