import java.util.*;
class OOPSBannerApp
{
    public static void main(String[] args)
    {
        String O1[] = O();
        String O2[] = O();
        String P[] = P();
        String S[] = S();
        String a[] = new String[9];
        for (int i = 0; i < 9; i++) 
        {
            a[i] = String.join("   ", O1[i], O2[i], P[i], S[i]);
        }
        for (String i : a) 
        {
            System.out.println(i);
        }
    }
    public static String[] O()
    {
        return new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }
    public static String[] P()
    {
        return new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      ",
            "*      ",
            "*      "
        };
    }
    public static String[] S()
    {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            "      *",
            "      *",
            " ***** "
        };
    }
}