package httpjsonexample.httpjsonexample;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ArrayList<String> data;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGet = (Button)findViewById(R.id.btnGet);
        pd = new ProgressDialog(this);
        pd.setTitle("Loading Data...");
        ListView myHttpList = (ListView)findViewById(R.id.myHttpList);
        data = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        myHttpList.setAdapter(adapter);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getHttpData();
            }
        });
    }

    private void getHttpData(){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://www.googleapis.com/books/v1/volumes?q=quilting",new JsonHttpResponseHandler(){
            @Override
            public void onStart() {
                pd.show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try {
                    JSONArray items = response.getJSONArray("items");
                    for(int i = 0;i<items.length();i++){
                        JSONObject item = items.getJSONObject(i);
                        String name = item.getJSONObject("volumeInfo").getString("title");
                        Log.e("RESPONSE OBJECT AT "+i,name);
                        data.add(name);
                        adapter.notifyDataSetChanged();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("JSONException","REQUEST FAILED");
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
               Log.e("onFailure","REQUEST FAILED "+responseString);
            }

            @Override
            public void onFinish() {
                pd.dismiss();
            }
        });
    }
}
