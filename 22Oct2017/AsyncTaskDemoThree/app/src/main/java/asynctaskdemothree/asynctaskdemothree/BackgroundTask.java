package asynctaskdemothree.asynctaskdemothree;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 10/22/2017.
 */

public class BackgroundTask extends AsyncTask<Integer,Void,Void> {
    TextView tv;
    int counter;
    public BackgroundTask(TextView tv) {
        this.tv = tv;
    }

    @Override
    protected Void doInBackground(Integer... params) {
        int count = params[0];
        for(int i = 0;i<=count;i++){
            //countTv.setText(String.valueOf(i));
            counter++;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        tv.setText("TASK COMPLETE at Count: "+counter);
    }
}
