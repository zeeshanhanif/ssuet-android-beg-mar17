package sqlite.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MySqliteHelper dbHelper = new MySqliteHelper(MainActivity.this);

        ListView myList = findViewById(R.id.myList);
        ArrayList<Contact> contacts = dbHelper.getContacts();
        ArrayAdapter<Contact> adapter = new ArrayAdapter<Contact>(this,android.R.layout.simple_list_item_1,contacts);
        myList.setAdapter(adapter);

        final EditText etName = findViewById(R.id.etName);
        final EditText etPhone = findViewById(R.id.etPhone);

        Button saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long id = dbHelper.addContact(etName.getText().toString(),etPhone.getText().toString());
                Toast.makeText(MainActivity.this,"Saved "+id,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
