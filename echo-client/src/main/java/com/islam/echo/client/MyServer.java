/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.islam.echo.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apple
 */
public class MyServer {

    public static void main(String args[]) {

        try {
            ServerSocket serverSocket = new ServerSocket(6666);

            Socket socket = serverSocket.accept();//Establishing a connection & wait for the client

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            String str = dataInputStream.readUTF();

            System.out.println("Message " + str);

            serverSocket.close();

        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
