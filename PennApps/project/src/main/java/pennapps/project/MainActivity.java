package pennapps.project;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.widget.Toast;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;

import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;

public class MainActivity extends Activity {

    private Button btn1, btn2;
    private PrintWriter printWriter;
    private Socket socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

    }

    public void onClick(View v) {
        switch ( v.getId() ) {
            case R.id.btn1:
                Log.i("MainActivity", "btn1");
                new Network().execute(new MouseEvent(1, new Point(0, 0)));
                break;
            case R.id.btn2:
                Log.i("MainActivity", "btn2");
                new Network().execute(new KeyEvent(1, 'z'));
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch ( item.getItemId() ) {
            case R.id.add_layout:
                Log.i("MainActivity", "startLayout");
                Toast.makeText(getApplicationContext(), "Layout Maker", Toast.LENGTH_SHORT).show();
                Intent startNewActivityOpen = new Intent(MainActivity.this, LayoutMaker.class);
                startActivityForResult(startNewActivityOpen, 0);
                break;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}