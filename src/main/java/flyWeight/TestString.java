package flyWeight;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 10:49
 */
public class TestString {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        System.out.println(s4.intern() == s3.intern());
        System.out.println(s4 == s3);
    }
}
