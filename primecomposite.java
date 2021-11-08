import java.util.*;  
public class Main
{
	public static void main(String[] args) {
	    int i=1,c=0;
	    Scanner sc= new Scanner(System.in); 
	    int a= sc.nextInt();  
	    for(i=1;i<=a;i++)
	    { 
	        if (a%i==0)
	        {
	            c+=1;
	        }
	            
	    }
	    if (c==2)
	    {
	        System.out.format("%d is prime",a);
	    }
	    else if(c==1)
	    {
	        System.out.format("%d is neither prime nor composite",a);
	    }
	    else{
	        System.out.format("%d is composite",a);
	    }
	}
}
/*
17
17 is prime*/
