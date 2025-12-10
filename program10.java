import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.nextLine().charAt(0);
		String[]ans = UserMainCode.Stringsplit(str ,c);
		for(int i = 0 ; i< ans.length ;i++){
			System.out.println(ans[i] + " ");
		}
		
	}
}
class UserMainCode{
	public static String[] Stringsplit(String s , char c){
	String[]s1 = s.split(""+ c);
	String [] op = new String[s1.length];
	for(int i =0 ; i<s1.length ;i++){
		op[i] =s1[i].toLowerCase();
		StringBuilder sb = new StringBuilder(op[i]);
		op[i] = sb.reverse().toString();
	}
	return op;
	}
}