import java.util.LinkedList

fun merge(a : LinkedList<Int>, b : LinkedList<Int>){
    var result = LinkedList<Int>()
    var x = 0
    var y = 0
    while(x < a.size && y < b.size){
        if(a[x] <= b[y]){
            result.add(a[x])
            x++
        }
        else{
            result.add(b[y])
            y++
        }
    }
    while(x < a.size){
        result.add(a[x])
        x++
    }
    while(y < b.size){
        result.add(b[y])
        y++
    }
    println(result)
}

fun main(){
    var list1 = LinkedList<Int>()
    var list2 = LinkedList<Int>()
    while(true){
        var a = readLine()!!.toInt()
        if(a==0) break
        else if(a==1){
            var num = readLine()!!.toInt()
            list1.add(num)
        }
        else{
            var num = readLine()!!.toInt()
            list2.add(num)
        }
    }
    merge(list1, list2)
}