package model;

import java.util.Arrays;

/**
* @generated
*/
public class Session {
    
    private GradeCategory[] categories;

    private String title;

    public Session(String title) {
        this.title = title;
        this.categories = new GradeCategory[0];
    }
    
    public GradeCategory[] getCategories() {
        return this.categories;
    }
    
    public void setCategories(GradeCategory[] categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addCategory(GradeCategory category) {
        categories  = Arrays.copyOf(categories, categories.length + 1);
        categories[categories.length - 1] = category;
    }

    public double getAverage() {
        double avg = 0;
        for (GradeCategory category : categories) {
            avg += category.getWeightedAverage();
        }
        return avg;
    }
    
    
}
