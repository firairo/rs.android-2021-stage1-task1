package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val sadArray = sadArray.toMutableList()
        var i=1

        while (i<=sadArray.size-2){
            if(sadArray[i-1]+sadArray[i+1]<=sadArray[i]){
                sadArray.removeAt(i)
                i=1
            }
            i++
        }

        val good_array = sadArray.toIntArray()


        return good_array

    }
}


