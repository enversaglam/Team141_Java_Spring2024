package day15_methodOverloading_whileLoop;

public class E02_MethodOverloading {
    public static void main(String[] args) {
        toplama('a', 'b');// 195
        toplama(3.4f, 6);//toplama float int -- double ve int calisir floati double ye cast eder 9.400000095367432
        toplama(2.3f, 3.1f);//toplama float float ==> iki double in toplami = 5.3999998569488525
    }

    public static void toplama(int a, int b) {
        System.out.println("Iki integerin toplami "+(a+b));
    }
    public static void toplama(double  a, int b) {
        System.out.println("double ve integerin toplami "+(a+b));
    }
    public static void toplama(double a, double b) {
        System.out.println("Iki double in toplami "+(a+b));
    }
}
