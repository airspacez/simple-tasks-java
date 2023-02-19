import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class twelve {
    public static void main(String[] args) {
        String S = "new line";

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();

        try (BufferedReader reader = new BufferedReader(new FileReader(s + "\\src\\read.txt"))) {
            String line;
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(s + "\\src\\write.txt"))) {
                if ((line = reader.readLine()) != null) {
                    writer.write(line);
                    if (line.isEmpty()) {
                        writer.write(S);
                    }
                }
                while ((line = reader.readLine()) != null) {
                    writer.write("\n" + line);
                    if (line.isEmpty()) {
                        writer.write(S);
                    }
                }
                reader.close();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
