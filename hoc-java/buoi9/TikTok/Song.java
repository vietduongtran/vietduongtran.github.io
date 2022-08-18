package TikTok;

public class Song {
    private int Id;
    private String name;
    private String singer;
    
    public Song(int Id, String name, String singer) {
        this.Id = Id;
        this.name = name;
        this.singer = singer;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }


}
