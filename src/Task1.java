import java.math.BigDecimal;
import java.text.BreakIterator;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);

        for (;;) {
            System.out.println("Enter your name , something like this \"John\"");
            String Param = enterName.next();

            if (Param.matches("([А-ЯA-Z]+[а-яa-z]+$)")) {
                System.out.println("Hi"+"  "+Param);
            } else
                System.out.println("I've entered \"Bull Shit\"");
            System.out.println("Do you want to try again? [Y\\N]");
            String Param1  = enterName.next();
            if (Param1.equals("N")){
                break;

            }
            else
                System.out.println("Y've entered a wrong letter or you just want to try this again");



        }

    }

}