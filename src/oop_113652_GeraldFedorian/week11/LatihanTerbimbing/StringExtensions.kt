package oop_113652_GeraldFedorian.week11.LatihanTerbimbing

fun String.addGreeting(): String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}


fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}