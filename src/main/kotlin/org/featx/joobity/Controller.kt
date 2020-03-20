package org.featx.joobity

import io.jooby.Context
import io.jooby.annotations.*

object ReturnObject {
  lateinit var cool: String
}

@Path("/")
class Controller {

  @GET
  fun sayHi(): String {
    return "Welcome to Jooby!"
  }

  @POST
  fun postForm(@FormParam cool: String): ReturnObject {
    val returnObject = ReturnObject
    returnObject.cool = cool
    return returnObject
  }
}
