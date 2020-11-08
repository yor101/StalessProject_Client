package Yorick.Laros;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        messageHandler.sendMessage(7878, "127.0.0.1");

    }
}
