import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner inPutDataGlobal = new Scanner(System.in);
        System.out.println("How many numbers should be?");
        int howMany = inPutDataGlobal.nextInt();
        String[] arraStrSize = new String[howMany];
        System.out.println("\n" + "you have selected" + "  " + howMany + "  " + "numbers");
        for (int i = 0; i < arraStrSize.length; i++) {
            System.out.println("Enter the number #" + (i + 1));
            arraStrSize[i] = inPutDataGlobal.next();

        }
        int comparisonValue = 0;
        System.out.println("You have entered following numbers" + "  " + Arrays.toString(arraStrSize));
        for (int i = 0; i < arraStrSize.length; i++) {
            if (arraStrSize[i].matches("[0-9]+")) {
                comparisonValue += 1;

            }


        }
        if (comparisonValue==arraStrSize.length){
            System.out.println("All numbers have correct format");
            int[] arrayOfNums=new int[arraStrSize.length];
            for (int i = 0; i <arraStrSize.length ; i++) {
                arrayOfNums[i] = Integer.parseInt(arraStrSize[i]);

            }
            System.out.println("\n" + "Max and Min values:");
            int minValue =0;
            int maxValue = Integer.MAX_VALUE;
            for (int i = 0; i <arrayOfNums.length ; i++) {
                if (arrayOfNums[i]>minValue){
                    minValue = arrayOfNums[i];
                }
            }
            System.out.println("The smallest number is:" + "   "+ minValue);

            for (int i = 0; i <arrayOfNums.length ; i++) {
                if (arrayOfNums[i]<maxValue){
                 maxValue = arrayOfNums[i];
                }
            }
            System.out.println("The smallest number is:" + "   "+ maxValue);

            System.out.println("\n" + "Even\\Odd list:");
            String evenCounter = "";
            String oddCounter = "";
            for (int i = 0; i <arrayOfNums.length ; i++) {
                if (arrayOfNums[i]%2==0){
                    evenCounter += "  " + arraStrSize[i];
                }

            }
            System.out.println("Even numbers:"+"  "+ evenCounter);

            for (int i = 0; i <arrayOfNums.length ; i++) {
                if (arrayOfNums[i]%2!=0){
                    oddCounter += "  " + arraStrSize[i];
                }


            }
            System.out.println("Odd numbers:"+"   "+ oddCounter);


            System.out.println("\n" + "list of numbers that could be divided by 3 or 9");
            String counterFor3A9 = "";

            for (int i = 0; i <arrayOfNums.length ; i++) {
                if (arrayOfNums[i]%3==0|arrayOfNums[i]%9==0){
                    counterFor3A9 += "  " + arraStrSize[i];
                }

            }
            System.out.println("the numbers are divided by 3 or 9:"+"  "+ counterFor3A9);

            System.out.println("\n" + "list of numbers that could be divided by 5 or 7");
            String counterFor5A7 = "";

            for (int i = 0; i <arrayOfNums.length ; i++) {
                if (arrayOfNums[i]%5==0|arrayOfNums[i]%7==0){
                    counterFor5A7 += "  " + arraStrSize[i];
                }

            }
            System.out.println("the numbers are divided by 5 or 7:"+"  "+ counterFor5A7);
            char[][] chAr = new char[arraStrSize.length][];
            double[] arDouble = new double[arrayOfNums.length];
            String [] newString = new String[arraStrSize.length];
            for (int i = 0; i <arrayOfNums.length ; i++) {
                arDouble[i]=arrayOfNums[i];
            }
            for (int i = 0; i <arraStrSize.length ; i++) {
                newString[i] = Double.toString(arDouble[i]);

            }
            for (int i = 0; i <newString.length ; i++) {
                chAr[i] = newString[i].toCharArray();

            }

            System.out.println("\n" + "The numbers with only unique digits and length of 3 digits except dot and decimal 0");
            String countStR = "";
            for (int i = 0; i <chAr.length ; i++) {

                int counterCh = 0;
            if (chAr[i].length-2==3){

                for (int j = 0; j <chAr[i].length ; j++) {

                        if (newString[i].indexOf(chAr[i][j])==newString[i].lastIndexOf(chAr[i][j])){
                            counterCh += 1;

                        }


                }
                if (counterCh == chAr[i].length){
                    countStR  += "   " +  newString[i];
                }

            }


            }


            System.out.println("List:" +"   "+ countStR);
            char [][] secondCh = new  char[arraStrSize.length][];
            for (int i = 0; i <arraStrSize.length ; i++) {
             secondCh[i] = arraStrSize[i].toCharArray();
            }
            System.out.println("\n"+"List of Happy numbers:");
            String happyNum = "";
            for (int i = 0; i <arrayOfNums.length ; i++) {
                int helper= 0;
                int sumLeftShift = 0;
                int sumRigthShift = 0;

                if (arraStrSize[i].length()%2==0){

                    helper = arraStrSize[i].length()/2;
                    for (int j = 0; j <helper ; j++) {
                       sumLeftShift += Character.getNumericValue(secondCh[i][j]);

                    }
                    for (int k = helper; k <arraStrSize[i].length() ; k++) {
                        sumRigthShift += Character.getNumericValue(secondCh[i][k]);
                    }
                    if (sumLeftShift==sumRigthShift){
                        happyNum += "  " + arraStrSize[i];
                    }
                }

            }
            System.out.println("Happy numbers are" + "   "+ happyNum);
        }

        else System.out.println("One of the numbers has wrong format");
    }
}
