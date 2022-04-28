package sdet31;

import java.util.HashSet;

public class sample3 {

	public static void main(String[] args) {
		String s="Tester";
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for(Character ch:hs)
		{    int count=0;
		
		    for(int i=0;i<s.length();i++) {
		    	
		    
			for(int j=s.length()-1;j>=0;j--)
			{
				count++;
			}
		    }
			if(count==1)
			{
				System.out.println(s.indexOf(ch));
			}
		}
		
	}

}
