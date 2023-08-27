//      В языке Java принято первое слово, входящее в название переменной,
//        записывать с маленькой латинской буквы. Следующее слово идет с большой буквы
//        (только первая буква слова – большая). Слова не имеют разделителей и
//        состоят только из латинских букв. Например, правильные записи переменных в
//        Java могут выглядеть следующим образом: name, nEERC.
//        В языке C++ для описания переменных используются только маленькие латинские символы и символ «_»,
//        который отделяет непустые слова друг от друга. Если строка имеет смешанный синтаксис,
//        сообщить об этом. Примеры: name, n_e_e_r_c.
//        Вам требуется написать программу, которая преобразует переменную, записанную на одном языке,
//        в формат другого языка. Идентификатор (имя) переменной должен вводится с клавиатуры.
//        Программа должна определить, из какого языка взята переменная, и переделать ее в переменную другого языка.
//        Вывести результат на консоль.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String str = in.nextLine();
        int[] indexArr;
        String str = "java_Identifier_To";
        String strOutLanguege = "";
        String strOut = "";
        int index = 0;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                strOutLanguege = "Это язык С++";
                if (Character.isUpperCase(str.charAt(i + 1))) {
                    strOutLanguege += ". Смешанный тип";
                }
                break;
            } else if (Character.isUpperCase(str.charAt(i))){
                strOutLanguege = "Это язык JAVA";
            }
        }
        System.out.println(str + " - " + strOutLanguege);

        if (strOutLanguege.contains("С++")) {
            for (int i = 0, j = 0; i < str.length(); i++) {         //подсчёт колличества символов "_"
                index = str.indexOf('_', index + 1);
                if (index == -1) {
                    break;
                } else {
                    cnt++;
                }
            }
            indexArr = new int[cnt];          //запись индексов символов "_" в массив
            for (int i = 0, j = 0; i < cnt; i++) {
                index = str.indexOf('_', index + 1);
                indexArr[j++] = index - i;
            }
            strOut = str.replace("_", "");      //удаление из строки символов "_"
            for (int i = 0; i < cnt; i++) {         //перезапись регистров символов в стиле java
                if (Character.isLowerCase(strOut.charAt(indexArr[i]))) {
                    strOut = strOut.substring(0, indexArr[i]) + Character.toUpperCase(strOut.charAt(indexArr[i])) +
                            strOut.substring(indexArr[i] + 1);
                }
            }
        } else if (strOutLanguege.contains("JAVA")) {
            for (int i = 0; i < str.length(); i++){             //подсчёт символов верхнего регистра
                if (Character.isUpperCase(str.charAt(i))){
                    cnt++;
                }
            }
            indexArr = new int[cnt];
            for (int i = 0, j = 0; i < str.length(); i++){      //запись индексов символов верхнего регистра
                if (Character.isUpperCase(str.charAt(i))){
                    indexArr[j] = i + j;
                    j++;
                }
            }
            strOut = str;
            for (int i = 0; i < cnt; i++){
                strOut = strOut.substring(0, indexArr[i]) + "_" + strOut.substring(indexArr[i]);
            }
        }
        System.out.println(strOut);
    }
}
