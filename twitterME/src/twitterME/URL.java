package twitterME;

public class URL {
	String FindUrl(String tweet){
		//search for URL
	    if (tweet.contains('http:' || '.com')) {
	        int indexOfHttp = tweet.indexOf('http:');
	        int endPoint = (tweet.indexOf(' ', indexOfHttp) != -1) ?
	        	tweet.indexOf(' ', indexOfHttp) : tweet.length();
	        String url = tweet.substring(indexOfHttp, endPoint);       
	    }
	 
	    //final
	    return tweet;
	    }
}
