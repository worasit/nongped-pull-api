import api.ApiServer

/**
  * Created by wdaimongkol on 6/25/2017 AD.
  */
trait ShutdownAwareApp extends App {
  def shutdown(): Unit

  sys.addShutdownHook(shutdown())
}

object Boot extends ShutdownAwareApp {
  override def shutdown(): Unit = {
    println("Shutdown the nongped-pull-api")
  }
}
