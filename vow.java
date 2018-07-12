public class vow {
public static void main(String[] args) { 
	char c=args[0].charAt(0);
	if(c>='A' && c<='Z'||c>='a' && c<='z'){
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){System.out.println("vowel");}
	else if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u'||c!='A'||c!='E'||c!='I'||c!='O'||c!='U'){System.out.println("consonant");}
	}
	else {System.out.println("invalid");}
}
}