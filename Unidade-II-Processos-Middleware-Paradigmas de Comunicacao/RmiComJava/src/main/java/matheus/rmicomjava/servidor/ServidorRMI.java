/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.rmicomjava.servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    
	public static void main(String[] args) {
        try {
			// cria um objeto para se tornar acessível via rede
            ICalculadora calc = (ICalculadora) new Calculadora();
            String objName = "rmi://localhost/Calc";
			
            System.out.println("Registrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, calc);
			
            System.out.println("Aguardando Clientes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}