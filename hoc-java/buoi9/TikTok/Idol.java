package TikTok;

import java.util.ArrayList;

public class Idol {
   
    private String name;
    private int id;
    private String email;
    private String group;
    private ArrayList<Follower> followers;

    public Idol(String name, int id, String email, String group, ArrayList<Follower> followers) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
        this.followers = followers;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    @Override
    public String toString() {
        return "Idol [email=" + email + ", followers=" + followers + ", group=" + group + ", id=" + id + ", name="
                + name + "]";
    }
    
}
