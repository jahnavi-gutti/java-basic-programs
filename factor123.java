import java.util.*;
public class Main
{
    public static void main(String[] args)
    {   int c=1,i=1;
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for (i=1;i<=a;i++)
        {
            c*=i;
        }
        System.out.println(c);
    }
}
/*
5
120*/
