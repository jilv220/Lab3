import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    public static int word_counting(final String input) {
        int sum = 0;
        String str_url = urlToString(input);
        String[] split_url = str_url.split("");
        for ( int i = 0; i < split_url.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[]unused) {

        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter the url: ");
        String Webpager = Input.nextLine();
        String urlstr = urlToString(Webpager);
        System.out.println();

    }
}
