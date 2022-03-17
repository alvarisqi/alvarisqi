data class Barang(
    val nama: String = "Pop mie",
    val harga: Int = 10000,
    val jumlah: Int = 15,
    val diskon: Int = 30/100
) {
    fun tampil() {
        println("Nama : $nama");
        println("Harga : $harga");
        println("Jumlah : $jumlah");
        println("Diskon : $diskon");
    }

    fun HitungTotal() {
        val total: Int = harga*jumlah*diskon;
        println("Harga Total = $total");
    }

    fun main(args : Array<String>) {
        tampil();
        println("");
        HitungTotal();
    }
}