/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd.paradigmasdecomunicacao.exemplormi;

/*
 * CreditoHome.java
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CreditoHome extends Remote {
    double calculaCredito() throws RemoteException;
    void setSaldo(double saldo) throws RemoteException;
}

