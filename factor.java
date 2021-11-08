import java.util.*;  
public class Main
{
	public static void main(String[] args) {
	    int i=1;
	    Scanner sc= new Scanner(System.in); 
	    int a= sc.nextInt();  
	    for(i=1;i<=a;i++)
	    { 
	        if (a%i==0)
	            System.out.format("%d\n",i);
	    }
	}
}
/*
14
1
2
7
14*/
