package Lambda;


/*
* Used for Method Reference Example
* */

public class StringParser {

    String print(String s) {
        if(s.length()<=3) s=s.toUpperCase();
        else s=s.toLowerCase();
        return s;
    }
}
