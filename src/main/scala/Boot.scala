import com.typesafe.sslconfig.util.ConfigLoader
import server.ApiServer

/**
  * Created by wdaimongkol on 6/25/2017 AD.
  */
trait ShutdownAwareApp extends App {
  def shutdown(): Unit

  sys.addShutdownHook(shutdown())
}

object Boot extends ShutdownAwareApp {

  val server = new ApiServer()
  server.start()

  override def shutdown(): Unit = {
    println("Shutdown the nongped-pull-api")
  }
}
