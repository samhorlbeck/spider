package lab.spider;


/**
 * Downloads web pages by following http links located
 * in the html of BEGINNING_URL.  Recursively repeats
 * the process.
 * 
 * @author shilad
 *
 */
public class RunSpider {
	private static final String BEGINNING_URL = "http://www.dailypaul.com/";

	/**
	 * Run the spider program.
	 * @param args
	 */
	public static void main(String [] args) {
		Spider spider = new Spider(100);
		spider.crawl(BEGINNING_URL);
		for (WordCount urlCount : spider.getUrlCounts()) {
			println("url " + urlCount.getWord() + " is " + urlCount.getCount());
		}
	}
	
	/**
	 * I provided this function because students are used to calling println().
	 * @param message
	 */
	public static void println(String message) {
		System.out.println(message);
	}
}
