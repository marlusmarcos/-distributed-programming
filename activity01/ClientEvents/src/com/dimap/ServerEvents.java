package com.dimap;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerEvents extends Remote{
	
	public void register (Observer o) throws RemoteException;
	
	public void notificarSubscriber (String notificacao) throws RemoteException;

}
