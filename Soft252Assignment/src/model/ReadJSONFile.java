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
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
/**
 *
 * @author mhill9
 */
public class ReadJSONFile {
    
    public void main(String[] args){
        JSONParser parser = new JSONParser();
        
        try
        {
            Object obj = parser.parse(new FileReader("Doctors.json"));
            JSONObject JsonObject = (JSONObject) obj;
            String Forname = (String) JsonObject.get("Forname");
            System.out.println("Location is: " + Forname);
        }
        catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}
    }
    
}
