import leon.lang._
import leon.lang.synthesis._
import leon.annotation._

object Blah {
  
sealed abstract class Boolean
case object T extends Boolean
case object F extends Boolean
  
def bool_always_true(p: Boolean, q: Boolean): Boolean = { choose { (out:Boolean) => 

     out == T
  }
}
}
