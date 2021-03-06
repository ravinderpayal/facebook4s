package client

import client.FacebookClient._
import domain.posts.FacebookPostAttributes._
import services.FacebookInternals

import scala.concurrent.Future

trait FacebookPostApi extends FacebookInternals {

  import serialization.FacebookDecoders.decodePost

  /**
    * @param postId Id of facebook post alpha numeric
    * @param accessToken Facebook access token
    * @param fields Sequence of facebook post attributes
    * @return Facebook post details
    *         @throws scala.RuntimeException if facebook responds with bad request
    */
  def post(postId: PostId, accessToken: AccessToken, fields: Seq[PostAttribute]): Future[Post] =
    sendRequestOrFail(postUri(postId, accessToken, fields))

  /**
    * @param postId Id of facebook post alpha numeric
    * @param accessToken Facebook access token
    * @return Facebook post details
    *         @throws scala.RuntimeException if facebook responds with bad request
    */
  def post(postId: PostId, accessToken: AccessToken): Future[Post] =
    post(postId, accessToken, defaultPostAttributeValues)

  /**
    * @param postId Id of facebook post alpha numeric
    * @param accessToken Facebook access token
    * @param fields Sequence of facebook post attributes
    * @return Either facebook post details or error FacebookError
    */
  def postResult(postId: PostId, accessToken: AccessToken,fields: Seq[PostAttribute]): AsyncPostResult =
    sendRequest(postUri(postId, accessToken, fields))

  /**
    * @param postId Id of facebook post alpha numeric
    * @param accessToken Facebook access token
    * @return Either facebook post details or error FacebookError
    */
  def postResult(postId: PostId, accessToken: AccessToken): AsyncPostResult =
    postResult(postId, accessToken, defaultPostAttributeValues)

}
