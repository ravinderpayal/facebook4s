package domain.permission

import domain.FacebookAttribute

object FacebookPermissions {

  /**
    * Trait that represents facebook permission - https://developers.facebook.com/docs/facebook-login/permissions/
    */
  sealed trait FacebookPermission extends FacebookAttribute {
    val value: String
  }

  /**
    * Facebook permission that gives access to user posts.
    */
  final case object FacebookUserPosts extends FacebookPermission {
    val value = "user_posts"
  }

  object UserAttributes {
    val attributeValues = Seq(Email, PublicProfile, ReadCustomFriendList, AboutMe, BirthDay, EducationHistory,
      Fiends, Hometown, Location, RelationshipDetails, UserRelationship, ReligionPolitics)


    final case object Email extends FacebookPermission {
      override val value = "email"
    }

    final case object PublicProfile extends FacebookPermission {
      override val value = "public_profile"
    }

    final case object ReadCustomFriendList extends FacebookPermission {
      override val value = "read_custom_friendlists"
    }

    final case object AboutMe extends FacebookPermission {
      override val value = "user_about_me"
    }

    final case object BirthDay extends FacebookPermission {
      override val value = "user_birthday"
    }

    final case object EducationHistory extends FacebookPermission {
      override val value = "user_education_history"
    }

    final case object Fiends extends FacebookPermission {
      override val value = "user_friends"
    }

    final case object Hometown extends FacebookPermission {
      override val value = "user_hometown"
    }

    final case object Location extends FacebookPermission {
      override val value = "user_location"
    }

    final case object RelationshipDetails extends FacebookPermission {
      override val value = "user_relationship_details"
    }

    final case object UserRelationship extends FacebookPermission {
      override val value = "user_relationships"
    }

    final case object ReligionPolitics extends FacebookPermission {
      override val value = "user_religion_politics"
    }

    final case object UserPhotos extends FacebookPermission {
      override val value = "user_photos"
    }

    final case object UserVideos extends FacebookPermission {
      override val value = "user_videos"
    }
  }

}



