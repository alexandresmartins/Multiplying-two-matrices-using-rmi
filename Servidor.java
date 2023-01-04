package q4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
	public static void main(String[] args) {
		try {
			multi m = new multi();
			
			System.setProperty("java.rmi.server.hostname","localhost");
			multidistribuido stub = (multidistribuido) UnicastRemoteObject.exportObject(m, 0);
			
			Registry registro = LocateRegistry.createRegistry(2000);
			registro.bind("Multiplicador", stub);
			
			System.out.println("Servidor pronto!");	
			
		} catch (Exception e){
			System.err.println("Erro :" + e.toString());
		}
	}
}
