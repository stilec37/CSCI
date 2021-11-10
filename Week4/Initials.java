package Week4;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //call it "in" or "keyboard"

        System.out.println("Enter your First Name");
        String first = in.next();
        System.out.println("Enter your SO First name");
        String second = in.next();
        // HELLO WORLD
        // 012345678910
        // spaces count as well

        // compute initials
        String initials = first.substring(0, 1) + " & " + second.substring(0, 1)+ "<3";
        System.out.println(initials);
        // sub means one specific part of something
        
    }
}
