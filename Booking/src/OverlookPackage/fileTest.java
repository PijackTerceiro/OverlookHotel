package OverlookPackage;

import java.io.Serializable;

public class fileTest implements Serializable
{
  public static void main(String[] args)
  {
    MyFileHandler fileHandler = new MyFileHandler();
    fileHandler.writeToTextFile("Facundinho jiji", "prueba.txt");

  }
}
