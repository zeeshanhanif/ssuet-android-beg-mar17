package httprequestdemoone.firebasedemo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contacts;
    String updateId;
    DatabaseReference contactsRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference reference = database.getReference();
        contactsRef = reference.child("contacts");

        final EditText nameEt = findViewById(R.id.etName);
        final EditText phoneEt = findViewById(R.id.etPhone);
        Button saveBtn = findViewById(R.id.saveBtn);
        final ListView myContactList = findViewById(R.id.myContactList);
        contacts = new ArrayList<>();
        final ContactsListAdapter adapter = new ContactsListAdapter(this, contacts, new ContactItemListner() {
            @Override
            public void onUpdate(Contact contact) {
                nameEt.setText(contact.getName());
                phoneEt.setText(contact.getPhone());
                updateId = contact.getId();
            }

            @Override
            public void onDelete(Contact contact) {
                contactsRef.child(contact.getId()).removeValue();
            }
        });
        myContactList.setAdapter(adapter);



        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                String phone = phoneEt.getText().toString();
                String key = updateId;
                if(updateId == null){
                    key = contactsRef.push().getKey();
                }
                Contact contact = new Contact(name,phone,key);
                contactsRef.child(key).setValue(contact);
                updateId = null;
                nameEt.setText("");
                phoneEt.setText("");
            }
        });

        contactsRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Contact contact = dataSnapshot.getValue(Contact.class);
                contacts.add(contact);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Contact contact = dataSnapshot.getValue(Contact.class);
                int indexOfItem = contacts.indexOf(contact);
                if(indexOfItem >= 0){
                    contacts.set(indexOfItem,contact);
                }
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Contact contact = dataSnapshot.getValue(Contact.class);
                int indexOfItem = contacts.indexOf(contact);
                contacts.remove(indexOfItem);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
