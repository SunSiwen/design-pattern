package readResource;

import java.io.*;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 23:35
 */
public class ReadFile {

    public static void getFileContent(Object fileInPath) {
        try {
            BufferedReader br = null;
            if (fileInPath == null) {
                return;
            }
            if (fileInPath instanceof String) {
                br = new BufferedReader(new FileReader(new File((String) fileInPath)));
            } else if (fileInPath instanceof InputStream) {
                br = new BufferedReader(new InputStreamReader((InputStream) fileInPath));
            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
