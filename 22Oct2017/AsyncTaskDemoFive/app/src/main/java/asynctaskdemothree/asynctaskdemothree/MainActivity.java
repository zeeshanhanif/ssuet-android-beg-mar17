package asynctaskdemothree.asynctaskdemothree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etCount = (EditText) findViewById(R.id.etCount);
        final TextView countTv = (TextView)findViewById(R.id.countTv);
        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackgroundTask bg = new BackgroundTask(countTv);
                bg.execute(Integer.valueOf(etCount.getText().toString()));
            }
        });
    }
}
