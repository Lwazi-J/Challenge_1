public class Calculator
{
    public int calculate(String db)
    {
        //working out age
        String[] parts = db.split("/");
        String date = parts[0];
        String month = parts[1];
        String year = parts[2];
        return 2022 - Integer.parseInt(year);
    }
    public double ToMiles(double kiloM)
    {
        //working out kilometers to miles
        return kiloM * 0.621371;
    }

    public double ToMeters(double kiloM)
    {
        //working out the distance in meters
        return kiloM/100;
    }

    public double ToSeconds(int ageY)
    {
        //working out age in seconds
        return ageY * 31536000;
    }

    public double ToMilliSecs(double ageY)
    {
        //working out age in milliseconds
        return ageY * 315576000;
    }
}
