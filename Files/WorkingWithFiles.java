package Files;

import java.util.Scanner;
import java.io.*;

public class WorkingWithFiles {
    public static void main(String[] args){
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:/Codes/Java/Files/students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:/Codes/Java/Files/students.txt");
        if(file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } else {
            System.out.println("The file does not exist");
        }
    }


    public static void readFile(){
        File file = new File("C:/Codes/Java/Files/students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Codes/Java/Files/students.txt", true));
            writer.newLine();
            writer.write("John Doe");
            System.out.println("Successfully wrote to the file");
            writer.close();
        }
    }
}
