class AuthorNameNormalizer {
    fun normalize(authorName: String): String {
        val name = authorName.trim()
        return if (name.isMultiPart()) {
            val (parts, suffix) = name.parts()
            val middleInitials = initialize(middle(parts))
            "${parts.last()}, ${parts.first()}$middleInitials$suffix"
        } else name
    }

    private fun String.isMultiPart(): Boolean = contains(' ')

    private fun String.parts(): Pair<List<String>, String> {
        return when {
            hasSuffix() -> {
                rejectMultipleCommas()
                namesAndSuffix()
            }
            else -> {
                namesWithNoSuffix()
            }
        }
    }

    private fun String.rejectMultipleCommas() {
        if (count { it == ',' } > 1) throw IllegalArgumentException("name contains two commas")
    }

    private fun String.namesAndSuffix(): Pair<List<String>, String> {
        val parts = split(", ")
        return parts[0].split(" ") to ", ${parts[1]}"
    }

    private fun String.namesWithNoSuffix(): Pair<List<String>, String> = split(' ') to ""

    private fun String.hasSuffix(): Boolean = this.contains(", ")

    private fun middle(parts: List<String>): List<String> = parts.drop(1).dropLast(1)

    private fun initialize(middleNames: List<String>): String = middleNames
        .joinToString(separator = " ", prefix = " ") {
            if (it.length > 1) "${it.first()}." else it
        }
        .ifBlank { "" }
}