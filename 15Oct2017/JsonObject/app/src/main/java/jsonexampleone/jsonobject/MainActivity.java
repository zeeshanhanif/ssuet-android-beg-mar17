package jsonexampleone.jsonobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String jsonObj = "{'name':'Student 1','age':20,'gpa':2.3}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView etName = (TextView) findViewById(R.id.StudentName);
        TextView etAge = (TextView) findViewById(R.id.StudentAge);
        TextView etGpa = (TextView) findViewById(R.id.StudentGpa);

        try {
            JSONObject jsonObject = new JSONObject(jsonObj);

            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");
            double gpa = jsonObject.getInt("gpa");

            Student st = new Student(name,age,gpa);
            
            etName.setText(st.getName());
            etAge.setText(String.valueOf(st.getAge()));
            etGpa.setText(String.valueOf(st.getGpa()));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
