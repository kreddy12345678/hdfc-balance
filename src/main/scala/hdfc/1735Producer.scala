package hdfc

import org.apache.camel.Exchange
import org.apache.camel.impl.DefaultProducer


/**
 * The 1735 producer.
 */
class 1735Producer(endpoint: 1735Endpoint) extends DefaultProducer(endpoint) {

  def process(exchange: Exchange) : Unit = {
    println(exchange.getIn().getBody())
  }

}
