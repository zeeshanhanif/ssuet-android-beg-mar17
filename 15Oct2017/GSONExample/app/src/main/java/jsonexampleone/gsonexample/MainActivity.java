package jsonexampleone.gsonexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    String jsonObj = "{'name':'Student 1','age':20,'gpa':2.3}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView etName = (TextView) findViewById(R.id.StudentName);
        TextView etAge = (TextView) findViewById(R.id.StudentAge);
        TextView etGpa = (TextView) findViewById(R.id.StudentGpa);
        TextView etJson = (TextView) findViewById(R.id.StudentJson);

        Gson gson = new Gson();

        Student student = gson.fromJson(jsonObj,Student.class);
        etName.setText(student.getName());
        etAge.setText(String.valueOf(student.getAge()));
        etGpa.setText(String.valueOf(student.getGpa()));

        Student st = new Student("Hello Student",40,4.5);
        String json = gson.toJson(st);
        etJson.setText(json);


    }
}
