package model.writer;

import java.io.*;

public class FileHandler implements Writer {
    private String filePath = "/path/to/your/file.txt";

    public FileHandler() {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void save(Serializable serializable) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            System.out.println("File saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object read() {
        System.out.println("Reading file from: " + filePath);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return objectInputStream.readObject();
        } catch (EOFException e) {
            System.out.println("File is empty or corrupted.");
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void setPath(String filePath) {
        this.filePath = filePath;
    }
}
