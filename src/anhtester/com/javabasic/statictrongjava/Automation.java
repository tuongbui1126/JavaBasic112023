package anhtester.com.javabasic.statictrongjava;

import java.net.URL;
import java.sql.SQLOutput;

public class Automation {
    public static void main(String[] args) {
        System.out.println(PhuongThucStatic.cong2So(2,10 ));
        System.out.println(PhuongThucStatic.getURL());
        System.out.println(PhuongThucStatic.getPASSWORD());
        System.out.println(PhuongThucStatic.getEMAIL());
        System.out.println(PhuongThucStatic.getBROWSER());

        PhuongThucStatic.getAllInformation();
    }
}
