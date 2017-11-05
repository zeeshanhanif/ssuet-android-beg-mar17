package httpexample.httpexample;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class Book {
    String kind,id;


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

    @Override
    public String toString() {
        return "Book{" +
                "kind='" + kind + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
