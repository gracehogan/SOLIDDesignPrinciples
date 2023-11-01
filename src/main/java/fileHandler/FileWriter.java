package fileHandler;

import java.io.IOException;

public class FileWriter {

    private String filename;

    public FileWriter(String filename) {
        this.filename = filename;
    }

    public void writeFile(String content) throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write(content);
        }
    }

}

