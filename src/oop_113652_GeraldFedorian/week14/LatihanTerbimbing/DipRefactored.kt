package oop_113652_GeraldFedorian.week14.LatihanTerbimbing

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}