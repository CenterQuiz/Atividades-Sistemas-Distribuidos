/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd.paradigmasdecomunicacao.java.sec.code.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 定义远程接口
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}