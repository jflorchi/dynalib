package io.paratek.dynanode.server;

import io.paratek.dynanode.client.DynaClientCallback;

import java.awt.*;
import java.rmi.RemoteException;

/**
 * Service that will mediate events when our injection calls the function
 *
 * @author Parametric
 */
public class DynaCallbackService {

    private DynaClientCallback callback;

    /**
     * Registers a Callback interface with the Service
     * @param callback
     */
    public void registerCallback(final DynaClientCallback callback) {
        this.callback = callback;
        try {
            callback.println("Successfully Registered Callback Object!");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public DynaClientCallback getCallback() {
        return callback;
    }

    /*
    Singleton
     */

    private static DynaCallbackService service = new DynaCallbackService();

    public static DynaCallbackService getService() {
        return service;
    }

}
