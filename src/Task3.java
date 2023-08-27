//      Подсчитать среднюю длину слова, во введенном с клавиатуры предложении.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        float averageValue = 0;

        System.out.println("Введите предложение");
        String str = in.nextLine();
        String[] words = str.split(" ");

//        for (int i = 0; i < words.length; i++){
//            if (words[i].endsWith(",") || words[i].endsWith(".") || words[i].endsWith("?") ||words[i].endsWith("!")){
//
//            }
//        }

        for (String word : words) {
            cnt += word.length();
            System.out.println(word);
        }
        averageValue = (float) cnt / (float) words.length;
        System.out.println(cnt);
        System.out.println(words.length);
        System.out.println(averageValue);
    }
}
