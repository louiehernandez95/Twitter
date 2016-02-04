package twitterME;
import java.io.*;
import java.util.*;

public LinkedList<String> UrlList = new LinkedList<String>();
public LinkedList<String> TopicsList = new LinkedList<String>();
public LinkedList<String> HashesList = new LinkedList<String>();

public class Parser {
	public Boolean FindTopic(String tweet){
			int i=0;
			String topic;
			do {
			if (tweet.contains('#@' || 'http://@' || '@http://'|| '@#')) {		    	
		         break;
		    }	
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
	   	String hashTag=tweet;
		int i=0;
		do {
		    if (tweet.contains('#@' || 'http://#' || '#http://'|| '@#')) {		    	
			     break;
			}
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
		String url=tweet;
		int i=0;
		do {         
		    if (tweet.contains('htttp://@' || 'http://#' || '#http://'|| '@htttp://')) {		    	
		         break;
		    }
		    if (tweet.contains('http://')) {
		        int indexOfUrl = tweet.indexOf('http://');
		        int endPoint = (tweet.indexOf(' ', indexOfHttp) != -1) ?
	        	tweet.indexOf(' ', indexOfUrl) : tweet.length();
		        url = tweet.substring(indexOfUrl, endPoint);  
		        UrlList.set(i, url); 
		        return true;		
		        }
		     i++;
	      } while (i<UrlList.size());
	       return false;
	 }
 }

