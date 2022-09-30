public class Challenge1
{
    public static void main(String[] args)
    {
       // Scanner sc = new Scanner(System.in);
        String name = "",surname = "",dob = "";
        double dist = 0, kToMiles = 0, kToMeters = 0,ageToSecs = 0,ageToMilli = 0;
        int age = 0;
        //Declaration of objects
        Prompter ask = new Prompter(name,surname,dob,dist);
        Validator valid = new Validator();
        Calculator calc = new Calculator();
        Printer output = new Printer();

        //Getting values
        ask.prompt(name,surname,dob,dist);
        name = ask.getName();
        surname = ask.getSurname();
        dob = ask.getDate_of_birth();
        dist = ask.getDistance_from_store();

        //Calculations
        age = calc.calculate(dob);
        kToMiles = calc.ToMiles(dist);
        kToMeters = calc.ToMeters(dist);
        ageToSecs = calc.ToSeconds(age);
        ageToMilli = calc.ToMilliSecs(age);

        //DISPLAY OF INFORMATION
        output.Print(name,surname,kToMiles,kToMeters,ageToSecs,ageToMilli,age);
    }
}