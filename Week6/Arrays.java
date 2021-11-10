package Week6;
import java.util.Scanner;

public class Arrays {
    // arrays are used to store multiple values in a single variable
    public static void main(String[] args) {
        // empty array with nothing in it
        int[] anArray;
        // creating the object and inputting it to memory
        anArray = new int[10];

        // System.out.println(anArray[0]);

        anArray[0] = 100;

        // another way to create an array if we know the values before hand
        int[] shortArray = {
            0,1,2,3,4,5,6,7,8,9
        };

        // foreach loop that is used with arrays
        for (int i : shortArray) {
            System.out.println(i);
        }

        // making an array with strings
        String[] name = {"Appa", "Momo", "Jack"};
        System.out.println(name[0]);

        //without a for each loop
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
        // with foreach loop
        for (String string : name) {
            System.out.println(string);
        }

        //add values to an array
        String[] nameunknown = new String[20];
        nameunknown[0] = "Greg";
        nameunknown[1] = "George";
        nameunknown[2] = "Ryan";
        nameunknown[3] = "Ryan";

        System.out.println(nameunknown[2]);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Word");
        String str = keyboard.next();

        nameunknown[4] = str;

        for (String string : nameunknown) {
            System.out.println(string);
        }

        // char array
        // creat array of string str length
        char[] ch = new char[str.length()];

        // copy char by char into array
        for(int i = 0;i < str.length(); i++){
            ch[i] = str.charAt(i);
        }

        System.out.println(ch);

        for (char c : ch) {
            System.out.println("Char: "+c);
        }

        // 2 dimensional arrays
        // char[][] = new Char [][];
        
        // System.out.println(shortArray[0]);
        

    }

}
