package com.dimap;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Observer extends Remote {
	
	public void updateEvents(String m) throws RemoteException;
	//public String myId ();

}
