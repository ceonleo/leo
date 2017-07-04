package hunter_s01;

import java.util.Scanner;

public class UniqueInt_unsorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int s=sc.nextInt();
		int[] a=new int[s];
		int ans=0;
		System.out.println("enter array elements");
		for(int i=0;i<s;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++){
			int count=0;
			for(int j=0;j<s;j++){
				if((a[i]==a[j])&&(i!=j)){
					count=2;
				}
				}
			if(count==0)
			{
				ans=a[i];
			}
			}
		System.out.println(ans);
}}
