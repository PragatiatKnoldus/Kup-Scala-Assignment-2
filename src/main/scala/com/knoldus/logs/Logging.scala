package com.knoldus.logs

class Logging {

  // used concept of default arguments and string interpolation

  def log (message: String, level: String = "INFO"): String = s"[$level]: $message"

}
