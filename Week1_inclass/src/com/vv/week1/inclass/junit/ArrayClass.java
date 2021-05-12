package com.vv.week1.inclass.junit;

public class ArrayClass {
		public static int sum(int arr[])
		{
		  int s=0;
		  for(int i=0;i<arr.length;i++)
		     s=s+arr[i];
		  return s;
		}
		public static int Average(int arr[])
		{
		  int s=0;
		  for(int i=0;i<arr.length;i++)
		     s=s+arr[i];
		  int avg = s/arr.length;
		  return avg;
		}
		public static int greateThanAverage(int arr[])
		{
		  int count=0;
		  for(int i=0;i<arr.length;i++)
		    if(arr[i]>Average(arr))
		      count++;
		  return count;
		}
		public static int countEven(int arr[])
		{
		  int count=0;
		  for(int i=0;i<arr.length;i++)
		      if(arr[i]%2==0)
		         count++;
		  return count;
		}
		public static int countOdd(int arr[])
		{
		  int count=0;
		  for(int i=0;i<arr.length;i++)
		      if(arr[i]%2!=0)
		         count++;
		  return count;
		}

}
