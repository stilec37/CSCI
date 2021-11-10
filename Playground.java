public class Playground {
    public static void main(String[] args) {
        // STRING PLAYGROUND
        String name = "Cailyn";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //This is needed for the homework
        System.out.println(name.replace("a", "T"));

        // METHOD PLAYGROUND
        // METHOD WITH VOID
        // addExclamationPoint(name);
        
        // METHOD WITHOUT VOID (STRING)
        newAddExclamationPoint(name);

        String exclaimName = newAddExclamationPoint (name);
        System.out.println(exclaimName);



        // System.out.println(newAddExclamationPoint(name));
        // Create a friend object
        // Friend newFriend = new Friend();
        //Call my friend name method
        String friendName = Friend.myFriendName();
        System.out.println(friendName);

        // call validateFriend Mthod with the variable name
        // name = Cailyn
        String validateFriend = Friend.validateFriend(name);
        System.out.println(validateFriend);
        System.out.println(Friend.validateFriend("jake"));
        
        Counter count = new Counter();
        //System.out.println(count.getValue());
        //0
        System.out.println(count.getValue());
        //1
        count.click();
        System.out.println(count.getValue());
        //2
        count.click();
        System.out.println(count.getValue());
        count.click();
        count.click();
        count.click();
        System.out.println(count.getValue());
        count.minusClick();
        System.out.println(count.getValue());
        count.reset();
        System.out.println(count.getValue());

 

    }
    // make a void methd
    // make a method
    // method addExclamationPoint
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!" );
        
    }

    // make a method that returns a string
    public static String newAddExclamationPoint(String s) {
        return s + "!";

        
    }
}
