package roomlibrarydemo.roomlibrarydemo;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameEt = findViewById(R.id.nameTv);
        final EditText phoneEt = findViewById(R.id.phoneTv);
        Button saveBtn = findViewById(R.id.saveBtn);
        Button getAllBtn = findViewById(R.id.getAllBtn);

        db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"my-app.db").build();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = nameEt.getText().toString();
                String phoneStr = phoneEt.getText().toString();
                new MyDbTask(db,1).execute(new Contact(nameStr,phoneStr));

            }
        });

        getAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*List<Contact> contacts = db.contacts().selectAllContacts();
                for(Contact contact : contacts){
                    Log.e("Contact ",contact.toString());
                }*/
            }
        });
    }
}
