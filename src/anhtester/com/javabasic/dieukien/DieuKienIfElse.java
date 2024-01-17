package anhtester.com.javabasic.dieukien;

public class DieuKienIfElse {
    public static void main(String[] args) {

        //Điều kiện IF
        int age = 30;
        String name = "Auto";
        String message = "Add Category successful";

        if(age > 20 && (name.equals("Auto") || message.contains("success"))){
            System.out.println("Thỏa điều kiện");
        }

        //Điều kiện If-Else
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }


    }


}
