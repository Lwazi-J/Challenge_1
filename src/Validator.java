import javax.swing.*;
import java.util.regex.Pattern;

public class Validator
{
    public boolean IsValid(String input)
    {
        return Pattern.matches("[a-zA-Z]+",input);
    }

    public void Validate(String in)
    {
        if (IsValid(in))
        {
            JOptionPane.showMessageDialog(null,"Input valid, YOU MAY CONTINUE");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"INVALID INPUT");
        }
    }
}
