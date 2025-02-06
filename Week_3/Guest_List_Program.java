import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;


// Date: 2-5-2025

/** Requirements for program:
 * 1. Create an empty list to store guest names.
 * 2a. Use a while loop to keep asking for guest names.
 * 2b. Stop when the user presses Enter.
 * 2c. Reject duplicates (don't add a name if it's already in the list).
 * 3. Sort the list alphabetically.
 * 4. Print the list of guests.
 * 5a. Ask if the user wants to delete names:
 * 5b. Let them remove by name or index.
 * 5c. Keep asking until they choose to stop.
 * 6. Print the final list & total guest count.
 * 7. Select a random guest to win a prize.
 * 8. Add validation to prevent crashes.
 */

public class GuestListProgram {
    public static void main(String[] args) {
        // Step 1: Create an empty list to store guest names
        ArrayList<String> guestList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // Step 2: Use a while loop to get guest names
        System.out.println("Enter guest names one by one. Press ENTER to stop:");
        while (true) {
            System.out.print("Enter guest name: ");
            String guest = input.nextLine().trim(); // Read input and remove extra spaces

            if (guest.isEmpty()) {
                break; // Stop when user presses ENTER
                // 2b. Stop when the user presses Enter.
            }

            // 2c. Reject duplicates (don't add a name if it's already in the list).
            // Prevent duplicate names. Logic states if guest list names does not contain guests name meaning the name
            // is not the same. If name is the same, please add this name.
            if (!guestList.contains(guest)) {
                guestList.add(guest);
            } else { // Handle error accordingly if user has a name that is already listed.
                System.out.println("This guest is already in the list. Try a different name.");
            }
        }

        // Step 3: Sort names alphabetically
        Collections.sort(guestList);

        // Step 4: Print all names entered
        System.out.println("\nGuest List:");
        printGuestList(guestList);

        // Step 5: Allow the user to delete names
        while (!guestList.isEmpty()) {
            System.out.println("\nWould you like to remove any guests? (yes/no)");
            String response = input.nextLine().trim().toLowerCase();

            if (response.equals("no")) {
                break; // Stop removing guests if the user says no
            }

            System.out.println("Enter the guest's name to remove OR enter the guest number (index):");
            String deleteInput = input.nextLine().trim();

            // Check if the input is a number (delete by index)
            try {
                int index = Integer.parseInt(deleteInput) - 1; // Convert input to index
                if (index >= 0 && index < guestList.size()) {
                    System.out.println("Removing guest: " + guestList.get(index));
                    guestList.remove(index);
                } else {
                    System.out.println("Invalid index. Please try again.");
                }
            } catch (NumberFormatException e) {
                // If input is not a number, delete by name (ignoring case)
                boolean removed = false;

                for (int i = 0; i < guestList.size(); i++) {
                    if (guestList.get(i).equalsIgnoreCase(deleteInput)) {  // Compare ignoring case
//                        Uses .equalsIgnoreCase(deleteInput) instead of .contains(deleteInput).
//                                "John" == "john" == "JOHN" ✅
                        System.out.println("Removing guest: " + guestList.get(i));
                        guestList.remove(i);
                        removed = true;
                        break;  // Stop after removing the first match
                    }
                }

                if (!removed) {
                    System.out.println("Guest not found. Please enter a valid name.");
                }
            }

            // Stop if there are no guests left
            if (guestList.isEmpty()) {
                System.out.println("All guests have been removed.");
                break;
            }

            // Print updated guest list
            System.out.println("\nUpdated Guest List:");
            printGuestList(guestList);
        }


        // Step 6: Print final guest list and count
        System.out.println("\nFinal Guest List:");
        printGuestList(guestList);
        System.out.println("Total Guests: " + guestList.size());

        // Step 7: Select a random winner
        if (!guestList.isEmpty()) {
            Random rand = new Random();
            String winner = guestList.get(rand.nextInt(guestList.size()));
            System.out.println("\n🎉 The lucky winner is: " + winner + " 🎉");
        } else {
            System.out.println("\nNo guests left, so no winner can be chosen.");
        }

        // Close scanner
        input.close();
    }

    // Helper method to print the guest list
    public static void printGuestList(ArrayList<String> guestList) {
        if (guestList.isEmpty()) {
            System.out.println("(No guests in the list)");
        } else {
            for (int i = 0; i < guestList.size(); i++) {
                System.out.println((i + 1) + ". " + guestList.get(i));
            }
        }
    }
}
