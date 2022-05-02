package com.dimap;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class Main {

public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		ServerEvents server = (ServerEvents) 
				Naming.lookup("rmi://127.0.0.1:1098/ServerEvents");
	//	ServerEvents server2 = (ServerEvents) 
		//		Naming.lookup("rmi://127.0.0.1:1098/ServerEvents");

		Observer client = new ObserverImpl("Jean");
		ObserverImpl client2 = new ObserverImpl("Marlus");
		Observer client3 = new ObserverImpl("Mikael");
		Observer client4 = new ObserverImpl("Marcos");
		
		server.criarTopico("fuutebol");
		server.getEvento(0).setObservers(client4);
		server.getEvento(0).setObservers(client3);
		server.getEvento(0).setObservers(client2);
		server.criarTopico("filmes");
		server.getEvento(1).setObservers(client);
		server.getEvento(0).notificar("teste de notificacao do topico: " + server.getEvento(0).getNome() );
		server.getEvento(1).notificar("teste de notificacao do topico: " + server.getEvento(1).getNome() );
		
//		server.register(client2);
//		server.register(client3);
//		server.register(client4);
//		server.notificarSubscriber("notificando sobre futebol ");
//		server.notificarSubscriber("notificando sobre filme ");
//		//server.notificarSubscriber("notificando sobre series ");
//		//client2.getNotificacoes();
//		for (String m : client2.getM_list()) {
//			System.out.println(m);
//		}
	}
}
