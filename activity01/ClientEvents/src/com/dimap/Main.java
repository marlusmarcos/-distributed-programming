package com.dimap;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class Main {

public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		ServerEvents server = (ServerEvents) 
				Naming.lookup("rmi://127.0.0.1:1098/ServerEvents");
		Naming.lookup("rmi://127.0.0.1:1098/ServerEvents");

		Observer client1 = new ObserverImpl("Jean");
		ObserverImpl client2 = new ObserverImpl("Marlus");
		Observer client3 = new ObserverImpl("Mikael");
		Observer client4 = new ObserverImpl("Marcos");
		Observer client5 = new ObserverImpl("Andre");
		
		server.criarTopico("fuutebol");
		server.getEvento(0).setObservers(client4);
		server.getEvento(0).setObservers(client3);
		server.getEvento(0).setObservers(client2);
		server.criarTopico("filmes");
		server.getEvento(1).setObservers(client1);
		server.getEvento(1).setObservers(client5);
		server.getEvento(0).notificar("NOtificando para os interessados, ABC CAMPEÃO ESTADUAL 2022 com o placar de 4x2 em cima do 4meric4 no tópico: " + server.getEvento(0).getNome() );
		server.getEvento(1).notificar("notificando todos sobre o filme do doutor estranho: " + server.getEvento(1).getNome() );
		

	}
}
