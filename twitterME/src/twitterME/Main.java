package twitterME;

public class Main {
String Parse(String tweet){
	
	
	
	//search for URL
    if (tweet && tweet?.contains('http:')) {
        int indexOfHttp = tweet.indexOf('http:');
        int endPoint = (tweet.indexOf(' ', indexOfHttp) != -1) ?
        	tweet.indexOf(' ', indexOfHttp) : tweet.length();
        String url = tweet.substring(indexOfHttp, endPoint);
        String targetUrlHtml=  "<a href='${url}' target='_blank'>${url}</a>";
        tweet = tweet.replace(url,targetUrlHtml );
    }
    
}
