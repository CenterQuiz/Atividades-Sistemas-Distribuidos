/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.rmicomjava.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
	
    int adicao(int x, int y) throws RemoteException;
    int subtracao(int x, int y) throws RemoteException;
    int multiplicacao(int x, int y) throws RemoteException;
    double divisao(int x, int y) throws RemoteException;
}