package booksapigson.booksapigson;

/**
 * Created by Ishaq Hassan on 10/29/2017.
 */

public class Book {
    String kind;
    String id;
    String etag;
    String selfLink;

    public Book() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @Override
    public String toString() {
        return "Book{" +
                "kind='" + kind + '\'' +
                ", id='" + id + '\'' +
                ", etag='" + etag + '\'' +
                ", selfLink='" + selfLink + '\'' +
                '}';
    }
}
