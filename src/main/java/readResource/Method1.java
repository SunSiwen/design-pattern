package readResource;

import java.io.IOException;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method1 {

    public void function(String fileName) throws IOException {
        String path = this.getClass().getClassLoader().getResource("").getPath();//注意getResource("")里面是空字符串
        System.out.println(path);
        String filePath = path + fileName;
        System.out.println(filePath);
        getFileContent(filePath);
    }

    public static void main(String[] args) throws IOException {
        new Method1().function("preface.txt");
    }
}
