package oop_113652_GeraldFedorian.week07.TugasMandiri

fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }

        is BattleState.LootDropped -> {
            val item = event.item
            println("Kamu mendapatkan item: ${item.name}")
            println("Damage: ${item.damage}")
            println("Rarity: ${item.rarity} (Drop Chance: ${item.rarity.dropChance}%)")
        }

        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. HP dipulihkan.")
        }
    }
}