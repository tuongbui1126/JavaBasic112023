package anhtester.com.javabasic.toantu;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        // String name, address, email;

        String expectedTest = "Selenium Java"; //Data cứng từ Excel
        String actualText = "Login 123"; //Lấy bằng auto với Selenium

        String buttonExpectedColor = "#124124";
        String buttonActualColor = ""; //Luôn luôn lấy bằng auto với selenium

        String s = ((expectedTest == actualText) && (buttonActualColor == buttonActualColor)) ? "Test case pass" : "Test case fail. Text trên button không đúng.";
        System.out.println(s);
    }
}
