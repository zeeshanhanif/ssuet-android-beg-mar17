package findviewbyid.form;

/**
 * Created by Ishaq Hassan on 8/13/2017.
 */

public class Student {
    private String name;
    private String email;
    private String phone;

    Student(String name,String email,String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
