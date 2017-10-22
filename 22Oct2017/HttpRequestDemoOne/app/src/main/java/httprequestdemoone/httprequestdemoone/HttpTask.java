package httprequestdemoone.httprequestdemoone;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ishaq Hassan on 10/22/2017.
 */

public class HttpTask extends AsyncTask<Void,Void,String> {
    TextView tv;

    HttpTask(TextView tv){
        this.tv = tv;
    }

    @Override
    protected String doInBackground(Void... params) {
        URL url;
        HttpURLConnection urlConnection = null;
        String response = "";
        try {
            url = new URL("http://www.google.com");

            urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = urlConnection.getInputStream();
            InputStreamReader isw = new InputStreamReader(in);
            int data = isw.read();

            while (data != -1) {
                char current = (char) data;
                data = isw.read();
                Log.e("responseInt",data+"");
                response += current;
                Log.e("responseStr",response);
                Log.e("responseChr",String.valueOf(current));
            }
        } catch (Exception e) {
            Log.e("responseException",e.getMessage());
            e.printStackTrace();
        } finally {
            Log.e("responseFInally","hello");
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        Log.e("response","sending");
        return response;
    }

    @Override
    protected void onPostExecute(String s) {
        Log.e("POST EXECUTE",s);
        tv.setText(s);
    }
}
