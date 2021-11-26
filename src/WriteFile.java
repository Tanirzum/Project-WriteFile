import java.io.*;
import java.util.*;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("File");
        PrintWriter printWriter = new PrintWriter(file);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Запишите документы в файл");
            String fileValue = scanner.nextLine();
            printWriter.println(fileValue);
            printWriter.close();
            System.out.println("Что-бы выйти из программы пишите end");
            String end = scanner.nextLine();
            if (end.equalsIgnoreCase("end")) {
                break;
            }
        }
    }
}
