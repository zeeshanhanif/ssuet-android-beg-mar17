package findviewbyid.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText phone = (EditText) findViewById(R.id.phone);
        Button saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = name.getText().toString();
                String emailStr = email.getText().toString();
                String phoneStr = phone.getText().toString();

                if(nameStr.isEmpty()){
                    name.setError("Please Enter Your Name!");
                    return;
                }

                name.setError(null);

                Student st = new Student(nameStr,emailStr,phoneStr);

                Toast.makeText(MainActivity.this,"Name : "+st.getName(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
