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
  public boolean isUnderage(Guest guest)
  {
    int age = 0;
    if (GregorianCalendar.MONTH < guest.getBirthday().getMonth())
      age = 1 + GregorianCalendar.YEAR - guest.getBirthday().getYear();
    if (GregorianCalendar.DAY_OF_MONTH == guest.getBirthday().getMonth())
    {
      if (GregorianCalendar.DATE <= guest.getBirthday().getDay())
        age = 2 + GregorianCalendar.YEAR - guest.getBirthday().getYear();
    }
    if (age >= 18)
    {
      return true;
    }else
      return false;
  }

  @Override public String toString()
  {
    return "Reservation{" + "guest=" + guest + ", checkIn=" + checkIn
        + ", checkOut=" + checkOut + ", room=" + room + '}';
  }
}
