import java.util.regex.*;

public class RegexTest {

    public static void main(String args[]) {
        String pattern = "[a-z]+";
String text = "Now is the time";
Pattern p = Pattern.compile(pattern);
Matcher m = p.matcher(text);
while (m.find()) {
System.out.print(text.substring (m.start(),
m.end()) + "*");

}

}

=============================================
//Implementing matches() method
import java.util.regex .*;

public class Regex {
    public static void main(String[] arg) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        if (m.matches())
            System.out.println(m.start() + "" + m.end() + "" + m.group());
    }
}

===================================================
// Implementing matches() method
import java.util.regex.*;

public class Regex

{public static void main(String[] arg)
{

Pattern p = Pattern.compile("a*b");
Matcher m = p.matcher("aaaaab");
if(m.matches())
System.out.println(m.start()+""+m.end()+""+m.group());
}
}

==============================================
// Implementing lookingAt() method
import java.util.regex .*;

public class Regex {
    public static void main(String[] arg) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("b aab");
        if (m.lookingAt())
            System.out.println(m.start() + "" + m.end() + "" + m.group());
    }
}

=============================================
// Implementing find() method

import java.util.regex .*;

public class Regex {
    public static void main(String[] arg) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("ab aabcba");
        while (m.find())
            System.out.println(m.start() + "" + m.end() + "" + m.group());
    }
}===================================================
// Implementing find() method

import java.util.regex.*;

public class Regex {
    public static void main(String[] arg) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("ab aabcba");
        while (m.find())
            System.out.println(m.start() + "" + m.end() + "" + m.group());
    }
}