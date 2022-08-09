package readResource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method7 {

    public void function(String fileName) throws IOException {
        String rootPath = System.getProperty("user.dir");//D:\design-pattern
        String filePath = rootPath + "\\src\\main\\resources\\"+fileName;
        getFileContent(filePath);
    }

    public static void main(String[] args) throws IOException {
        new Method7().function("preface.txt");
    }
}
