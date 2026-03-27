package oop_00000119085_IvanMichaelLawrenceSanjaya.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapatkan loot: $name | Damage: $damage | Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("Game Over! Reason: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. Bisa ber istirahat dan aman dari musuh.")
        }
    }
}