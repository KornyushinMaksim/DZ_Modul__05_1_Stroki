//      Слова в языке Мумба-Юмба могут состоять только из букв a, b, c, и при этом:
//        ■ никогда не содержат двух букв 'b' подряд;
//        ■ ни в одном слове никогда не встречается три одинаковых подслова подряд.
//        Например, по этому правилу, в язык Мумба-Юмба не могут входить слова 'aaa'
//        (так как три раза подряд содержит подслово 'a'), 'ababab'
//        (так как три раза подряд содержит подслово 'ab'), 'aabcabcabca'
//        (три раза подряд содержит подслово 'abc').
//        Все слова, удовлетворяющие вышеописанным правилам, входят в язык Мумба-Юмба.
//        Напишите программу, которая по данному слову (введеного с клавиатуры)
//        определит, принадлежит ли оно этому языку.

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите слово");
//        String str = in.nextLine();
        String str = "abababcbaca";
        String strTest = "qdertyuiopswfghjklzxvnm";
        StringBuffer strOut = new StringBuffer();
        boolean flagForOut = true;
        boolean flagForConditions = true;
        String strYes = "Это слово из языка Мумба-Юмба\n";
        String strNo = "Слово не является языком Мумба-Юмба\n";

        for (int i = 0; i < str.length(); i++) {                //проверка на наличие других символов кроме 'a','b','c'
            for (int j = 0; j < strTest.length(); j++) {
                if (str.charAt(i) == strTest.charAt(j)) {
                    flagForOut = false;
                    break;
                }
            }
        }

        if (!flagForOut) {
            strOut.append(strNo);
        } else {
            strOut.append(strYes);
            for (int j = 1; j < str.length() - 1; j++) {            //проверка на 'aaa'
                if (str.charAt(j + 1) == str.charAt(j) && str.charAt(j - 1) == str.charAt(j) && flagForConditions) {
                    strOut.replace(0, strOut.length(), strNo);
                    flagForConditions = false;
                }
            }
            for (int i = 0; i < str.length() - 1; i++) {            //проверка 'bb'
                if (str.charAt(i + 1) == str.charAt(i) && flagForConditions) {
                    strOut.replace(0, strOut.length(), strNo);
                    flagForConditions = false;
                }
            }
            for (int i = 0; i < str.length() - 6; i++){             //проверка на 'ababab'
                if (str.charAt(i) == str.charAt(i + 2) && str.charAt(i) == str.charAt(i + 4) &&
                        str.charAt((i + 1)) == str.charAt((i + 1) + 2) && str.charAt((i + 1)) == str.charAt((i + 1) + 4) &&
//                        str.charAt((i + 2)) == str.charAt((i + 2) + 2) && str.charAt((i + 2)) == str.charAt((i + 2) + 4) &&
                        flagForConditions) {
                    strOut.replace(0, strOut.length(), strNo);
                    flagForConditions = false;
                }
            }
            for (int i = 0; i < str.length() - 9; i++){             //проверка на 'abcabcabc'
                if (str.charAt(i) == str.charAt(i + 3) && str.charAt(i) == str.charAt(i + 6) &&
                        str.charAt((i + 1)) == str.charAt((i + 1) + 3) && str.charAt((i + 1)) == str.charAt((i + 1) + 6) &&
                        str.charAt((i + 2)) == str.charAt((i + 2) + 3) && str.charAt((i + 2)) == str.charAt((i + 2) + 6) &&
                        flagForConditions) {
                    strOut.replace(0, strOut.length(), strNo);
                    flagForConditions = false;
                }
            }
            System.out.println(strOut);
        }
    }
}
