package client

import base.FacebookClientStubSupport
import serialization.compatibility._

class ClientCodeSpec extends FacebookClientStubSupport {
  "Facebook Graph Api" should {
    "obtain client code by long lived token" in { c =>
      c.mockSendWithResource(resourcePath = "testdata/client_code.json")
      c.clientCode("long lived token") map(_ shouldBe clientCode)
    }
  }
}
