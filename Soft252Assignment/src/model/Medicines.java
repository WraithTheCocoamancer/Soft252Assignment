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
public class Medicines {
    public String Medicine;
    public int StockNo;
public Medicines(String Medicine,int StockNo) {
        this.Medicine = Medicine;
        this.StockNo = StockNo;
    }
    
    public int getStockNo() {
        return StockNo;
    }

    public void setStockNo(int StockNo) {
        this.StockNo = StockNo;
    }
    

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }
    
    
}
