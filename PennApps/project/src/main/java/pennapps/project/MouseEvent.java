package pennapps.project;

import android.graphics.Point;

/**
 * Created by Michael on 2/14/2014.
 */
public class MouseEvent implements Event {
    enum EventType { MOUSEDOWN, MOUSEUP, MOUSEMOVE }
    Point point; /* only set for mouse type
                    position of the cursor */
    EventType type;

    MouseEvent ( EventType type, Point point ) {
        this.type = type;
        this.point = point;
    }

    EventType GetType() {
        return this.type;
    }

}
