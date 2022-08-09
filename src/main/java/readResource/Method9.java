package readResource;

import java.io.File;
import java.io.IOException;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method9 {

    public void function(String fileName) throws IOException {
        System.setProperty("TEST_ROOT","D:\\design-pattern");
        //参数为空
        String rootPath = System.getProperty("TEST_ROOT");
        System.out.println(rootPath);
        String filePath = rootPath + "\\src\\main\\resources\\"+fileName;
        getFileContent(filePath);
    }

    public static void main(String[] args) throws IOException {
        new Method9().function("preface.txt");
    }
}
