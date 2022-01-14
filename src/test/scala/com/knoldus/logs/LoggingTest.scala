package com.knoldus.logs

import org.scalatest.flatspec.AnyFlatSpec

class LoggingTest extends AnyFlatSpec {

  "A log" should "be valid" in {
    val obj = new Logging()
    assert ("[INFO]: Some information" == obj.log("Some information"))
  }

  "A log" should "be valid as" in {
    val obj = new Logging()
    assert ("[WARN]: This is a warning" == obj.log("This is a warning","WARN"))
  }
}
