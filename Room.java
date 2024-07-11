class Room {
    String roomNumber;
    String roomType;
    int roomRate;
    int checkinMonth;
    int checkoutMonth;

    public Room() {
    }

    public Room(String roomNumber, String roomType, int roomRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomRate = roomRate;
    }

    void displayRoom() {
        System.out.println("Room Number: " + this.roomNumber);
        System.out.println("Room Type: " + this.roomType);
        System.out.println("Room Rate: Rs " + this.roomRate);
    }
}
