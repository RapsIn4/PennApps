package pennapps.project;

import java.util.ArrayList;

/**
 * Created by Michael on 2/14/2014.
 */
public class eventQueue {
    ArrayList<Event> eventQueue;

    /**
     * Add an event to be processed
     */
    void AddToQueue( Event e ) {
        eventQueue.add( e );
    }

    /**
     * Pass the next event to the server to process
     */
    void PassNextEvent() {
        // package event and send to server to process

    }

}
