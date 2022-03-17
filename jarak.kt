fun jarak() {
    var x1: Int = 2;
    var x2: Int = 8;
    var y1: Int = 3;
    var y2: Int = 7;
    var t1: Double = Math.pow((x2 - x1).toDouble(), 2.0);
    var t2: Double = Math.pow((y2 - y1).toDouble(), 2.0);
    var x3: Int = 5;
    var x4: Int = -8;
    var y3: Int = 3;
    var y4: Int = -4;
    var t3: Double = Math.pow((x4 - x3).toDouble(), 2.0);
    var t4: Double = Math.pow((y4 - y3).toDouble(), 2.0);
    val hasil1: Int = Math.sqrt(t1+t2).toInt();
    val hasil2: Int = Math.sqrt(t3+t4).toInt();
    println("titik t1(2,3) dan t2(8,7)");
    println("Jarak dari t1 ke t2 adalah : $hasil1");
    println("");
    println("titik t1(5,3) dan t2(-8,-4)");
    println("Jarak dari t1 ke t2 adalah : $hasil2");
}

fun main() {
    jarak();
}