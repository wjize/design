package headFirst03.inputStream;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wangjize on 2025/6/5.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        String path = System.getProperty("user.dir");
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(path + "/src/headFirst03/inputStream/text.txt")
                            )
                    );

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
