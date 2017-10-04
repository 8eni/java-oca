// Data & Times - Manipulation & exam tricks
// 

// Exmaple 1
LocalDate date = LocalDate.of(2014, month.JANUARY, 20);
System.out.println(date);	// 2014-01-20
date = date.plusDays(2);	
System.out.println(date);	// 2014-01-22


// Example 2 - exam potential tricks
LocalDate date = LocalDate.of(2014, month.JANUARY, 20);
date.plusDays(10);	
System.out.println(date);

// Example 3 - exam potential tricks
LocalDate date = LocalDate.of(2014, month.JANUARY, 20);
date = date.plusMinutes(1)


//
// 14. ANS: 2014-01-20 - Does not change because we ignored the results cause immutable
// pay attention to make sure the return value of a method isnt ignored
// (does this mean because we dont assign)

// 19. ANS: DOES NOT COMPILE - LocalDate does not contain time
// Testing your knowledge of what date and time consist of