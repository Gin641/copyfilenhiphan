import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String sourcePath = "C:\\Gin\\module 2\\Binary File Serialization\\copy file nhi phan\\src\\source";
        String sourceDestination = "C:\\Gin\\module 2\\Binary File Serialization\\copy file nhi phan\\src\\destination";
        FileInputStream inputStream;
        FileOutputStream outputStream;
        byte[] allBytes;
        long fileSize;
        try {
            inputStream = new FileInputStream(sourcePath);
            outputStream = new FileOutputStream(sourceDestination);
            fileSize = new File(sourcePath).length();
            allBytes = new byte[(int) fileSize];
            while (inputStream.read(allBytes) != -1){
                outputStream.write(allBytes);
            }
            System.out.println("Successful!");
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
