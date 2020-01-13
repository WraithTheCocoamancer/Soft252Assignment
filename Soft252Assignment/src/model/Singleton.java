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
    private static Singleton Instance = null;
    //public static AdminList AdminInstance;
    //public static DoctorList DoctorInstance;
    //public static SecretaryList SecretaryInstance;
    //public static PatientList PatientInstance;
     AdminList Admins = new AdminList();
    DoctorList Doctors = new DoctorList();
    PatientList Patients = new PatientList();
    SecretaryList Secretarys = new SecretaryList();
        
    private Singleton() {}
    
     public static Singleton getInstance() {
        if (Instance == null) {
            Instance = new Singleton();
        }
        return Instance;
    }
    
    //public static AdminList getAdminInstance() {
        //if (AdminInstance == null) {
            //AdminInstance = new AdminList();
        //}
        //return AdminInstance;
   // }
    //public static DoctorList getDoctorInstance() {
       // if (DoctorInstance == null) {
        //    DoctorInstance = new DoctorList();
       // }
    //    return DoctorInstance;
   // }public static SecretaryList getSecretaryInstance() {
   //     if (SecretaryInstance == null) {
    //        SecretaryInstance = new SecretaryList();
     ///   }
     //   return SecretaryInstance;
   // }
  //  public static PatientList getPatientInstance() {
   //     if (PatientInstance == null) {
    //        PatientInstance = new PatientList();
     //   }
      //  return PatientInstance;
   // }

    
}
