package readResource;

import java.io.IOException;
import java.io.InputStream;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method5 {

    public void function(String fileName) throws IOException {
        InputStream in = this.getClass().getResourceAsStream("/" + fileName);
        getFileContent(in);
    }

    public static void main(String[] args) throws IOException {
        new Method5().function("preface.txt");
    }
}
