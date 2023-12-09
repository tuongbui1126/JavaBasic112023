package anhtester.com.javabasic.kieudulieu;

public class Bank {
    static int VAT = 10000;
    static String BANKNAME = "Viettinbank";
    static String ADDRESS = "San Jose, CA";
    static String PHONE = "8329701726";
    static Float INTEREST_RATE = 7.3F;

    public static void getBankInfo() {
        //Viết nhiều dòng code trong đây
        System.out.println("Bank Name: " + BANKNAME);
        System.out.println("Bank Address: " + ADDRESS);
        System.out.println("Bank Phone: " + PHONE);
        System.out.println("Bank Interest Rate: " + INTEREST_RATE);

    }

    public static float getBankInterestRate() {
        //Viết nhiều dòng code trong đây
        return INTEREST_RATE;
    }
    }
