//Author  : Deepansh Dubey.
//Date      : 16/10/2020.
//Purpose: To check a triprime no.


import java.io.*;
class triprime
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long i,n=0,m=0,o=0,c=0;
try
{
System.out.println("Input three no.");
n=Long.parseLong(br.readLine());
m=Long.parseLong(br.readLine());
o=Long.parseLong(br.readLine());
}
catch(Exception e)
{
System.out.println(e);
}
for(i=2;i<=(n>o?n:o);i++)
{
if(n%i==0&&m%i==0&&o%i==0)
{
c++;
}
}
if(c==0)
{
System.out.println("Triprime Numbers!!");
}
else
{
System.out.println("Not Triprime Numbers");
}
}
}