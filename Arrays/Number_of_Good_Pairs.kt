class Solution {
   fun numIdenticalPairs(nums: IntArray): Int {
    var counter = 0
    nums.forEachIndexed { i, num -> for (j in i + 1 until nums.size) if (num == nums[j])   
    counter++ }

    return counter
}
}