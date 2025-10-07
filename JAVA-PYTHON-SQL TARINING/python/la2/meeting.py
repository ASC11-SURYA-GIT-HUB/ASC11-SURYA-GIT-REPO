# Define base class for all meeting rooms
class MeetingRoom:
    def __init__(self, room_id, capacity, floor_location):
        self.room_id = room_id
        self.capacity = capacity
        self.floor_location = floor_location

# Inherited class for Zoom-enabled meeting rooms
class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor_location, zoom_device_id, zoom_account_id):
        super().__init__(room_id, capacity, floor_location)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

# Class for room booking
class Booking:
    def __init__(self, employee_id, room_id, meeting_date, meeting_time, duration):
        self.employee_id = employee_id
        self.room_id = room_id
        self.meeting_date = meeting_date
        self.meeting_time = meeting_time
        self.duration = duration

# Booking system that manages all bookings
class BookingSystem:
    def __init__(self):
        self.bookings = {}

    def add_booking(self, booking):
        if booking.meeting_date not in self.bookings:
            self.bookings[booking.meeting_date] = []
        self.bookings[booking.meeting_date].append(booking)
        print(f"Booking successful for Room {booking.room_id} on {booking.meeting_date} at {booking.meeting_time}.")

    def get_bookings_by_date(self, date):
        return self.bookings.get(date, [])

# Example test
print("------ MEETING ROOM SYSTEM ------")

room1 = MeetingRoom("MR101", 12, 3)
zoom_room = ZoomMeetingRoom("MR202", 20, 5, "ZD001", "ZACC1001")

booking1 = Booking("EMP1001", "MR101", "2025-10-08", "09:00", "1 hour")
booking2 = Booking("EMP1002", "MR202", "2025-10-08", "11:00", "2 hours")

system = BookingSystem()
system.add_booking(booking1)
system.add_booking(booking2)

print("\nBookings on 2025-10-08:")
for b in system.get_bookings_by_date("2025-10-08"):
    print(f"Employee {b.employee_id} booked Room {b.room_id} at {b.meeting_time} for {b.duration}")
