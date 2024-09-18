import java.util.Scanner;

public class Checksum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String message = scanner.nextLine();

        int checksum = calculateChecksum(message);
        System.out.println("The checksum generated is: " + checksum);

        System.out.print("\nEnter the data to be sent: ");
        String receivedData = scanner.nextLine();
        int receivedChecksum = calculateChecksum(receivedData);
        System.out.println("The checksum of the received data is: " + receivedChecksum);

        if (receivedChecksum == checksum) {
            System.out.println("\nData is received without error.");
        } else {
            System.out.println("\nThere is an error in the received data.");
        }

        scanner.close();
    }

    private static int calculateChecksum(String message) {
        int checksum = 0;
        for (char c : message.toCharArray()) {
            checksum += (int) c;
        }
        return checksum;
    }
}
