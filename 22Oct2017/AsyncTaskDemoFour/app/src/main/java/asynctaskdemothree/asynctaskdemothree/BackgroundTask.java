package asynctaskdemothree.asynctaskdemothree;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 10/22/2017.
 */

public class BackgroundTask extends AsyncTask<Integer,Void,Integer> {
    TextView tv;

    public BackgroundTask(TextView tv) {
        this.tv = tv;
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        int count = params[0];
        int counter = 0;
        for(int i = 0;i<=count;i++){
            //countTv.setText(String.valueOf(i));
            counter++;
        }
        return counter;
    }

    @Override
    protected void onPostExecute(Integer val) {
        tv.setText("TASK COMPLETE at Count: "+val);
    }
}
