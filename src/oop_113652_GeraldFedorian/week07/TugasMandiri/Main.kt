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

    println("\n=== BLACKSMITH UPGRADE ===")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Senjata setelah upgrade:")
    println("Nama: ${upgradedItem.name}")
    println("Damage: ${upgradedItem.damage}")
    println("Rarity: ${upgradedItem.rarity}")

    println("\n=== SIMULASI EVENT ===")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}