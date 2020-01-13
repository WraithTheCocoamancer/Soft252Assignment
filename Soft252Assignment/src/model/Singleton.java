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
public class Singleton {
    public static AdminList AdminInstance;
    public static DoctorList DoctorInstance;
    public static SecretaryList SecretaryInstance;
    public static PatientList PatientInstance;
    private void Singleton() {}
    
    public static AdminList getAdminInstance() {
        if (AdminInstance == null) {
            AdminInstance = new AdminList();
        }
        return AdminInstance;
    }
    public static DoctorList getDoctorInstance() {
        if (DoctorInstance == null) {
            DoctorInstance = new DoctorList();
        }
        return DoctorInstance;
    }public static SecretaryList getSecretaryInstance() {
        if (SecretaryInstance == null) {
            SecretaryInstance = new SecretaryList();
        }
        return SecretaryInstance;
    }
    public static PatientList getPatientInstance() {
        if (PatientInstance == null) {
            PatientInstance = new PatientList();
        }
        return PatientInstance;
    }
    
    
}
