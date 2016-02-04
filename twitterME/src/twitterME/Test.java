import org.junit.Test;
import static org.junit.Assert.*;

public class Test {

   public void testAssertions() {
      //test data
      //Check that two objects are equal
      assertEquals(FindTopic("@Newyork"), true);
      assertEquals(FindHash("#newYork"), true);
      assertEquals(FindUrl("http://NewYork"), true);
    //Check that an object isn't null      
      FindTopic("@Newyork");
      FindHash("#newYork");
      FindUrl("http://NewYork");
      assertNotNull(HashesList.get(0));
      assertNotNull(UrlList.get(0));
      assertNotNull(TopicsList.get(0));
    //Check that a condition is true
      assertTrue (HashesList.contains("newYork") ;
      assertTrue (UrlList.contains("NewYork") ;
      assertTrue (TopicsList.contains("Newyork") ;
   }
}