package model;

import java.util.Arrays;
import java.util.stream.DoubleStream;
public class GradeCategory {

    private double[] scores;
    private double weight;
    private String title;

    public GradeCategory(String title, double weight){
        this.title = title;
        this.weight = weight;
        scores = new double[0];
    }

    private double[] getScores() {
        return this.scores;
    }

    private  void setScores(double[] scores) {
        this.scores = scores;
    }
    
    private double getWeight() {
        return this.weight;
    }
    
    private void setWeight(double weight) {
        this.weight = weight;
    }
    
    private String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }
    

    public void addScore(double score) {
        scores  = Arrays.copyOf(scores, scores.length + 1);
        scores[scores.length - 1] = score;        
    }

    public double getAverage() {
        if (scores.length == 0) return 1;
        double avg = (DoubleStream.of(scores).sum())/scores.length;
        return avg;
    }

    public double getWeightedAverage() {
        return getAverage() * weight;
    }
    
    
}
