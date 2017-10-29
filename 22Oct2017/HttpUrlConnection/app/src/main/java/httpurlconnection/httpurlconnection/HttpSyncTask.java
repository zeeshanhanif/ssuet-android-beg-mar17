package httpurlconnection.httpurlconnection;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ishaq Hassan on 10/29/2017.
 */

public class HttpSyncTask extends AsyncTask<String,Void,String> {
    TextView tv;

    public HttpSyncTask(TextView tv) {
        this.tv = tv;
    }

    @Override
    protected String doInBackground(String... strings) {
        String webPage = "";
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String data="";

            while ((data = reader.readLine()) != null){
                webPage += data + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return webPage;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.e("Response",s);
        tv.setText(s);
    }
}
