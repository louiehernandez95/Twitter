package twitterME;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {
	public void Tests{
  //Check that an object isn't null      
    Parser.FindTopic("@Newyork");
    Parser.FindHash("#newYork");
    Parser.FindUrl("http://NewYork");
    assertNotNull(HashesList.get(0));
    assertNotNull(UrlList.get(0));
    assertNotNull(TopicsList.get(0));
  //Check that two objects are equal
    assertEquals("Newyork", TopicsList.get(0));
    assertEquals("newYork", HashesList.get(0));
    assertEquals("NewYork", UrlList.get(0));
  //Check that Parser did add string to linkedlist
    assertTrue(HashesList.contains("newYork"));
    assertTrue(UrlList.contains("NewYork"));
    assertTrue(TopicsList.contains("Newyork"));
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
