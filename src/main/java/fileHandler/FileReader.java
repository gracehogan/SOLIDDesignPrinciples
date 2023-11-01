package fileHandler;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    String filename;

    //Added constructor to take in fileName
    public FileReader(String filename) {
        this.filename = filename;
    }

    public String readFile() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
