public class Lab2Main {
    public static void main(String[] args) {
        // Part 1: Class relationships and booking
        MeetingRoom room1 = new MeetingRoom("MR101", 8, 1);
        ZoomMeetingRoom zoomRoom = new ZoomMeetingRoom("ZR202", 12, 2, "ZD-001", "zoom@company.com");

        Booking booking1 = new Booking("EMP001", "2025-09-30", "10:00", 60, room1);
        Booking booking2 = new Booking("EMP002", "2025-09-30", "14:00", 45, zoomRoom);

        System.out.println("=== Bookings ===");
        booking1.displayBooking();
        booking2.displayBooking();

        // Part 2: Welcome message
        System.out.println("\n=== Welcome Message ===");
        System.out.println(Utility.welcomeMessage("John"));

        // Part 3: Largest number
        System.out.println("\n=== Largest Number ===");
        int largest = Utility.largest(32, 45, 27);
        System.out.println("Largest: " + largest);

        // Part 4: Digits in Words
        System.out.println("\n=== Digits in Words ===");
        Utility.printDigitsInWords(951);
    }
}
