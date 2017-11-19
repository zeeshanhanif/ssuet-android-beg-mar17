package httprequestdemoone.firebasedemo1;

/**
 * Created by Ishaq Hassan on 11/19/2017.
 */

public interface ContactItemListner {
    void onUpdate(Contact contact);

    void onDelete(Contact contact);
}
