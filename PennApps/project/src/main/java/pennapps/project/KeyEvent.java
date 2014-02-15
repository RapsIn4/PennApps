package pennapps.project;

import java.io.Serializable;

/**
 * Created by Michael on 2/14/2014.
 */
public class KeyEvent extends Event {
    static final long serialVersionUID = 1L;
    private int type;
    private char key; // only set if type is key

    KeyEvent ( int type, char c ) {
        this.key = c;
        this.type = type;
    }

    public void SetKey( char c ) {
        this.key = c;
    }

    public char GetKey() {
        return this.key;
    }

    public int GetType () {
        return this.type;
    }

}
