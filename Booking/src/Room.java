import java.util.Set;

public class Room
{
  private String type;
  private int roomNum;
  private int beds;
  private int price;
  private boolean availability;

  public Room()
  {
    type = null;
    price = 0;
    beds = 0;
    roomNum = 0;
    availability = false;

  }

  public Room(String type, int roomNum, int beds, int price)
  {
    this.type = type;
    this.price = price;
    this.beds = beds;
    this.roomNum = roomNum;
    this.availability = true;
  }

  public void isBooked()
  {
    availability=false;
  }

  public boolean getStatus()
  {
    if(availability==true)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int getRoomNum()
  {
    return roomNum;
  }

  @Override public String toString()
  {
    return
        "\nType of room: " + type +
        "\nRoom number: " + roomNum +
        "\nprice: " + price +
        "\nNumber of beds: " + beds +
        "\nStatus: " + availability;
  }
}

