package ArrayListDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       
        ArrayList numbers = new ArrayList();

        numbers.add(10);
        numbers.add(20);
        numbers.add("Ankara");

        for(Object number : numbers){
            System.out.println(number);
        }
    
       
    }
    
}
