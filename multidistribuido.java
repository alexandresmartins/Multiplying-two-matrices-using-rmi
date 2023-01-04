package q4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface multidistribuido extends Remote {
	public void multiplica(int a[][], int b[][]) throws RemoteException;
	public void exibe() throws RemoteException;
}
