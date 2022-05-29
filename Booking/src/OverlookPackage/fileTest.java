package OverlookPackage;

import java.io.Serializable;

public class fileTest implements Serializable
{
  public static void main(String[] args)
  {
    String fileName = "C:\\Users\\34654\\Documents\\GitHub\\OverlookHotel\\Booking\\src\\resources\\roomsFile.xml";
    HotelManager hotelManager = new HotelManager();
    RoomList rooms = new RoomList();
    rooms = hotelManager.getAllRooms(fileName);
    System.out.println(rooms.getRoomByNumber(2));


  }
}
