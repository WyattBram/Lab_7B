
import java.util.Scanner;

public class Main {
    //Repeats a string a certin amount of times
    public static String repeatNTimes(String s,int i){
        if(i == 1){
            return  s;
        }
        else{
            return s + repeatNTimes(s, i-1);
        }
    }
    //Checks if a string is reversed version of other strin
    public static Boolean isReverse(String s,String ss){
        if (s.isEmpty() && ss.isEmpty()) {
            return true;
        } else if (s.length() != ss.length()) {
            return false;
        }
        if(s.charAt(0) == ss.charAt(ss.length() -1)){
            return isReverse(s.substring(1), ss.substring(0,ss.length()-1));
        }
        else if((s.charAt(0) != ss.charAt(ss.length() -1))){
            return false;
        }
        return true;
    }




    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String one;
        String two;
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));

        System.out.println("Enter the first string: ");
        one = x.nextLine();

        System.out.println("Enter the second string: ");
        two = x.nextLine();

        if(isReverse(one, two)){
            System.out.println(one + " is the reverse of " + two);
        }
        else{
            System.out.println(one + " is not the reverse of " + two);
        }

    }
}