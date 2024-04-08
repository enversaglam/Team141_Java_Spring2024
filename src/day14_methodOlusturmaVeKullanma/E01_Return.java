package day14_methodOlusturmaVeKullanma;

public class E01_Return {
    public static void main(String[] args) {
        /*
            Her method bir is yapmak icin olusturulur
            Biz method'larin yaptiklari islem sonucunda
            bize ne döndürdüklerine bakariz

            method'larin islem sonucu, verilen parametrelere gore degisecegi icin
            return kelimesi daha cok data turunu belirtir

         */
        String str = "Java Kolaydir.";
        System.out.println(str.substring(3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('x'));
        System.out.println(str.contains("Java"));
    }
}
