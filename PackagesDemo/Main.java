package PackagesDemo;

import java.util.Scanner;
import PackagesDemo.math.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız: ");
        String name = scanner.nextLine();

        System.out.println("Merhaba " + name);

        DortIslem dortIslem = new DortIslem();
        double result = dortIslem.topla(5, 6);
        System.out.println(result);
    }
    
}
