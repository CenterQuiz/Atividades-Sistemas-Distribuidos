/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.rmicomjava.servidor;

public final class Calculadora_Stub
    extends java.rmi.server.RemoteStub
    implements ICalculadora, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_adicao_0;
    private static java.lang.reflect.Method $method_divisao_1;
    private static java.lang.reflect.Method $method_multiplicacao_2;
    private static java.lang.reflect.Method $method_subtracao_3;
    
    static {
	try {
	    $method_adicao_0 = ICalculadora.class.getMethod("adicao", new java.lang.Class[] {int.class, int.class});
	    $method_divisao_1 = ICalculadora.class.getMethod("divisao", new java.lang.Class[] {int.class, int.class});
	    $method_multiplicacao_2 = ICalculadora.class.getMethod("multiplicacao", new java.lang.Class[] {int.class, int.class});
	    $method_subtracao_3 = ICalculadora.class.getMethod("subtracao", new java.lang.Class[] {int.class, int.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public Calculadora_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of adicao(int, int)
    public int adicao(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_adicao_0, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, 2566911560477534424L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of divisao(int, int)
    public double divisao(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_divisao_1, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, 6934344649835342376L);
	    return ((java.lang.Double) $result).doubleValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of multiplicacao(int, int)
    public int multiplicacao(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_multiplicacao_2, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, 5735732167672099436L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of subtracao(int, int)
    public int subtracao(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_subtracao_3, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, -991134570583429329L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}