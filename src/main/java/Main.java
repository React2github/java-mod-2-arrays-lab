
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)) {
        String userName = "";
        for(var i=0;i<10; i++) {
        System.out.print("Enter student's name: ");
        userName += obj.nextLine() + ", ";
        System.out.println(userName);
        }
        if(userName.length() > 10) {
        System.out.println("You printed " + userName);
        }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
