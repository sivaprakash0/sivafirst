package testprg;

import java.util.Scanner;

public class anag {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String nm1=in.nextLine();
	String nm2=in.nextLine();int cnt=0;
	char c[]=(nm1.toLowerCase()).toCharArray();char c2[]=(nm2.toLowerCase()).toCharArray();
	for(int i=0;i<nm1.length();i++){
		for(int j=0;j<nm2.length();j++){
			if(c[i]==c2[j]){
				cnt++;
			}
		}
	}
	if(cnt==nm1.length()) System.out.println("true");
	else System.out.println("false");
	}
}
