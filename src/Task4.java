import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner inPass = new Scanner(System.in);
        System.out.println("Enter your Password");
        String pass = inPass.next();
        if (pass.equals("123")){
            System.out.println("\n"+ "The Password is correct");
        }
        else System.out.println("\n"+"The Password is wrong");
    }
}
