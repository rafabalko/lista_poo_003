import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            System.out.println("Conteúdo do arquivo:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
        }
    }
}
}