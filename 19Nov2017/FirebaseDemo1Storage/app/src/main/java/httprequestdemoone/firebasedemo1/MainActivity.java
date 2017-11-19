package httprequestdemoone.firebasedemo1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    ArrayList<Contact> contacts;
    String updateId;
    DatabaseReference contactsRef;
    private final int PICK_IMAGE = 100;
    ImageView contactImage;
    Uri selectedimg;
    FirebaseStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        storage = FirebaseStorage.getInstance();

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference reference = database.getReference();
        contactsRef = reference.child("contacts");

        final EditText nameEt = findViewById(R.id.etName);
        final EditText phoneEt = findViewById(R.id.etPhone);
        Button saveBtn = findViewById(R.id.saveBtn);
        Button logout = findViewById(R.id.logout);
        contactImage = findViewById(R.id.contactImage);


        contactImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                finish();
            }
        });

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
                uploadImage(selectedimg,key);
                Contact contact = new Contact(name,phone,key);
                contactsRef.child(key).setValue(contact);
                updateId = null;
                nameEt.setText("");
                phoneEt.setText("");
                contactImage.setImageResource(0);
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



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == PICK_IMAGE) {
            selectedimg = data.getData();
            try {
                contactImage.setImageBitmap(MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedimg));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void uploadImage(Uri uri, final String key){
        if(uri == null){
            return;
        }
        StorageReference storageRef = storage.getReference();
        StorageReference fileRef = storageRef.child(key+".jpg");

        UploadTask uploadTask = fileRef.putFile(uri);
        uploadTask.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle unsuccessful uploads
            }
        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                // taskSnapshot.getMetadata() contains file metadata such as size, content-type, and download URL.
                Uri downloadUrl = taskSnapshot.getDownloadUrl();
                String downloadUrlStr = downloadUrl.toString();
                contactsRef.child(key).child("image").setValue(downloadUrlStr);
                Toast.makeText(MainActivity.this,"Upload Successful",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
