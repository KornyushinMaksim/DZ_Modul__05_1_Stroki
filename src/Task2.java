//      Написать программу, которая создаст строку,
//        в которой находятся все целые числа, начиная с 1,
//        выписаны в одну строку «123456789101112131415...».
//        Строка должна быть длиной не более 1 000 символов.
//        По числу n (введенного с клавиатуры), выведите цифру
//        на n-й позиции (используется нумерация с 1).

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        StringBuffer strRow = new StringBuffer();
        Scanner in = new Scanner(System.in);
        final int size = 1000;
        int[] arr = new int[size];

        for (int i = 1; i < size; i++){
            arr[i] = i;
            strRow.append(arr[i]);
        }

        System.out.println(strRow);
        System.out.print("Введите номер позиции: ");
        int n = in.nextInt();
        for (int i = 1; i < 1000; i++){
            if (arr[i] == n){
                System.out.println(arr[i]);
            }
        }
    }
}
