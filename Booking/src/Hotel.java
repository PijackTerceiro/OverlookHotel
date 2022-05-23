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


    //We have to find a way to return also the rooms that are not in reservations.

    for(int i=0; i <= reservations.size(); i++)
    {
      //This loop checks through all the reservations comparing dates and will add to the availableRooms arraylist the available room.
      //If check in input is after check-out in reservation or check out input is before check-in in reservation.
      if(checkIn.after(reservations.get(i).getCheckOut()) || checkOut.before(reservations.get(i).getCheckIn()))
      {
        //This will add only the room in the availableRooms arrayList
        availableRooms.add(reservations.get(i).getRoom());
      }
    }

    //We should create another loop to return an arrayList with different room numbers.
    for(int i=0; i<=availableRooms.size(); i++)
    {

    }
  }
}
