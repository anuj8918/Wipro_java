import java.util.Scanner;

class Main extends Room implements HotelManagement {
    Room r1 = new Room("101", "Single", 1000);
    Room r2 = new Room("102", "Double", 2000);
    Scanner sc = new Scanner(System.in);

    public void addRoom() {
        Room newRoom = new Room();
        System.out.println("Enter Room Number");
        newRoom.roomNumber = sc.nextLine();
        System.out.println("Enter Room Type (Single/Double)");
        newRoom.roomType = sc.nextLine();
        System.out.println("Enter Room Rate");
        newRoom.roomRate = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Room added successfully");
    }

    public void bookRoom() {
        System.out.println("Room 1");
        r1.displayRoom();
        System.out.println("Room 2");
        r2.displayRoom();
        System.out.println("Choose a room number");
        String choice = sc.nextLine();
        if (choice.equals(r1.roomNumber)) {
            System.out.println("Enter Check-in Month (1-12)");
            r1.checkinMonth = sc.nextInt();
            System.out.println("Room booked successfully");
        } else if (choice.equals(r2.roomNumber)) {
            System.out.println("Enter Check-in Month (1-12)");
            r2.checkinMonth = sc.nextInt();
            System.out.println("Room booked successfully");
        } else {
            System.out.println("Room not available");
        }
    }

    public void checkoutRoom() {
        System.out.println("Choose a room number");
        String choice = sc.nextLine();

        if (choice.equals(r1.roomNumber)) {
            System.out.println("Room 1 checked out successfully");
        } else if (choice.equals(r2.roomNumber)) {
            System.out.println("Room 2 checked out successfully");
        } else {
            System.out.println("Room Not available");
        }
    }

    public static void main(String[] args) {
        Main hotel = new Main();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add a Room");
            System.out.println("2. Book a Room");
            System.out.println("3. Checkout a Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    hotel.addRoom();
                    break;
                case 2:
                    hotel.bookRoom();
                    break;
                case 3:
                    hotel.checkoutRoom();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
