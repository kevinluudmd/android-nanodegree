package kluu.project0;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bind ui button events. hard coded for now
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonDelegator(View v) {
        final int id = v.getId();
        String app_name = "";
        switch (id) {
            case R.id.spotify_btn:
                app_name = "spotify";
                break;
            case R.id.scores_btn:
                app_name = "score";
                break;
            case R.id.library_btn:
                app_name = "library";
                break;
            case R.id.bib_btn:
                app_name = "build it bigger";
                break;
            case R.id.xyz_btn:
                app_name = "xyz";
                break;
            case R.id.capstone_btn:
                app_name = "capstone";
                break;
            default:
        }
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + app_name + " app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

}
