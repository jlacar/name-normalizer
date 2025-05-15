class AuthorNameNormalizer {
    fun normalize(name: String): String {
        if (name.isMultiPart()) {
            val parts = name.split(' ')
            return "${parts.last()}, ${parts.first()}"
        }
        return name
    }

    private fun String.isMultiPart(): Boolean = contains(' ')
}