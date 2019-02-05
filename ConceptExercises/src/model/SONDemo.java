/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import view.Banner;

/**
 *
 * @author jamesK
 */
public class SONDemo {

    public SONDemo() {

    }

    // JSON Demonstration of Writing and Reading with Java
    public void jsonDemo() {
        // create diner JSON object
        JSONObject diner = new JSONObject();

        // broad data
        diner.put("Name", "Bernie's");
        diner.put("Established", "1967");

        // location data
        Map locationMap = new LinkedHashMap(2);
        locationMap.put("street", "1122 Boogie Woogie Avenue");
        locationMap.put("city", "Gotham");
        diner.put("location", locationMap);

        // menu data
        Map menuMap = new LinkedHashMap(3);

        // appetizers
        Map appetizerMap = new LinkedHashMap(3);
        appetizerMap.put("Twice Baked Potatoes", "5.00");
        appetizerMap.put("Onion Ring Tower", "6.00");
        appetizerMap.put("Jalapeno Poppers", "4.00");
        menuMap.put("Appetizers", appetizerMap);

        // entrees
        Map entreeMap = new LinkedHashMap(4);
        entreeMap.put("Leaning Tower of Pancakes", "7.99");
        entreeMap.put("Eggs", "1.99");
        entreeMap.put("Sirloin Steak", "11.99");
        entreeMap.put("Burger", "6.99");

        menuMap.put("Entrees", entreeMap);

        // beverages
        Map beverageMap = new LinkedHashMap(4);
        beverageMap.put("Fountain Drinks", "1.99");
        beverageMap.put("Specialty Drinks", "3.99");
        beverageMap.put("Root Beer Float", "3.99");
        beverageMap.put("Strawberry Lemonade", "2.99");
        menuMap.put("Beverages", beverageMap);

        // add menu to diner object
        diner.put("Menu", menuMap);

        // write object to file
        try (FileWriter p = new FileWriter("JSONBerniesDiner.json")) {
            p.write(diner.toJSONString());
            p.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // read
        
        // good practice whenever external files are involved to use try/catch
        try (FileReader readBoi = new FileReader("JSONBerniesDiner.json")) {
            
            JSONParser parseBoi = new JSONParser();
            Object obj = parseBoi.parse(readBoi);
            
            JSONObject dinerObj = (JSONObject) obj;
            
            // get diner name and est. date
            String dinerName = (String) dinerObj.get("Name");
            String dinerEst = (String) dinerObj.get("Established");
            
            // get location
            Map locate = ((Map)dinerObj.get("location"));
            
            // get menu
            Map mapMenu = ((Map)dinerObj.get("Menu"));
            
            // get appetizers
            Map apps = ((Map)dinerObj.get("Appetizers"));
            
            // get entrees
            Map ents = ((Map)dinerObj.get("Entrees"));
            
            // get beverages
            Map bevs = ((Map)dinerObj.get("Beverages"));
            
            // output diner name and date
            Banner.createBanner_Min("Restaurant: " + dinerName);
            Banner.createBanner_Min("Established: " + dinerEst);
            
            // output location
            Banner.createBanner_Min("Location Map: ");
            outputMap(locate);
            
            // output menu
            Banner.createBanner_Min("Menu Map: ");
            outputMap(mapMenu);
            
            
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
            
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
    private void outputMap(Map mapBoi) {
        Iterator<Map.Entry> it = mapBoi.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = it.next();
            Banner.createBanner_Min(pair.getKey() + " : " + pair.getValue());
        }
    }
}
