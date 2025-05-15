class AuthorNameNormalizer {
    fun normalize(name: String): String {
        if (isMultiPart(name)) {
            val parts = name.split(' ')
            return "${parts.last()}, ${parts.first()}"
        }
        return name
    }

    private fun isMultiPart(name: String): Boolean = name.contains(' ')
}