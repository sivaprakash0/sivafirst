import java.util.Arrays;
import java.util.Scanner;
public class ArrSort {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int no[]=new int[sz];
	int no1[]=new int[sz];
	int a[]=new int[sz];
	String b,c="";
	int k=0;
	for(int i=0;i<sz;i++){
		no[i]=in.nextInt();
		no1[i]=no[i];
	}
	Arrays.sort(no);
	Arrays.sort(no1);
		for(int s=sz-1;s>=0;s--){
			 a[k]=no[s];
			 k++;
	  }
		int last=no1[(sz/2)];
		if(sz%2==0){
		for(int j=0;j<(sz/2);j++){
		System.out.print(a[j]+" "+no1[j]+" ");	
		}
		}
		else {
			for(int j=0;j<(sz/2);j++){
				b=(a[j]+" "+no1[j]+" ");
				c=c+b;
				}
			System.out.println(c+last);
		}
}
}
