package onclick.onclickattribute;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myOnClick(View a){
        Toast.makeText(this,"Hello World Click!",Toast.LENGTH_SHORT).show();
    }
}
