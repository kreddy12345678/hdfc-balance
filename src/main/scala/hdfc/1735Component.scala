package hdfc


import org.apache.camel.Endpoint
import org.apache.camel.impl.DefaultComponent
import java.util.Map

/**
 * Represents the component that manages {@link 1735Endpoint}.
 */
class 1735Component extends DefaultComponent {

  protected def createEndpoint(uri: String, remaining: String, parameters: Map[String, Object]): Endpoint = {

    val endpoint = new 1735Endpoint(uri, this)
    setProperties(endpoint, parameters)

    endpoint
  }
}
