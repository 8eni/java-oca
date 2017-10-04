// Arrays - Searching Arrays(sorted) via binary
// 

// Example 1
int[] numbers = {2,4,6,8};
System.out.println(Arrays.binarySearch(numbers, 2));
System.out.println(Arrays.binarySearch(numbers, 4));
System.out.println(Arrays.binarySearch(numbers, 1));
System.out.println(Arrays.binarySearch(numbers, 3));
System.out.println(Arrays.binarySearch(numbers, 9));

// Note - Line 5 is a sorted order
// 6. 0
// 7. 1
// 8. ANS: -1 - Because 1 doesnt exist, should be inserted at 0 index, 
// however this is taken so we give it -1 position
// 9. ANS: -2 - Altough 3 not in list it would be inserted at element 1 to keep the sorted order
// we negate and subtract for consistancy -1, -1 = -2
// 10. ANS: -5 - Doesnt exist, so Insert after 8 which is 4 index, negate this (-4) and 
// subtract 1 (-1) giving us -5