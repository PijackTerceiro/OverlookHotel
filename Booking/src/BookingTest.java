public class BookingTest
{
  public static void main(String[] args)
  {
    Date birthday1 = new Date(16,05,1788);
    Date checkIn1 = new Date(13,2,2022);
    Date checkOut1 = new Date(17,2,2022);
    Guest guest1 = new Guest("Steen", "Kroyer","DK", birthday1,4545677);
    Room room1 = new Room(300,2,412);

    Reservation booking1 = new Reservation(guest1,checkIn1,checkOut1,room1);

    System.out.println(booking1);
  }
}
