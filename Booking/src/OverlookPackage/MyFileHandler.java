package OverlookPackage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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

  public void readXmlFile(String fileName)

  {try
  {
    //creating a constructor of file class and parsing an XML file
    File file = new File(fileName);
    //an instance of factory that gives a document builder
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    //an instance of builder to parse the specified xml file
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(file);
    doc.getDocumentElement().normalize();
    System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
    NodeList nodeList = doc.getElementsByTagName("rooms");
    // nodeList is not iterable, so we are using for loop
    for (int itr = 0; itr < nodeList.getLength(); itr++)
    {
      Node node = nodeList.item(itr);
      System.out.println("\n");
      if (node.getNodeType() == Node.ELEMENT_NODE)
      {
        Element eElement = (Element) node;
        System.out.println("Room Type: "+ eElement.getElementsByTagName("roomType").item(0).getTextContent());
        System.out.println("Room Number: "+ eElement.getElementsByTagName("roomNum").item(0).getTextContent());
        System.out.println("Number of beds: "+ eElement.getElementsByTagName("bedNum").item(0).getTextContent());
        System.out.println("Price: "+ eElement.getElementsByTagName("price").item(0).getTextContent());
        System.out.println("Availability: "+ eElement.getElementsByTagName("available").item(0).getTextContent());
      }
    }
  }
catch (Exception e)
  {
    e.printStackTrace();
  }
}
}
