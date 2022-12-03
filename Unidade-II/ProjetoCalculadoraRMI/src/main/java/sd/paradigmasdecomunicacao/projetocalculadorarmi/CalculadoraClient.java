/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd.paradigmasdecomunicacao.projetocalculadorarmi;

import java.rmi.Naming;

/**
 *
 * @author mathe
 */
public class CalculadoraClient {

    public static void main(String[] args) {
        try {
            Calculadora c
                    = (Calculadora) Naming.lookup(
                            "rmi://192:168.86.10:1099/CalculadoraService"
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
