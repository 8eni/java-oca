// StringBuilder - Mutability & Chaining
// 

// Example 1
StringBuilder sb = new StringBuilder("start");
sb.append("+middle"); 					// sb = "start+middle";
StringBuilder same = sb.append("+end");	// "start+middle+end";


// Example 2
StringBuilder a = new StringBuilder("abc");
StringBuilder b = a.append("de");
b = b.append("f").append("g");
System.out.print("a=" + a);
System.out.print("b=" + b);



//
// 12. There are now 2 variables refferig to that object with a value of "abcde"
// 13. Both still refering to that object nwow with a value of "abcdefg"
// 14. ANS: a=abcdefg
// 15. ANS: b=abcdefg