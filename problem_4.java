// Autoboxing - Autoboxing into integer
// 

List<Double> weights = new ArrayList<>();
weights.add(50.5);				// [50.5]
weights.add(new Double(60));	// [50.5, 60.0]
weights.remove(50.5);			// [60.0]
double first = weights.get(0);  // 60.0



List<Integer> heights =  new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.remove(1);
System.out.println(numbers);

//
//... answer
// 1. outputs - [1]
// 2. outputs - [1,2]
// 3. Actually removes Index 1 which is Integer 2
//  Was expecting numbers.remove[1]; to remove