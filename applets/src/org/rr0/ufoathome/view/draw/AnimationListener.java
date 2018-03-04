package org.rr0.ufoathome.view.draw;

/**
 * @author Jer�me Beau
 * @version 30 janv. 2004 20:41:04
 */
public interface AnimationListener {
    void timeChanged(AnimationEvent timeEvent);

    void animationStarted();

    void animationStopped();

    void modeChanged(String mode);
}
