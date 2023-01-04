package q4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 2000);
			multidistribuido stub = (multidistribuido) registro.lookup("Multiplicador");
			int i;
			int j;
			int a[][] = new int[3][3];
			int b[][] = new int[3][3];
			Scanner in = null;
			in = new Scanner(System.in);
			System.out.println("Entre com os elementos da matriz A:");
            for (i = 0; i < 3; i++)
                for (j = 0; j < 3; j++)
                    a[i][j] = in.nextInt();
            
            System.out.println("Entre com os elementos da matriz B:");
            for (i = 0; i < 3; i++)
                for (j = 0; j < 3; j++)
                    b[i][j] = in.nextInt();
			
			//int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
			//int b[][]={{1,1,1},{2,2,2},{3,3,3}};   
			
			stub.multiplica(a, b);
			stub.exibe();
			
		} catch (Exception e){
			System.err.println("Erro :" + e.toString());
		}
	}
}
