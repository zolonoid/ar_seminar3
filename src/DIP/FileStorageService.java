package DIP;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileStorageService {
    private FileStorage fileStorage;

    public FileStorageService(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

    public String readTxtFile(String path) throws IOException {
        FileInputStream stream = fileStorage.readFile(path);
        var reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
        char[] text = new char[stream.available()];
        reader.read(text);
        return new String(text);
    }

    public void writeTxtFile(String path, String text) throws IOException {
        FileOutputStream stream = fileStorage.writeFile(path);
        stream.write(text.getBytes(StandardCharsets.UTF_8));
        stream.flush();
    }
}
