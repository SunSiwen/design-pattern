package readResource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Objects;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method4 {

    public void function(String fileName) throws IOException {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);
        getFileContent(in);
    }

    public static void main(String[] args) throws IOException {
        new Method4().function("preface.txt");
    }
}
