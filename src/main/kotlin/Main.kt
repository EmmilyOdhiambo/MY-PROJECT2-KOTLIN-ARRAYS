fun main() {
    scores()
    teachers("John","Nancy","Mary","Jane")
    human()
    informations()
    println(students("Nancy","Emmie","Dorcas"))


}


//Create one function that given the below array:

//var numbers = arrayOf(23, 42,4,905,83,35,100,33,15,232)
fun scores(){
    var numbers = arrayOf(23, 42,4,905,83,35,100,33,15,232)
    var addition = numbers[1] + numbers[4]
    println(addition)

    var index = numbers.indexOf(100)
    println(index)

    numbers.sort()
    println(numbers.contentToString())

    var arrays = numbers.sortedArray()
    println(numbers.contentToString())

}



//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun teachers(name1:String,name2:String,name3:String,name4:String){
    var t = arrayOf(name1,name2,name3,name4)
    println(t.contentToString())
}
//Looping through an array:
//We use "for" to loop elements in array
fun human() {
    var details = arrayOf("toyota", "mercedees", true, 254.56, 1050, 712345678)
    for (detail in details) {
        println(detail)
    }
    if("mercedees" in details){
        println("it exists")
    }else{
        println("do not exists")
    }
}

//Create a function that given an array below:
//
//var owner = arrayOf(“nairobi”, “born-a-crime”, “kenyans”, “stephanie")
//prints out the arrays in the correct grammatical case.
//prints out the arrays in the uppercase.
fun informations(){
    var informations = arrayOf("nairobi","born-a-crime","kenyan","stephanie")
    for(information in informations){
        println(information.capitalize())
    }
}

//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun students(nam1:String,nam2:String,nam3:String): String {
    var identity = arrayOf(nam2,nam1,nam3)
    return identity.contentToString()

}