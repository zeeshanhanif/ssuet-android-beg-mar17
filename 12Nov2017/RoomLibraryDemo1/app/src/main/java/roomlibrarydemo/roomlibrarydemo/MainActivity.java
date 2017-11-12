package roomlibrarydemo.roomlibrarydemo;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText idEt = findViewById(R.id.idTv);
        final EditText nameEt = findViewById(R.id.nameTv);
        final EditText phoneEt = findViewById(R.id.phoneTv);
        Button saveBtn = findViewById(R.id.saveBtn);
        Button getAllBtn = findViewById(R.id.getAllBtn);
        Button updateBtn = findViewById(R.id.updateBtn);
        Button deleteBtn = findViewById(R.id.deleteBtn);
        Button getContactBtn = findViewById(R.id.getContactBtn);

        db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"my-app.db").allowMainThreadQueries().build();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = nameEt.getText().toString();
                String phoneStr = phoneEt.getText().toString();
                //new MyDbTask(db,1).execute(new Contact(nameStr,phoneStr));
                db.contacts().insertContact(new Contact(nameStr,phoneStr));
            }
        });

        getAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Contact> contacts = db.contacts().selectAllContacts();
                for(Contact contact : contacts){
                    Log.e("Contact ",contact.toString());
                }
            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.valueOf(idEt.getText().toString());
                Contact contact = db.contacts().getContactById(id);
                db.contacts().deleteContact(contact);
            }
        });

        getContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.valueOf(idEt.getText().toString());
                Contact contact = db.contacts().getContactById(id);
                nameEt.setText(contact.getName());
                phoneEt.setText(contact.getPhone());
                idEt.setText(String.valueOf(contact.getId()));
            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = nameEt.getText().toString();
                String phoneStr = phoneEt.getText().toString();
                int id = Integer.valueOf(idEt.getText().toString());
                Contact contact = new Contact(nameStr,phoneStr);
                contact.setId(id);
                db.contacts().updateContact(contact);
            }
        });

    }
}
