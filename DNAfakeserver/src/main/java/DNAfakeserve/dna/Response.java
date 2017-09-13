package DNAfakeserve.dna;

/**
 * Created by bibek on 8/11/17.
 */
public class Response {
    private Data data;
    private Link links;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }
}
