package com.dimap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObserverImpl extends UnicastRemoteObject implements Observer{
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public ObserverImpl(String name) throws RemoteException {
		super();
		this.name = name;
	}

	protected ObserverImpl() throws RemoteException {
		super();
		
	}

	@Override
	public void updateEvents(String m) throws RemoteException {
		System.out.println("Observador: "+ name + ", recebendo a notificação: "+m );
		
	}

}
