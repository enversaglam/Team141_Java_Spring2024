package day11_stringManipulations;

public class E03_isEmptyIsBlank {
    
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.length());
        System.out.println(str.isEmpty());

        String str2 = " ";
        System.out.println(str2.length());
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        String str3 = "        ";
        System.out.println(str3.length());
        System.out.println(str3.isEmpty());
        System.out.println(str3.isBlank());

        System.out.println(str.isBlank());


    }
}
