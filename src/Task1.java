import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //tsk1
//        Ввести с клавиатуры строку текста, а затем один символ.
//        Показать на консоль индексы и количество совпадений (ищем вхождения символа в строку).
//        В случае если совпадений не найдено, вывести соответствующий текст.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println("Введите искомый символ");
        char symb = in.next().charAt(0);
        StringBuffer strRes = new StringBuffer();
        int index = 0;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            index = str.indexOf(symb, index + 1);
            if (index == -1){
                break;
            } else {
                strRes.append(index).append(", ");
                cnt++;
            }
        }
        System.out.printf("Индексы: %s\nКоличество: %d", strRes, cnt);

    }
}
