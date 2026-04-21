package oop_113652_GeraldFedorian.week09.TugasMandiri

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)