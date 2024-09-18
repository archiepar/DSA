import java.util.ArrayList;
import java.util.Scanner;

public class Hamming {

    // Function to generate the Hamming Code
    public static void generateHammingCode(ArrayList<Integer> data, ArrayList<Integer> hammingCode) {
        int r = 0;
        while ((1 << r) < (data.size() + r + 1)) {
            r++;
        }

        hammingCode.ensureCapacity(data.size() + r);
        int j = 0;

        // Place data bits in Hamming code and leave spaces for parity bits
        for (int i = 0; i < data.size() + r; i++) {
            if ((i & (i + 1)) == 0) {
                hammingCode.add(0); // Space for parity bits
            } else {
                hammingCode.add(data.get(j++));
            }
        }

        // Calculate the parity bits
        for (int i = 0; i < r; i++) {
            int parity = 0;
            for (int j2 = 0; j2 < hammingCode.size(); j2++) {
                if ((j2 & (1 << i)) != 0) {
                    parity ^= hammingCode.get(j2);
                }
            }
            hammingCode.set((1 << i) - 1, parity); // Set parity bit value
        }
    }

    // Function to detect and correct error in received data
    public static int detectAndCorrectError(ArrayList<Integer> hammingCode) {
        int r = 0;
        while ((1 << r) < hammingCode.size()) {
            r++;
        }

        int errorPos = 0;
        for (int i = 0; i < r; i++) {
            int parity = 0;
            for (int j = 0; j < hammingCode.size(); j++) {
                if ((j & (1 << i)) != 0) {
                    parity ^= hammingCode.get(j);
                }
            }
            errorPos += parity * (1 << i); // Calculate error position
        }

        if (errorPos > 0 && errorPos <= hammingCode.size()) {
            hammingCode.set(errorPos - 1, hammingCode.get(errorPos - 1) ^ 1); // Correct the error
        }

        return errorPos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the data bits
        System.out.print("Enter the bit size for the data: ");
        int n = sc.nextInt();

        ArrayList<Integer> data = new ArrayList<>(n);
        System.out.print("Enter the Data bits: ");
        for (int i = 0; i < n; i++) {
            data.add(sc.nextInt());
        }

        // Generate Hamming Code
        ArrayList<Integer> hammingCode = new ArrayList<>();
        generateHammingCode(data, hammingCode);

        System.out.print("The Hamming code generated for your data is: ");
        for (int bit : hammingCode) {
            System.out.print(bit);
        }
        System.out.println();

        // Simulate error detection by altering a bit
        System.out.print("For detecting error at the receiver end, enter position of a bit to alter original data: ");
        int alterPos = sc.nextInt();

        // Ensure the position is valid
        if (alterPos > 0 && alterPos <= hammingCode.size()) {
            hammingCode.set(alterPos - 1, hammingCode.get(alterPos - 1) ^ 1); // Simulate error
        } else {
            System.out.println("Invalid position to alter data.");
            return;
        }

        System.out.print("Sent Data is: ");
        for (int bit : hammingCode) {
            System.out.print(bit);
        }
        System.out.println();

        // Detect and correct error
        int errorPos = detectAndCorrectError(hammingCode);

        if (errorPos > 0) {
            System.out.println("Error is found at location " + errorPos);
        } else {
            System.out.println("No error found in received data.");
        }

        System.out.print("After correcting error, Data is: ");
        for (int bit : hammingCode) {
            System.out.print(bit);
        }
        System.out.println();

        // Output the original data bits
        System.out.print("The data sent from the sender: ");
        for (int bit : data) {
            System.out.print(bit);
        }
        System.out.println();

        sc.close();
    }
}
