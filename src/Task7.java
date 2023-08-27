//      Пользователь вводит с клавиатуры любую строку.
//        Поменять в исходной строке все большие буквы на маленькие,
//        а маленькие – на большие. Если в строке присутствуют цифры,
//        заменить на символ подчеркивания и вывести результат на консоль.

import java.lang.String;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String str = in.nextLine();
        String str = new String ("MAny of the 6 desIgnations used by 143 manuFacturers and 44 SELLERS " +
                "to distinguish their products are Claimed as traDEmarks");
        String testNumber = new String("1234567890");
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
            for (int j = 0; j < testNumber.length(); j++){
                if (c == testNumber.charAt(j)){
                    chars[i] = '_';
                    break;
                }
            }
        }

        System.out.println(new String(chars));
    }
}
