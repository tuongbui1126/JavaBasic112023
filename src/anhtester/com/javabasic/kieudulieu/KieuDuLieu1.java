package anhtester.com.javabasic.kieudulieu;

public class KieuDuLieu1 {

    static {
        //Block
        //Auto run
        //Load file properties
    }

    double numberInt = 12442134324324.3424234234;

    boolean checkValue = true;

    public static void main(String[] args) {
        //System.out.println(numberInt); //cách gọi biến static

        KieuDuLieu1 kieuDuLieu1 = new KieuDuLieu1(); //cách gọi biến non-static
        System.out.println(kieuDuLieu1.numberInt);

        System.out.println(Bank.BANKNAME);
        System.out.println(Bank.VAT);
        System.out.println(Bank.INTEREST_RATE);

    }
}
