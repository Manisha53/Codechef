//DANNY WANTS TO KNOW

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
		int n=s.nextInt();
		int q=s.nextInt();
		
		long[] a= new long[n]; 
		long[] b= new long[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();       // input to array of # soldiers
		}
		for(int i=0;i<n;i++){
		    b[i]=s.nextInt();       //input to array of strength of each soldier
		}
		while(q-->0){
		    int l=s.nextInt();
		    int r=s.nextInt();
		    long sum=0;
		    for(int k= l-1 ;k<= r-1 ;k++){
		        //sum=0;
		        sum=sum+a[k]*b[k];
		    }
		    System.out.println(sum);
		}
	}
	}
}
