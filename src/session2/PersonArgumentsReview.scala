package session2

class PersonArgumentsReview(
                             val name: String,
                             val adult: Boolean = false,
                             val lastName: String
                           ) {

  override def toString = s"PersonArgumentsReview(name=$name, lastName=$lastName, adult=$adult)"
}
