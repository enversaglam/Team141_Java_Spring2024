package day17_scope;

public class E04_StaticVariablesVsInstanceVariables {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String bashekimIsmi = "Dr Emrah";
    static String hastaneAdresi = "cankaya";

    String persIsmi;
    String perAdresi;
    String perTel;

    public static void main(String[] args) {
        E04_StaticVariablesVsInstanceVariables pers1 = new E04_StaticVariablesVsInstanceVariables();

        System.out.println(pers1.perAdresi); // null

        pers1.persIsmi = "Ulvi";
        pers1.perAdresi = "Cankaya";
        pers1.perTel = "5552345665";

        System.out.println(pers1.persIsmi+" "+pers1.perAdresi+" "+pers1.perTel);

        E04_StaticVariablesVsInstanceVariables pers2 = new E04_StaticVariablesVsInstanceVariables();

        System.out.println(pers2.persIsmi); // null
        
    }
}
