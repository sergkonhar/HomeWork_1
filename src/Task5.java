import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers, with commas as the separators");
        Scanner inPutData = new Scanner(System.in);
        String getData = inPutData.next();
        String stringArray [] = getData.split(",");
        int sumValue = 0;
        int mulValue  =1;
        int numArray [] = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            numArray[i] = Integer.parseInt(stringArray[i]);
            System.out.println("one of the particular numbers" + "\t" + numArray[i]);
            sumValue += numArray[i];
            mulValue *= numArray[i];
        }
        System.out.println("Sum of all values in the array" +"\t"+  sumValue);
        System.out.println("Multiplication of all values in the array" +"\t"+  mulValue);

    }

}
