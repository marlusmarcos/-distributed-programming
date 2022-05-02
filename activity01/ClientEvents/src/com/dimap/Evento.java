package com.dimap;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Evento extends Remote {
	
	public String getNome()throws RemoteException;

	public void setNome(String nome)throws RemoteException;

	public List<Observer> getObservers()throws RemoteException;

	public void setObservers(Observer ob)throws RemoteException;
	
	 void notificar (String m) throws RemoteException;

}
