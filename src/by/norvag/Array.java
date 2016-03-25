package by.norvag;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by norvag on 08.02.2016.
 * Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:
 * Числа, которые делятся на 5 и на 7.
 */
public class Array {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a dimension of the array: ");

        String sDim = reader.readLine();
        int Dim = Integer.parseInt(sDim);

        int[] Array = new int[Dim];

        System.out.println("Enter the array");

        for(int i = 0; i < Array.length; i++) {
            String sNum = reader.readLine();
            int Num = Integer.parseInt(sNum);
            if(Num % 5 == 0 && Num % 7 == 0) {
                Array[i] = Integer.parseInt(sNum);
            }
        }

        System.out.println("After sorting:\n");
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] != 0) {
                System.out.println(Array[i]);
            }
        }
    }
}
