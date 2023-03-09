
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//regex sample
/*
[abc]	Find one character from the options between the brackets
[^abc]	Find one character NOT between the brackets
[0-9]	Find one character from the range 0 to 9

|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	Find just one instance of any character
^	Finds a match as the beginning of a string as in: ^Hello
$	Finds a match at the end of the string as in: World$
\d	Find a digit
\s	Find a whitespace character

n+	Matches any string that contains at least one n
n*	Matches any string that contains zero or more occurrences of n
n?	Matches any string that contains zero or one occurrences of n
n{x}	Matches any string that contains a sequence of X n's
n{x,y}	Matches any string that contains a sequence of X to Y n's
n{x,}	Matches any string that contains a sequence of at least X n's

 */
public class MyCala implements ICala {

    public MyCala() {
    }

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        String check_pattern;

        for (int i = 0; i < t.size(); i++) {
            String tmp = t.get(i).getOwner().substring(1, 2);
            if (tmp.matches("\\d")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
       int maxInList = findMaxPrice(t);
        for(int i = 1; i < t.size(); i++) {
            if(maxInList == t.get(i).getPrice()){
                t.remove(t.get(i));
                break;
            }
        }
        
    }

    @Override
    public void f3(List<Cala> t) {
       Collections.sort(t, Comparator.comparing(Cala 
               -> Cala.getOwner().substring(1, 2)));
       //so sánh từ bé đến lớn
    }

    public int findMaxPrice(List<Cala> t) {
        int maxPrice = 0;
        for (Cala x : t) {
            if (x.getPrice() > maxPrice)
                maxPrice = x.getPrice();  
        }
        return maxPrice;
    }
    
 
}
