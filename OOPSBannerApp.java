import java.util.*;
class OOPSBannerApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[5];
        a[0]=(String.join("   "," ***** ", " ***** ", " ***** ", " ***** "));
        a[1]=(String.join("   ","*     *", "*     *", "*     *", "*      "));
        a[2]=(String.join("   ","*     *", "*     *", " ***** ", " ***** "));
        a[3]=(String.join("   ","*     *", "*     *", "*      ", "      *"));
        a[4]=(String.join("   "," ***** ", " ***** ", "*      ", " ***** "));
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}