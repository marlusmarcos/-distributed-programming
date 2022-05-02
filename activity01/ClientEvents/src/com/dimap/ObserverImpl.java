package com.dimap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ObserverImpl extends UnicastRemoteObject implements Observer{
	private String name;
	private ArrayList<String> m_list = new ArrayList<>();
	

	public ArrayList<String> getM_list() {
		return m_list;
	}

	public void setM_list(ArrayList<String> m_list) {
		this.m_list = m_list;
	}

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
		m_list.add(m);
		System.out.println("Observador: "+ name + ", recebendo a notificação: "+m );
		
	}
	

}
