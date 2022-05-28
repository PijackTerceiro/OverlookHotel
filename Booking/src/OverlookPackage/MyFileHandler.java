package OverlookPackage;

import java.io.*;
import java.util.Scanner;

public class MyFileHandler
{
  public void writeToTextFile(String str, String fileName)
  {
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName, true);
      PrintWriter write = new PrintWriter(fileOut);
      write.println(str);
      write.close();
      System.out.println("Writing is done.");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or could not be opened.");
      e.printStackTrace();
    }
  }

  public void writeArrayToTextFile(String[] str, String fileName)
  {
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName, true);
      PrintWriter write = new PrintWriter(fileOut);
      write.println(str);
      write.close();
      System.out.println("Writing is done.");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or could not be opened.");
      e.printStackTrace();
    }
  }

  public String readFromTextFile(String fileName)
  {
    try
    {
      FileInputStream fileIn = new FileInputStream(fileName);
      Scanner read = new Scanner(fileIn);
      while (read.hasNext())
      {
        System.out.println(read.nextLine());
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or could not be opened");
      e.printStackTrace();
    }
    return "Reading done";
  }

  public void writeToBinaryFile(Date date, String fileName)
  {
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName, true);
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      write.writeObject(date);
      write.close();

    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or could not be opened");
      e.printStackTrace();
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file.");
      e.printStackTrace();
    }
  }

  public Object readFromBinaryFile(String fileName)
  {
    try
    {
      FileInputStream fileIn = new FileInputStream(fileName);
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while (true)
      {
        try
        {
          Date date = (Date) read.readObject();
          System.out.println(date);
        }
        catch (EOFException eof)
        {
          System.out.println("End of file");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
      System.exit(1);
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
      System.exit(1);
    }
    return "End of the file";
  }
}
