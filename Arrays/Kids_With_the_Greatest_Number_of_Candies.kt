class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
       val max = candies.max()
        var bool = BooleanArray(candies.size)
        var i = 0
        while(i < bool.size){
            if(max != null){
            bool[i] = (max <= (candies[i] + extraCandies) )
            }
            i++
        }
        
        return bool
    }
}