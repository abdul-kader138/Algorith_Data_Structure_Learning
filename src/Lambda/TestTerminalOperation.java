package Lambda;


import java.util.ArrayList;
import java.util.List;

public class TestTerminalOperation {

    public static void main(String[] args) {


        List<String> obj = new ArrayList<>();
        obj.add("PPFL");
        obj.add("PFL");
        obj.add("PPL");
        obj.add("PCFL");

        Object[] objArr = obj.stream().toArray();
        String[] arr =getList(objArr);
        for (String s : arr) System.out.println(s);
    }


    private static String[] getList(Object[] obj) {
        String[] val = new String[obj.length];
        for (int i = 0; i < obj.length; i++) val[i] = (String) obj[i];
        return val;
    }
}
