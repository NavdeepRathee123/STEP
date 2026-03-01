import java.util.*;
class OOPSBannerApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         String a[] = {
            String.join("   ", 
                "  ***  ", "  ***  ", "***** ", " ***** "),
            String.join("   ", 
                " *   * ", " *   * ", "*    *", "*      "),
            String.join("   ", 
                "*     *", "*     *", "*    *", "*      "),
            String.join("   ", 
                "*     *", "*     *", "***** ", " ***** "),
            String.join("   ", 
                "*     *", "*     *", "*     ", "      *"),
            String.join("   ", 
                "*     *", "*     *", "*     ", "      *"),
            String.join("   ", 
                "*     *", "*     *", "*     ", "      *"),
            String.join("   ", 
                " *   * ", " *   * ", "*     ", "      *"),
            String.join("   ", 
                "  ***  ", "  ***  ", "*     ", " ***** ")
        };
        for (String i : a) 
        {
            System.out.println(i);
        }
    }
}