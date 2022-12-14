package sd.paradigmasdecomunicacao.exemplormi2;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;

public class CreditoServer implements CreditoHome {

    private double saldo;

    public CreditoServer() {
        super();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double calculaCredito() {
        double credito = 0.0;

        if (this.saldo >= 0 && this.saldo <= 200) {
            credito = 0.0;
        } else if (this.saldo >= 201 && this.saldo <= 400) {
            credito = this.saldo * 0.2;
        } else if (this.saldo >= 401 && this.saldo <= 600) {
            credito = this.saldo * 0.3;
        } else if (this.saldo >= 601) {
            credito = this.saldo * 0.4;
        }
        return credito;
    }

    public static void main(String args[]) {
//	if (System.getSecurityManager() == null) {
//		System.setSecurityManager(new SecurityManager());
//	}
        try {
            CreditoServer obj = new CreditoServer();
            CreditoHome stub = (CreditoHome) UnicastRemoteObject.exportObject(obj, 0);
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("CreditoHome", stub);

            System.out.println("CreditoServer bound in registry");
            /*  
          CreditoHome obj = new CreditoServer();
	  CreditoHome stub = (CreditoHome) UnicastRemoteObject.exportObject(obj, 0);
	  Registry registry = LocateRegistry.getRegistry();
	  registry.rebind("CreditoHome", stub);
          System.out.println("CreditoServer bound in registry");*/
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
