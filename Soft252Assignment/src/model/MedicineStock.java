/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mhill9
 */
import java.util.ArrayList;
public class MedicineStock {
    
    public void MedicineList(){
        Medicines Paracetamol500 = new Medicines("Paracetamol (500mg)");
        Medicines Paracetamol1000 = new Medicines("Paracetamol (1000mg)");
        Medicines Felodipine5 = new Medicines("felodipine(5mg)");
        //Medicines test1 = new Medicines("");
        //Medicines = new Medicines("");
        //Medicines = new Medicines("");
        //Medicines = new Medicines("");
        //Medicines = new Medicines("");
        //Medicines = new Medicines("");
        //Medicines = new Medicines("");
        //Medicines = new Medicines("");
        ArrayList<Medicines> listMeds = new ArrayList<>(); 
        listMeds.add(Paracetamol500);
        listMeds.get(0);
        listMeds.remove(Paracetamol500);
        listMeds.remove(0);
        
        //"Paracetamol (500mg)", "Paracetamol (1000mg)", "felodipine(5mg)","" 
    }
}
