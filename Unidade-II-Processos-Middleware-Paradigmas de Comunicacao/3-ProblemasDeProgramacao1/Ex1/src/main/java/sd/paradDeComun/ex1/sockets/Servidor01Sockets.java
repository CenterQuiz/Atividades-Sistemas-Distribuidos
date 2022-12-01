/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd.paradDeComun.ex1.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mathe
 */
public class Servidor01Sockets {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Socket socket;
        try ( ServerSocket ss = new ServerSocket(7777)) {
            System.out.println("Servidor esperando por conexoes...");
            socket = ss.accept();
            System.out.println("Conexao de " + socket + "!");
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(
                    outputStream
            );
            ////////////////////////////////////////////////////////////////////////
            String nome = dataInputStream.readUTF();
            String cargo = dataInputStream.readUTF();
            double salario = dataInputStream.readDouble();
            double salarioReajustado = reajustarSalario(cargo, salario);
            dataOutputStream.writeDouble(salarioReajustado);
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Fechando Sockets.");
            socket.close();
        } catch (Exception e) {
            System.out.println("err: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static double reajustarSalario(String cargo, double salario) {
        if (cargo.toLowerCase().equals("operador")) {
            return salario * 1.2;
        } else if (cargo.toLowerCase().equals("programador")) {
            return salario * 1.18;
        } else {
            return salario;
        }
    }
}
