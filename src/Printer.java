public class Printer
{
    public void Print(String n, String sn,double miles,double meters,double seconds,double milliSeconds,int age)
    {
        System.out.println("\n\n======HELLO " + n + " " +sn +"======" + "\n");

        System.out.println("Your name is " + n);
        System.out.println("Your surname is " + sn);
        System.out.println("You are " + age + " years old");
        System.out.println("Distance in miles is : " + miles + " miles");
        System.out.println("Distance in meters is: " + meters + " meters");
        System.out.println("Age in seconds is: " + seconds + " seconds");
        System.out.println("Age in milliseconds is: " + milliSeconds + " milliseconds");

        //converting age to hexadecimal
        System.out.println("Age in Hex is = " + Integer.toHexString(age));

        //converting age to octal
        System.out.println("Age in Octal is = " + Integer.toOctalString(age));

        //converting age to binary
        System.out.println("Age in binary is = " + Integer.toBinaryString(age));
    }
}
