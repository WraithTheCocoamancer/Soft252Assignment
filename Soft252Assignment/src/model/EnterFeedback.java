/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author mhill9
 */
public class EnterFeedback {
    
    public Feedback FeedbackChad = new Feedback ("Chad Doktor", 5, "very Respectful. Intense but well meaning");
    public ArrayList<Feedback> FeedbackList = new ArrayList<>();
    public void feedbacklist()
    {
        FeedbackList.add(FeedbackChad);

    }
}
