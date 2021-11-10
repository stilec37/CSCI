package Week8;
public class AdvancedArrays {
    // Given an Array return true if 9 appears as first or last statement
    // of the array
    // EX. frontEnd([1,3,4,9]) --> true
    // nums[5,6,7,8] = 4 index
    // nums[0,1,2,3]
    public static boolean frontEnd(int[] nums){
        // if(nums[0] == 9 || nums[nums.length - 1] == 9){

        
        // if you have a boolean statement you can put the i statent in the return
        return nums[0] == 9 || nums[nums.length - 1] == 9;
    }
    // given an int arra if there is a 9 followed by a 1 and then a 1 return
    // The police are on their way
    // [2,1,3,9,1,1,2,3,4]
    public static String Call911(int[] nums) {
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == 9 && nums[i+1] == 1){
                if(nums[i+2] == 1){
                    return "The Police are on their way";
                }else if(nums[i+2] != 1){
                    return "Dialing the number";
                }
                break;
            }
        }
        return "Have a good day";
    }

    // Create a method that will reverse a given string
    // TEST
    // TSET

    //without an array
    public static String revString(String str){
        String newString = "";
        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i); // extract each char
            newString = ch + newString;
        }
        return newString;
    }

    // with an array
    public static String newrevString(String str){
        // Create a string buffer Object
        // string buffer is an array list that can get bigger or smaller, a way to store a string but outside the string
        StringBuffer sbr = new StringBuffer(str);
        int p = sbr.length();
        // shows the capacity that the string buffer has
        int q = sbr.capacity();
        sbr.append("What");

        // to.String converts to string 
        String answer = sbr.toString();

        sbr.reverse();
        sbr.setCharAt(2, 't');
        // String answer = sbr.toString();
        return answer;

    }

    // reverse an array
    // use for homework 4
    public static String reverseArray(String str){

        // return if the string is null or empty
        if(str == null || str.equals("")){
            return str;
        }

        // get string length
        int n = str.length();
        // create a character array of the same size as the string length (n)
        // ex
        // hello --> 5
        // [null,null,null,null,null]
        char[] temp = new char[n];
        // fill the char array with the chars from the string
        for(int i = 0; i < n; i++){
            temp[n - i - 1] = str.charAt(i);
        }
        // convert char array to string
        return String.copyValueOf(temp);
    }


    public static void main(String[] args) {
        int [] x = {0,2,3,1};
        System.out.println(frontEnd(x));
        int[] phoneNumber = {2,1,3,9,1,1,3,4};
        System.out.println(Call911(phoneNumber));

        System.out.println(revString("Hello")); 
    
    }
}
