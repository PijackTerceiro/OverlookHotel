import java.util.ArrayList;

public class BookingTest
{
  public static void main(String[] args)
  {
    Date birthday1 = new Date(16,5,1988);
    Date birthday2 = new Date(21, 6, 2002);
    Date birthday3 = new Date(3, 8, 2001);
    Date birthday4 = new Date(5,7,1998);
    Date birthday5 = new Date(11, 6, 2000);
    Date birthday6 = new Date(30, 2, 1999);

    Room room1 = new Room("Room", 1, 2, 169);
    Room room2 = new Room("Room", 2, 1, 134);
    Room room3 = new Room("Room", 3, 2, 169);
    Room room4 = new Room("Room", 4, 1, 134);
    Room room5 = new Room("Room", 5, 1, 134);
    Room room6 = new Room("Room", 6, 1, 134);
    Room room7 = new Room("Room", 7, 1, 134);
    Room room8 = new Room("Room", 8, 1, 134);
    Room room9 = new Room("Room", 9, 1, 134);
    Room room10 = new Room("Room", 10, 2, 169);
    Room room11 = new Room("Room", 11, 2, 169);
    Room suite1 = new Room("Suite", 12, 1, 299);
    Room suite2 = new Room("Suite", 13, 3, 399);

    ArrayList<Room> rooms = new ArrayList<>();
    rooms.add(room1);
    rooms.add(room2);
    rooms.add(room3);
    rooms.add(room4);
    rooms.add(room5);
    rooms.add(room6);
    rooms.add(room7);
    rooms.add(room8);
    rooms.add(room9);
    rooms.add(room10);
    rooms.add(room11);
    rooms.add(suite1);
    rooms.add(suite2);





    Date checkInRes1 = new Date(13,6,2022);
    Date checkOutRes1 = new Date(17,6,2022);
    Date checkInRes2 = new Date(21,6,2022);
    Date checkOutRes2 = new Date(26,6,2022);
    Date checkInRes3 = new Date(14, 6, 2022);
    Date checkOutRes3 = new Date(16,6,2022);

    Guest guest1 = new Guest("Facundo", "Pagano","Argentinian", birthday1,4545677);
    Guest guest2 = new Guest("Santiago", "Gómez", "Spanish",birthday2, 654055065);
    Guest guest3 = new Guest("Pedro", "Marsiglia","Brazilian", birthday3,21321412);
    Guest guest4 = new Guest("Matheus", "Amaral", "Brazilian",birthday4, 7348374);
    Guest guest5 = new Guest("Juanito", "López","Mexican", birthday5,23523423);
    Guest invitedGuest = new Guest("Lucía", "González", "Spanish", birthday6, 342342423);

    ArrayList<Reservation> reservations = new ArrayList<>();

    Hotel hotel = new Hotel(reservations, rooms);

    hotel.createBooking(11, guest1, checkInRes1, checkOutRes1);
    hotel.createBooking(6,guest3,checkInRes2,checkOutRes2);
    System.out.println(hotel.isAvailable(checkInRes3,checkOutRes3));




    /*Reservation res2 = new Reservation();
    Reservation res3 = new Reservation();
    Reservation res4 = new Reservation();
    Reservation res5 = new Reservation();
    Reservation res6 = new Reservation();*/








  }
}
