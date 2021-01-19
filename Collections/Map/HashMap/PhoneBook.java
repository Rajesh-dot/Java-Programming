// Problem statement: https://www.hackerrank.com/challenges/phone-book/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class PhoneBook {
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map phBook = new HashMap();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phBook.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if (phBook.containsKey(s)) {
                System.out.println(s+"="+phBook.get(s));
            } else {
                System.out.println("Not found");
            }
		}
        
        
	}
}



