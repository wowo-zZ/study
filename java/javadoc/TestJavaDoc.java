package javadoc;
/**
 * This is a javadoc test file
 * <strong>test strong</strong>
 * <em>test em</em>
 * @author wowo
 * @since v1.1
 * @version v1.3
 * @see <a href="https://doc.xfyun.cn">查看文档</a>
 */
public class TestJavaDoc {
    
    private short test1;
    private int test2;
    private long test3;
    private char test4;
    private float test5;
    private double test6;


    /**
     * @param name 测试name
     * @return String
     */
    public String getName(String name) {
        return "testjavadoc";
    }

    /**
     * @see TestJavaDoc#getName(String)
     * @return String
     */
    public String testMethod() {
        return "hello wowo";
    }
}
