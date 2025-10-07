import java.util.*;

class MeetingRoom {
    private String id;
    private int capacity;
    private int floor;

    public MeetingRoom(String id, int capacity, int floor) {
        this.id = id;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "MeetingRoom{id='" + id + "', capacity=" + capacity + ", floor=" + floor + "}";
    }
}

class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String id, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(id, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }

    public String getZoomAccountId() {
        return zoomAccountId;
    }

    @Override
    public String toString() {
        return "ZoomMeetingRoom{" +
                "id='" + getId() + "', capacity=" + getCapacity() +
                ", floor=" + getFloor() + ", zoomDeviceId='" + zoomDeviceId +
                "', zoomAccountId='" + zoomAccountId + "'}";
    }
}

class Booking {
    private String employeeId;
    private String date; // format: YYYY-MM-DD
    private String time; // format: HH:MM
    private int duration; // in minutes
    private MeetingRoom room;

    public Booking(String employeeId, String date, String time, int duration, MeetingRoom room) {
        this.employeeId = employeeId;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.room = room;
    }

    public String getDate() {
        return date;
    }

    public void displayBooking() {
        System.out.println("Booking: EmployeeID=" + employeeId + ", Date=" + date + ", Time=" + time +
                ", Duration=" + duration + " mins, Room=" + room);
    }
}
