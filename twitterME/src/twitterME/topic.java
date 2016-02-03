package twitterME;

public class topic {
	public String FindTopic(String tweet){
		//search for topic
		String topic;
	    if (tweet.contains('@') {
	    int indexOfTopic = tweet.indexOf('@');
        int endPoint = (tweet.indexOf(' ', indexOfTopic) != -1) ?
	        	tweet.indexOf(' ', indexOfTopic) : tweet.length();
	        topic = tweet.substring(indexOfTopic, endPoint);    
	    }
	  //final
	    return topic;
	 }
}
