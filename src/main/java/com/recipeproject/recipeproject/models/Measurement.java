package com.recipeproject.recipeproject.models;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Measurement {

    @Id
    @GeneratedValue

    private Integer measurementId;

    @NotNull
    private String measurement;



    public Measurement() {
    }

    public Measurement(String measurement) {
        this.measurement = measurement;
    }

    public int getMeasurementId() {
        return measurementId;
    }



    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}
