/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.rmicomjava.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    public Calculadora() throws RemoteException { 
		//super() is allways called!
    }

    public int adicao(int x, int y) throws RemoteException { 
        return x + y;
    }

    public int subtracao(int x, int y) throws RemoteException { 
        return x - y;
    }
	
    public int multiplicacao(int x, int y) throws RemoteException { 
        return x * y;
    }
	
    public double divisao(int x, int y) throws RemoteException { 
        return x / y;
    }
}