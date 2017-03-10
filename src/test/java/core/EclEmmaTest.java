package core;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EclEmmaTest {
  @Test
  public void test_01() {
	  Assert.assertEquals(EclEmma.isQuestion("Is two times two equals four?"), true);
  }
  @Test
  public void test_02() {
	  Assert.assertEquals(EclEmma.isQuestion("Is two times two equals four"), false);
  }
  @Test
  public void test_03() {
	  EclEmma.main(null);
  }
  @Test
  public void test_04() {
	  EclEmma o=new EclEmma();
  }
}
