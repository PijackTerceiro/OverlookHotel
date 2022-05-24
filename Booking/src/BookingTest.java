public class BookingTest
{
  public static void main(String[] args)
  {
    Date birthday1 = new Date(16,05,1988);
    Date checkIn1 = new Date(13,2,2022);
    Date checkOut1 = new Date(17,2,2022);
    Guest guest1 = new Guest("Facundo", "Pagano","AR", birthday1,4545677);


    checkIn1.setDate(18,4,2022);
    birthday1.setYear(2004);

    RoomsModelManager initialData = new RoomsModelManager("rooms file.txt");

  }
}
