package ExceptionHandling;

public class Main {
    
    public static void main(String[] args){
        try{
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[4]);
        } catch (StringIndexOutOfBoundsException exception){
            System.out.println("StringIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception exception){
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
