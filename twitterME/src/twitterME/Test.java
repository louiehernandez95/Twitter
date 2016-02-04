import org.junit.Test;
import static org.junit.Assert.*;

public class Test {

   public void testAssertions() {
      //test data
      String str1 = new String ("@true");
      String str2 = new String ("true");
      String str3 = new String ("#true");
      String str4 = new String ("https://true");
      
      //Check that two objects are equal
      assertEquals(str1.FindTopic(), str2);
      assertEquals(str3.FindHash(), str2);
      assertEquals(str4.FindUrl(), str2);
    //Check that an object isn't null
      assertNotNull(str1);
      assertNotNull(str3);
      assertNotNull(str4);
      
    //Check that a condition is true
      assertTrue (HashesList.indexOf(str2) > -1;
      assertTrue (UrlList.indexOf(str2) > -1;
      assertTrue (TopicsList.indexOf(str2) > -1;
   }
}