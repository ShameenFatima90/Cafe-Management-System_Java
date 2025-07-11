import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

class data_saver {

    public static void saves(JTextArea textArea) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Sufian/Desktop/Sip n Savor/data/Customer.txt"))) {
            String text = textArea.getText();
            writer.write(text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save(JTextArea textArea) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Sufian/Desktop/Sip n Savor/data/Customer bills.txt"))) {
            String text = textArea.getText();
            writer.write(text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
