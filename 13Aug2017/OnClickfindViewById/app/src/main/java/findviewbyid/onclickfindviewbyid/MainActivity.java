package findviewbyid.onclickfindviewbyid;

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
        final EditText myEditText = (EditText) findViewById(R.id.myEditText);
        Button myButton = (Button) findViewById(R.id.myButton);
        View.OnClickListener myListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myText = myEditText.getText().toString();
                Toast.makeText(MainActivity.this,myText,Toast.LENGTH_SHORT).show();
            }
        };
        myButton.setOnClickListener(myListner);

    }
}
