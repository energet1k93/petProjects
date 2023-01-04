import java.util.Random;
public class PasswordGenerator
{
    public static void main(String[] args)
    {
        int length = 12; // password length
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int size)
    {
        System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();

        char[] password = new char[size];
        int index = 0;
        for (int i = 0; i < size; i++)
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));

        }
        return password;
    }
}