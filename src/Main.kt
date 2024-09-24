import kotlin.random.Random

//назаров Руслан
//23-ИСП-3/1
//Двухмерный массив
// 12.56

fun main() {

    var sumArray = 0
    var sumCubeArray = 0
    var averageArray = 0

    var masTwoMer = arrayOf<Array<Int>>()
    for (i in 0..1) {
        var array = arrayOf<Int>()
        for (j in 0..3) array += Random.nextInt(1, 100)
        masTwoMer += array
    }
    for (i in masTwoMer) {
        for (array in masTwoMer) {
            for (value in array) {
                print("$value ")
                sumArray += value
                sumCubeArray += value * 2
                averageArray += value / array.size
            }
            println()
        }
    }
    println()

    println("сумма всех элементов массива: $sumArray")
    println("сумма квадратов массива: $sumCubeArray")
    println("среднее арифметическое массива: $averageArray")
}