import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

 class HttpURLConnectionExample {

    private final String USER_AGENT = "Mozilla/5.0";

//    public static void main(String[] args) throws Exception {
//
//        HttpURLConnectionExample http = new HttpURLConnectionExample();
//
//        System.out.println("Testing 1 - Send Http GET request");
//        http.sendGet();
//    }
    // HTTP GET request
String sendGet() throws Exception {

        String url = "https://dev-162669.oktapreview.com/api/v1/users?limit=25";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Authorization","SSWS 00OVZQPmvH_1Lj9nfE3ZLFyrSNjU6-euEV45H6vLsV");
        con.setRequestProperty("Content-Type","application/json");
        con.setRequestProperty("Accept","application/json");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //return result
        return response.toString();

}
}