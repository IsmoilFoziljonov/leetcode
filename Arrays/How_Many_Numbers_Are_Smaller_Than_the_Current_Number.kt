class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var result = IntArray(nums.size)
        nums.forEachIndexed{i, num -> 
            var counter = 0
            for(j in 0 until nums.size){
                if(num > nums[j]){
                    counter++
                }   
            }
            result[i] = counter
        }
        
        return result
    }
}
