class AuthorNameNormalizer {
    fun normalize(name: String): String {
        if (name.contains(' ')) {
            val parts = name.split(' ')
            return "${parts.last()}, ${parts.first()}"
        }
        return name
    }
}