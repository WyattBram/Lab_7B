import java.util.Objects;

public class Main {

    public static String repeatNTimes(String s,int i){
        if(i == 1){
            return  s + "\n";
        }
        else{
            return s + "\n" + repeatNTimes(s, i-1);
        }
    }

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
        //System.out.println(repeatNTimes("I must study recursion until it makes sense", 100));
        System.out.println(isReverse("",""));

    }
}