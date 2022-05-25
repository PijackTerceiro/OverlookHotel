import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hotel
{
  //Arraylist Field
  private ArrayList<Reservation>reservations=new ArrayList<>();
  private ArrayList<Room>roomList = new ArrayList<>(42);

  //Constructor
  public Hotel() {}

  //addReservation
  public void addReservations(Reservation reservation, int index)
  {
    reservations.add(reservation);
    roomList.get(index).isBooked();
  }

  //isAvailable
  public Set<Room> isAvailable(Date checkIn, Date checkOut, Reservation reservation)
  {
    Set<Room> availableRooms = new HashSet<>();

    //We have to find a way to return also the rooms that are not in reservations.
    for (int i = 0; i <= reservations.size(); i++)
    {
      //This loop checks through all the reservations comparing dates and will add to the availableRooms set the available room.
      //If check in input is after check-out in reservation or check out input is before check-in in reservation.
      if (checkIn.after(reservations.get(i).getCheckOut()) || checkOut.before(
          reservations.get(i).getCheckIn())||roomList.get(i).getStatus()==true)
      {
        //This will add only the room in the availableRooms set
        availableRooms.add(reservations.get(i).getRoom());
      }
    }
    for (int i=0; i<=roomList.size();i++)
    {
      if(roomList.get(i).getStatus()==true)
      {
        availableRooms.add(roomList.get(i));
      }
    }
    return availableRooms;
  }

  public void createBooking(Set<Room> availableRooms)
  {

  }
}
