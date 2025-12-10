import java.util.*;
class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		System.out.println(UserMainCode.repeatFront(s ,k));
	}
}
class UserMainCode{
	public static String repeatFront(String str , int n){
		String str1 = "" ;
	 int l = str.length();
	 if(l < 3)	{
	   for(int i = 0 ; i<n ;i++){
	   	str1 += str;
	   }
	   }
	else{
		for(int i = 0 ; i<n ;i++){
	   	str1 += str.substring(0,n);
	   }
	}
     return str1;
	}
}