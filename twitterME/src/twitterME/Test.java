package twitterME;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test {
   public void testAssertions() {
      //Check that two objects are equal
      assertEquals(Parser.FindTopic("@Newyork"), true);
      assertEquals(Parser.FindHash("#newYork"), true);
      assertEquals(Parser.FindUrl("http://NewYork"), true);
    //Check that an object isn't null      
      Parser.FindTopic("@Newyork");
      Parser.FindHash("#newYork");
      Parser.FindUrl("http://NewYork");
      assertNotNull(HashesList.get(0));
      assertNotNull(UrlList.get(0));
      assertNotNull(TopicsList.get(0));
    //Check that Parser did add string to linkedlist
      assertTrue(HashesList.contains("newYork") ;
      assertTrue(UrlList.contains("NewYork") ;
      assertTrue(TopicsList.contains("Newyork") ;
      //check if non-topics returns false
      assertFalse(Parser.FindTopic("@#"));
      assertFalse(Parser.FindTopic("#@"));
      assertFalse(Parser.FindTopic("http://@"));
      assertFalse(Parser.FindTopic("@htttp://"));
      //check if non-Hashtags return false
      assertFalse(Parser.FindHash("@#"));
      assertFalse(Parser.FindHash("#@"));
      assertFalse(Parser.FindHash("http://#"));
      assertFalse(Parser.FindHash("#http://"));
    //check if non-Urls return false
      assertFalse(Parser.FindUrl("@http://"));
      assertFalse(Parser.FindUrl("http://@"));
      assertFalse(Parser.FindUrl("http://#"));
      assertFalse(Parser.FindUrl("#http://"));
      
   }
}