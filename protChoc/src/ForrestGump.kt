class ForrestGump <T> (val life : RandomBox <T>) {
    var isRunning: Boolean = false
    fun runForrest() {
        isRunning = true
    }

    fun sayTheLineForrest(): String {
        val picked = life.pickOne()

        if (picked == null) {
            return “Life sucks :(“
        }

        Return “Life is like a box of chocolates: \n$(picked)”
    }
}
