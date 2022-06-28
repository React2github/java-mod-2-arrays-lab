
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try(Scanner obj = new Scanner(System.in)) {
        
        String userName[] = {"", "", "", "", "", "", "", "", "", ""};
        int count = 0;
        for(var i=0;i<10; i++) {        
        System.out.print("Enter student's name: ");
        userName[i] = obj.nextLine();
        count = count + 1;
        
        if(count == 10) {
        System.out.println("You printed " + Arrays.toString(userName));
        }
        }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
