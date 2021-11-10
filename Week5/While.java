package Week5;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // while loop - execites a block of code as longas the condition remains true

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String pill = "";

        // create while loop
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = keyboard.nextLine();
        }
        System.out.println("Hello " + name);

        while(!pill.equals("Red")){
            System.out.println("What will your choice be Red or Blue?");
            pill = keyboard.nextLine();
        }
        int i = 1;
        // While loops have 2 different approaches
        // Standard While (See above)
        // Do-While
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        
        
    }
}
