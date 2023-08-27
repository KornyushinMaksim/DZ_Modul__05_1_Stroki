//      Напишите программу, которая будет печатать ромбовидный рисунок
//        на основе строки, введенной с клавиатуры
//        (максимальная длина – 50 символов).


import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        String str = "testing";
        char[] strChars = str.toCharArray();
        char[] strRes = new char[str.length()];
        Arrays.fill(strRes, ' ');
        StringBuffer strOut = new StringBuffer();
        int cntIndexGeneral = 0;
        int quantityCharsStr = str.length() - 1;
        int cntIndex = 1;

        while (cntIndexGeneral < str.length()) {
            int i = 0;
            for (int j = quantityCharsStr--; i < cntIndexGeneral + 1; j++) {
                strRes[j] = strChars[i++];
            }
            strOut.append(strRes).append("\n");
            cntIndexGeneral++;
        }
        cntIndexGeneral -= 1;
        while (cntIndexGeneral > 0) {
            Arrays.fill(strRes, ' ');
            for (int i = 0, j = cntIndex; i < cntIndexGeneral; i++) {
                strRes[i] = strChars[j++];
            }
            strOut.append(strRes).append("\n");
            cntIndexGeneral--;
            cntIndex++;
        }
        System.out.println(strOut);
    }
}
