package httprequestdemoone.firebasedemo1;

/**
 * Created by Ishaq Hassan on 11/19/2017.
 */

public class Contact {
    private String name;
    private String phone;
    private String image;
    private String id;

    public Contact() {
    }

    public Contact(String name, String phone, String id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Contact anotherContact = (Contact) obj;
        return anotherContact.getId().equals(this.id);
    }
}
