import java.util.Scanner;

public class ReverseString {
	public static void main(String [] args) {
		System.out.println("Please enter the number");
		String str = new Scanner(System.in).next();
		System.out.println("Reverse of "+str+" is "+reverseAPI(str));
		System.out.println("Reverse of "+str+" is "+reverseAlgo(str));
		System.out.println("Reverse of "+str+" is "+reverseAlgoHalf(str));
	}
	
public static String reverseAPI(String str) {
	
	StringBuilder bld = new StringBuilder(str);
	str = bld.reverse().toString();
	return str;	
}
public static String reverseAlgo(String str) {
	
	String str1="";
	int i = str.length()-1;
	//System.out.println("Length of string is "+i);
	while(i>=0) {
		str1=str1+str.charAt(i);
		i--;
	}
	return str1;	
}
public static String reverseAlgoHalf(String str) {
	char [] ch = str.toCharArray();
	
	for(int i=0;i<ch.length/2;i++) {
		char c=ch[i];
		ch[i]=ch[ch.length-i-1];
		ch[ch.length-i-1]=c;
	}
	
	return new String(ch);
}
}
