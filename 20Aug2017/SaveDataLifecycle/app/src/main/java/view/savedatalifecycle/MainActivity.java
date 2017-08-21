package view.savedatalifecycle;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myNameEt;
    String KEY = "MY_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myNameEt = (EditText) findViewById(R.id.myNameEt);
        myNameEt.setText(getSharedPreferences(KEY,0).getString("MY_NAME",""));

    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sharedPreferences = getSharedPreferences(KEY,0);
        sharedPreferences.edit()
                .putString("MY_NAME",myNameEt.getText().toString()).apply();
    }
}
