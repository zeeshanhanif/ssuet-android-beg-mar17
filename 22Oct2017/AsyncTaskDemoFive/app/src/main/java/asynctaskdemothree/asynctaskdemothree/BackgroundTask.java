package asynctaskdemothree.asynctaskdemothree;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 10/22/2017.
 */

public class BackgroundTask extends AsyncTask<Integer,Integer,Integer> {
    TextView tv;

    public BackgroundTask(TextView tv) {
        this.tv = tv;
    }

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        Log.e("PROGRESS COUNT",""+values[0]);
        tv.setText("TASK PROGRESS at Count: "+values[0]);
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        int count = params[0];
        int counter = 0;
        for(int i = 0;i<=count;i++){
            counter++;
            publishProgress(counter);
        }
        return counter;
    }

    @Override
    protected void onPostExecute(Integer val) {
        tv.setText("TASK COMPLETE at Count: "+val);
    }
}
