package advanced_java;
import java.util.regex.*;

public class Regular_Expression_demo {

	public static void main(String[] args) {
		// 1st way	
	 Pattern p=Pattern.compile("..a"); 
	 Matcher m=p.matcher("sla");
	 boolean o1=m.matches();  
	 System.out.println(o1);
	 System.out.println(m.start());
	   // 2nd way 
	 boolean o2=Pattern.compile("..a").matcher("sla").matches();
	 System.out.println(o2); 
	   // 3rd way 
	 System.out.println(Pattern.matches("..a", "sla"));
	
		System.out.println("list of quantifiers");
		 
		//  ?--(once or not) +--(one or more) *--(zero or more)
		//  meta characters and meta tag
		//  \d-->(digits 0 to 9)
		//  \D-->(expect digits)
		//  \w-->(alpha numeric word)(a-z A-Z 0-9 _)
		//  \W-->(expect (alpha numeric word)(only symbols)
		//  \s-->white spaces
		//  \S-->except white spaces
		//  [abc]-->either a or b or c
		//  [^abc]-->except either a or b or c
		//  [0-9]{6}-->only numbers, only six digits numbers
    	//  [0-9]{6,}-->only numbers, six digits numbers or more
    	//  [0-9]{6,10}-->only numbers, min six but less than ten digits numbers 
		System.out.println(Pattern.matches("..a", "sla"));
		System.out.println(Pattern.matches("a", "sla"));
		System.out.println(Pattern.matches("a", "aaa"));
		System.out.println(Pattern.matches("a", "a"));
		System.out.println(Pattern.matches("a?", "a"));
		System.out.println(Pattern.matches("[abc]", "sla"));
		System.out.println(Pattern.matches("[abc]", "s"));
		System.out.println(Pattern.matches("[abc]", "c"));
		System.out.println(Pattern.matches("[Ss]", "sla"));
		System.out.println(Pattern.matches("[Ss]la", "sla"));
		System.out.println(Pattern.matches("[Ss]la", "Sla"));
		System.out.println(Pattern.matches("[Ss]la", "SLA"));
		System.out.println(Pattern.matches("[^Ss]la", "sla"));
		System.out.println(Pattern.matches("[^Ss]la", "tla"));
		System.out.println(Pattern.matches("^rk$", "rajesh"));
		System.out.println(Pattern.matches("^rk$", "jesonrk"));
		System.out.println(Pattern.matches("^rk$", "rkjeson"));
		System.out.println(Pattern.matches("^rk$", "rk"));
		System.out.println(Pattern.matches("[rk]+", "iam rk"));
		System.out.println(Pattern.matches("[rk]*", "iam rk"));
		System.out.println(Pattern.matches("....rk", "iam rk"));
		System.out.println(Pattern.matches("[0-9]+", "3456"));
		System.out.println(Pattern.matches("[0-9]*", "3456"));
		System.out.println(Pattern.matches("[0-9]{4}", "3456"));
		System.out.println(Pattern.matches("[0-9]{6}", "3456"));
		System.out.println(Pattern.matches("[0-9]{6,}", "3456"));
		System.out.println(Pattern.matches("[0-9]{6,}", "3456789"));
		System.out.println(Pattern.matches("[0-9]{6,}", "345678901"));
		System.out.println(Pattern.matches("[a-z][0-9]{6,}", "rk7598"));
		System.out.println(Pattern.matches("[a-z]+[0-9]+{6,}", "rajesh759899"));
		System.out.println(Pattern.matches("[a-z]+[0-9]+{6,}", "rk759899"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "9489755233"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "7489755233"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "7989755233"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "9889755233"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "+917989755233"));
		System.out.println(Pattern.matches("[789]{3}[0-9]+{6,}", "7989755233"));		







		






















	}

}
