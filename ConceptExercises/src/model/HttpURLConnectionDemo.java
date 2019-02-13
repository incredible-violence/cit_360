/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import view.*;
/**
 *
 * @author jamesK
 */
public class HttpURLConnectionDemo {
    /**
     * DEFAULT CONSTRUCTOR
     */
    public HttpURLConnectionDemo()
    {
    }

    /**
     * RUNS THE Get DEMO
     *
     *
     */
    public void run_get() {
        try
        {
            String myUrl = "https://www.google.com/search?q=kittens";
            String results = doGet(myUrl);
            Banner.createBanner_Min(results);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * RUNS THE Post DEMO
     *
     *
     */
    public void run_post() {
        try
        {
           doPost();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * Does the connection action & get request, reads output if successful
     *
     * @param paramUrl
     * @return
     * @throws Exception
     */
    private String doGet(String paramUrl) throws Exception
    {
        URL url = null;
        BufferedReader reader = null;
        StringBuilder stringBuilder;

        try
        {
            url = new URL(paramUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            // read the output
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null)
            {
                stringBuilder.append(line + "\n");
            }
            return stringBuilder.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            if (reader != null)
            {
                try
                {
                    reader.close();
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }
        }
    }

    /**
     * Does the connection action & post request, reads output if successful
     *
     * This one is a little more complicated.  The only place I could find that
     * was centralized and allowed post requests for testing purposes was
     * jsonplaceholder.typicode.com.  As such, for specific forms there are specific
     * parameters which must be met, hence the pre-constructed string POST_PARAMS.
     *
     * @return
     */
    private void doPost() throws Exception {
        final String POST_PARAMS = "{\n"
                + "\"userId\": 101,\r\n"
                + "    \"id\": 101,\r\n"
                + "    \"title\": \"Test Title - Boogachucka\",\r\n"
                + "    \"body\": \"Test Body - BoogachuckaBoogachucka\""
                + "\n}";

        Banner.createBanner_Min(POST_PARAMS);

        // url of the json hosting site that allows posts
        URL obj = new URL("https://jsonplaceholder.typicode.com/posts");

        // make the connection
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();

        // set up the POST
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("userId", "a1adfbcdefgh");
        postConnection.setRequestProperty("Content-Type", "application/json");
        postConnection.setDoOutput(true);

        // output management
        OutputStream os = postConnection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();

        // response management
        int responseCode = postConnection.getResponseCode();
        Banner.createBanner_Min("POST Response Code :  " + responseCode);
        Banner.createBanner_Min("POST Response Message : " + postConnection.getResponseMessage());

        // success case
        if (responseCode == HttpURLConnection.HTTP_CREATED) {

            BufferedReader in = new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            // output result
            Banner.createBanner_Min(response.toString());

        }
        else {
            Banner.createBanner_Min("POST FAILED");
        }
    }
}
