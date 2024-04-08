package day12_stringManipulations_forLoop;

public class E01_StringtenSayiTopalam {
    public static void main(String[] args) {
        String fiyatStr1 = "15,30 €";
        String fiyatStr2 = "11,45 €";

        fiyatStr1 = fiyatStr1.replaceAll("\\D", "");
        fiyatStr2 = fiyatStr2.replaceAll("\\D", "");

        System.out.println(fiyatStr1 + fiyatStr2);

        System.out.println("Verilen sayilarin toplami : "+
                            (Double.parseDouble(fiyatStr1)+Double.parseDouble(fiyatStr2))/100 + 
                            " €");
    }
}
