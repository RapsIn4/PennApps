package pennapps.project;
import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.net.Socket;

import java.net.UnknownHostException;

import android.os.Bundle;

import android.app.Activity;

import android.view.Menu;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button b=(Button) findViewById(R.id.btn1);

        b.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                switch ( v.getId() ) {
                    case R.id.btn1:
                        Log.i("MainActivity", "btn1");
                        new Network().execute(new MouseEvent(1, new Point(0, 0)));
                        break;
                    case R.id.btn2:
                        Log.i("MainActivity", "btn2");

                        break;
                }
            }
        });
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.layout.fragment_main, menu);

        return true;

    }

}
