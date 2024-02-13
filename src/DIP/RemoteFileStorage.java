package DIP;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RemoteFileStorage implements FileStorage {
    @Override
    public FileInputStream readFile(String path) {
        return null;
    }

    @Override
    public FileOutputStream writeFile(String path) {
        return null;
    }
}
