object formatName{
    def toUpper(name: String): String = {
        name.toUpperCase()
    }

    def toLower(name: String): String = {
        name.toLowerCase()
    }

    def formatNames(name: String, format: String => String): String = {
        format(name)
    }

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny", toUpper))

        println(formatNames("Niroshan", name => {
            name.substring(0, 2).toUpperCase() + name.substring(2).toLowerCase()
        }))

        println(formatNames("Saman", toLower))

        println(formatNames("Kumara", name => {
            name.substring(0, 1).toUpperCase() + name.substring(1, 5).toLowerCase() + name.substring(5).toUpperCase()
        }))
    }
}
