package sd.paradigmasdecomunicacao.projetocalculadorarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author mathe
 */
public class CalculadoraImple
        extends UnicastRemoteObject
        implements Calculadora {

    private static final long serialVersionUID = 1L;

    public CalculadoraImple() throws RemoteException {
        super();
    }

    public long add(long a, long b) throws RemoteException {
        return a + b;
    }

}
