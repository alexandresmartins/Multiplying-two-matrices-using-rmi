package q4;

import java.rmi.RemoteException;

public class multi implements multidistribuido{
	int c[][]=new int[3][3]; 
	public void multiplica(int a[][], int b[][]) throws RemoteException{
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      
			} 
			}  
			}    
	}
	public void exibe() throws RemoteException{
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.println(c[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
