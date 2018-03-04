package org.rr0.ufoathome.model.sky;

/**
 * @author Jer�me Beau
 * @version 4 d�c. 2003 23:08:42
 */
public class SkyEvent extends java.util.EventObject {
    protected Object value;

    public SkyEvent(Object source, Object value) {
        super(source);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
