package day17_scope;

public class E01_Scope {

    int a = 20;
    static String b;

    public static void main(String[] args) {
        
        /*
        Scope :
        variable ve method'larin nerelerden kullanilabilecegini
        ve bir kod blogu icerisinde hangi class uyelerinin kullanilabilecegini
        belirleyen kurallardir
        */
        int sayi = 10;
        System.out.println(sayi);
        // System.out.println(str);
        // System.out.println(a);
        System.out.println(b);
    

    }

    public static void method1(){
        // System.out.println(sayi);
        // String str = "Java super"
        // System.out.println(a);
        System.out.println(b);
    }

    public void method2() {
        // System.out.println(sayi);
        // System.out.println(str);
        System.out.println(a);
        System.out.println(b);
    }
}
