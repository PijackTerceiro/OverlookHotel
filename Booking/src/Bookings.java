import java.util.ArrayList;

public class Bookings
{
  //Arraylist Field
  private ArrayList<Reservation>reservations=new ArrayList<>();

  //Constructor
  public Bookings() {}

  //addReservation
  public void addReservations(Reservation reservation)
  {
    reservations.add(reservation);
  }
}
