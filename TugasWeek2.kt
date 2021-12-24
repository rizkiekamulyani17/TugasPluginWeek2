fun main(){
    val Angka : Array <Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)

    print("Data array = ")
    println(Angka.toList())

    //Looping
    println("\n\n looping lewat genap dimulai dari 6")
    var total = 0
    for(i in Angka){
        if(i>= 6 && i % 2 == 0)
            println(i)
        total++
    }
    for (num in Angka){
        total = total + num
    }
    println("\n Jumlah nilai dalam array = "+ total)
}