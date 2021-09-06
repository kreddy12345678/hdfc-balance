package hdfc

import org.apache.camel.component.mock.MockEndpoint
import org.apache.camel.test.junit4.CamelTestSupport
import org.junit.Test
import org.apache.camel.scala.dsl.builder.{RouteBuilder, RouteBuilderSupport}

// The trait RouteBuilderSupport helps bridge the Scala RouteBuilder with the Java RouteBuilder,
// that the CamelTestSupport expects and uses
class 1735ComponentTest extends CamelTestSupport with RouteBuilderSupport {

  // Create a simple route that uses both the consumer and producer endpoint of the new component.
  override def createRouteBuilder() = {
    new RouteBuilder() {

      "1735://foo" to "1735://bar" to "mock:result"
    }

  }

  @Test
  def test1735() = {
    val mock: MockEndpoint = getMockEndpoint("mock:result")
    mock.expectedMinimumMessageCount(1)

    assertMockEndpointsSatisfied()
  }

}
