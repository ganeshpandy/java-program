package com.revolite.interview;

public class ThirdMax
{
public static void main(String[]args){
int[]arr={1,2,3,4,5};
int flarge=arr[0];
int slarge=arr[1];
int tlarge=arr[2];
for(int i=1;i<arr.length;i++){
if(arr[i]>flarge){
slarge=flarge;
flarge=arr[i];
}
else if(arr[i]>slarge){
slarge=arr[i];
}
else if(arr[i]>tlarge)
{
	tlarge=arr[i];
}
}
System.out.println("3rd largest value is:"+tlarge);
}
}