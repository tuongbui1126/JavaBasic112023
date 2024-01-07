package anhtester.com.javabasic.variables;

public class LearnVariables {

    static int age = 26; //Biến toàn cục static có thể gọi vô duoc 1 hàm bất kỳ
    static int number = 20;
    public static void sayHello() {
        int n = 10;                     // Đây là biến local (nội bộ) > ko gọi duoc vô 1 hàm bất kỳ. Chỉ dùng nội bộ
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {  //Hàm chính thức để run trong main
        System.out.println(age);
        System.out.println(number);

        //Cách 1
        LearnVariables abc = new LearnVariables(); //Để gọi hàm sayHello trong main. Thông qua 1 đối tượng.
        abc.sayHello();
        //Cách 2
        sayHello(); //Nếu có static thì dùng cách này
    }
}
