package readResource;

import java.io.File;
import java.io.IOException;

import static readResource.ReadFile.getFileContent;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:39
 */
public class Method8 {

    public void function(String fileName) throws IOException {
        //参数为空
        File directory = new File("");
        //规范路径：getCanonicalPath() 方法返回绝对路径，会把 ..\ 、.\ 这样的符号解析掉
        String rootCanonicalPath = directory.getCanonicalPath();
        //绝对路径：getAbsolutePath() 方法返回文件的绝对路径，如果构造的时候是全路径就直接返回全路径，如果构造时是相对路径，就返回当前目录的路径 + 构造 File 对象时的路径
        String rootAbsolutePath =directory.getAbsolutePath();
        System.out.println(rootCanonicalPath);
        System.out.println(rootAbsolutePath);
        String filePath = rootCanonicalPath + "\\src\\main\\resources\\"+fileName;
        getFileContent(filePath);
    }

    public static void main(String[] args) throws IOException {
        new Method8().function("preface.txt");
    }
}
