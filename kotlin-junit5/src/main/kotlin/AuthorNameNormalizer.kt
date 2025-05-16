class AuthorNameNormalizer {
    fun normalize(authorName: String): String {
        val name = authorName.trim()
        return when {
            name.isMultiPart() -> normalized(name)
            else -> name
        }
    }

    private fun normalized(name: String): String {
        val parts = name.parts()
        val middleInitials = initialize(parts.drop(1).dropLast(1))
        return "${parts.last()}, ${parts.first()}" + if (middleInitials.isNotBlank()) " $middleInitials" else ""
    }

    private fun initialize(middleParts: List<String>): String {
        return middleParts.joinToString(" ") { "${it.first()}." }.let { it.ifBlank { "" } }
    }

    private fun String.parts(): List<String> = split(' ')

    private fun String.isMultiPart(): Boolean = contains(' ')
}