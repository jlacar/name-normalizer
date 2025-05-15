class AuthorNameNormalizer {
    fun normalize(authorName: String): String {
        val name = authorName.trim()
        if (name.isMultiPart()) {
            val parts = name.parts()
            return "${parts.last()}, ${parts.first()}"
        }
        return name
    }

    private fun String.parts(): List<String> = split(' ')

    private fun String.isMultiPart(): Boolean = contains(' ')
}