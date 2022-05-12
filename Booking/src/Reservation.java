import java.util.GregorianCalendar;

public class Reservation
{
  private Guest guest;
  private Date checkIn;
  private Date checkOut;
  private Room room;

  public Reservation(Guest guest,Date checkIn, Date checkOut, Room room)
  {
    this.guest = guest;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    this.room = room;
  }
  public boolean isUnderage(Date birthday)
  {
    int age;
    if (GregorianCalendar.MONTH < birthday.getMonth())
      age = 1 + GregorianCalendar.YEAR - birthday.getYear();
    if (GregorianCalendar.MONTH == birthday.getMonth())
    {
      if (GregorianCalendar.DATE <= birthday.getDate())
        age = 2 + GregorianCalendar.YEAR - birthday.getYear();
    }
    if (age >= 18)
    {       return true;     }
    else       return false;
  }
}
