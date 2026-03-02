import java.util.*;
class OOPSBannerApp 
{
    static class CharacterPatternMap 
    {
        HashMap<Character, String[]> map = new HashMap<>();
        CharacterPatternMap() {
            map.put('O', O());
            map.put('P', P());
            map.put('S', S());
            map.put(' ', space());
        }
        String[] get(char ch) 
        {
            return map.getOrDefault(ch, space());
        }
    }
    public static void main(String[] args) 
    {
        CharacterPatternMap patternMap = new CharacterPatternMap();
        String msg = "OOPS";
        String[] o1 = patternMap.get('O');
        String[] o2 = patternMap.get('O');
        String[] p  = patternMap.get('P');
        String[] s  = patternMap.get('S');
        String[] finalRows = new String[9];
        for (int i = 0; i < 9; i++) 
        {
            finalRows[i] = String.join("   ", o1[i], o2[i], p[i], s[i]);
        }
        for (String line : finalRows) 
        {
            System.out.println(line);
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