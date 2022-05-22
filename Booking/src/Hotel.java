import java.util.ArrayList;

public class Hotel
{
  //Arraylist Field
  private ArrayList<Reservation>reservations=new ArrayList<>();

  //Constructor
  public Hotel() {}

  //addReservation
  public void addReservations(Reservation reservation)
  {
    reservations.add(reservation);
  }

  //isAvailable
  public ArrayList<Room> isAvailable(Date checkIn, Date checkOut)
  {
    ArrayList<Room> availableRooms = new ArrayList<>();

    //This loop checks through all the reservations comparing dates and will add to the availableRooms arraylist the available room.
    //We have to find a way to return also the rooms that are not in reservations.

    for(int i=0; i<= reservations.size(); i++)
    {
      if(checkIn.after(reservations.get(i).getCheckIn()) && checkOut.after(reservations.get(i).getCheckOut())
          || checkIn.before(reservations.get(i).getCheckIn()) && checkOut.before(reservations.get(i).getCheckOut()))
      {
        availableRooms.add(reservations.get(i).getRoom());
      }
    }
    //We should create another loop to return an arrayList with different room numbers.
    for(int i=0; i<=availableRooms.size(); i++)
    {

    }
  }
}
