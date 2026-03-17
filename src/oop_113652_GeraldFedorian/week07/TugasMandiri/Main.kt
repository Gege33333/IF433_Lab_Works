package oop_113652_GeraldFedorian.week07.TugasMandiri

fun main() {

    GameManager.startGame()
    GameManager.startGame()

    println("\n=== SIMULASI FACTORY & ENUM ===")

    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("\nSenjata Awal Pemain:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")
}