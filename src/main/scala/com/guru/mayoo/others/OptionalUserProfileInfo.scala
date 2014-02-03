
object OptionalUserProfileInfo{
  val unKnowLocation = ""
  val unKnowAge = -1
  val unKnowNWebsite = ""
}

class OptionalUserProfileInfo(
  location : String = OptionalUserProfileInfo.unKnowLocation,
  age : Int = OptionalUserProfileInfo.unKnowAge,
  website : String = OptionalUserProfileInfo.unKnowNWebsite)

println(new OptionalUserProfileInfo)
println(new OptionalUserProfileInfo(age = 23))
