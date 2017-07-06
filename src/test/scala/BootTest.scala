import org.specs2.mutable.Specification

/**
  * Created by worasit on 7/6/17.
  */
class BootTest extends Specification {

  "this is my specification" >> {
    "where example 1 must be true" >> {
      1 must_== 1
    }
    "where example 2 must be true" >> {
      2 must_== 2
    }
  }

}
