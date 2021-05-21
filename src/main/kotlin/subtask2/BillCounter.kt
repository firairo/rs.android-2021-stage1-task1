package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val input = bill.toMutableList()
        val sum = input.sum()
        val fairlySplit = "bon appetit"

        val allergy =(sum-bill[k])/2
        var anna: Int
        if (b==allergy)
            return fairlySplit

        else
            anna =b-allergy
        return anna.toString()

    }
}