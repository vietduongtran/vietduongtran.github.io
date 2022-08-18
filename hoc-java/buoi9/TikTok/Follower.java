package TikTok;

public class Follower {
    
    private String nameFollower;
    private int id;
    private String email;
    private int numberOfLikes;
    
    public Follower(String name, int id, String email, int numberOfLikes) {
        this.nameFollower = nameFollower;
        this.id = id;
        this.email = email;
        this.numberOfLikes = numberOfLikes;
    }

    public String getNameFollower() {
        return nameFollower;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }


}
