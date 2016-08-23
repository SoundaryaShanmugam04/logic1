package shiva;

import java.util.Arrays;
import java.util.Scanner;

public class lo4 
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String temp="";
int stop=0;
int sto=0;
int count=0;
String ttt="";
System.out.println("enter the strating of dict");
String st=s.next();
System.out.println("enter the ending");
String en=s.next();
System.out.println("enter the dict");
String di=s.next();
String te=st+","+di+","+en;
//System.out.println(te);
String sp[]=te.split(",");
Arrays.sort(sp);
for(int i=0;i<sp.length;i++)
{
//	System.out.println(sp[i]);
}
for(int i=0;i<sp.length;i++)
{
	temp+=sp[i]+",";
}
//System.out.println(sp.length);
for(int i=0;i<sp.length;i++)
{
	
	if(st.equals(sp[i]))
	{
		sto=i;
//		System.out.println(i);
	}
	if(en.equals(sp[i]))
	{
	stop=i;	
//	System.out.println(i);
	}
}
/*for(int i=0;i<temp.length();i++)
{
	String t=temp.substring(i);
	System.out.println(t);
	if(t.equals(st))
	{
		sto=i;
		System.out.println(sto);
	}
}*/
/*for(int i=0;i<temp.length();i++)
{
	String t=temp.substring(i);
	System.out.println(t);
	if(t.equals(en))
	{
		stop=i;
		System.out.println(stop);
	}
}*/
//System.out.println(sto+"==="+stop);
//System.out.println(temp);
for(int i=sto;i<=stop;i++)
{
	 ttt=ttt+sp[i];
	 count++;
}
System.out.println(temp.substring(sto,stop+1));
String fi=temp.substring(sto,stop+1);
String lo[]=fi.split(",");
//System.out.println(lo.length);
System.out.println(count);

}
}
