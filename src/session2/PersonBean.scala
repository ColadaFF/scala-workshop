package session2

import scala.beans.BeanProperty
import scala.beans.BooleanBeanProperty

class PersonBean(
                  @BeanProperty val name: String,
                  @BeanProperty var lastName: String,
                  @BooleanBeanProperty val adult: Boolean) {

  override def toString = s"PersonBean(name=$name, lastName=$lastName, adult=$adult)"
}
