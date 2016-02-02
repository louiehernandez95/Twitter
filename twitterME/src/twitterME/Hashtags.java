package twitterME;

public class Hashtag {
	 String FindHash(String tweet){
		//search for hashtag 
	    if (tweet.contains('#') {
	    int indexOfHash = tweet.indexOf('#');
        int endPoint = (tweet.indexOf(' ', indexOfHash) != -1) ?
	        	tweet.indexOf(' ', indexOfHash) : tweet.length();
	        String hashTag = tweet.substring(indexOfHash, endPoint);    
	    }
	  //final
	    return hashTag;
	 }
}

