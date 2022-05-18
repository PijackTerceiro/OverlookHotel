public class BookingTest
{
  public static void main(String[] args)
  {
    //Test guest
    Date birthday1 = new Date(16,05,1988);
    Date checkIn1 = new Date(13,2,2023);
    Date checkOut1 = new Date(17,2,2023);
    Guest guest1 = new Guest("Facundo", "Pagano","AR", birthday1,4545677);
    //Test guest
    Date birthday2 = new Date(16,05,1988);
    Date checkIn2 = new Date(15,2,2023);
    Date checkOut2 = new Date(25,2,2023);
    Guest guest2 = new Guest("Santiago", "Gomez","ES", birthday2,4545675);

    //Create a room database
    Room room1 = new Room(300,2,412);
    Room room2 = new Room(270, 4,404);
    Room room3 = new Room(240,3,666);
    Room suite1 = new Room(222,3,101);
    Room suite2 = new Room(333,4,234);
    Room suite3 = new Room(450,2,333);

    checkIn1.setDate(18,4,2022);
    birthday1.setYear(2005);

    //Reservation test
    Reservation booking1 = new Reservation(guest1,checkIn1,checkOut1,room1);
    Reservation booking2 = new Reservation(guest2, checkIn2,checkOut2,room2);

    //Info test
    System.out.println(booking1);
    System.out.println(booking2);
    //isUnderage method test
    System.out.println("Is underage? " + booking1.isUnderage(guest1));

  }
}
