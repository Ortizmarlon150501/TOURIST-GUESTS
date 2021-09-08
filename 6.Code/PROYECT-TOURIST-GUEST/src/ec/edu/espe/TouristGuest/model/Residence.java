/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

/**
 *
 * @author JARAMILLO JEAN CODEC OPP-ESPE
 */
public class Residence {

    private float costOfAcommodation;
    private float feedingCost;
    private float tourismCost;

    public static float costOfResidence(float costOfAcommodation, float feedingCost, float tourismCost) {
        float costTotalResicence;
        costTotalResicence = costOfAcommodation + feedingCost + tourismCost;
        return costTotalResicence;
    }

    public Residence(float costOfAcommodation, float feedingCost, float tourismCost) {
        this.costOfAcommodation = costOfAcommodation;
        this.feedingCost = feedingCost;
        this.tourismCost = tourismCost;
    }

    /**
     * @return the costOfAcommodation
     */
    public float getCostOfAcommodation() {
        return costOfAcommodation;
    }

    /**
     * @param costOfAcommodation the costOfAcommodation to set
     */
    public void setCostOfAcommodation(float costOfAcommodation) {
        this.costOfAcommodation = costOfAcommodation;
    }

    /**
     * @return the feedingCost
     */
    public float getFeedingCost() {
        return feedingCost;
    }

    /**
     * @param feedingCost the feedingCost to set
     */
    public void setFeedingCost(float feedingCost) {
        this.feedingCost = feedingCost;
    }

    /**
     * @return the tourismCost
     */
    public float getTourismCost() {
        return tourismCost;
    }

    /**
     * @param tourismCost the tourismCost to set
     */
    public void setTourismCost(float tourismCost) {
        this.tourismCost = tourismCost;
    }

}
