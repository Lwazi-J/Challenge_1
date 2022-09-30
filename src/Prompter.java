import java.util.Scanner;

public class Prompter
{
    Scanner sc = new Scanner(System.in);
    Validator valid = new Validator();
    private String name;
    private String surname;
    private String date_of_birth;
    private double distance_from_store;

    public Prompter(String myName,String mySname,String myDOB,double myDst)
    {
        name = myName;
        surname = mySname;
        date_of_birth = myDOB;
        distance_from_store = myDst;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String nme)
    {
        this.name = nme;
    }
    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getDate_of_birth()
    {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth)
    {
        this.date_of_birth = date_of_birth;
    }

    public double getDistance_from_store()
    {
        return distance_from_store;
    }

    public void setDistance_from_store(double distance_from_store)
    {
        this.distance_from_store = distance_from_store;
    }

    public void prompt(String myName,String surName,String dob,double distance)
    {
        System.out.println("What is your name: ");
        myName = sc.nextLine();                //set the name
        valid.Validate(myName);
        setName(myName);
        System.out.println("What is your surname: ");
        surName = sc.nextLine();                 //set the surname
        valid.Validate(surName);
        setSurname(surName);
        System.out.println("Enter your date of birth (DD/MM/YYYY): ");
        dob = sc.nextLine();
        setDate_of_birth(dob);
        System.out.println("How far is your favourite store from your home in Kilometers?: ");
        distance = sc.nextDouble();             //set distance
        setDistance_from_store(distance);
    }
}
