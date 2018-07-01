
List nums = [9, 1, 8, 2, 7, 3, 7, 4, 6, 5]
println nums

// Sum doubles

// Java approach
int total = 0;
for (int n : nums){
    total += 2 * n
}
assert total == 104

// Groovy using collect
assert 104 == nums.collect { it * 2 }.sum()

// Reduce to a problem already solved
assert 104 == nums.sum() * 2

// Groovy sum with closure
assert 104 == nums.sum { it * 2 }

// Sum with *.
assert 104 == nums*.multiply(2).sum()

// Double the collection
assert 104 == (nums * 2).sum()

// Use inject
assert 104 == nums.inject(0) { acc, val ->
    acc + val * 2
}
