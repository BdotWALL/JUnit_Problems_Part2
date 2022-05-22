package interfaceinaboxjunit5;

public class CD implements Packable{
    private String artist;
    private String name;
    private int pubYear;
    private double weight;

    public CD (String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = weight();
      
    }

    public double weight(){
        return weight = .1;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }
    
}
