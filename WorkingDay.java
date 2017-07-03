package player_set2;
import java.util.Scanner;
public class WorkingDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	System.out.println(isWorking(s));
	}
public static boolean isWorking(String s){
	String s1=s.toLowerCase();
	if(s1.equals("monday")||s1.equals("tuesday")||s1.equals("wednesday")
			||s1.equals("thrusday")||s1.equals("friday")){
		return true;
	}
	return false;
}
}
