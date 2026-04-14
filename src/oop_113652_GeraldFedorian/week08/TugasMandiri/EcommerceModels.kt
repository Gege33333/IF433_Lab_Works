package oop_113652_GeraldFedorian.week08.TugasMandiri

sealed class Product {

    data class Electronic(
        val id: String,
        val name: String,
        val warrantyMonths: Int
    ) : Product()

    data class Clothing(
        val id: String,
        val name: String,
        val size: String
    ) : Product()
}