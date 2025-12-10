import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(UserMainCode.vowelcount(s));
	}
}
class UserMainCode{
	public static int vowelcount(String str){
		int count = 0;
		for(char c :str.toCharArray()){
			c = Character.toLowerCase(c);
		switch (c){
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
		    count++;
		    break;
		    }
	
		 
		 }
		 return count;
		
		
	}
}