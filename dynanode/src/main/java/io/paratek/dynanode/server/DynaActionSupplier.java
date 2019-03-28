package io.paratek.dynanode.server;


import io.paratek.dynanode.DynaAction;

import java.util.HashMap;

/**
 * Handles actions in the client instance
 *
 * @author Parametric
 */
public class DynaActionSupplier {

    private static final DynaActionSupplier mediator = new DynaActionSupplier();
    public static HashMap<String, byte[]> classData = new HashMap<>();
    private volatile DynaAction action = null, lastAction;

    public static DynaActionSupplier getSupplier() {
        return mediator;
    }

    public void setLastAction(int i, int i2, int i3, int i4, String s1, String s2) {
        this.lastAction = new DynaAction(i, i2, i3, i4, s1, s2);
    }

    public DynaAction getAction() {
        return action;
    }

    public void setAction(DynaAction action) {
        this.action = action;
    }

    public DynaAction getLastAction() {
        return lastAction;
    }

}
