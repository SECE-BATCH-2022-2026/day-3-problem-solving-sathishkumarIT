import java.io.*;
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		for(int i =0 ; i<n ;i++){
			str[i] = sc.nextLine();
		}
		String[]ans1 = UserMainCode.removeduplicate(str);
		for(int i =0 ; i <ans1.length ; i++){
			System.out.print(ans1[i] + " ");
		}
	}
}
class UserMainCode{
	public static String[] removeduplicate(String[] str1){
		Set<String> ts = new TreeSet<String>();
		for(String s : str1){
			ts.add(s);
		}
		String[] ans = new String[ts.size()];
		int i =0;
		for(String s :ts){
			ans[i++] = s;
		}
		return ans;
	}
}
