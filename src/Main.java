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
        if(Objects.equals(s, ss)){
            return true;
        }
        if(s.isEmpty()){
            return false;
        }
        else{
            return isReverse(s.substring(1) + s.charAt(0), ss);

        }
    }




    public static void main(String[] args) {
        //System.out.println(repeatNTimes("I must study recursion until it makes sense", 100));
        System.out.println(isReverse("fad","daf"));

    }
}