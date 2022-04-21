package com.dimap;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class Main {

public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		ServerEvents server = (ServerEvents) 
				Naming.lookup("rmi://127.0.0.1:1098/ServerEvents");

		Observer client = new ObserverImpl("teste1");
		Observer client2 = new ObserverImpl("Marlus");
		Observer client3 = new ObserverImpl("mkael");
		Observer client4 = new ObserverImpl("marcos");
		
		server.register(client2);
		server.register(client3);
		server.register(client4);
		server.notificarSubscriber("notificando ");
	}
	
}
