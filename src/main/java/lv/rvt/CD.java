package lv.rvt;

public class CD implaments Packable {
    private String artist;
    private String cd_name;
    private int pub_year;
    private double weight = 0.1;

    public CD(String artist, String cd_name, int pub_year) {
        this.artist = artist;
        this.cd_name = cd_name;
        this.pub_year = pub_year;
    }
    
}
