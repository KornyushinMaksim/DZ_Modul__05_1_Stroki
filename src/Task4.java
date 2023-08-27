//      Ввести строку с клавиатуры (латиницей).
//        Из введенной строки выбрать все слова,
//        начинающиеся на гласные буквы и заканчивающиеся на согласные.
//        Вывести отобранные слова на консоль.

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String str = in.nextLine();
        String str = "Many of the designations used by manufacturers and sellers to distinguish their products are " +
                "claimed as trademarks";
        String[] strTest = {"e", "y", "i", "o", "a", "u"};
        String[] strTest2 = {"q","w","r","t","p","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        String[] words = str.split(" |.|,|:|-|");
        String[] tempWords = new String[words.length];
        int cnt = 0;

        for (int i = 0, j = 0; i < words.length; i++) {
            for (int f = 0; f < strTest.length; f++) {
                if (words[i].startsWith(strTest[f])) {
                    for (int g = 0; g < strTest2.length; g++){
                        if (words[i].endsWith(strTest2[g])){
                            tempWords[j++] = words[i];
                            cnt++;
                        }
                    }
                }
            }
        }
        String[] resWord = new String[cnt];
        System.arraycopy(tempWords, 0, resWord, 0, cnt);
        System.out.println(Arrays.toString(resWord));
    }
}
