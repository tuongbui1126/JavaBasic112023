package anhtester.com.javabasic.variables;

public class StaticVariable {

    int tuoi = 20; //Biến toàn cục instance, phải gọi nó thông qua 1 đối tượng trung gian trong main
    static int age = 30; //Biến static dùng khi mình cần nó tồn tại trong suốt quá trình trong project mình làm

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable();
        System.out.println("Tuổi: "+ staticVariable.tuoi);

        System.out.println("Tuổi: "+ age);
    }
}
