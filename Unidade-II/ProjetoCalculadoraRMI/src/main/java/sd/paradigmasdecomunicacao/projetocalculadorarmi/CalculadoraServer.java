/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd.paradigmasdecomunicacao.projetocalculadorarmi;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author mathe
 */
public class CalculadoraServer {

    public CalculadoraServer() {
        try {
            System.setProperty("java.rmi.server.hostname", "192.168.86.10");
            LocateRegistry.createRegistry(1099);
            Calculadora c = new CalculadoraImple();
            Naming.bind("CalculadoraService", (Remote) c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new CalculadoraServer();
    }
}
