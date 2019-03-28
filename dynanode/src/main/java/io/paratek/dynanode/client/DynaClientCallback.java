package io.paratek.dynanode.client;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Parametric
 */
public interface DynaClientCallback extends Remote, Serializable {

    /**
     * Used for debugging
     *
     * @param line
     * @throws RemoteException
     */
    void println(String line) throws RemoteException;

}
