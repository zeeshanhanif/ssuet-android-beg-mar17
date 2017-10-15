package jsonexampleone.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    String json = "[\n" +
            "  {\n" +
            "   name:\"Student 1\",\n" +
            "   age:20,\n" +
            "   gpa:2.3\n" +
            "  },\n" +
            "  {\n" +
            "   name:\"Student 2\",\n" +
            "   age:30,\n" +
            "   gpa:2.6\n" +
            "  },\n" +
            "  {\n" +
            "   name:\"Student 3\",\n" +
            "   age:40,\n" +
            "   gpa:2.9\n" +
            "  }\n" +
            "]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView jsonName = (TextView) findViewById(R.id.jsonName);
        TextView jsonAge = (TextView) findViewById(R.id.jsonAge);
        TextView jsonGpa = (TextView) findViewById(R.id.jsonGpa);

        try {
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0;i<jsonArray.length();i++){
                String name = jsonArray.getJSONObject(i).getString("name");
                String age = jsonArray.getJSONObject(i).getString("age");
                String gpa = jsonArray.getJSONObject(i).getString("gpa");
                jsonName.setText(jsonName.getText()+","+name);
                jsonAge.setText(jsonAge.getText()+","+age);
                jsonGpa.setText(jsonGpa.getText()+","+gpa);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
