package pennapps.project;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
/**
 * Created by Michael on 2/15/2014.
 */
public class Network extends AsyncTask<String, Void, Void> {

    private Socket socket;
    private PrintWriter printWriter;
    @Override
    protected Void doInBackground(String... url) {
        try {
            socket = new Socket("158.130.165.210", 14444);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.write("SUCK MY DICK");
            printWriter.flush();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
