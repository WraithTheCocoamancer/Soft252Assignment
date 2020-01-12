/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author mhill9
 */
public class CreateJson {
    public static void main(String [] args) throws IOException{
        JSONObject obj = new JSONObject();
        obj.put("Forname", "Morgan");
        obj.put("Surname", "Hill");
        
        JSONArray list = new JSONArray();
        list.add("PL4 8NY");
        list.add("Hello1234");
                
            try(FileWriter file = new FileWriter("Doctors.json"))
        {
            file.write(obj.toString());
            file.flush();
        }
            catch(IOException e){
                e.printStackTrace();
            }
        
        
    }
}
