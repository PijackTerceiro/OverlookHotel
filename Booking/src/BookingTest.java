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

    Room room1 = new Room("Room", 2, 2, 134);

    Date checkIn1 = new Date(13,2,2022);
    Date checkOut1 = new Date(17,2,2022);
    Guest guest1 = new Guest("Facundo", "Pagano","Argentinian", birthday1,4545677);
    Guest guest2 = new Guest("Santiago", "Gómez", "Spanish",birthday2, 654055065);
    Guest guest3 = new Guest("Pedro", "Marsiglia","Brazilian", birthday3,21321412);
    Guest guest4 = new Guest("Matheus", "Amaral", "Brazilian",birthday4, 7348374);
    Guest guest5 = new Guest("Juanito", "López","Mexican", birthday5,23523423);
    Guest invitedGuest = new Guest("Lucía", "González", "Spanish", birthday6, 342342423);

    Reservation res1 = new Reservation(guest1, checkIn1, checkOut1, room1);
    res1.addGuests(invitedGuest);
    res1.addGuests(guest3);
    /*Reservation res2 = new Reservation();
    Reservation res3 = new Reservation();
    Reservation res4 = new Reservation();
    Reservation res5 = new Reservation();
    Reservation res6 = new Reservation();*/

    System.out.println(res1);






  }
}
