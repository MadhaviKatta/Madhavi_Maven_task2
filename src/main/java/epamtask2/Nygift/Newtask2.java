package epamtask2.Nygift;
import java.lang.*;
import java.util.Scanner;
interface cookie {
	void method();
}
class Sortingarray implements cookie
{
    public void method()
    {
        int i,temp,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of array elements");
	    int count = scan.nextInt();
	    System.out.println("enter array elements");
	    int num[] = new int[count];
	    for(i=0;i<count;i++) 
	    {
	        num[i] = scan.nextInt();
	    }
	    for (i = 0; i < count; i++) 
        {
            for (j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    
    for(i=0;i<count;i++)
    {
    	System.out.println(num[i]);
    }
    int max=num[0];
    for(i=0;i<count;i++)
    {
    	max=num[i];
    		if(num[i]>max)
    		{
    			max=num[i];
    		}
    }
    System.out.println("Maximum Element"+" "+max);
    }
    void year()
    {
    	System.out.println("NEW YEAR");
    }
    
}
class overriding extends Sortingarray
{
	void year()
	{
		System.out.println("HAPPY NEW YEAR");
	}
}
public class Newtask2 {
    public static void main (String[] args) {
        Sortingarray s1=new Sortingarray();
        s1.method();
        overriding r=new overriding();
        r.year();
    }
}
