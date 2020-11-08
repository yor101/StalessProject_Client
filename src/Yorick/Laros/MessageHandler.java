package Yorick.Laros;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MessageHandler {

    private final Scanner scanner = new Scanner(System.in);
    private InetAddress address;
    private DatagramSocket socket;

    public void sendMessage(int port, String hostname){

        String message;

        try {
            address = InetAddress.getByName(hostname);
            socket= new DatagramSocket();

            while (true){
                System.out.println("type tour message below: ");
                message = scanner.nextLine();

                byte[] buf = message.getBytes();

                DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
                socket.send(packet);
                if (message.equals("quit")){
                    break;
                }
            }

        }catch (IOException e){
            System.out.println("oh well, there is a error " + e.getMessage());
        }
    }
}
