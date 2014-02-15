package pennapps.project;


import java.io.Serializable;

/**
 * Created by Michael on 2/14/2014.
 */
abstract class Event implements Serializable{
    abstract char GetKey();
    abstract int GetType();
}
