package twitterME;

public class Hashtags {
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
}

