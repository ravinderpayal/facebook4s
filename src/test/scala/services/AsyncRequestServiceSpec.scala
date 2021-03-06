package services

import akka.http.scaladsl.model.StatusCodes
import base.{AsyncSpec, TestUrls}

class AsyncRequestServiceSpec extends AsyncSpec {
  implicit val appResources = FacebookAppResources()
  val asyncRequest = AsyncRequest()

  implicit val ec = executionContext

  "Should send request" in {
    asyncRequest(TestUrls.appTokenUri).map(_.status shouldBe StatusCodes.OK)
  }
}
