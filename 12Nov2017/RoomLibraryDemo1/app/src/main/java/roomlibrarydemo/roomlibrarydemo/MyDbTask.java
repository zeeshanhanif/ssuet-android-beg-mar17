package roomlibrarydemo.roomlibrarydemo;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ishaq Hassan on 11/12/2017.
 */

public class MyDbTask extends AsyncTask<Contact,Void,List<Contact>>{
    AppDatabase appDatabase;
    int mode;

    public MyDbTask(AppDatabase appDatabase,int mode) {
        this.appDatabase = appDatabase;
        this.mode = mode;
    }

    @Override
    protected List<Contact> doInBackground(Contact... contacts) {
        appDatabase.contacts().insertContact(contacts[0]);
        List<Contact> allContacts = new ArrayList<>();
        if(mode == 0){
            allContacts = appDatabase.contacts().selectAllContacts();
        }
        if(mode == 1){
            allContacts.add(appDatabase.contacts().getContactById(1));
        }
        return allContacts;
    }

    @Override
    protected void onPostExecute(List<Contact> contacts) {
        for(Contact contact : contacts){
            Log.e("Contact ",contact.toString());
        }
    }
}
