import java.util.GregorianCalendar;

public class Reservation
{
  private Guest guest;
  private Date checkIn;
  private Date checkOut;
  private Room room;

  public Reservation(Guest guest, Date checkIn, Date checkOut, Room room)
  {
    this.guest = guest;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    this.room = room;
  }

  public boolean isUnderage(Guest guest)
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int age =
        currentDate.get(GregorianCalendar.YEAR) - guest.getBirthday().getYear();

    if (age >= 18)
    {

      if (currentDate.get(GregorianCalendar.MONTH) + 1 < guest.getBirthday()
          .getMonth())
        age = currentDate.get(GregorianCalendar.YEAR) - (1 + guest.getBirthday()
            .getDay());

      if (currentDate.get(GregorianCalendar.MONTH) + 1 == guest.getBirthday()
          .getMonth())
      {

        if (currentDate.get(GregorianCalendar.DATE) <= guest.getBirthday()
            .getDay())
          age =
              currentDate.get(GregorianCalendar.YEAR) - (1 + guest.getBirthday()
                  .getDay());
      }
      if (age >= 18)
      {
        return false;
      }
      else
        return true;
    }
    return true;
  }

  @Override public String toString()
  {
    return "Reservation{" + "guest=" + guest + ", checkIn=" + checkIn
        + ", checkOut=" + checkOut + ", room=" + room + '}';
  }
}
