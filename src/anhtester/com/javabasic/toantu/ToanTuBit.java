package anhtester.com.javabasic.toantu;

public class ToanTuBit {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean checkValue1 = (a > 1) & (b < 2); //result: false
        boolean checkValue2 = (a > 1) || (b > 2); //result: true

        String expectedTest = "Selenium Java"; //Data cứng từ Excel
        String actualText = "Selenium Java"; //Lấy bằng auto với Selenium

        String buttonExpectedColor = "#124124";
        String buttonActualColor = ""; //Luôn luôn lấy bằng auto với selenium

        System.out.println(checkValue1);
        System.out.println(checkValue2);
        System.out.println((expectedTest == actualText) & (buttonExpectedColor == buttonActualColor));
    }
}
