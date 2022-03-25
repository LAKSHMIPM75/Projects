package Assignment24;
public class UserMainCode {
public static  String getAlternateChars( String s1)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i=i+2) {
	sb.append(s1.charAt(i));
	return sb.toString();
}
return s1;
}
}