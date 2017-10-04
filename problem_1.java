// String class - Concatenation & Immutability
// 

// Example 1
String s = "1";			// holds "1"
s += "2";				// holds "12"
s += "3";				// holds "123"
System.out.println(s);	// 123


// Example 2
String s1 = "1";				
String s2 = s1.concat("2");		
s2.concat("3");				
System.out.println(s2);	


//
// 12. "1"
// 13. "12"
// 14. Will throw this line at you to see if you remember String class is immutable
// 15. Answer - "12"
// Great for tricking people on the exam