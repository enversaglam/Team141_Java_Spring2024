package day11_stringManipulations;

public class E06_ReplaceAll {
    public static void main(String[] args) {
        String input = "J%7a_)va   C?=a/&_nd1$i2r";

        input = input.replaceAll("\\s+", " ");
        input = input.replaceAll("\\d", "");
        input = input.replaceAll("\\s", "5");
        input = input.replaceAll("\\W", "");
        input = input.replaceAll("5", " ");
        input = input.replace("_", "");


        System.out.println(input);

        String str = "\"Java\"";

        System.out.println(str);
        System.out.println(str.repeat(3));

        String str2 = "   IT de buldugunuz ilk is aradiginiz son isiniz olacak     ";

        System.out.println(str2.trim());

    }
}
