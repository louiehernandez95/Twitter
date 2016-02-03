package twitterME;

public class URL {
	public String FindUrl(String tweet){
		//search for URL
		String url=tweet;
	    if (tweet.contains("http://")) {
	        int indexOfHttp = tweet.indexOf('http://');
	        int endPoint = (tweet.indexOf(' ', indexOfHttp) != -1) ?
	        	tweet.indexOf(' ', indexOfHttp) : tweet.length();
	        url = tweet.substring(indexOfHttp, endPoint);       
	    }
	 
	    //final
	    return url;
	    }
}
