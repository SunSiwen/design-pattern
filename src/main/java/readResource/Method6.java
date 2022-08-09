package readResource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method6 {

    public void function(String fileName) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource(fileName);
        InputStream inputStream = classPathResource.getInputStream();
        getFileContent(inputStream);
    }

    public static void main(String[] args) throws IOException {
        new Method6().function("preface.txt");
    }
}
