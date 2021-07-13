
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroupSplit {
    public static void main(String args[]) {
        String str = "GunaAraman";
        String[] arrOfStr = str.split("A", 2);

        for (String a : arrOfStr)
            System.out.println(a);


        String text = "Hey hello welcome back hello" + " this is hello from hii";
        String ps = "(hello)";
        System.out.println();
        Pattern pattern = Pattern.compile(ps);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
        System.out.println();

        

        String regex = "Guna";
        Pattern patternn
            = pattern.compile(regex);
        String stringToBeMatched= "GunaRaman";
        Matcher matcherr
            = patternn
                  .matcher(stringToBeMatched);
        System.out.println(matcherr.find());
    }
}
