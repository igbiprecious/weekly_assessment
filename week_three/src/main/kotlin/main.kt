fun main(){
    //function call for question one
    numberMultiple()

    //function call for question two
    stringReverser("Good food")
}

//QUESTION ONE
fun numberMultiple() {
    var i: Int = 0
    var multipleOf3: Int = 3
    var multipleOf5: Int = 5
    var multipleOf3n5: Int = multipleOf3 * multipleOf5
    while (i < 100) {
        i++
        if (i % multipleOf3n5 == 0) {
            println("FizzBizz")
            continue
        }else if (i % multipleOf3 == 0) {
            println("Fizz")
            continue
        }else if (i % multipleOf5 == 0) {
            println("Bizz")
            continue
        }
        println(i)
    }
}

//QUESTION TWO
fun stringReverser(words : String){
    var detectLength : Int = words.length //to detect total character Length of the Word
    for(word in words){
        detectLength--
        println(words[detectLength])
    }
}