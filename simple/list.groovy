
List nums = [1, 2, 5, 6, 9, 0, 4, 2, 1, 7]
println nums
println nums.class.name
println nums[-1..-3] * 4
println nums -1 -0
println nums + [3, 2, 1]
println nums << [3, 2, 1]

List leveledNums = [1, [6, [5, [3, 9, 0], 4]]]
println leveledNums
println leveledNums.flatten()
