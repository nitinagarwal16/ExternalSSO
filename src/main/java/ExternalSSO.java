import java.util.List;

/**
 * Created by Nitin on 6/12/2017.
 */
public interface ExternalSSO
{
    public List<User> listAllUsers();

    public User getUser(String uid);

    public List<User> listActiveUsers();

    public List<User> listLockedUsers();

    public void clearUserSession(String uid);

    public void suspendUser(String uid);

    public void activateUser(String uid);

    public void deactivateUser(String uid);

    public void unsuspendUser(String uid);

    public List<App> getAppsAssignedToUser(String uid);

    public List<User> listUsersAssignedToApp(String aid);

    public App getApp(String aid);

    public void removeUserFromApp(String uid, String aid);

}
