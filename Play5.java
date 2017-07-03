package player;
import java.util.Scanner;
public class Play5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		String str=st.toUpperCase();
		int ans=0;
	for(int i=0;i<str.length()-1;i++){
		if(check(str.charAt(i))<check(str.charAt(i+1)))
			ans-=(str.charAt(i));
		else if(check(str.charAt(i))>=check(str.charAt(i+1)))
				ans+=check(str.charAt(i));
		
	}
	ans+=check(str.charAt(str.length()-1));
		System.out.println(ans);
	}

	public static int check(char c)
	{
		switch(c)
		{
        case 'M':
            return 1000;
        case 'D':
            return 500;
        case 'C':
            return 100;
        case 'L':
            return 50;
        case 'X':
            return 10;
        case 'V':
            return 5;
        case 'I':
            return 1;
        default:
            return 0;
		}
	}
}
