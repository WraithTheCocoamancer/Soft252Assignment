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
        Medicines Felodipine5 = new Medicines("Felodipine(5mg)");
        Medicines Diclofenac35 = new Medicines("Diclofenac(35mg)");
        Medicines Atrovastatin20 = new Medicines("Atrovastatin(20mg)");
        Medicines Furosomide40 = new Medicines("Furosomide(40mg)");
        Medicines Amoxicillin500 = new Medicines("Amoxicillin(500mg)");
        Medicines Amitriptyline25 = new Medicines("Amitriptyline(25mg)");
        Medicines Loratadine10 = new Medicines("Loratadine(10mg)");
        Medicines Diazepam2 = new Medicines("Diazepam(2mg)");
        Medicines Prednisolone200 = new Medicines("Prednisolone(200mg)");
        ArrayList<Medicines> listMeds = new ArrayList<>(); 
        listMeds.add(Paracetamol500);
        listMeds.add(Paracetamol1000);
        listMeds.add(Felodipine5);
        listMeds.add(Diclofenac35);
        listMeds.add(Atrovastatin20);
        listMeds.add(Furosomide40);
        listMeds.add(Amoxicillin500);
        listMeds.add(Amitriptyline25);
        listMeds.add(Diazepam2);
        listMeds.add(Paracetamol500);
        listMeds.add(Prednisolone200);

        listMeds.get(10);

        
        //"Paracetamol (500mg)", "Paracetamol (1000mg)", "felodipine(5mg)","" 
    }
}
