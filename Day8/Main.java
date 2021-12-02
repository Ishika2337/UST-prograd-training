import javax.imageio.IIOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Managment.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        //Write in file

        FileWriter writer = new FileWriter("Managment.txt",true);
        writer.write("Hello Everyone");
        writer.append("\nI am Ishika verma");
        writer.close();

        //Read File ---> This gives ASCII values because .read() returns integer

        FileReader reader = new FileReader("Managment.txt");
        int i = reader.read();
        while(i != -1){
            System.out.println(i);
            i = reader.read();
        }
        reader.close();

        //Read File

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }
}
