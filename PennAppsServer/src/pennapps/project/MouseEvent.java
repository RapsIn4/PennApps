package pennapps.project;


import java.io.Serializable;


/**
 * Created by Michael on 2/14/2014.
 */
public class MouseEvent implements Serializable{
    static final long serialVersionUID = 1L;
    private int type;
    private Point point; /* only set for mouse type
                    position of the cursor */
    MouseEvent() {
        type = 1;
        point = new Point(0, 0);
    }

    MouseEvent ( int type, Point point ) {
        this.type = type;
        this.point = point;
    }

    int GetType() {
        return this.type;
    }
    
    Point GetPoint() {
        return point;
    }

}
