package Week8;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLesson {
    // array list can expand and contract if we wantted to. we can add and remove stuff
    // array has a fixed size
    

    public static void main(String[] args) {
        // initialize the Array List with STRING
        ArrayList<String> cars = new ArrayList<String>();
        System.out.println(cars.size());
        // add items to array list
        cars.add("BMW");
        System.out.println(cars.size());
        cars.add("Honda");
        cars.add("Volvo");
        cars.add("Toyota");
        System.out.println(cars.size());
        // print the array list
        System.out.println(cars);
        // array notation is {} and list is []

        // for each loop with array list
        for (String string : cars) {
            System.out.println(string);
        }


        //remove a value
        //crucial for ladder project 3
        cars.size();
        
        // collection class
        // sort is a method within collection
        // sorts alpabetically for strings and numerically with integers
        Collections.sort(cars);
        cars.remove(cars.size()-1);

        System.out.println(cars);

        // string is a non primitive type

        // array list -- make sure you are using objects
        // wrapper classes 
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        int test = 5;

        myNumbers.add(test);
        
        int addValue = 0;

        System.out.println(myNumbers);

        for (Integer i : myNumbers) {
            addValue = addValue + i;
        }
        System.out.println(addValue);

        ArrayList<Character> names = new ArrayList<Character>();

        ArrayList<Double> dollars = new ArrayList<Double>();


    }
}
