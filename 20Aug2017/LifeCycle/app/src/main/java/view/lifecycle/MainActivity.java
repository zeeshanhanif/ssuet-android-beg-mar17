package view.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate","onCreate Called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","onStart Called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume","onResume Called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause","onPause Called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","onStop Called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","onDestroy Called!");
    }
}
