package jsonexampleone.listgson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String studentsJson = "[\n" +
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

        Gson gson = new Gson();

        Student[] students = gson.fromJson(studentsJson,Student[].class);
        ArrayList<Student> students1 = new ArrayList<>(Arrays.asList(students));
        //students1.addAll(Arrays.asList(students));

    }
}
