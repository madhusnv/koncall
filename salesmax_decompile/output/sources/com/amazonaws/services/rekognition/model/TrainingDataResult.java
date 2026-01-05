package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class TrainingDataResult implements Serializable {
    private TrainingData input;
    private TrainingData output;
    private ValidationData validation;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TrainingDataResult)) {
            return false;
        }
        TrainingDataResult trainingDataResult = (TrainingDataResult) obj;
        if ((trainingDataResult.getInput() == null) ^ (getInput() == null)) {
            return false;
        }
        if (trainingDataResult.getInput() != null && !trainingDataResult.getInput().equals(getInput())) {
            return false;
        }
        if ((trainingDataResult.getOutput() == null) ^ (getOutput() == null)) {
            return false;
        }
        if (trainingDataResult.getOutput() != null && !trainingDataResult.getOutput().equals(getOutput())) {
            return false;
        }
        if ((trainingDataResult.getValidation() == null) ^ (getValidation() == null)) {
            return false;
        }
        return trainingDataResult.getValidation() == null || trainingDataResult.getValidation().equals(getValidation());
    }

    public TrainingData getInput() {
        return this.input;
    }

    public TrainingData getOutput() {
        return this.output;
    }

    public ValidationData getValidation() {
        return this.validation;
    }

    public int hashCode() {
        return (((((getInput() == null ? 0 : getInput().hashCode()) + 31) * 31) + (getOutput() == null ? 0 : getOutput().hashCode())) * 31) + (getValidation() != null ? getValidation().hashCode() : 0);
    }

    public void setInput(TrainingData trainingData) {
        this.input = trainingData;
    }

    public void setOutput(TrainingData trainingData) {
        this.output = trainingData;
    }

    public void setValidation(ValidationData validationData) {
        this.validation = validationData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInput() != null) {
            sb.append("Input: " + getInput() + ",");
        }
        if (getOutput() != null) {
            sb.append("Output: " + getOutput() + ",");
        }
        if (getValidation() != null) {
            sb.append("Validation: " + getValidation());
        }
        sb.append("}");
        return sb.toString();
    }

    public TrainingDataResult withInput(TrainingData trainingData) {
        this.input = trainingData;
        return this;
    }

    public TrainingDataResult withOutput(TrainingData trainingData) {
        this.output = trainingData;
        return this;
    }

    public TrainingDataResult withValidation(ValidationData validationData) {
        this.validation = validationData;
        return this;
    }
}
