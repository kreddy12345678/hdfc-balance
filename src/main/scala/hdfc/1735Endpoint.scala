package hdfc

import org.apache.camel.{Consumer, Processor, Producer}
import org.apache.camel.impl.DefaultEndpoint

/**
 * Represents a 1735 endpoint.
 */
class 1735Endpoint(uri:String, component: 1735Component) extends DefaultEndpoint(uri, component) {

  def createProducer() : Producer = {
    new 1735Producer(this)
  }

  def createConsumer(processor: Processor) : Consumer = {
    new 1735Consumer(this, processor)
  }

  def isSingleton() : Boolean = true

}
