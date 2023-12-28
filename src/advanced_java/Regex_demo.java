package advanced_java;
import java.util.regex.*;
public class Regex_demo {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d","1234"));
		System.out.println(Pattern.matches("\\d","2"));
		System.out.println(Pattern.matches("\\d+","1234"));
		System.out.println(Pattern.matches("\\d+","surya1234"));
		System.out.println(Pattern.matches("\\D+","surya1234"));
		System.out.println(Pattern.matches("\\D","surya"));
		System.out.println(Pattern.matches("\\D","s"));
		System.out.println(Pattern.matches("\\D+","surya"));
		System.out.println(Pattern.matches("\\D+","surya_"));
		System.out.println(Pattern.matches("\\D+","surya_#"));
		System.out.println(Pattern.matches("\\D+","surya_#007"));
		System.out.println(Pattern.matches("\\D+{5}","surya_#007"));
		System.out.println(Pattern.matches("\\D+{5}","surya"));
		System.out.println(Pattern.matches("\\D+{5}","suriya"));
		System.out.println(Pattern.matches("\\d+{5,}","suriya"));
		System.out.println(Pattern.matches("\\s{5,}","suriya"));
		System.out.println(Pattern.matches("\\s{5,}","  "));
		System.out.println(Pattern.matches("\\s{5,}","       "));
		System.out.println(Pattern.matches("\\S{5,}","       "));
		System.out.println(Pattern.matches("\\S{5,}","jaya"));
		System.out.println(Pattern.matches("\\S{5,}","jayalakshmi"));
		System.out.println(Pattern.matches("\\S{5,10}","jayalakshmi"));
		System.out.println(Pattern.matches("\\S{5,10}","jayalak"));
		System.out.println(Pattern.matches("\\w{5,10}","jayalakshmi"));
		System.out.println(Pattern.matches("\\w{5,13}","jayalakshmi"));
		System.out.println(Pattern.matches("\\w{5,13}","jaya"));
		System.out.println(Pattern.matches("\\w{5,13}","jayaa"));
		System.out.println(Pattern.matches("\\w{5,13}","jayaa123"));
		System.out.println(Pattern.matches("\\w{5,13}","Jayaa123"));
		System.out.println(Pattern.matches("\\w{5,13}","Jayaa_123"));
		System.out.println(Pattern.matches("\\w{5,13}","Jayaa.123"));
		System.out.println(Pattern.matches("\\W{5,13}","Jayaa#123"));
		System.out.println(Pattern.matches("\\W{5,13}","#"));
		System.out.println(Pattern.matches("\\W{5,13}","#####"));
		System.out.println(Pattern.matches("\\W{5,13}","#$@#$@##"));


































		

	}

}
