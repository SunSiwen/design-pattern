package readResource;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Objects;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method3 {

    public void function(String fileName) throws IOException {
        String path = Objects.requireNonNull(this.getClass().getClassLoader().getResource(fileName)).getFile();
        System.out.println(path);
        String filePath = URLDecoder.decode(path, "UTF-8");//如果路径中带有中文会被URLEncoder,因此这里需要解码
        System.out.println(filePath);
        getFileContent(filePath);
    }

    public static void main(String[] args) throws IOException {
        new Method3().function("preface.txt");
    }
}
