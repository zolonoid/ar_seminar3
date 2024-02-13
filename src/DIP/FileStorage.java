package DIP;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public interface FileStorage {
    FileInputStream readFile(String path);

    FileOutputStream writeFile(String path);
}
