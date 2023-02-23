import java.util.*

fun main() {
    val startRod: Stack<Int> = Stack()
    val tempRod: Stack<Int> = Stack()
    val finalRod: Stack<Int> = Stack()
    println("Please insert the number of disk you'd like to have")
    val n = Integer.valueOf(readln())
    var i = n
    while(i > 0) {
        startRod.push(i--)
    }
    hanoi(n, startRod, tempRod, finalRod)
    println("Final Rod elements " + finalRod.toString())
}


fun hanoi(diskNumber: Int, startRod: Stack<Int>, tempRod: Stack<Int>, finalRod: Stack<Int> ) {
    if(diskNumber == 1) {
        moveDisks(startRod,finalRod)
    }
    else {
        hanoi(diskNumber - 1, startRod, finalRod, tempRod)
        moveDisks(startRod, finalRod)
        hanoi(diskNumber - 1, tempRod, startRod, finalRod )
    }
}

fun moveDisks(from: Stack<Int>, to: Stack<Int>) {
    val temp: Int = from.pop()
    println("Moving $temp from $from to $to")
    to.push(temp)
}