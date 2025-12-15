package co.istad.generic;

import java.math.BigDecimal;


public class Student extends Person {

    private Double score;

    public Student(String name, String gender, Float height, Double score) {
        super(name, gender, height);
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}


}
