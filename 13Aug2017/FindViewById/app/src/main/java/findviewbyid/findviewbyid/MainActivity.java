package findviewbyid.findviewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        String myText = myTextView.getText().toString();
        Toast.makeText(this,myText,Toast.LENGTH_SHORT).show();
    }
}
