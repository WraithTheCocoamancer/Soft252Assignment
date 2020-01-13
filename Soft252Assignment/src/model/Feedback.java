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
    public String DoctorName;
    public int Rating;
    public String FeedbackNotes;

    public Feedback(String DoctorName, int Rating, String FeedbackNotes) {
        this.DoctorName = DoctorName;
        this.Rating = Rating;
        this.FeedbackNotes = FeedbackNotes;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
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
