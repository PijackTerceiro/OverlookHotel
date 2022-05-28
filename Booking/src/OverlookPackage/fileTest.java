package OverlookPackage;

import java.io.Serializable;

public class fileTest implements Serializable
{
  public static void main(String[] args)
  {
    Date date = new Date(20,2,2022);
    Room room1 = new Room("room",1,2,3000,false);
    MyFileHandler fileHandler = new MyFileHandler();
    fileHandler.writeToTextFile("\n","prueba.txt");
    fileHandler.writeToBinaryFile(date,"prueba.txt");

    fileHandler.readFromBinaryFile("prueba.txt");

  }
}
