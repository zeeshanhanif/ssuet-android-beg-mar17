package httprequestdemoone.firebasedemo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameEt = findViewById(R.id.etName);
        final EditText phoneEt = findViewById(R.id.etPhone);
        Button saveBtn = findViewById(R.id.saveBtn);
        final ListView myContactList = findViewById(R.id.myContactList);
        contacts = new ArrayList<>();
        final ArrayAdapter<Contact> adapter = new ArrayAdapter<Contact>(this,android.R.layout.simple_list_item_1,contacts);
        myContactList.setAdapter(adapter);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference reference = database.getReference();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                String phone = phoneEt.getText().toString();
                String key = reference.child("contacts").push().getKey();
                Contact contact = new Contact(name,phone,key);
                reference.child("contacts").child(key).setValue(contact);
            }
        });

        reference.child("contacts").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Contact contact = dataSnapshot.getValue(Contact.class);
                contacts.add(contact);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

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
