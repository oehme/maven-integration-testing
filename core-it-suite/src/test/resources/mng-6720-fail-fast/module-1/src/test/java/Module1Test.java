import org.junit.Test;

public class Module1Test {
    @Test
    public void test() throws Exception {
        Thread.sleep(1000);
        System.out.println("Module1");
        throw new RuntimeException();
    }
}
