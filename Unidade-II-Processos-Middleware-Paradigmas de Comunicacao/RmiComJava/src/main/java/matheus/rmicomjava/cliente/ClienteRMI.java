/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.rmicomjava.cliente;

import java.rmi.Naming;

public class ClienteRMI {

	public static void main(String[] args) throws Exception {
		String objName = "rmi://localhost:1099/Calc";
        ICalculadora calc = (ICalculadora) Naming.lookup(objName);
		System.out.println("O Resultado da soma é: " + calc.adicao(1, 2));
	}
}
