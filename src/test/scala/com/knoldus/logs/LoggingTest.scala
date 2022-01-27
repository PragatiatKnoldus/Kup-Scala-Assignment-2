package com.knoldus.logs

import org.scalatest.flatspec.AnyFlatSpec

class LoggingTest extends AnyFlatSpec {

  val logging = new Logging()

  "A log" should "give default value of level and message if no level is provided" in {
    assert("[INFO]: Some information" == logging.log("Some information"))
  }

  "A log" should "give level and message if some level is provided" in {
    assert("[WARN]: This is a warning" == logging.log("This is a warning", "warn"))
  }
}