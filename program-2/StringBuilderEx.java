import java.util.Scanner;
/*Java StringBuilder class is used to create mutable (modifiable) string. 
The Java StringBuilder class is same as 
StringBuffer class except that it is non-synchronized.
*
*
*
*/
public class StringBuilderEx {
	public static void main(String args[]) {
		System.out.println("Enter the string");
		String str = new Scanner(System.in).next();
		StringBuilder sb = new StringBuilder(str);
		sb.append(" Java");// now original string is changed
		System.out.println("New String After Append Is "+sb);// prints Hello Java
	}

}
