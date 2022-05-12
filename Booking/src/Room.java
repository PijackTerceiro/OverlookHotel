public class Room
{
  private int price;
  private int beds;
  private int roomNum;
  private boolean isBooked;

  public Room(int price, int bedNum, int roomNum)
  {
    this.price = price;
    this.beds = bedNum;
    this.roomNum = roomNum;
    this.isBooked = false;
  }
}
