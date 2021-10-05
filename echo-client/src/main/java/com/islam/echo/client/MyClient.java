/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.islam.echo.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author apple
 */
public class MyClient {

    public static void main(String args[]) throws IOException {

        try {
            Socket socket = new Socket("localhost", 6666);

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("hello server");

            dataOutputStream.flush();

            dataOutputStream.close();
            
            socket.close();

        } catch (IOException e) {

        }

    }
}
