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

                // TODO Auto-generated method stub

                try {

                    Socket socket=new Socket("10.0.2.2",6666);

                    ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());

                    out.writeObject("Hi im the client");

                    out.flush();

                    ObjectInputStream in=new ObjectInputStream(socket.getInputStream());

                    String msg=(String) in.readObject();

                    //TextView t=(TextView) findViewById(R.id.btn2);
                    System.out.println(msg);
                    //t.setText(msg);

                    out.close();

                    in.close();

                } catch (IOException e) {

                    // TODO Auto-generated catch block

                    e.printStackTrace();

                } catch (ClassNotFoundException e) {

                    // TODO Auto-generated catch block

                    e.printStackTrace();

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