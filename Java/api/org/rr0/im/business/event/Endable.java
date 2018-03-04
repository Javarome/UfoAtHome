package org.rr0.im.business.event;

import org.rr0.im.business.event.circumstance.Moment;

/**
 * Something that have a unique start time (and optionnaly end time).
 *
 * @author J�r�me Beau
 * @version 15 juin 2003 18:05:12
 */
public interface Endable extends Timeable
{
    /**
     * @associates <{org.rr0.im.business.event.circumstance.Moment}>
     * @supplierRole end moment 
     */
    Moment getEnd ();
}
