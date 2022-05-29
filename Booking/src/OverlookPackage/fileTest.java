package OverlookPackage;

import java.io.Serializable;

public class fileTest implements Serializable
{
  public static void main(String[] args)
  {
    MyFileHandler fileHandler = new MyFileHandler();
    String fileName = "C:\\Users\\34654\\Documents\\GitHub\\OverlookHotel\\Booking\\src\\resources\\roomsFile.xml";
    fileHandler.readXmlFile(fileName);
  }
}
