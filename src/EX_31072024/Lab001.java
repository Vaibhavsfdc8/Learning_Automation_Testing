package EX_31072024;
import java.util.Scanner;

public class Lab001 {
    public void Test(){
        System.out.println("Green");
    }
    public static void main(String[] args) {

        System.out.println("MY First Program");
        Lab001 l1= new Lab001();
        l1.Test();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
