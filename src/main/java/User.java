import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by Nitin on 6/12/2017.
 */

class Profile {
    @JsonProperty("lastName")
    String lastName;
    @JsonProperty("secondEmail")
    String secondEmail;
    @JsonProperty("mobilePhone")
    String mobilePhone;
    @JsonProperty("email")
    String email;
    @JsonProperty("login")
    String login;
    @JsonProperty("firstName")
    String firstName;

    @Override
    public String toString() {
        return "Profile{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class User {
    @JsonProperty("id")
    String uid;
    @JsonProperty("status")
    String status;
    //    @JsonProperty("profile.email")
//    String email;
//    @JsonProperty("profile.firstName")
//    String firstName;
//    @JsonProperty("profile.lastName")
//    String lastName;
//    @JsonProperty("profile.login")
//    String login; //login name
    @JsonProperty("lastLogin")
    String lastLogin;
    @JsonProperty("profile")
    Profile profile;

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", status='" + status + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                ", profile=" + profile +
                '}';
    }
}

