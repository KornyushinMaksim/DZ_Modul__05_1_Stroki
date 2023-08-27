//      Написать программу, проверяющую является ли одна строка анаграммой
//        для другой строки (строка может состоять из нескольких слов и символов пунктуации).
//        Пробелы и пунктуация должны игнорироваться при анализе.
//        Разница в больших и маленьких буквах должна игнорироваться.
//        Обе строки должны вводиться с клавиатуры. Программа должна выводить Yes,
//        если строки являются анаграммой, и No – иначе.

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        String str1 = "Аз есмь строка, живу я, мерой остр";
        String str2 = "За семь морей ростка я вижу рост";


        String[] wordsStr1 = str1.split(" ");           //разбили на массивы 1 и 2 строчку
        String[] wordsStr2 = str2.split(" ");

        for (int i = 0; i < wordsStr1.length; i++) {

                wordsStr1[i] = wordsStr1[i].trim();            //удалили пробелы в 1 и 2 строчках
                wordsStr2[i] = wordsStr2[i].trim();

            if (wordsStr1[i].endsWith(",")) {               //удаление запятых
                wordsStr1[i] = wordsStr1[i].substring(0, wordsStr1[i].length() - 1);
            }
            if (wordsStr2[i].endsWith(",")) {
                wordsStr2[i] = wordsStr2[i].substring(0, wordsStr2[i].length() - 1);
            }
        }

        String listStr1 = new String();         //переписываем массивы в строки
        String listStr2 = new String();
        for (int i = 0; i < wordsStr1.length; i++){
            listStr1 += wordsStr1[i];
        }
        for (int i = 0; i < wordsStr2.length; i++){
            listStr2 += wordsStr2[i];
        }

        char[] charsStr1 = listStr1.toCharArray();          //перевели в char[]
        char[] charsStr2 = listStr2.toCharArray();

        for (int i = 0; i < charsStr1.length; i++){         //смена регистра на маленький
            if (Character.isUpperCase(charsStr1[i])){
                charsStr1[i] = Character.toLowerCase(listStr1.charAt(i));
            }
        }
        for (int i = 0; i < charsStr2.length; i++){
            if (Character.isUpperCase(charsStr2[i])){
                charsStr2[i] = Character.toLowerCase(str2.charAt(i));
            }
        }

        Arrays.sort(charsStr1);         //сортировка
        Arrays.sort(charsStr2);

        if (Arrays.equals(charsStr1, charsStr2)){       //сравнение двух строк и вывод результата
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
