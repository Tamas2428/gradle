import org.junit.Assert;
import org.junit.Test;

public class ConcatTest {
    @Test
    public void concatTestMethod() {
        Assert.assertEquals("Majom", Concat.concatMethod("Ma", "jom"));
    }
}
