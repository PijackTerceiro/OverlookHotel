package OverlookPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileHandler
{
  public void writeToTextFile(String str, String filename)
  {
    try
    {
      FileOutputStream fileOut = new FileOutputStream(filename, true);
      PrintWriter write = new PrintWriter(fileOut);
      write.println(str);
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("The file cannot be opened or found.");
      e.printStackTrace();
    }
  }
  public String readFromTextFile(String fileName)
  {

    try
    {
      FileInputStream fileIn = new FileInputStream(fileName);
      Scanner input = new Scanner(fileIn);
      while (input.hasNext())
      {
        System.out.println(input.nextLine());
      }
      input.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("The file cannot be opened or found.");
      e.printStackTrace();
    }
    return "Reading its done";
  }
}