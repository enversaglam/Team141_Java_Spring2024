package day13_forLoop_nestedForLoop;

public class E07_NestedForLoop {
    public static void main(String[] args) {
        // for loop ile 1 2 3 4 yazdirin

        for (int i = 1; i <= 4; i++) {
            System.out.print( i + " ");
        }
        System.out.println(" ");
        // for loop ile 2 4 6 8 yazdirin
        for (int i = 1; i <= 4; i++) {
            System.out.print( 2*i + " ");
        }

        System.out.println(" ");
        // for loop ile 3 6 9 12 yazdirin
        for (int i = 1; i <= 4; i++) {
            System.out.print( 3*i + " ");
        }
        System.out.println("");

        for (int i = 1; i <=3; i++) {//outer for loop satırları konntrol eder
            for (int j = 1; j <=4 ; j++) {//ınner for loop sğtunları kontrol eder
                System.out.print(i*j + " ");
                
            }
            System.out.println("");
            
        }


    }
}
