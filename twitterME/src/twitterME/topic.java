import java.io.*;
import java.util.*;

private LinkedList<String> lines = new LinkedList<String>();

public class Parser {
	public String FindTopic(String tweet){
		//search for topic
		String topic;
	    if (tweet.contains('@') {
	    int indexOfTopic = tweet.indexOf('@');
        int endPoint = (tweet.indexOf(' ', indexOfTopic) != -1) ?
	        	tweet.indexOf(' ', indexOfTopic) : tweet.length();
	        topic = tweet.substring(indexOfTopic, endPoint);    
	    return topic;
	    }
	 
	    return "";
	 }
	 
	 public String FindHash(String tweet){
			//search for hashtag 
			String hashTag=tweet;
		    if (tweet.contains('#') {
	            int indexOfHash = tweet.indexOf('#');
	            int endPoint = (tweet.indexOf(' ', indexOfHash) != -1) ?
		          	tweet.indexOf(' ', indexOfHash) : tweet.length();
		        hashTag = tweet.substring(indexOfHash, endPoint); 
		        return hashTag;
		       }
		  
		    return ""
		 }
	 public String FindUrl(String tweet){
			//search for URL
			String url=tweet;
		    if (tweet.contains("http://")) {
		        int indexOfHttp = tweet.indexOf('http://');
		        int endPoint = (tweet.indexOf(' ', indexOfHttp) != -1) ?
		        	tweet.indexOf(' ', indexOfHttp) : tweet.length();
		        url = tweet.substring(indexOfHttp, endPoint);  
		        return url;
		    }
		    return "";
		    }
	 
}
