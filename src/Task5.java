//      Ввести строку с клавиатуры.
//        В строке должны содержаться слова,
//        которые могут быть раздельные пробелами или двоеточиями.
//        Необходимо вычислить количество слов в строке,
//        у которых четное количество букв.

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String str = in.nextLine();
        String str = "Many of the designations:used by manufacturers and sellers to distinguish their products are " +
                "claimed as trademarks";
        String[] words = str.split(" |:");
        int cnt = 0;

        for (int i = 0; i < words.length; i ++){
            if (words[i].length() % 2 == 0){
                cnt++;
            }
        }

        System.out.printf("В предложении слов с чётным количеством букв - %d", cnt);
    }
}
