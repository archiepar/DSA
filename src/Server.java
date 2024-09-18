import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6789);
        System.out.println("Server established.");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client is now connected.");

        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

        int expectedFrame = 0;
        boolean endTransmission = false;

        while (!endTransmission) {
            try {
                // Attempt to read frame data from the client
                int frameNumber = in.readInt(); // Receive frame number
                int data = in.readInt(); // Receive frame data

                System.out.println("\nFrame " + frameNumber + " received");
                System.out.println("Data: " + data);

                if (frameNumber == expectedFrame) {
                    // Frame received in order
                    System.out.println("Acknowledgement sent for frame " + frameNumber);
                    out.writeInt(frameNumber);  // Send ACK for the current frame
                    expectedFrame++;
                } else {
                    // Frame received out of order or missing frame
                    System.out.println("Error: Out of order frame. Expected frame: " + expectedFrame);
                    System.out.println("Acknowledgement sent for the last correct frame: " + (expectedFrame - 1));
                    out.writeInt(expectedFrame - 1);  // Send ACK for the last correctly received frame
                }
                
            } catch (EOFException e) {
                // The client has no more frames to send (End of File reached)
                System.out.println("All frames received. Closing connection.");
                endTransmission = true;
            }
        }

        clientSocket.close();
        serverSocket.close();
    }
}
