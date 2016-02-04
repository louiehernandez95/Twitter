import java.io.*;
import java.util.*;

private LinkedList<String> UrlList = new LinkedList<String>();
private LinkedList<String> TopicsList = new LinkedList<String>();
private LinkedList<String> HashesList = new LinkedList<String>();

public class Parser {
	public Boolean FindTopic(String tweet){
			//search for topic
			int i=0;
			String topic;
			do {
		    if (tweet.contains('@') {
		    int indexOfTopic = tweet.indexOf('@');
	        int endPoint = (tweet.indexOf(' ', indexOfTopic) != -1) ?
		        	tweet.indexOf(' ', indexOfTopic) : tweet.length();
		        topic = tweet.substring(indexOfTopic, endPoint);    
		        TopicsList.set(i, topic); 
		        return true;
		       }
		    i++;
	        } while (i<TopicsList.size());
		    return false;
		 }
		 
		 public Boolean FindHash(String tweet){
				//search for hashtag 
				String hashTag=tweet;
				int i=0;
				do
	            {
			    if (tweet.contains('#') {
		            int indexOfHash = tweet.indexOf('#');
		            int endPoint = (tweet.indexOf(' ', indexOfHash) != -1) ?
			          	tweet.indexOf(' ', indexOfHash) : tweet.length();
			        hashTag = tweet.substring(indexOfHash, endPoint); 
			        HashesList.set(i, hashTag); 
			        return true;
			       }
			    i++;
	            } while (i<HashesList.size());
			    return false;
			 }
		 public Boolean FindUrl(String tweet){
				//search for URL
				String url=tweet;
				int i=0;
				do
	            {
	              
			    if (tweet.contains("http://")) {
			        int indexOfHttp = tweet.indexOf('http://');
			        int endPoint = (tweet.indexOf(' ', indexOfHttp) != -1) ?
			        	tweet.indexOf(' ', indexOfHttp) : tweet.length();
			        url = tweet.substring(indexOfHttp, endPoint);  
			        UrlList.set(i, url);   
			        return true;
			        }
			    i++;
	            } while (i<UrlList.size());
			    return false;
	    }
	}

