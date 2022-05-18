import java.util.Objects;

public class Guest
{
  //Fields
  //=======================
  private String firstName, lastName, nationality;
  private int telNum;
  private Date birthday;
  //=======================

  //Constructor
  //=======================
  public Guest (String firstName, String lastName, String nationality, Date birthday, int telNumber)
  {
    this.firstName=firstName;
    this.lastName=lastName;
    this.nationality=nationality;
    this.birthday=birthday;
    this.telNum=telNumber;
  }
  //=======================

  //Setters
  //=======================
  public void setFirstName(String firstName)
  {
    this.firstName=firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName=lastName;
  }

  public void setBirthday(Date birthday)
  {
    this.birthday=birthday;
  }

  public void setTelNum(int telNum)
  {
    this.telNum = telNum;
  }

  public void setNationality(String nationality)
  {
    this.nationality=nationality;
  }
  //=======================

  //Getters
  //=======================

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public Date getBirthday()
  {
    return birthday;
  }

  public int getTelNum()
  {
    return telNum;
  }

  public String getNationality()
  {
    return nationality;
  }
  //=======================

  //EqualMethod
  //=======================
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Guest guest = (Guest) obj;
    return telNum == guest.telNum && Objects.equals(firstName, guest.firstName)
        && Objects.equals(lastName, guest.lastName) && Objects.equals(
        nationality, guest.nationality) && Objects.equals(birthday,
        guest.birthday);
  }
  //toString
  //=======================
  public String toString()
  {
    return "Full name: " + firstName + ", " + lastName +
        "\nNationality: " + nationality +
        "\nPhone number: " + telNum +
        "\nDate of birth: " + birthday;
  }
  //=======================
}
