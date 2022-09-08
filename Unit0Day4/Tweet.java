// class -> a blueprint for new datatype
// class is always capitalized
public class Tweet {
    // instance variables are always private
    private String body, username, date;
    private int replies, likes;
    
    // constructor -> must be the same NAME as the class
    // inside my constructor's parenthesis, I need to add my parameters
    public Tweet(String body, String username, String date, int replies, int likes) {
        // the instance variable body is "global", while the parameter is "local"
        this.body = body;
        this.username = username;
        this.date = date;
        this.replies = replies;
        this.likes = likes;
    }

    // methods -> are actions or a sequence of actions that can be invoked using dot-notation
    // dot-notation: object.toString(); every method has a parenthesis at the end
    // all objects share a common ancestor: Object class. All objects inherit these two specific methods: .toString() and .equals()

    public String toString() {
        return body + " - " + username;
    }

    public String makeTweet(Rectangle rect) {
        body = "" + rect.getArea();
        return body + " - " + username;
    }

    // String -> is a list of chars, and is NOT primitive, it's a class that makes String objects
    // likes -> is an integer, and IS primitive
    // .equals() to compare objects
    // == to compare primitives
    public boolean equals(Tweet otherTweet) {
        return body.equals(otherTweet.body) && username.equals(otherTweet.username) && date.equals(otherTweet.date) && likes == otherTweet.likes;
    }

    // getters -> return the value of the instance variables / attributes
    public String getBody() {
        return body;
    }

    public String getUsername() {
        return username;
    }

    public String getDate() {
        return date;
    }

    public int getReplies() {
        return replies;
    }

    public int getLikes() {
        return likes;
    }

    //setters -> assign or change the value of the instance variables / attributes
    public void setBody(String body) {
        this.body = body;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
