// ArrayList - Autoboxing & Autoboxing with Integers
// 

// Exmaple 1
List<Double> weights = new ArrayList<>();
weights.add(50.5);				// [50.5]
weights.add(new Double(60));	// [50.5, 60.0]
weights.remove(50.5);			// [60.0]
double first = weights.get(0);  // 60.0


// Example 2
List<Integer> heights =  new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.remove(1);
System.out.println(numbers);

//
// 14. outputs - [1]
// 15. outputs - [1,2]
// 16. We request remove via Index, index of 1
// Because theres already a remove() method that takes an int param
// Java calls that rather than autoboxing 