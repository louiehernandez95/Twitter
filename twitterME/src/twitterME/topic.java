package twitterME;

public class topic {
	String FindHash(String tweet){
		//search for topic
	    if (tweet.contains('@') {
	    int indexOfTopic = tweet.indexOf('@');
        int endPoint = (tweet.indexOf(' ', indexOfTopic) != -1) ?
	        	tweet.indexOf(' ', indexOfTopic) : tweet.length();
	        String topic = tweet.substring(indexOfTopic, endPoint);    
	    }
	  //final
	    return topic;
	 }
}
