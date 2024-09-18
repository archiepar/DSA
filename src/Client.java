import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6789);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        int windowSize = (int) Math.pow(2, m) - 1;

        System.out.print("Enter number of frames to be sent: ");
        int numFrames = sc.nextInt();

        int[] frames = new int[numFrames];
        for (int i = 0; i < numFrames; i++) {
            System.out.print("Enter data for frame no " + i + " => ");
            frames[i] = sc.nextInt();
        }

        System.out.println("Connected with server.");
        System.out.print("|");
        for (int i = 0; i < numFrames; i++) {
            System.out.print(i + "||");
        }
        System.out.println();

        int base = 0;
        int nextSeqNum = 0;
        boolean endTransmission = false;

        while (!endTransmission) {
            while (nextSeqNum < base + windowSize && nextSeqNum < numFrames) {
                System.out.println("\nSending frame: " + nextSeqNum);
                out.writeInt(nextSeqNum); // send frame number
                out.writeInt(frames[nextSeqNum]); // send frame data
                nextSeqNum++;
            }

            int ack = in.readInt(); // receive acknowledgement from server
            System.out.println("Acknowledgement of frame no " + ack + " received.");

            if (ack == numFrames - 1) {
                endTransmission = true; // End if all frames are acknowledged
            } else {
                base = ack + 1; // Go-Back-N logic: restart from the last ACK'd frame
                nextSeqNum = base;
            }
        }

        socket.close();
        sc.close();
    }
}

