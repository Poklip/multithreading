import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    public int parse(File file) {
        int counter = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String bufferedLine;
            while ((bufferedLine = br.readLine()) != null) {
                if (bufferedLine.contains("страдани")) {
                    counter += 1;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return counter;
    }
}