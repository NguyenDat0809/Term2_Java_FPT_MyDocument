
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 84859
 */
public class MyString implements IString {

    public MyString() {

    }

    public int f1(String str) {
        int count = 0;

        String tmpString[] = str.split(" ");
        for (int i = 0; i < tmpString.length; i++) {
            if (Pattern.matches("(.*)[02468](.*)", tmpString[i])) {
                count++;
            }
        }

        return count;
    }

    public String f2(String str) {
        String bufferString[] = str.split(" "); //slpit inputed
        for (int i = 0; i < bufferString.length; i++) {
            if (checkReverse(bufferString[i])) {
                str = str.replaceAll(bufferString[i], "XX");
            }
        }
        return str;
    }

    public boolean checkReverse(String str) {
        for (int i = 0; i < str.length(); i++) {
            int tmp = (str.length() - i - 1);
            if (str.charAt(i) != str.charAt(tmp)) {
                return false;
            }
        }
        return true;
    }

}
