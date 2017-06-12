import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nitin on 6/12/2017.
 */
public class OktaTest
{
    private static final StringBuilder apikey = new StringBuilder("00OVZQPmvH_1Lj9nfE3ZLFyrSNjU6-euEV45H6vLsV");
    public ArrayList<User> listAllUsers() throws Exception
    {
        HttpURLConnectionExample http = new HttpURLConnectionExample();
        String response = http.sendGet();
        ObjectMapper objMapper = new ObjectMapper();
        ArrayList<User> userList = objMapper.readValue(response,new TypeReference<ArrayList<User>>(){});
        return userList;
    }
    public static void main(String args[])throws Exception
    {
//        HttpURLConnectionExample http = new HttpURLConnectionExample();
//        http.sendGet();
        OktaTest obj = new OktaTest();
        ArrayList<User> userList = obj.listAllUsers();
        for(User x: userList)
            System.out.println(x);
    }

}
