package NumberFinder;

public class NumberFinder {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 3;
        boolean found = false;
        
        for (int i : numbers) {
            if (i == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
    }
}
