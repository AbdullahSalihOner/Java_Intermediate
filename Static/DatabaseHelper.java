package Static;

public class DatabaseHelper {
    public static class Crud{
        public static void delete(){
                System.out.println("Veri silindi.");
        }
        public static void update(){
            System.out.println("Veri guncellendi.");
        }
    }

    public static class Connection{
        public static void createConnection(){
            System.out.println("Baglanti olusturuldu.");
        }
    }
}
