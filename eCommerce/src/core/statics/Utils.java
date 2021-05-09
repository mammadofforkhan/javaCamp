package core.statics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public  static boolean passwordValidate(String data){
if (data.length()<6) { return false; }else{ return  true;
}
    }
    public  static boolean nameValidate(String data){
        if (data.length()<2) { return false; }else{ return  true;
        }
    }
    public  static boolean surNameValidate(String data){
        if (data.length()<2) { return false; }else{ return  true;
        }
    }
    public  static boolean EmailValidate(String data){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(data);
        System.out.println(data +" : "+ matcher.matches());
        return matcher.matches();
    }



}
