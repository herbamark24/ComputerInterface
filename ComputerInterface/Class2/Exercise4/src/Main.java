import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop operations are not supported");
            return;
        }
        try {
            Desktop desktop = Desktop.getDesktop();
    //        File file = new File("uniqueFile.txt");
    //        desktop.open(file);

            URI uri = URI.create("mailto:mark.algoritam@gmail.com?subject=Test&body=Something");
            desktop.mail(uri);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}