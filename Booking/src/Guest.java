public class Guest
{
  //Fields
  private String firstName, lastName, nationality;
  private int telNum;
  private Date birthday;

  //Constructor
  Guest (String firstName, String lastName, String nationality, Date birthday, int telNumber)
  {
    this.firstName=firstName;
    this.lastName=lastName;
    this.nationality=nationality;
    this.birthday=birthday;
    this.telNum=telNumber;
  }
}
