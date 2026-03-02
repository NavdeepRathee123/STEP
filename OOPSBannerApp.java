import java.util.*;
class OOPSBannerApp 
{
    static class CharacterPattern 
    {
        char ch;
        String[] pattern;
        CharacterPattern(char ch, String[] pattern) 
        {
            this.ch = ch;
            this.pattern = pattern;
        }
    }
    static class CharacterPatternMap 
    {
        CharacterPattern[] map = 
        {
                new CharacterPattern('O', O()),
                new CharacterPattern('P', P()),
                new CharacterPattern('S', S()),
                new CharacterPattern(' ', space())
        };
        String[] get(char c) 
        {
            for (CharacterPattern cp : map) 
            {
                if (cp.ch == c) return cp.pattern;
            }
            return space();
        }
    }
    public static void main(String[] args) 
    {
        CharacterPatternMap map = new CharacterPatternMap();
        String msg = "OOPS";
        String[] o1 = map.get('O');
        String[] o2 = map.get('O');
        String[] p  = map.get('P');
        String[] s  = map.get('S');
        String[] finalRows = new String[9];
        for (int i = 0; i < 9; i++) 
        {
            finalRows[i] = String.join("   ", o1[i], o2[i], p[i], s[i]);
        }
        for (String row : finalRows) 
        {
            System.out.println(row);
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
    public static String[] space() 
    {
        return new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };
    }
}