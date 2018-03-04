package org.rr0.im.business.event.circumstance;

import org.rr0.im.service.function.classification.Classifiable;
/**
 * 
 *
 * @author J�r�me Beau
 * @version 10 mai 2003 17:04:20
 */
public interface Temperature extends Classifiable {
    float getCelcius ();

    float getFarenheit ();
}
