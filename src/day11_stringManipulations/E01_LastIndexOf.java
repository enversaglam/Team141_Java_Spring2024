package day11_stringManipulations;

public class E01_LastIndexOf {
    public static void main(String[] args) {
        
        String str = "Java cok zevkli";

        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.contains("z"));

        System.out.println(str.indexOf('k'));

        System.out.println(str.indexOf("cok"));

        System.out.println(str.lastIndexOf('k'));

        int sonIndex = str.lastIndexOf('k');

        System.out.println(str.lastIndexOf('k', sonIndex-1));

        System.out.println(str.lastIndexOf("cok"));

        System.out.println(str.indexOf('x'));

        System.out.println(str.lastIndexOf('w'));
    }
}
