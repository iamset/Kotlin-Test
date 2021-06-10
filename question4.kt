fun main() {
    
    var swapCount = 0
    fun bubbleSort(arr:IntArray):IntArray{
        var swap = true
        while(swap){
            swap = false
            for(i in 0 until arr.size-1){
                if(arr[i] > arr[i+1]){
                    val temp = arr[i]
                    arr[i] = arr[i+1]
                    arr[i + 1] = temp

                    swap = true
                    swapCount++;
                }
            }
        }
        return arr
	}
    
    val sortedArray:IntArray = bubbleSort(intArrayOf(3,6,1,0,5));
    println("Number of swaps: "+ swapCount)
    println("FirstElement: "+ sortedArray.get(0))
    val lastIndex = sortedArray.lastIndex
    println("LastElement:" + sortedArray.get(lastIndex))
}
