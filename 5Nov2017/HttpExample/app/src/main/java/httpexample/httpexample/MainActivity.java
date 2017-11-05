package httpexample.httpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    ArrayList<Book> booksArray;
    ArrayAdapter<Book> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        booksArray = new ArrayList<>();
        adapter = new ArrayAdapter<Book>(this,android.R.layout.simple_list_item_1,booksArray);
        listView.setAdapter(adapter);
        getHttpData();
    }

    private void getHttpData(){
        AsyncHttpClient httpClient = new AsyncHttpClient();
        httpClient.get("https://www.googleapis.com/books/v1/volumes?q=quilting",new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try{
                    JSONArray items = response.getJSONArray("items");
                    Gson gson = new Gson();
                    Book[] books = gson.fromJson(items.toString(),Book[].class);
                    booksArray.addAll(Arrays.asList(books));
                    adapter.notifyDataSetChanged();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}





