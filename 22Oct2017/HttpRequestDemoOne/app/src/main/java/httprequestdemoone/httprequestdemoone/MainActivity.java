package httprequestdemoone.httprequestdemoone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendReq = (Button) findViewById(R.id.sendReq);
        final TextView responseText = (TextView) findViewById(R.id.responseText);
        sendReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpTask httpTask = new HttpTask(responseText);
                httpTask.execute();
            }
        });
    }
}
