public class Twitter {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 9);
        Tweet tweet = new Tweet("I build tree", "bob the builder", "Today", 500, 20000);
        System.out.println(tweet.makeTweet(rect));
    }
}
