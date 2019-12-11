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
public class Feedback {
    public int DoctorId;
    public int Rating;
    public String FeedbackNotes;

    public Feedback(int DoctorId, int Rating, String FeedbackNotes) {
        this.DoctorId = DoctorId;
        this.Rating = Rating;
        this.FeedbackNotes = FeedbackNotes;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public String getFeedbackNotes() {
        return FeedbackNotes;
    }

    public void setFeedbackNotes(String FeedbackNotes) {
        this.FeedbackNotes = FeedbackNotes;
    }
    
    
    
}
