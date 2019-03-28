package io.paratek.dynanode;

import io.paratek.dynanode.client.DynaClientCallback;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface to interact with OSRS remotely
 *
 * @author Parametric
 */
public interface DynaBridge extends Remote {


    /**
     * Passes a reference to our client side callback to the RMI server
     * @param callback
     * @throws RemoteException
     */
    void registerCallback(final DynaClientCallback callback) throws RemoteException;


    /**
     * Every time the game is clicked, an action is created and stored for this use
     * @return the action we stored
     * @throws RemoteException
     */
    DynaAction getLastAction() throws RemoteException;


    /**
     * Sets the Action that will override the next action that will be sent upon a mouse click
     * @param action action to execute
     * @throws RemoteException
     */
    void setLastAction(final DynaAction action) throws RemoteException;


    /**
     * Retrieves a loaded class in the remote JVM
     * @param name the name of the desired class
     * @return the byte[] representation of the class
     * @throws RemoteException
     */
    byte[] fetchClass(final String name) throws RemoteException;


    /**
     * Redefines a class in the remote JVM
     * @param name the name of the class to redefine
     * @param bytes the bytes of the new class
     * @return if redefinition was successful
     * @throws RemoteException
     */
    boolean redefineClass(final String name, final byte[] bytes) throws RemoteException;

}
